package link.netap.netaplinkapi.service.impl;

import link.netap.netaplinkapi.dto.UserDto;
import link.netap.netaplinkapi.dto.UsersDto;
import link.netap.netaplinkapi.entity.User;
import link.netap.netaplinkapi.mapper.UserMapper;
import link.netap.netaplinkapi.repository.UserRepository;
import link.netap.netaplinkapi.config.Config;
import link.netap.netaplinkapi.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Slf4j
@Component
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final Config config;
    private final UserRepository userRepository;

    @Override
    public UserDto addUser(UserDto userDto) {
        User user = new User();
        if (userDto == null || userDto.getLogin().length() < 3) return null;

        user.setLogin(userDto.getLogin());
        user.setName(userDto.getName());
        user.setSurname(userDto.getSurname());
        user.setCreatedDate(LocalDateTime.now());
        user.setDelete(false);
        user.setPassword(config.encoder().encode(userDto.getPassword()));
        return UserMapper.convertToDto(userRepository.save(user));
    }

    @Override
    @Transactional(readOnly = true)
    public UserDto getUser(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isEmpty()) return null;
        return UserMapper.convertToDto(userOptional.orElseThrow());
    }

    @Override
    public UsersDto getUsers() {
        return null;
    }
}
