package LiteralsValueProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student_App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
		Value_properties vp   = context.getBean("student",Value_properties.class);
		vp.profile();

	}

}
