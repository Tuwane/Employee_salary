public class Worker{
private int empNum;
private String lastName;
private String firstName;
private double salary;

public void setEmpNum(int empNum){
	this.empNum = empNum;
}

public int getEmpNum(){
	return empNum;
}

public void setLastName(String surn){
	lastName = surn;
}

public String getLastName(){
	return lastName;
}

public void setfirstName(String name){
	firstName = name;
}

public String getfirstName(){
	return firstName;
}

public void setSalary(double sal){
	salary = sal;
}

public double getSalary(){
	return salary;
}

public void disp(){
System.out.println("Emp number is 		:	" + empNum);
System.out.println("Last Name		:	" + lastName);
System.out.println("First Name		:	" + firstName);
System.out.println("Salary 			:	" + salary);		
}

}