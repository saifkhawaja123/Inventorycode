package com.myfirst.project.controller;


import com.myfirst.project.domain.User;
import com.myfirst.project.service.UserService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public User addUserRecord(@RequestBody User user)
    {
        return userService.addUser(user);
    }
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Optional<User> getUserRecord(@RequestParam(name = "id") Long id)
    {
        return userService.getUser(id);
    }
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public void getdeleteRecord(@RequestParam(name = "id") Long id)
    {  userService.deleteUser(id);  }
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<User> allRecord()
    {
       return userService.showALLUser();
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public JSONObject updateUser(@RequestBody User user, @RequestParam(name = "id") Long id)
    { return userService.updateUser(id,user.getAddress()); }

}
