package com.example.app.service;

import com.example.app.dao.PartnerDao;
import com.example.app.model.Partner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class PartnerLoginService {

    private final PartnerDao partnerDao;

    @Autowired
    public PartnerLoginService(@Qualifier("PartnerDao") PartnerDao partnerDao){ this.partnerDao = partnerDao;}

    public Optional<Partner> PartnerLogin(String email, String password){
        Optional<Partner> partner = partnerDao.selectPartnerByEmail(email);
        if (Objects.equals(password, "12345678")) {
            return partner;
        }
        return null;
    }
}
