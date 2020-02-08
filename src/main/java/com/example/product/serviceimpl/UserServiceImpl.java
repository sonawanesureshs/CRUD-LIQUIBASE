package com.example.product.serviceimpl;

import com.example.product.constants.ApiConstants;
import com.example.product.entity.Product;
import com.example.product.entity.User;
import com.example.product.repository.ProductRepo;
import com.example.product.repository.UserRepo;
import com.example.product.service.UserService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public String add(final User user) {

        userRepo.save(user);


        JSONObject jo = new JSONObject();
        jo.put(ApiConstants.API_MESSAGE,ApiConstants.API_ADD_USERS);
        jo.put("data" , convertToJson(user));

//        return ApiConstants.API_ADD_PRODUCT_SUCCESS;
        return jo.toString();
    }

    @Override
    public String update(final User user) {

        userRepo.save(user);

        JSONObject jo = new JSONObject();
        jo.put(ApiConstants.API_MESSAGE,ApiConstants.API_UPDATE_USER);
        jo.put("data" , convertToJson(user));
//        return ApiConstants.API_ADD_PRODUCT_SUCCESS;
        return jo.toString();
    }

    @Override
    public String delete(final int id) {

        userRepo.deleteById(id);
        JSONObject jo = new JSONObject();
        jo.put(ApiConstants.API_MESSAGE,ApiConstants.API_USER_DELETE);
        jo.put("id", id);
        return jo.toString();
    }

    @Override
    public String get() {
        JSONArray jsonArray = new JSONArray();
        userRepo.findAll().forEach(user -> {


            jsonArray.add(convertToJson(user));

        });



        return jsonArray.toJSONString();
    }
    public JSONObject convertToJson(User user){
        JSONObject jObj = new JSONObject();
        jObj.put("position", user.getId());
        jObj.put("id", user.getId());

        jObj.put("firstname", user.getFirstname());
        jObj.put("lastname", user.getLastname());
        jObj.put("emailid", user.getEmailid());
        jObj.put("username", user.getUsername());
        jObj.put("addr1", user.getAddr1());
        jObj.put("addr2", user.getAddr2());
        jObj.put("contact", user.getContact());
        jObj.put("altcontact", user.getAltcontact());
        jObj.put("city", user.getCity());
        jObj.put("state", user.getState());
        jObj.put("country", user.getCountry());
        jObj.put("zip", user.getZip());

        return jObj;
    }
}
