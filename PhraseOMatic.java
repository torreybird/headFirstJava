public class PhraseOMatic {
	public static void main (String[] args) {
		//three sets of words
		String[] wordListOne = {"24/7", "multi-tier","30,000 foot","B to B","win-win","front-end","web-based","pervasive","smart","six-sigma","critical-path","dynamic"};
		String[] wordListTwo = {"empowered","sticky","value-added","oriented","centric","distributed","clustered","branded","outside-the-box","in the DNA","positioned","networked","focused","leveraged","aligned","targeted","shared","cooperative","accelerated"};
		String[] wordListThree = {"process","tipping-point","solution","architecture","core competency","strategy","mindshare","portal","space","vision","paradigm","mission","growth"};
		
		//find out how many words are in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		//generate three random numbers
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		//build a phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
		
		//display the phrase
		System.out.println("What we need is a " + phrase);
	}
}