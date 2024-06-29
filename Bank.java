
public interface Bank {
    void rateofintrest(double amount);	

}
class HBL  implements Bank{
     double rate;
	@Override
	public void rateofintrest(double amount) {
		// TODO Auto-generated method stub
		rate=amount*0.07;
		System.out.println("Toal intreset of HBL is= "+rate);	}
	
}
class  ABL implements Bank{
double rate;
	@Override
	public void rateofintrest(double amount) {
		// TODO Auto-generated method stub
		rate=amount*(7.5/100);
		System.out.print("Toal intreset of ABL is= "+rate);	}

		
	}
	
