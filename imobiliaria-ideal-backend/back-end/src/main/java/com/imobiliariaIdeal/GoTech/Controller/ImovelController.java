package com.imobiliariaIdeal.GoTech.Controller;

import com.imobiliariaIdeal.GoTech.Repository.ImovelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/imovel")
public class ImovelController {

    @Autowired
    ImovelRepository imovelRepository;

    @GetMapping(path="/")
    public String olamundo(){
        return "Olá mundo";
    }
}
