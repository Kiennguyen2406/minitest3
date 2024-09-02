package com.example.minitest3.repository;

import com.example.minitest3.model.App.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AppUserRepo extends CrudRepository<AppUser, Long> {
    Optional<AppUser> findByName(String name);
}