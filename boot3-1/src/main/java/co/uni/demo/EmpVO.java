package co.uni.demo;

import java.util.Date;

import lombok.Data;

@Data
public class EmpVO {
	String employeeId;
	String firstName;
	String lastName;
	String salary;
	Date hireDate;
}
