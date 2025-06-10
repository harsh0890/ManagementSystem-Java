package com.harsh.dev.myproject.db.repository;


import com.harsh.dev.myproject.db.entity.User;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

//    @Override
//    @NonNull
//    Optional<User> findById(@NonNull Integer integer);


    Optional<User> findByUsername(String username);
}
