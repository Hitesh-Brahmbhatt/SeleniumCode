import org.apache.log4j.Logger;

public class Logging_Example {

	public static void main(String[] args) {
		
	 Logger Application_Logs = Logger.getLogger("devpinoyLogger");
	 Application_Logs.debug("Hello");
	 Application_Logs.debug("World");
	 Application_Logs.debug("Good Morning");
	 
		

	}

}
