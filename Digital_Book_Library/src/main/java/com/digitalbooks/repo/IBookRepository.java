package com.digitalbooks.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digitalbooks.entity.BookAuthor;

@Repository
public interface IBookRepository extends JpaRepository<BookAuthor, Integer>  {

}