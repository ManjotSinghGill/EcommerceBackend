package com.example.app.api;

import com.example.app.dao.PartnerDao;
import com.example.app.model.Partner;
import com.example.app.service.PartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/controller/partner")
@RestController
public class PartnerController {

    private final PartnerService partnerService;

    @Autowired
    public PartnerController(PartnerService partnerService){
        this.partnerService = partnerService;
    }

    @PostMapping
    public void addPartner(@RequestBody Partner partner){
        partnerService.addPartner(partner);
    }

    @GetMapping
    public List<Partner> selectAllPartner(){ return partnerService.selectAllPartner();
    }

    @GetMapping(path = "{partid}")
    public Partner getPartnerByID(@PathVariable("partid")UUID partid){
        return partnerService.selectPartnerByID(partid).orElse(null);
    }

    @DeleteMapping(path = "{partid}")
    public void removePartner(@PathVariable("partid") UUID partid){
        partnerService.removePartner(partid);
    }

    @PutMapping(path = "{partid}")
    public void updatePartner(@PathVariable("partid") UUID partid, @RequestBody Partner partner){
        partnerService.updatePartner(partid, partner);
    }
}
