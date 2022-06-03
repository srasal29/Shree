package testclasses;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
import org.testng.annotations.AfterMethod;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


public class Test123 {
//	SoftAssert soft;
@BeforeClass
public void beforeclass(){
	System.out.println("before class");
}
@BeforeMethod
public void beforeMethod(){
	System.out.println("before Method");
//	soft = new SoftAssert();
}
@Test
public void testA(){
	System.out.println("testA");
//	soft.assertEquals("Pune", "Katraj","Hi is not Katraj");
//	soft.assertEquals("Hydrabad", "Hydra","Hi is not present");
//	soft.assertEquals("HI", "HI","Hi is not present")	;
//	soft.assertAll();
	Assert.assertEquals("Hi", "Hi");
	Assert.assertEquals("Hi", "Bi");
	
}
@Test
public void testB(){
	System.out.println("testB");
//	soft.assertEquals("Hi", "Hinks","Hi is not present");
//	soft.assertEquals("Hello", "mamkaHello");
//	soft.assertEquals("Bye", "Bye")	;
//	soft.assertAll();
	Assert.assertEquals("Hii", "Hii");
	Assert.assertEquals("Hello", "Hello");
	
}
@AfterMethod
public void afterMethod(){
	System.out.println("after Method");
}
@AfterClass
public void afterClass(){
	System.out.println("after class");
}
}
