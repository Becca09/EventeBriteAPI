package africa.semicolon.mogbo.dto.requests;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegisterUserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
