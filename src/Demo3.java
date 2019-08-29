import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;


public class Demo3 {
	@Test
	public void test1() throws IOException
	{
	//step 1
		Layout layout =new PatternLayout("%d %c %m %n");
		Appender appender=new FileAppender(layout ,"./report/r.log");
		BasicConfigurator.configure(appender);
		
		//step 2
		
		Logger log=Logger.getLogger(this.getClass().getName());
	
		
		log.setLevel(Level.WARN);
		
		//step 3
		log.info("info");
		log.warn("warn");
		log.error("error");
		 
		
		
	}

}
