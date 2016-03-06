class DogTestDrive {
	public static void main (String[] args) {
		Dog d = new Dog();
		d.size = 40;
		d.name = "Gertrude";
		System.out.println("Name: " + d.name);
		System.out.println("Size: " + d.size);
		d.bark();
	}
}