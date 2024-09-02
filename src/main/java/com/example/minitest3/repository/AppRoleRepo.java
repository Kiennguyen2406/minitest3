package com.example.minitest3.repository;

import com.example.minitest3.model.App.AppRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRoleRepo extends CrudRepository<AppRole, Long> {
}