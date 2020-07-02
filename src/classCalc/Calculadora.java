package classCalc;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Calculadora extends JFrame {
	public Calculadora() {
	}
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new CodFont();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
