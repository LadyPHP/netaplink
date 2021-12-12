package link.netap.ui.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private Long id;
    private String login;
    private String name;
    private String surname;
    private String password;
    private Long createdDate;
    private Long updatedDate;
    private Boolean delete;
}
