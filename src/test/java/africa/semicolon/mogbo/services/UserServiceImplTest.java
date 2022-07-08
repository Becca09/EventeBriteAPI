package africa.semicolon.mogbo.services;

import africa.semicolon.mogbo.data.repositories.UserRepository;
import africa.semicolon.mogbo.dto.requests.RegisterUserRequest;
import africa.semicolon.mogbo.exceptions.DuplicateEmailException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    private UserServices userServiceImpl;
    @Autowired
    private UserRepository userRepository;

    @Test
    void registerUserTest() {
        registerErnest();

        assertEquals(1, userRepository.count());
    }

    private void registerErnest() {
        RegisterUserRequest registerUserRequest = new RegisterUserRequest();
        registerUserRequest.setEmail("example@yahoo.com");
        registerUserRequest.setFirstName("Ernest");
        registerUserRequest.setLastName("Ehigiator");
        registerUserRequest.setPassword("12345");
        userServiceImpl.registerUser(registerUserRequest);
    }

    @Test
    void duplicateEmailThrowsExceptionTest() {
        registerErnest();
        assertThrows(DuplicateEmailException.class, this::registerErnest);
        try {
            registerErnest();
        } catch (DuplicateEmailException ex) {
            assertEquals("example@yahoo.com already exists", ex.getMessage());
        }
    }
}