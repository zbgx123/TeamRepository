package com.cmk.supermarket.Controller;

import com.cmk.supermarket.Entity.Admin;
import com.cmk.supermarket.Repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class AdminController {
    @Autowired
    private AdminRepository adminRepository;

    @RequestMapping("/login")
    public ResponseEntity<String> findUsrAndPwd(@RequestBody Admin adm) {
        adm = adminRepository.findAdminByUsrAndPwd(adm.getUsr(), adm.getPwd());
        if(adm == null){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        else{
            return ResponseEntity.ok("login sucess");
        }

    }

}
