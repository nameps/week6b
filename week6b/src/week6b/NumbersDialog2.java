package week6b;

import javax.swing.JOptionPane;

public class NumbersDialog2 {
	public static void main(String[]args) {
		int creditDays =30;
		JOptionPane.showMessageDialog(null,"" + creditDays);
		JOptionPane.showMessageDialog(null, "Every bill is due in" +creditDays );
		JOptionPane.showMessageDialog(null,"Thank You");
	}
}
