package link.netap.ui.feign;

import link.netap.ui.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "netaplinkapi", url = "${feign.netaplinkapi:}")
public interface NetaplinkAPIClient {
    @GetMapping("/api/users/add")
    ResponseEntity<byte[]> addUser(@RequestBody User user);

    @GetMapping("/api/users/{id}")
    ResponseEntity<User> getUser(@PathVariable("id") Long id);
}
