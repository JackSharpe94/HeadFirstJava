
public class MakeCanine {
	public void go() {
		Canine c;
		c = new Dog();
		//The above is ok as you are assigning the object to superclass ref
		
		c = new Canine();
		c.Roam();
		
		//This is not ok as Canine is abstract
	}
	
	public static main void (String[] args) {
		MakeCanine canine = new MakeCanine();
		canine.go();
		
		//This causes errors as c cannot equal abstract class
	}
}
