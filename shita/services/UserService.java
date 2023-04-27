package shita.services;

import shita.data.model.User;
import shita.dto.request.RegisterUserRequest;
import shita.dto.response.RegisterUserResponse;

public interface UserService {
    RegisterUserResponse registerNewUser(RegisterUserRequest request);
    User findUser(int id);


}
