import org.testng.Assert;
import org.testng.annotations.Test;

public class test44 {
    @Test
    void StartCar(){
        System.out.println("Start Car");
    }
    @Test(dependsOnMethods = {"StartCar"})
    void DriveCar(){
        System.out.println("Drive Car");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"DriveCar"}, alwaysRun = true)
    void StopCar(){
        System.out.println("Stop Car");
    }
    @Test(dependsOnMethods = {"DriveCar", "StopCar"})
    void ParkCar(){
        System.out.println("Park car");
    }
}
