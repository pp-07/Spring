package Dependency_Injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Airtel {
	private Service s;
	public Airtel() {
		
	}
	
	


public Airtel(Service s) {
		
		this.s = s;
	}

	

	@Autowired
	@Qualifier("internet")
	public void setS(Service s) {
		System.out.println("setter");
		this.s = s;
	}

	
	


	
	public void method1() {
		s.service();
	}
	

}
