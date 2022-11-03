package com.library.Library.Service;

import com.library.Library.Dto.Book;
import com.library.Library.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookService {

    @Autowired
    public BookRepository bookRepository;

    public List<Book> getAllBookDto(){
       List<Book> list = (List<Book>)this.bookRepository.findAll();
        return list;
    }

    public Book getBookDtoById(int id){
        Book book=null;
        try {
            book =this.bookRepository.findById(id);

        }catch (Exception e){
            System.out.println(e);

        }
        return book;
    }

    public Book insertBook(Book b){
        Book result = this.bookRepository.save(b);
        return result;
    }

    //delete book
    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }


    //update
    public Book updateBookDto(Book bookDto, int id){
        bookDto.setBookId(id);
        bookRepository.save(bookDto);
        return bookDto;
    }

}
