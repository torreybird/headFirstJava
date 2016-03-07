class GoodDog {
	private int size; //declared the variable "size" and made it private
	
	public int getSize() { //made a getter for "size" that's public, returns int
		return size;
	}
	
	public void setSize(int s) {//made a setter for "size" that requires int
		size = s;
	}
	
	void bark() {
		if (size > 60) {
			System.out.println("WOOOOOF. WOOOOOF.");
		} else if (size > 14) {
			System.out.println("Arf! Arf!");
		} else {
			System.out.println("Yip! Yip! Yip!");
		}
	}
}