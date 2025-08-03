import javax.swing.JOptionPane;

public class Maine1{
public static void main(String[] args){

String fname,lname;
int eP;
double sal;
Worker lucky = new Worker();

lucky.setEmpNum(422);
lucky.setLastName("Mofokeng");
lucky.setfirstName("Lucky");
lucky.setSalary(2000.00);


lucky.disp();
Worker pule = new Worker();

String inp1 = JOptionPane.showInputDialog(null,"Enter EPN number");
eP = Integer.parseInt(inp1);

fname = JOptionPane.showInputDialog(null,"Enter First Name");
lname = JOptionPane.showInputDialog(null,"Enter Last Name");

String inp2 = JOptionPane.showInputDialog(null,"Enter Salary");
sal = Double.parseDouble(inp2);

pule.setEmpNum(eP);
pule.setLastName(lname);
pule.setfirstName(fname);
pule.setSalary(sal);

String output= "Emp number is  	:	" + pule.getEmpNum() + "\n"
		+ "First Name 	:	" + pule.getLastName() +"\n"
		+ "Last Name	:	" + pule.getfirstName() +"\n"
		+ "Salary	:		R" + pule.getSalary();

JOptionPane.showMessageDialog(null,output);


}
}

