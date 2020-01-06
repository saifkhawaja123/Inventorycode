package com.myfirst.project.service;

import com.myfirst.project.domain.User;
import com.myfirst.project.repository.UserRepository;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    //adding a User
    public User addUser(User user)
    {
        return userRepository.save(user);
    }
    //Fetching a User By id
    public Optional<User> getUser(Long id)   { return userRepository.findById(id);}
    //Deleting the User by id
    public void deleteUser(Long id) { userRepository.deleteById(id); }
    //showing all the user available
    public List<User> showALLUser() { return userRepository.findAll();}
    //updating user data
    public JSONObject updateUser(Long id,String value) {
        String result;
        JSONObject jsonObject;
        User user1 = userRepository.getOne(id);
        if (userRepository.existsById(id)) {
            user1.setAddress(value);
            userRepository.save(user1);
            result = "{\"Status\" : \"OK \"}";}
         else{result="{\"Status\" : \"KO\" }";}
         jsonObject = new JSONObject(result);
         return jsonObject;
    }

}
