
public class PassByValue {

	
	public static void main(String[] args)
	{
		int x = 15;
		
		PassByValue value1 = new PassByValue();
		value1.modify(x);
		
		System.out.println("Value of X is " + x);
		
	}
	
	public void modify(int x)
	{
		x = 12;
	}
}
