import org.testng.annotations.DataProvider;

public class test99 {
    @DataProvider(name = "LoginDataProvider")
    public Object[][] GetData(){
        Object[][] data = {{"abc@gmail.com", "abc"},{"xyz@gmail.com", "xyz"},{"mno@gmail.com", "mno"}};
        return data;
    }
}
