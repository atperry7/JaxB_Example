package example.stuffs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import example.jaxb.Student;

public class JaxbLauncher {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		
		Student mike = new Student("Michael", "Memphis", 26);
		
		JAXBContext context = JAXBContext.newInstance(Student.class);
		
		Marshaller marshaller = context.createMarshaller();
		
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);		
		
		marshaller.marshal(mike, System.out);
		
		File xmlFile = new File("studentMarshalled.xml");
		
		marshaller.marshal(mike, new FileOutputStream(xmlFile));
		
		//Time to unmarshall!
		
		Unmarshaller unmarshaller = context.createUnmarshaller();
		
		Student unmarshalledStudent = (Student) unmarshaller.unmarshal(new FileInputStream(xmlFile));
		
		System.out.println("The student is: " + unmarshalledStudent.getName());
		
	}
	
}
