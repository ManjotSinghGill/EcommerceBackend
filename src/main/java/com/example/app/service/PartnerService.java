package com.example.app.service;

import com.example.app.dao.PartnerDao;
import com.example.app.model.Partner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PartnerService {

    private final PartnerDao partnerDao;

    @Autowired
    public PartnerService(@Qualifier("PartnerDao") PartnerDao partnerDao) {
        this.partnerDao = partnerDao;
    }

    public int addPartner(Partner partner){
        return partnerDao.insertPartner(partner);
    }

    public List<Partner> selectAllPartner(){
        return partnerDao.selectAllPartner();
    }

    public Optional<Partner> selectPartnerByID(UUID partid) { return  partnerDao.selectPartnerByID(partid);}

    public int removePartner(UUID partid){
        return partnerDao.removePartner(partid);
    }

    public int updatePartner(UUID partid, Partner partner){
        return partnerDao.updatePartnerByID(partid, partner);
    }
}