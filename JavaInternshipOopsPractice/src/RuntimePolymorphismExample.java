

 class Animal{
	
	 public void eat() {
		 System.out.println("Animal eats food");
	 }
}
 
 class Dogs extends Animal{
	 public void eat()
	 {
		 System.out.println("Dog eats pedigree, snacks");
	 }
 }
 
 class Cat extends Animal{
	 public void eat()
	 {
		 System.out.println("Cat eats fish");
	 }
 }
 
 class Cow extends Animal{
	 public void eat()
	 {
		 System.out.println("Cow eats grass");
	 }
 }


public class RuntimePolymorphismExample {

	public static void main(String[] args)
	{
		Animal animal1 = new Dogs();
		
		animal1.eat();
	}
	
	
}
