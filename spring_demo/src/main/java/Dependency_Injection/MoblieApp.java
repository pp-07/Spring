package Dependency_Injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MoblieApp {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("info.xml");
	Airtel air = context.getBean("airtelid",Airtel.class);
	air.method1();

	}

}
