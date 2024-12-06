package com.joy.bookingManagement.service.interfac;

import com.joy.bookingManagement.dto.LoginRequest;
import com.joy.bookingManagement.dto.Response;
import com.joy.bookingManagement.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);
}
