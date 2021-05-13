package ComponentConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class College {

	Principle prinicple;
	Teacher teacher;
	
	@Value("somaiya")
	String collegename;
	
	
	@Autowired
	public void setPrinicple(Principle prinicple) {
		this.prinicple = prinicple;
	}

	@Autowired
	@Qualifier("historyTeacher")
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Autowired
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}


	
	public void print() {
	           prinicple.princi();
	           teacher.teach();
	           System.out.println(collegename);
	}
	
	
	
	
	
	
}
