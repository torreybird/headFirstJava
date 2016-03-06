class Dog2 {
	String name; //make an instance variable? 
	public static void main (String[] args) {
		//Make a Dog object and access it
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";
		
		//Make a Dog array of size 3
		Dog[] myDogs = new Dog[3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1; //got the Dog already accessed, above
		
		//accessing Dogs using the array references
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		
		//Print out what myDogs[2]'s name is
		System.out.println("My last dog's name is " + myDogs[2].name);
		
		//now loop through the array and tell all the dogs to bark
		int x = 0;
		while (x < myDogs.length) {
			myDogs[x].bark();
			x = x + 1;
		}
	}
	
	public void bark() {
		System.out.println(name + " says Ruff!");
	}
	public void eat() {
		//method not defined
	}
	public void chaseCat() {
		//method not defined
	}
}