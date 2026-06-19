
public class PassByReference {

	
	public static void main(String[] args)
	{
		PassByReference value1 = new PassByReference();
		
		Computation computation1 = new Computation(20);
		value1.changeVariableValue(computation1);
		
		System.out.println("The value of x after passing by reference: " + computation1.x);
	}
	
	public void changeVariableValue(Computation computation)
	{
		 computation = new Computation();
		 
		 computation.x = 50;
		
		
	}
}

class Computation{
	
	
	int x;
	
	public Computation(int i) {
		x = i;
	}
	
	public Computation() {
		
		x = 1;
	}
}
