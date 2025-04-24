package com.lms.LibraryManagementSystem.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.LibraryManagementSystem.Entity.Book;
import com.lms.LibraryManagementSystem.Entity.Transaction;
import com.lms.LibraryManagementSystem.Entity.User;
import com.lms.LibraryManagementSystem.Repository.BookRepository;
import com.lms.LibraryManagementSystem.Repository.TransactionRepository;
import com.lms.LibraryManagementSystem.Repository.UserRepository;

@Service
public class TransactionService {

  @Autowired
  private TransactionRepository transactionRepository;

  @Autowired
  private BookRepository bookRepository;

  @Autowired
  private UserRepository userRepository;

  public List<Transaction> getAllTransaction(){
    return transactionRepository.findAll();
  }

    public Transaction borrowBook(Long userId, Long bookId) {
        // Fetch user and book from the repositories
        Optional<Book> bookOpt = bookRepository.findById(bookId);
        Optional<User> userOpt = userRepository.findById(userId);

        if (bookOpt.isEmpty() || userOpt.isEmpty()) {
            throw new RuntimeException("Book or User not found");
        }

        Book book = bookOpt.get();
        User user = userOpt.get();

        // Check if the book is available for borrowing
        if (book.getAvailableCopies() <= 0) {
            throw new RuntimeException("Book is not available for borrowing");
        }

        // Decrement available copies of the book
        book.setAvailableCopies(book.getAvailableCopies() - 1);
        bookRepository.save(book);

        // Create a new transaction
        Transaction transaction = new Transaction();
        transaction.setUser(user);
        transaction.setBook(book);
        transaction.setBorrowedDate(new Date(System.currentTimeMillis()));

        // Set due date (e.g., 7 days from now)
        long dueInMillis = 30L * 24 * 60 * 60 * 1000;  // 30 days
        transaction.setDueDate(new Date(System.currentTimeMillis() + dueInMillis));

        // Save the transaction in the database
        return transactionRepository.save(transaction);
    }

    /**
     * Method to return a borrowed book.
     * - It checks if the transaction exists.
     * - It calculates any fine if the book is returned late.
     * - Updates the available copies of the book.
     * 
     * @param transactionId the ID of the transaction being returned.
     * @return the updated transaction.
     */
    public Transaction returnBook(Long transactionId) {
        // Fetch the transaction from the repository
        Optional<Transaction> transactionOpt = transactionRepository.findById(transactionId);

        if (transactionOpt.isEmpty()) {
            throw new RuntimeException("Transaction not found");
        }

        Transaction transaction = transactionOpt.get();
        Date returnDate = new Date(System.currentTimeMillis());
        transaction.setReturnDate(returnDate);

        // Calculate if the book was returned late
        long diffInMillis = returnDate.getTime() - transaction.getDueDate().getTime();
        long diffDays = diffInMillis / (1000 * 60 * 60 * 24);

        if (diffDays > 0) {
            // Fine calculation (e.g., $1 per day)
            transaction.setFine(diffDays * 1.0);  // Fine of 1 per day
        } else {
            transaction.setFine(0.0);  // No fine if returned on time
        }

        // Update the available copies of the book
        Book book = transaction.getBook();
        book.setAvailableCopies(book.getAvailableCopies() + 1);
        bookRepository.save(book);

        // Save the updated transaction
        return transactionRepository.save(transaction);
    }

    // /**
    //  * Method to get all transactions for a specific user.
    //  * 
    //  * @param userId the ID of the user to retrieve transactions for.
    //  * @return a list of transactions.
    //  */
    // public List<Transaction> getTransactionsByUser(Long userId) {
    //     return transactionRepository.findByUserId(userId);
    // }

    // /**
    //  * Method to get all transactions for a specific book.
    //  * 
    //  * @param bookId the ID of the book to retrieve transactions for.
    //  * @return a list of transactions.
    //  */
    // public List<Transaction> getTransactionsByBook(Long bookId) {
    //     return transactionRepository.findByBookId(bookId);
    // }

    // /**
    //  * Method to get all transactions in the system.
    //  * 
    //  * @return a list of all transactions.
    //  */
    // public List<Transaction> getAllTransactions() {
    //     return transactionRepository.findAll();
    // }
 
}
