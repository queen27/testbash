package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {
@Test
public void test1() {
SoftAssert s=new SoftAssert();
System.out.println("Execution of test1 started");
s.assertEquals(200, 201,"Check if it failed");
System.out.println("Checking first assertion");
s.assertEquals("java", "java","Check if it failed");
System.out.println("Execution of test1 ended");
s.assertAll();//if u comment this method itll show pass test
}
@Test
public void test2() {

System.out.println("Execution of test2 started");
Assert.assertEquals(200, 201,"Check if it failed");
System.out.println("Checking first assertion");
Assert.assertEquals("java", "java","check if it failed");
System.out.println("Execution of test1 ended");
}

}
