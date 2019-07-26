package com.fh.shop.brand.biz;

import com.fh.shop.brand.mapper.IBrandMapper;
import com.fh.shop.brand.po.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.utils.ServerResponse;


@Service("brandService")
public class IBrandServiceImpl implements IBrandService {
    @Autowired
    private IBrandMapper brandMapper;


    @Override
    public ServerResponse findBrands(Integer id) {
        Brand brand = brandMapper.selectById(id);
        return ServerResponse.success(brand);
    }
}
