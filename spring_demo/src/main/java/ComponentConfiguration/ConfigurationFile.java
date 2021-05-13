package ComponentConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ComponentConfiguration")
public class ConfigurationFile {
	
	/*
	 * @Bean public Principle principlename() { return new Principle(); }
	 * 
	 * @Bean public Teacher teache() {
	 *  return new HistoryTeacher();
	 *   }
	 * 
	 * @Bean public College collegeBean() {
	 *  College college=new College();
	 * college.setPrinicple( principlename());
	 *  college.setTeacher(teache());
	 *   return college; }
	 */

}
