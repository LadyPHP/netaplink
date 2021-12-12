package link.netap.netaplinkapi.service;

import link.netap.netaplinkapi.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto addUser(UserDto userDto);

    UserDto getUser(Long id);

    List<UserDto> getUsers();
}
