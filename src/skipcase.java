import org.testng.annotations.Test;

public class skipcase {
	
@Test
 public void testCase1() {
  System.out.println("This is the Test Case 1");
 }
 @Test(enabled=false)
 public void skiptest() {
  System.out.println("This is skipped testcase");
 }
  @Test(enabled=true)
  public void skiptesttt() {
   System.out.println("This is skipped testcase1");
  
 }
}