import javax.swing.JOptionPane;

public class PrimeOrNOOOOOT {
public static void main(String[] args) {
	
String pos=JOptionPane.showInputDialog("Dr. Nugget: Hello, give me a positive number to continue.");	
	int nerm=Integer.parseInt(pos);

	if(nerm==1) {
		JOptionPane.showMessageDialog(null, "Dr. Nugget: Your number, "+pos+ " is not prime.");
		return;
	}
	if(nerm==2) {
		JOptionPane.showMessageDialog(null, "Dr. Nugget: Your number, "+pos+" is prime.");
		return;
	}
	
	for(int i=3;i<nerm;i+=2) {
		if(nerm%i==0) {
			JOptionPane.showMessageDialog(null, "Dr. Nugget: Your number, "+pos+ " is not prime.");
			return;
		}
	}
	JOptionPane.showMessageDialog(null, "Dr. Nugget: Your number, "+pos+" is prime.");
	return;
	
}
}

//lily: 12-9-12-25