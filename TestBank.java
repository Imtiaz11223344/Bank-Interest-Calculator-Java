import java.util.*;
public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount;
Scanner sc=new Scanner(System.in);
 
System.out.print("Enter Your Amount= ");
amount=sc.nextDouble();
Bank b;
b=new HBL();
b.rateofintrest(amount);
b=new ABL();
b.rateofintrest(amount);

	}

}
