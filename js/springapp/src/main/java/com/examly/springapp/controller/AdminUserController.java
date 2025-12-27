package com.examly.springapp.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.AdminUser;
import com.examly.springapp.service.AdminUserService;

@RestController
@RequestMapping("/admin")
public class AdminUserController {
    
    private AdminUserService adminUserService;

    public AdminUserController(AdminUserService adminUserService) {
        this.adminUserService = adminUserService;
    }

    @PostMapping("/create")
    public AdminUser addAmin(@RequestBody AdminUser adminUser){
        return adminUserService.createAdmin(adminUser);
    }


    @GetMapping("/{id}")
    public AdminUser getUserById(@PathVariable int id){
        return adminUserService.getUserById(id);
    }

    @PutMapping("/{id}")
    public AdminUser updateUserById(@PathVariable int id,@RequestBody AdminUser newAdminUser){
        return adminUserService.updateUserById(id, newAdminUser);
    }

    @GetMapping
    public List<AdminUser> getAllAdmins(){
        return adminUserService.getAllAdmins();
    }
}
