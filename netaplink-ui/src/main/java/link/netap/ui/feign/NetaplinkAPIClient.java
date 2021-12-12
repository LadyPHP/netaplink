package link.netap.ui.feign;

import link.netap.ui.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@FeignClient(name = "netaplinkapi", url = "${feign.netaplinkapi:}")
@Validated
public interface NetaplinkAPIClient {
    @PostMapping(value = "/api/users/add")
    ResponseEntity<byte[]> addUser(@RequestBody @Valid User user);

    @GetMapping("/api/users/{id}")
    ResponseEntity<User> getUser(@PathVariable("id") Long id);

    @GetMapping("/api/users/list")
    ResponseEntity<List<User>> getUsers();
}
