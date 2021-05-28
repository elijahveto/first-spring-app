package com.shcherbakova.app.persistance.repository;

import com.shcherbakova.app.persistance.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book,Long> {
}
