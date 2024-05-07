package com.security.test.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

import com.security.test.Persistance.Repository.AdminDao;
import com.security.test.Persistance.Security.AdminSecurity;

@Service

public class UserDetailJpa implements UserDetailsService{
    
    @Autowired
    AdminDao adminDao ; 


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        return   new AdminSecurity(adminDao.findById(1).get() );  

        
    }
    
}
