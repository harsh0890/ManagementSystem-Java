//package com.harsh.dev.myproject.service;
//
//
//
//import com.harsh.dev.myproject.db.entity.Role;
//import com.harsh.dev.myproject.db.entity.User;
//import com.harsh.dev.myproject.db.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@Component
//public class UserDetailServiceImpl implements UserDetailsService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user =  userRepository.findByUsername(username).orElseThrow(() ->
//                new UsernameNotFoundException("User Not Found : "+username));
//
//        UserDetails userDetails =  org.springframework.security.core.userdetails.User.builder()
//
//                .username(username)
//                .password(user.getPasswordHash())
//                .roles(user.getPermissions()).build();
//
//
//        return userDetails;
//    }
//}
