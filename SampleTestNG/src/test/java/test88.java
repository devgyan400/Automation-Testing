import org.testng.annotations.Test;

public class test88 {
    @Test(dataProvider = "LoginDataProvider", dataProviderClass = test99.class)
    public void LoginTest(String email, String password){
        System.out.println(email + " " + password);
    }
}
