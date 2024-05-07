package com.security.test.Persistance.Security;


import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.security.test.Persistance.Entity.Admin;




public class AdminSecurity implements UserDetails  {

    Admin admin  ;

    public AdminSecurity (Admin admin ) {
        this.admin = admin ; 
    }



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
   

        return List.of(()->"read");
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return admin.getPassword();
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub
        return admin.getName();
        
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }


    
}
