package Registration.admin_user.service;

import Registration.admin_user.dto.UserDto;
import Registration.admin_user.model.User;

public interface UserService {

    User Save(UserDto userDto);
}
