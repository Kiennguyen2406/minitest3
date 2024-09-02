package com.example.minitest3.service.appUser;

import com.example.minitest3.model.App.AppUser;
import com.example.minitest3.model.App.UserPrinciple;
import com.example.minitest3.repository.AppUserRepo;
import com.example.minitest3.service.IGenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppUserService implements IAppUserService {
    @Autowired
    private AppUserRepo appUserRepo;

    @Override
    public Iterable<AppUser> findAll() {
        return appUserRepo.findAll();
    }

    @Override
    public Optional<AppUser> findById(Long id) {
        return appUserRepo.findById(id);
    }

    @Override
    public void save(AppUser appUser) {
        appUserRepo.save(appUser);
    }

    @Override
    public void remove(Long id) {
        appUserRepo.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        tu name -> AppUser;
        Optional<AppUser> userOptional = appUserRepo.findByName(username);
        AppUser appUser = userOptional.get();
        if (appUser == null) {
            throw new UsernameNotFoundException("User not found");
        }
//        Chuyen AppUser -> UserDetails
        return UserPrinciple.build(appUser);
    }
}
