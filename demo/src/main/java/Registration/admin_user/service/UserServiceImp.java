package Registration.admin_user.service;

import Registration.admin_user.dto.UserDto;
import Registration.admin_user.model.User;
import Registration.admin_user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements  UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public User Save(UserDto userDto) {

        User user = new User(
                userDto.getFullname(),
                passwordEncoder.encode(userDto.getPassword()),
                userDto.getEmail(),
                userDto.getRole());
        return userRepository.save(user);
    }

}
