package com.readtowinpublication.pos.repo;

import com.readtowinpublication.pos.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface AuthorRepo extends JpaRepository<Author,Integer> {
}
