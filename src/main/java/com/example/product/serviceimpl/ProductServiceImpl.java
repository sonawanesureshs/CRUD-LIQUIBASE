package com.example.product.serviceimpl;

import com.example.product.constants.ApiConstants;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepo;
import com.example.product.service.ProductService;
import org.springframework.web.bind.annotation.CrossOrigin;


@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Override
    public String add(final Product product) {
        final boolean isExist = !(productRepo.findAllByName(product.getName()).isEmpty());
        if(isExist) {
            return ApiConstants.API_PRODUCT_EXISTS;
        }
        productRepo.save(product);
        return ApiConstants.API_ADD_PRODUCT_SUCCESS;
    }

    @Override
    public String update(final Product product) {
        final boolean isExists = productRepo.findAllByName(product.getName()).stream().anyMatch(productTemp->(productTemp.getName().equals(product.getName()) && productTemp.getId()!= product.getId()));
        if(isExists) {
            return ApiConstants.API_PRODUCT_EXISTS;
        }
        productRepo.save(product);
        return ApiConstants.API_ADD_PRODUCT_SUCCESS;
    }

    @Override
    public String delete(final int id) {
        final boolean isExists = productRepo.existsById(id);
        if(!isExists) {
            return ApiConstants.API_PRODUCT_NOT_EXISTS;
        }
        productRepo.deleteById(id);
        return ApiConstants.API_PRODUCT_DELETE;

    }

    @Override
    public String get() {
        JSONArray jsonArray = new JSONArray();

        for(int i=1;i<5;i++) {
//        productRepo.findAll().forEach(product -> {
            JSONObject jObj = new JSONObject();
            jObj.put("position", i);
            jObj.put("firstname", "Suresh");
            jObj.put("lastname", "Sonawane");
            jObj.put("emailid", "sonawanesuresh@yopmail.com");
            jObj.put("contact", "987654321");
            jObj.put("city", "Pune");
            jObj.put("country", "India");
            jsonArray.add(jObj);
//            i++;
//        });
        }


        return jsonArray.toJSONString();
    }

}
