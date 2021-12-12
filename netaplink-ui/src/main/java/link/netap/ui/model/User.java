package link.netap.ui.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class User {
    private Long id;
    @Size(min=2, max=50)
    private String login;
    private String name;
    private String surname;
    @Size(min=6, max=150)
    private String password;
    private Long createdDate;
    private Long updatedDate;
    private Boolean delete;
}
