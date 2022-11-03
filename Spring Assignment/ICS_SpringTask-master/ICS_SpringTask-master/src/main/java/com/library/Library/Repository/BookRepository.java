package com.library.Library.Repository;

import com.library.Library.Dto.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {

    public Book findById(int BookId);

}
