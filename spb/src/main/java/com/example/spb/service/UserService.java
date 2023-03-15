package com.example.spb.service;

import com.example.spb.dao.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> queryAll();

}
