import org.testng.annotations.Test;

public class test55 {
    @Test(groups = {"g1"})
    void test1(){
        System.out.println("This is test1...");
    }
    @Test(groups = {"g1"})
    void test2(){
        System.out.println("This is test2...");
    }
    @Test(groups = {"g2"})
    void test3(){
        System.out.println("This is test3...");
    }
    @Test(groups = {"g2"})
    void test4(){
        System.out.println("This is test4...");
    }
    @Test(groups = {"g1", "g2"})
    void test5() { System.out.println("This is test5..."); }
    @Test(groups = {"g1", "g3"})
    void test6(){
        System.out.println("This is test6...");
    }
}
