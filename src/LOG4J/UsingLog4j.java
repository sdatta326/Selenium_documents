package LOG4J;

import org.apache.log4j.Logger;

//import com.sun.istack.internal.logging.Logger;

public class UsingLog4j {
static Logger log=Logger.getLogger(UsingLog4j.class.getName());	
public static void main(String[] args) {
		// TODO Auto-generated method stub
log.info("information");
log.warn("warning");
log.error("error");
	}

}
