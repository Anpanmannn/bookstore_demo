package com.bowen.library.dao;

import com.bowen.library.dto.BookRequest;
import com.bowen.library.model.Book;

public interface BookDao {

    Book getBookById(Integer bookId);

    Integer createBook(BookRequest bookRequest);

    void updateBook(Integer bookId, BookRequest bookRequest);

    void deleteBookById(Integer bookId);
}
