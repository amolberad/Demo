package TestNgDemo.testngxml;

import org.testng.annotations.*;

public class ClassThree {

    @Test
    public void ClassThreeTest1()
    {
        System.out.println("ClassThreeTest1");
    }
    @Test (groups="email")
    public void ClassThreeTest2()
    {
        System.out.println("ClassThreeTest2");
    }
    @Test
    public void ClassThreeTest3()
    {
        System.out.println("ClassThreeTest3");
    }
}
