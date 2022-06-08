package com.example.app.dao;

import com.example.app.model.Partner;
import com.example.app.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("PartnerDao")
public class PartnerAccessService implements PartnerDao{

    private static List<Partner> DB = new ArrayList<>();

    @Override
    public int insertPartner(UUID partid, Partner partner) {
        DB.add(new Partner(partid, partner.getEmail(), partner.getName(), partner.getPassword(), partner.getPhone()));
        return 1;
    }

    @Override
    public int updatePartnerByID(UUID partid, Partner partner) {
        return selectPartnerByID(partid)
                .map(p -> {
                    int indexOfParnterToUpdate = DB.indexOf(p);
                    if(indexOfParnterToUpdate >=0){
                        DB.set(indexOfParnterToUpdate, new Partner(partid, partner.getEmail(), partner.getName(), partner.getPassword(), partner.getPhone()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }

    @Override
    public int removePartner(UUID partid) {
        Optional<Partner> partnerToDelete = selectPartnerByID(partid);
        if(partnerToDelete.isEmpty()){
            return 0;
        }
        DB.remove(partnerToDelete.get());
        return 1;
    }

    @Override
    public Optional<Partner> selectPartnerByID(UUID partid) {
        return DB.stream()
                .filter(partner -> partner.getId().equals(partid))
                .findFirst();
    }

    @Override
    public Optional<Partner> selectPartnerByEmail(String email) {
        return DB.stream()
                .filter(partner -> partner.getEmail().equals(email))
                .findFirst();
    }

    @Override
    public List<Partner> selectAllPartner() {
        return DB;
    }
}
