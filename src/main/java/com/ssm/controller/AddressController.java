package com.ssm.controller;

import com.ssm.pojo.Address;
import com.ssm.service.AddressService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AddressController {
    @Resource
    AddressService service;

    //绑定地址栏
    @RequestMapping("/tores")
    public String tores(Model model){
        List<Address> provinceAddress = service.getProvinceAddress();
        model.addAttribute("addressList",provinceAddress);
        List<Address> cityAddress = service.getCityAddress("110000");
        model.addAttribute("cityList",cityAddress);
        List<Address> areaAddress = service.getAreaAddress("110100");
        model.addAttribute("districtList",areaAddress);
        return "/fore/register";
    }
}
