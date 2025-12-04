package com.vignesh.spring_data_jpa_ex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vignesh.spring_data_jpa_ex.model.Student;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo = context.getBean(StudentRepo.class);

		Student s1 = context.getBean(Student.class);
		// Student s2 = context.getBean(Student.class);
		// Student s3 = context.getBean(Student.class);

		s1.setRollNo(101);
		s1.setName("Vignesh");
		s1.setMarks(87);

		repo.save(s1);

	}

} 