package com.firstapp.first_spring_app;

import com.firstapp.first_spring_app.model.Address;
import com.firstapp.first_spring_app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@ComponentScan
//@Configuration
//@EnableAutoConfiguration
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
		System.out.println("Hello all, this our first spring application!");

		// tight coupling
//		Employee emp1 = new Employee();
//		emp1.id = 123;
//		emp1.name ="Ajay";
//		emp1.email = "ajay123@gmail.com";
//		emp1.designation = "Developer";
//
//		Address adrs1 = new Address();
//		adrs1.doorNo =3334;
//		adrs1.streetName="euisjxn";
//		adrs1.city="uiesjdxsk";
//
//		emp1.address = adrs1;
//
//		System.out.println("emp1 : "+emp1);
//		System.out.println("adrs1 : "+adrs1);
//
//		adrs1.doorNo =6666;
//		adrs1.streetName="aaaaaaa";
//		adrs1.city="ytrytrreeeee";
//
//		//emp1.address = adrs1;
//		System.out.println("emp1 : "+emp1);
//		System.out.println("adrs1 : "+adrs1);

		//loose coupling
//		Employee emp1 = new Employee();
//		emp1.setId(123);
//		emp1.setName("Sanjay");
//		emp1.setEmail("snajy@gmail.com");
//		emp1.setDesignation("Developer");
//
//		Address address1 = new Address();
//		address1.setDoorNo(333);
//		address1.setStreetName("BSIZKAM");
//		address1.setCity("iuwhsnzaa");
//
//		emp1.setAddress(address1);
//
//		System.out.println("emp1 : "+emp1);
//		System.out.println("address1 : "+address1);
//
//		emp1.getAddress().setDoorNo(444);
//		emp1.getAddress().setStreetName("ooooooooo");
//		emp1.getAddress().setCity("yyyyyyy");
//
//		System.out.println("emp1 : "+emp1);
//		System.out.println("address1 : "+address1);
//
//		Address adrs2 = new Address(888, "iejds","oiesdjxn");
//
//		Employee emp2 = new Employee(234, "Vijay","vijay@gmail,com","developer",adrs2);



	}

}
