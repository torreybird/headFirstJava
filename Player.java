public class Player {
	int number = 0; //where the guess goes; declaring the thingummy so that it can has stuff. 
	public void guess () {
		number = (int) (Math.random() * 10);
		System.out.println("I'm guessing " + number); //this is the string returned when the guess() method is called?
	}
}