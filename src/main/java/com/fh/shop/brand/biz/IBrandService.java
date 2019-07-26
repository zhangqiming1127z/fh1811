package com.fh.shop.brand.biz;

import com.fh.shop.brand.po.Brand;
import org.utils.ServerResponse;

import java.util.List;

public interface IBrandService {
    public ServerResponse findBrands(Integer id);

}
