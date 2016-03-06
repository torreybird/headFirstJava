class BooksTestDrive {
	public static void main (String[] args) {
		Books[] myBooks = new Books[3]; //New myBooks array of references to Books objects
		int x = 0; //moved from the above	
		//create instances of Books for each referenced
		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();
		//titles of each referenced book object
		myBooks[0].title = "The Grapes of Java";
		myBooks[1].title = "The Java Gatsby";
		myBooks[2].title = "The Java Cookbook";
		//authors of each referenced book object
		myBooks[0].author = "Dendro Chronologist";
		myBooks[1].author = "Macho Pikachu";
		myBooks[2].author = "Fahr Vegnugan";
		
		//loop!

		while (x < 3) { //should get the whole loop, since the myBooks indicies are 0, 1, 2
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.println(myBooks[x].author);
			x = x + 1;
		}
		
	}
}