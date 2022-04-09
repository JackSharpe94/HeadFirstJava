
public class Cat {
	
	int size;
	int height;

	public Cat(int catSize, int catHeight) {
		
		size = catSize;
		height = catHeight;
		
	}
	
	public Cat() {
		
	}
}


// Declare like below: 
//possible to have multiple constructors to allow creation of objects 

Cat catTwo = new Cat();

Cat catOne = new Cat(5, 10);
