package ComponentConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class CollegeApp {

	public static void main(String[] args) {
		
ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationFile.class);
College obj =context.getBean("college",College.class);
obj.print();

((AnnotationConfigApplicationContext) context).close();
	}

}
