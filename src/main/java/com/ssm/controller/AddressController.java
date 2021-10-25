package com.ssm.controller;

import com.ssm.pojo.Address;
import com.ssm.service.AddressService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        return "fore/register";
    }


    //异步绑定城市
    @RequestMapping(value = "/addresscity/{id}",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Map<String,Object> tocity(@PathVariable("id") String id){
        Map<String,Object> map =new HashMap<>();
        List<Address> cityAddress = service.getCityAddress(id);
        List<Address> areaAddress = service.getAreaAddress(cityAddress.get(0).getAddressAreaId());
        map.put("addressList",cityAddress);
        map.put("childAddressList",areaAddress);
        map.put("success",true);
        return map;
    }

}
