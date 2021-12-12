package link.netap.netaplinkapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    private String login;
    private String name;
    private String surname;
    private String password;
    private LocalDateTime created_date;
    private LocalDateTime updated_date;
    private Boolean delete;
}
