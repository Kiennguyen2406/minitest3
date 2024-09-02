package com.example.minitest3.service.approle;

import com.example.minitest3.model.App.AppRole;
import com.example.minitest3.repository.AppRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppRoleService implements IAppRoleService {
    @Autowired
    private AppRoleRepo appRoleRepo;

    @Override
    public Iterable<AppRole> findAll() {
        return appRoleRepo.findAll();
    }

    @Override
    public Optional<AppRole> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(AppRole appRole) {

    }

    @Override
    public void remove(Long id) {

    }
}