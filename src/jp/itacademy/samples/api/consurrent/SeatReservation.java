package jp.itacademy.samples.api.consurrent;

public class SeatReservation {
	
	public static void main(String[] args) {
		
		Seat seat = new Seat();
		
		Person alice = new Person("Alice", seat);
		new Thread(alice).start();
		
		Person bobby = new Person("Bobby", seat);
		new Thread(bobby).start();
		
		Person cathy = new Person("Cathy", seat);
		new Thread(cathy).start();
	}
}
