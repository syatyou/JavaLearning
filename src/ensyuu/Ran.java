package ensyuu;
import java.util.Random;
public class Ran {
	
	public static void main(String[] args) {
		
		//Randomクラスのインスタンス化
		Random rnd = new Random();
		
		int ran = rnd.nextInt(100) + 1;
		System.out.println("もっと小さいです");
	}　　　

}
