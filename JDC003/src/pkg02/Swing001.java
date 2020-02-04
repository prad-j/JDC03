package pkg02;

import javax.swing.JOptionPane;

public class Swing001 {
	public static void main(String args[]){
		
		String fn = JOptionPane.showInputDialog("Enter the first number:");
		String sn = JOptionPane.showInputDialog("Enter the second number:");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null, "The answer is: "+ sum, "The Title", JOptionPane.PLAIN_MESSAGE);
		
	}
	
}
