import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;


public class Demo1 {
@Test
public void test1()
{
///step1
	BasicConfigurator.configure();
	
	//step 2
	
	Logger log=Logger.getLogger(this.getClass().getName());
	
	
	
	
	//step 3
	log.info("info");
	log.warn("warn");
	log.error("error");
	 
	
	
}

}
