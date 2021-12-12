package link.netap.netaplinkapi.mapper;

import link.netap.netaplinkapi.dto.UserDto;
import link.netap.netaplinkapi.entity.User;

import java.util.List;
import java.util.stream.Collectors;

public class UserMapper {
    public static UserDto convertToDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .login(user.getLogin())
                .password(user.getPassword())
                .name(user.getName())
                .surname(user.getSurname())
                .created_date(user.getCreatedDate())
                .updated_date(user.getUpdatedDate())
                .delete(user.getDelete())
                .build();
    }

    public static List<UserDto> convertToDtoList(List<User> userList) {
        return userList.stream().map(UserMapper::convertToDto).collect(Collectors.toList());
    }
}
