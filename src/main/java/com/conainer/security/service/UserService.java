package com.conainer.security.service;

import com.conainer.security.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();
        User usr1 = new User(1,"Aswathy",30,"achu.aswathy11@gmail.com");
        User usr2 = new User(2,"Guest",20,"guest@gmail.com");
        userList.addAll(Arrays.asList(usr1,usr2));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for(User user: userList){
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }

    public List<User> getUserList() {
        return userList;
    }
}
