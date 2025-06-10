package com.harsh.dev.myproject.requestprocessor;


import com.harsh.dev.myproject.db.entity.User;
import com.harsh.dev.myproject.db.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }


}
