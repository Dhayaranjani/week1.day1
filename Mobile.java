package week1.day1;

public class Mobile {

	public void makeCall() {
		System.out.println("I can Make Calls");
	}
	
	public void sendMessage() {
		System.out.println("I can send Messages");
	}
	
	public static void main (String[] args) {
		System.out.println("Inside Main Method Mobile");
		
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMessage();
		
	}
}