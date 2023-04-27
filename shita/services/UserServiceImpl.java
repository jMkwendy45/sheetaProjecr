package shita.services;

import shita.data.model.User;
import shita.data.repositories.UserImply;
import shita.data.repositories.UserRepository;
import shita.dto.request.RegisterUserRequest;
import shita.dto.response.RegisterUserResponse;
import shita.utils.Mapper;

public class UserServiceImpl implements  UserService {
    UserRepository userRepository = new UserImply();

    @Override
    public RegisterUserResponse registerNewUser(RegisterUserRequest request) {
        User user = Mapper.map(request);
        User savedUser = userRepository.save(user);
        return  Mapper.map(savedUser);
    }
    @Override
    public User findUser(int id) {
     return  userRepository.findById(id);
    }
}


