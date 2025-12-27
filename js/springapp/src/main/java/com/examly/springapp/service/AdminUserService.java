package com.examly.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.examly.springapp.model.AdminUser;
import com.examly.springapp.repository.AdminUserRepository;

@Service
public class AdminUserService {
    private AdminUserRepository adminRepo;

    public AdminUserService(AdminUserRepository adminRepo) {
        this.adminRepo = adminRepo;
    }

    public AdminUser createAdmin(AdminUser adminUser){
        return adminRepo.save(adminUser);
    }

    public AdminUser getUserById(int id){
        return adminRepo.findById(id).get();
    }

    public AdminUser updateUserById(int id,AdminUser admin){
        AdminUser a = adminRepo.findById(id).orElse(null);
        a.setUsername(admin.getUsername());
        a.setPassword(admin.getPassword());
        return adminRepo.save(a);
    }

    public List<AdminUser> getAllAdmins(){
        return adminRepo.findAll();
    }
}
