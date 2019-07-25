package PKG_1;

import java.io.File;
import java.net.MalformedURLException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class ObjectRepositoryXML {

	public static void main(String[] args) throws MalformedURLException, DocumentException {
		// TODO Auto-generated method stub
		File inputFile = new File("C:\\Selenium\\First_Selenium_Training\\src\\sample_testdata.xml");                                    
        SAXReader saxReader = new SAXReader();                    
        Document document = saxReader.read(inputFile);                            
        String nameofperson = document.selectSingleNode("//person/name").getText();                            
        String email = document.selectSingleNode("//person/email").getText();                            
        String location = document.selectSingleNode("//person/location").getText();
        
        System.out.println(nameofperson);
        System.out.println(email);
        System.out.println(location);

	}

}
