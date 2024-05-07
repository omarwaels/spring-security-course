package com.security.test.Persistance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.test.Persistance.Entity.Admin;

public interface AdminDao extends JpaRepository <Admin, Integer>{
    
    Admin getAdminById(int id);

}
