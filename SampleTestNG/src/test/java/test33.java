import org.testng.annotations.*;

public class test33 {
    @BeforeClass
    void BeforeClass(){ System.out.println("Before Class33");}

    @AfterClass
    void AfterClass(){ System.out.println("After Class33");}

    @BeforeMethod
    void BeforeMethod(){ System.out.println("This will execute before every test method33");}

    @AfterMethod
    void AfterMethod(){ System.out.println("This will execute after every test method33");}

    @Test
    void setup33() { System.out.println("This is setup test33"); }

    @Test
    void login33() {
        System.out.println("This is login test33");
    }

    @Test
    void logout33() {
        System.out.println("This is logout test33");
    }

    @BeforeSuite
    void BeforeSuite(){ System.out.println("Before Suite");}

    @AfterSuite
    void AfterSuite(){ System.out.println("After Suite");}

}
