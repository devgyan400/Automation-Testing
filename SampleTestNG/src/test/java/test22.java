import org.testng.annotations.*;

public class test22 {
    @BeforeClass
    void BeforeClass(){ System.out.println("Before Class22");}

    @AfterClass
    void AfterClass(){ System.out.println("After Class22");}

    @BeforeMethod
    void BeforeMethod(){ System.out.println("This will execute before every test method22");}

    @AfterMethod
    void AfterMethod(){ System.out.println("This will execute after every test method22");}

    @Test
    void setup22() { System.out.println("This is setup test22"); }

    @Test
    void login22() {
        System.out.println("This is login test22");
    }

    @Test
    void logout22() { System.out.println("This is logout test22"); }

    @BeforeTest
    void BeforeTest(){ System.out.println("Before Test");}

    @AfterTest
    void AfterTest(){ System.out.println("After Test");}
}