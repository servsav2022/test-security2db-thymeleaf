package com.servsav.testsecurity2dbthymeleaf.service;

import com.servsav.testsecurity2dbthymeleaf.dto.UserDto;
import com.servsav.testsecurity2dbthymeleaf.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
