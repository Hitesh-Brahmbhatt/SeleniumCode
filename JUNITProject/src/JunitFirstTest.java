import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitFirstTest {
	
	//In junit even if one @test fails next @test runs ; but in java if one line fails it wont go ahead

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}

	@Test
	public void test() {
		System.out.println("I am in Test ");
	}
	

	@Test
	public void test1() {
		System.out.println("I am in Test 1");
	}


	@Test
	public void test2() {
		System.out.println("I am in Test 2");
	}


	@Test
	public void test3() {
		System.out.println("I am in Test 3");
	}


	@Test
	public void test4() {
		System.out.println("I am in Test 4");
	}
}
