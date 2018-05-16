import javax.swing.JOptionPane;

public class Fibonacc_ItsFrench {
public static void main(String[] args) {
	int num1 = 1;
	int num2 = 1;
	String nerm = JOptionPane.showInputDialog("Dr. Nugget: How many Fobonacci number sequesnces would you like?");
	int fib = Integer.parseInt(nerm);
	System.out.println(1);
	System.out.println(1);
	for(int i=0;i<fib;i++){
		int sum=num1+num2;
		System.out.println(sum);
		num1=num2;
		num2=sum;
		
	}
	
	
	
}
}
