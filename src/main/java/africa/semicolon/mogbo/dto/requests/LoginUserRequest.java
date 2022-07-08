package africa.semicolon.mogbo.dto.requests;

import lombok.Data;

@Data
public class LoginUserRequest {
    private String email;
    private String password;
}
