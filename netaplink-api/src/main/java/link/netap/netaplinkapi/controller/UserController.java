package link.netap.netaplinkapi.controller;

import io.swagger.v3.oas.annotations.Operation;
import link.netap.netaplinkapi.dto.UserDto;
import link.netap.netaplinkapi.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/users/")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @Operation(summary = "Получить данные пользователя по id")
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable("id") Long id) {
        log.info("> id={}", id);
        UserDto userDto = userService.getUser(id);
        return ResponseEntity.ok(userDto);
    }

    @Operation(summary = "Получить список всех активных пользователей")
    @GetMapping("/list")
    public ResponseEntity<List<UserDto>> getUsersList() {
        List<UserDto> usersDto = userService.getUsers();
        return ResponseEntity.ok(usersDto);
    }

    @Operation(summary = "Добавить нового пользователя")
    @PostMapping(value = "/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto) {
        return ResponseEntity.ok(userService.addUser(userDto));
    }
}
