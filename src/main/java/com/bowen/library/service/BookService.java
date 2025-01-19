package com.bowen.library.service;

import com.bowen.library.dto.BookRequest;
import com.bowen.library.model.Book;

public interface BookService {

    Book getBookById(Integer bookId);

    Integer createBook(BookRequest bookRequest);

    void updateBook(Integer bookId, BookRequest bookRequest);

    void deleteBookById(Integer bookId);
}
