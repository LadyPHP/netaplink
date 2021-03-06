package link.netap.ui.controller;

import link.netap.ui.feign.NetaplinkAPIClient;
import link.netap.ui.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final NetaplinkAPIClient netaplinkAPIClient;

    @GetMapping("/registration")
    public String getForm() {
        return "registration";
    }

    @PostMapping(value = "/registration")
    public String addUser(@Valid User user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("message", "The information is invalid!");
        } else {
            netaplinkAPIClient.addUser(user);
            model.addAttribute("user", user);
        }
        return "registration";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") Long id, Model model) {
        ResponseEntity<User> responseEntity = netaplinkAPIClient.getUser(id);
        User user = responseEntity.getBody();
        model.addAttribute("user", user);
        return "user";
    }

    @GetMapping("/list")
    public String getUsers(Model model) {
        ResponseEntity<List<User>> responseEntity = netaplinkAPIClient.getUsers();
        List<User> users = responseEntity.getBody();
        model.addAttribute("users", users);
        return "users";
    }
}
