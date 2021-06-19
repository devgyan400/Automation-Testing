import org.testng.annotations.Test;

public class test11 {
    @Test(priority = 1)
    void setup() {
        System.out.println("This is setup test");
    }

    @Test(priority = 2, enabled = false)
    void login() {
        System.out.println("This is login test");
    }

    @Test(priority = 3)
    void logout() {
        System.out.println("This is logout test");
    }


}
