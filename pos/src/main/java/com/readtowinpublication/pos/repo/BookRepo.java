package com.readtowinpublication.pos.repo;

import com.readtowinpublication.pos.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface BookRepo extends JpaRepository<Book,String> {

//    public void saveBookWithAuthor(int authorId,Book book);
}
