package com.example.app.api;

import com.example.app.model.LoginModel;
import com.example.app.model.Partner;
import com.example.app.service.PartnerLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.Optional;

@RequestMapping("api/controller/partnerlogin")
@RestController
public class PartnerLoginController {
    private final PartnerLoginService partnerLoginService;

    @Autowired
    public PartnerLoginController(PartnerLoginService partnerLoginService){ this.partnerLoginService = partnerLoginService;}

    @PostMapping
    public Optional<Partner> PartnerLogin(@RequestBody LoginModel loginModel){
        return partnerLoginService.PartnerLogin(loginModel.getEmail(), loginModel.getPassword());
    }
}
