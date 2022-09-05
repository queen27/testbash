package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotationsTest {
@AfterSuite
public void test() {
	System.out.println("test1");
}
@AfterTest
public void test1() {
	System.out.println("test1");
}
@AfterClass
public void test2() {
	System.out.println("test2");
}
@AfterMethod
public void test3() {
	System.out.println("test3");
}
@Test
public void test4() {
	System.out.println("test4");
}

@BeforeMethod
public void test5() {
	System.out.println("test5");
}
@BeforeClass
public void test6() {
	System.out.println("test6");
}
@BeforeTest
public void test7() {
	System.out.println("test7");
}
@BeforeSuite
public void test8() {
	System.out.println("test8");
}





}
