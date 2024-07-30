package suite.com;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



public class ExecuteAll {
public static void main(String[] args) {
	
	Result r=JUnitCore.runClasses(A.class,B.class);
	System.out.println("Failure count"+r.getFailureCount());
	System.out.println("Ignore count"+r.getIgnoreCount());
	System.out.println("Run count"+r.getRunCount());
	int passcount =r.getRunCount()-r.getFailureCount();
	System.out.println("pass count"+passcount);
	 
	List<Failure> failures=r.getFailures();
		for (Failure failure :failures) {
			System.out.println(failure);
			
		}	
}
}
