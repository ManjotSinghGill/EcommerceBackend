package com.example.app.dao;

import com.example.app.model.Partner;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PartnerDao {

    int insertPartner(UUID partid, Partner partner);

    default int insertPartner(Partner partner){
        UUID partid = UUID.randomUUID();
        return insertPartner(partid, partner);
    }

    Optional<Partner> selectPartnerByID(UUID partid);

    Optional<Partner> selectPartnerByEmail(String email);

    int removePartner(UUID partid);

    int updatePartnerByID(UUID partid, Partner partner);

    List<Partner> selectAllPartner();
}
