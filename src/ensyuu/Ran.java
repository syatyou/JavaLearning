package ensyuu;
import java.util.Random;
public class Ran {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int ran = random.nextInt(100) + 1;
		System.out.println(ran);
		
		
		if (ran >= 50) {
		  System.out.println("もっと小さいです");
		} else {
		  System.out.println("もっと大きいです");
	}
	}
}
