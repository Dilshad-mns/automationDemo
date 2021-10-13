package automation.demo;

public class Manufacture {
	
	public static void main(String args[]) {
	Car thar = new Thar();
	Car bugati = new Bugatti();
	
	thar.startEngine();
	System.out.println("Engine speed: "+ thar.acceleration()+"\n");
	
	bugati.startEngine();
	System.out.println("Engine speed: "+ bugati.acceleration());
	
	}
	
}
