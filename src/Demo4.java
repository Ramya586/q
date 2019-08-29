import java.io.IOException;

//import org.apache.log4j.Appender;
//import org.apache.log4j.BasicConfigurator;
//import org.apache.log4j.FileAppender;
//import org.apache.log4j.Layout;
//import org.apache.log4j.Level;
import org.apache.log4j.Logger;
//import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;


public class Demo4 {
	@Test
	public void test1() throws IOException
	{
	
		
		Logger log=Logger.getLogger(this.getClass().getName());
		log.info("info");
		log.warn("warn");
		log.error("error");
		 
		
		
	}

}
