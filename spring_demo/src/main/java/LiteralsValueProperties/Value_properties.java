package LiteralsValueProperties;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Value_properties {
	
 @Value("${student.rollno}")
 int rollno;

	String  name;
	
	 @Value("${student.name}")
	 @Required
 public void setName(String name) {
	this.name = name;
}

@Value("${student.subject}")
	String subject;
	
	public void profile() {
		System.out.println(name+" "+ rollno+" "+ subject);
	}
	
	
	
	
}
