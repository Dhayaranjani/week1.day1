package week1.day1;

public class TwoWheeler {
	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chassisNumber = 765432879876L;
	boolean isPunctured = false;
	String bikeName = "Scooty Pep";
	double runningKM = 1000.253;
	String result ="";
	
	public static void main(String[] args) {
		TwoWheeler myTwoWheeler = new TwoWheeler();

		System.out.println("This is Assignment 1 : TwoWheeler");
		System.out.println("My Two Wheerler has");
		System.out.println("-------------------");
		System.out.println("No Of Wheels: " + myTwoWheeler.noOfMirrors);
		System.out.println("No Of Mirrors: " + myTwoWheeler.noOfMirrors);
		System.out.println("Chassis Number: " + myTwoWheeler.chassisNumber);
		if (!myTwoWheeler.isPunctured) 
			myTwoWheeler.result = "No";
		else
			myTwoWheeler.result = "Yes";
		System.out.println("Is it Punctured: " + myTwoWheeler.result);
		System.out.println("Bike Name: " + myTwoWheeler.bikeName);
		System.out.println("Runnign KM: " + myTwoWheeler.runningKM);
	}
}
