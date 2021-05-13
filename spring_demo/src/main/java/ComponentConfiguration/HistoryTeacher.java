package ComponentConfiguration;

import org.springframework.stereotype.Component;

@Component
public class HistoryTeacher implements Teacher {
public void teach() {
	System.out.println("History Teacher Activated");
	
}

}

