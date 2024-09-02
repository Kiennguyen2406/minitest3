package com.example.minitest3.service.appUser;

import com.example.minitest3.model.App.AppUser;
import com.example.minitest3.service.IGenerateService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IAppUserService extends IGenerateService<AppUser>, UserDetailsService {
}