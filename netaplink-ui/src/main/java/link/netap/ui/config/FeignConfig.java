package link.netap.ui.config;

import link.netap.ui.feign.NetaplinkAPIClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients(clients = {NetaplinkAPIClient.class})
@Configuration
public class FeignConfig {
}
