public class BeerSong {
	public static void main (String[] args) {
		int beerNum = 99;
		while (beerNum > 2) {
			System.out.println(beerNum + " bottles of beer on the wall,");
			System.out.println(beerNum + " bottles of beer!");
			System.out.println("Take one down, pass it around--");
			beerNum = beerNum - 1;
			System.out.println(beerNum + " bottles of beer on the wall.");
		}
		if (beerNum == 2) {
			System.out.println(beerNum + " bottles of beer on the wall,");
			System.out.println(beerNum + " bottles of beer!");
			System.out.println("Take one down, pass it around--");
			beerNum = beerNum - 1;
			System.out.println("Only one bottle of beer on the wall.");
		}
		if (beerNum == 1) {
			System.out.println("Only " + beerNum + " bottle of beer on the wall,");
			System.out.println("Only " + beerNum + " bottle of beer!");
			System.out.println("Take it down, pass it around--");
			beerNum = beerNum - 1;
			System.out.println("There are no bottles of beer on the wall.");
		}
	}
}