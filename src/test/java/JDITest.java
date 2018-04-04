import JDI.EASite;
import JDI.base.TestBaseJDI;
import JDI.entities.User;
import org.testng.annotations.Test;

public class JDITest extends TestBaseJDI {
    @Test
    public void checkLogin() {
        EASite.loginForm.loginAs(new User());
    }
}
