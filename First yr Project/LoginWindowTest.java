import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class LoginWindowTest {

    private LoginWindow loginWindow;

    @Before
    public void setUp() {
        loginWindow = new LoginWindow();
    }

    @Test
    public void testValidateCredentials() {
        assertTrue("Valid credentials should return true", 
                   loginWindow.validateCredentials("name", "password"));
        assertFalse("Invalid credentials should return false",
                    loginWindow.validateCredentials("wrongname", "wrongpassword"));
    }
}

//this tests the error handling on the login page 