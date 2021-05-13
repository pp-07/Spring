package ComponentConfiguration;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	
	public void teach() {
		System.out.println("Math Teacher activated");
	}
}
