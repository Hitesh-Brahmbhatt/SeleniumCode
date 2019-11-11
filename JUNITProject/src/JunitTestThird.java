
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runners.MethodSorters;
import org.junit.rules.ErrorCollector;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class JunitTestThird {
	
	@Rule
	public ErrorCollector errCol = new ErrorCollector();

	
	@Test
	public void a_testAssert(){
		
		System.out.println(" I am in assert Test Assert method");
		String actualerrmsg = "abc";
		String Expectederrmsg = "abc";
		Assert.assertEquals(Expectederrmsg, actualerrmsg);
		System.out.println("After Assert");
	}
	
	@Ignore
	@Test
	public void b_testAssertTrue(){
		
		int a=4;
		int b=6;
		
		System.out.println("Before Assertion");
		try{
			Assert.assertTrue(a>b);
		}catch(Throwable e){
			errCol.addError(e);
			System.out.println("Inside Catch");
		}
		System.out.println("After Catch");
	}
	
	
	
}
