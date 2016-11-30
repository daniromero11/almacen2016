import java.util.Scanner;

public class Payment {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Introduce el ratio de inter�s: ");
		
		double annualrate= input.nextDouble();
		
		double monthlyRate= annualrate/1200;
		
		System.out.print("Introduce los a�os: ");
		
		int years= input.nextInt();
		
		System.out.print("Introduce el pr�stamo: ");
		
		int loan= input.nextInt();
		
		double monthlyPayment= (((loan*monthlyRate)/(1-(1/ Math.pow(1+monthlyRate,years*12 ) ) )));
		
		double totalPayment = monthlyPayment*12*years;
		
		System.out.println("el pago mensual es: " + (int)(monthlyPayment*100)/100.0);
		
		System.out.println("el pago total es: " + (int)(totalPayment*100)/100.0);
		
		
		
		
		

	}

}
