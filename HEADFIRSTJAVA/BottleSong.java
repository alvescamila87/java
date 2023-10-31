public class BottleSong {
	public static void main(String[] args) {
	
		String word = "bottles";
		int bottlesNum = 10;
		
		while (bottlesNum > 0) {
		
			if (bottlesNum == 1) {
				word = "bottle"; // singular, as in ONE bottle
			}
			
			System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
			System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
			System.out.println("And if one green bottle should accidentally fall,");
			bottlesNum = bottlesNum - 1;
			
			if (bottlesNum > 0) {
				
				System.out.println("There'll be " + bottlesNum + " green " + word + ", hanging on the wall");
			} else {
				System.out.println("There'll be no green bottles, hanging on the wall");
			}
		}
	}	
}
	
	
