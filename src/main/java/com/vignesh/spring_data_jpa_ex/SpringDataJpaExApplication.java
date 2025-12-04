package com.vignesh.spring_data_jpa_ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		// Student s1 = context.getBean(Student.class);
		// Student s2 = context.getBean(Student.class);
		// Student s3 = context.getBean(Student.class);

		// s1.setRollNo(101);
		// s1.setName("Vignesh");
		// s1.setMarks(87);

		// s2.setRollNo(102);
		// s2.setName("Navid");
		// s2.setMarks(87);

		// s3.setRollNo(103);
		// s3.setName("Reddy");
		// s3.setMarks(87);

		// repo.save(s1);

		// Optional<Student> s= repo.findById(101);

		// s.ifPresent(System.out::print);

		System.out.println(repo.findByName("Vignesh"));

	}

}