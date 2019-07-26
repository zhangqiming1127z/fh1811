package com.fh.shop.brand.controller;

import com.fh.brand.BrandApi;
import com.fh.brand.po.Brand;
import com.fh.shop.brand.biz.IBrandService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.utils.ServerResponse;

import javax.annotation.Resource;

@CrossOrigin("*")
@RestController
@RequestMapping("api/brand")
public class BrandController implements BrandApi {

    @Resource(name = "brandService")
    private IBrandService brandService;




    @Override
    public ServerResponse<Brand> findBrands(Integer id) {
        ServerResponse brands = brandService.findBrands(id);
        return brands ;
    }
}
