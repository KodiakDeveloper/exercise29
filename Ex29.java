package selectionStructures;

import javax.swing.JOptionPane;

public class Ex29 {

	public static void main(String[] args) {

		int a, b, c, d;

		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Input A: "));

		b = Integer.parseInt(JOptionPane.showInputDialog(null, "Input B: "));

		c = Integer.parseInt(JOptionPane.showInputDialog(null, "Input C: "));

		d = Integer.parseInt(JOptionPane.showInputDialog(null, "Input D: "));

		if (a > b && a > c && a > d) {

			JOptionPane.showMessageDialog(null, "Greatest Value A =  " + a);
		}

		else if (b > a && b > c && b > d) {

			JOptionPane.showMessageDialog(null, "Greatest Value B =  " + b);

		}

		else if (c > a && c > b && c > d) {

			JOptionPane.showMessageDialog(null, "Greatest Value C =  " + c);

		}

		else {

			JOptionPane.showMessageDialog(null, "Greatest Value D = " + d);

		}

	}

}
