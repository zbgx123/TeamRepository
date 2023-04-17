package com.cmk.supermarket.Repository;

import com.cmk.supermarket.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    public Admin findAdminByUsrAndPwd(String usr, String pwd);
}
