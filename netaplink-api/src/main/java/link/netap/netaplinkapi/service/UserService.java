package link.netap.netaplinkapi.service;

import link.netap.netaplinkapi.dto.UserDto;
import link.netap.netaplinkapi.dto.UsersDto;

public interface UserService {
    UserDto addUser(UserDto userDto);

    UserDto getUser(Long id);

    UsersDto getUsers();
}
