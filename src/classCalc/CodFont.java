package classCalc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class CodFont extends JFrame {
	
	/*
	 * Jhonata Flores Sande
	 * Primeira API 100% funcional
	 */
	private static final long serialVersionUID = 1L;

	private double num1, num2, calc;
	
	private char operador = ' ';

	private String antigo;

	JLabel tela, armazenado;

	public CodFont() {
		setTitle("Calculadora");
		setResizable(false);
		getContentPane().setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(31, 31, 31));
		this.setSize(308, 415);
		this.setLocationRelativeTo(null);

		JButton botao_7 = new JButton("7");
		botao_7.setBackground(new Color(6, 6, 6));
		botao_7.setForeground(new Color(255, 255, 255));
		botao_7.setFont(new Font("Noto Sans", Font.PLAIN, 25));
		botao_7.setBorder(null);
		botao_7.setSize(70, 45);
		botao_7.setLocation(3, 187);
		/* Action */
		botao_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numerosDaTela('7');
			}
		});
		/* Action */
		getContentPane().add(botao_7);

		JButton botao_8 = new JButton("8");
		botao_8.setBackground(new Color(6, 6, 6));
		botao_8.setForeground(new Color(255, 255, 255));
		botao_8.setFont(new Font("Noto Sans", Font.PLAIN, 25));
		botao_8.setBorder(null);
		botao_8.setSize(70, 45);
		botao_8.setLocation(75, 187);
		/* Action */
		botao_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numerosDaTela('8');
			}
		});
		/* Action */
		getContentPane().add(botao_8);

		JButton botao_9 = new JButton("9");
		botao_9.setBackground(new Color(6, 6, 6));
		botao_9.setForeground(new Color(255, 255, 255));
		botao_9.setFont(new Font("Noto Sans", Font.PLAIN, 25));
		botao_9.setBorder(null);
		botao_9.setSize(70, 45);
		botao_9.setLocation(147, 187);
		/* Action */
		botao_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numerosDaTela('9');
			}
		});
		/* Action */
		getContentPane().add(botao_9);

		JButton botao_4 = new JButton("4");
		botao_4.setBackground(new Color(6, 6, 6));
		botao_4.setForeground(new Color(255, 255, 255));
		botao_4.setFont(new Font("Noto Sans", Font.PLAIN, 25));
		botao_4.setBorder(null);
		botao_4.setSize(70, 45);
		botao_4.setLocation(3, 234);
		/* Action */
		botao_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numerosDaTela('4');
			}
		});
		/* Action */
		getContentPane().add(botao_4);

		JButton botao_5 = new JButton("5");
		botao_5.setBackground(new Color(6, 6, 6));
		botao_5.setForeground(new Color(255, 255, 255));
		botao_5.setFont(new Font("Noto Sans", Font.PLAIN, 25));
		botao_5.setBorder(null);
		botao_5.setSize(70, 45);
		botao_5.setLocation(75, 234);
		/* Action */
		botao_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numerosDaTela('5');
			}
		});
		/* Action */
		getContentPane().add(botao_5);

		JButton botao_6 = new JButton("6");
		botao_6.setBackground(new Color(6, 6, 6));
		botao_6.setForeground(new Color(255, 255, 255));
		botao_6.setFont(new Font("Noto Sans", Font.PLAIN, 25));
		botao_6.setBorder(null);
		botao_6.setSize(70, 45);
		botao_6.setLocation(147, 234);
		/* Action */
		botao_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numerosDaTela('6');
			}
		});
		/* Action */
		getContentPane().add(botao_6);

		JButton botao_1 = new JButton("1");
		botao_1.setBackground(new Color(6, 6, 6));
		botao_1.setForeground(new Color(255, 255, 255));
		botao_1.setFont(new Font("Noto Sans", Font.PLAIN, 25));
		botao_1.setBorder(null);
		botao_1.setSize(70, 45);
		botao_1.setLocation(3, 281);
		/* Action */
		botao_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numerosDaTela('1');
			}
		});
		/* Action */
		getContentPane().add(botao_1);

		JButton botao_2 = new JButton("2");
		botao_2.setBackground(new Color(6, 6, 6));
		botao_2.setForeground(new Color(255, 255, 255));
		botao_2.setFont(new Font("Noto Sans", Font.PLAIN, 25));
		botao_2.setBorder(null);
		botao_2.setSize(70, 45);
		botao_2.setLocation(75, 281);
		/* Action */
		botao_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numerosDaTela('2');
			}
		});
		/* Action */
		getContentPane().add(botao_2);

		JButton botao_3 = new JButton("3");
		botao_3.setBackground(new Color(6, 6, 6));
		botao_3.setForeground(new Color(255, 255, 255));
		botao_3.setFont(new Font("Noto Sans", Font.PLAIN, 25));
		botao_3.setBorder(null);
		botao_3.setSize(70, 45);
		botao_3.setLocation(147, 281);
		/* Action */
		botao_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numerosDaTela('3');
			}
		});
		/* Action */
		getContentPane().add(botao_3);

		JButton botao_sinal = new JButton("+/-");
		botao_sinal.setBackground(new Color(6, 6, 6));
		botao_sinal.setForeground(new Color(255, 255, 255));
		botao_sinal.setFont(new Font("Noto Sans", Font.PLAIN, 20));
		botao_sinal.setBorder(null);
		botao_sinal.setSize(70, 45);
		botao_sinal.setLocation(3, 328);
		/* Action */
		botao_sinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trocarSinal();
			}
		});
		/* Action */
		getContentPane().add(botao_sinal);

		JButton botao_0 = new JButton("0");
		botao_0.setBackground(new Color(6, 6, 6));
		botao_0.setForeground(new Color(255, 255, 255));
		botao_0.setFont(new Font("Noto Sans", Font.PLAIN, 25));
		botao_0.setBorder(null);
		botao_0.setSize(70, 45);
		botao_0.setLocation(75, 328);
		/* Action */
		botao_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numerosDaTela('0');
			}
		});
		/* Action */
		getContentPane().add(botao_0);

		JButton botao_virgula = new JButton(".");
		botao_virgula.setBackground(new Color(6, 6, 6));
		botao_virgula.setForeground(new Color(255, 255, 255));
		botao_virgula.setFont(new Font("Noto Sans", Font.PLAIN, 25));
		botao_virgula.setBorder(null);
		botao_virgula.setSize(70, 45);
		botao_virgula.setLocation(147, 328);
		/* Action */
		botao_virgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numerosDaTela('.');
			}
		});
		/* Action */
		getContentPane().add(botao_virgula);

		/*
		 * Operadores Logicos e igual
		 */

		JButton botao_igual = new JButton("=");
		botao_igual.setForeground(Color.WHITE);
		botao_igual.setFont(new Font("Noto Sans", Font.PLAIN, 25));
		botao_igual.setBorder(null);
		botao_igual.setBackground(new Color(6, 6, 6));
		botao_igual.setBounds(219, 281, 70, 92);
		/* Action */
		botao_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getNum2();
				getCalc();
				operador = ' ';
				armazenado.setText("");
			}
		});
		/* Action */
		getContentPane().add(botao_igual);

		JButton botao_mais = new JButton("+");
		botao_mais.setForeground(Color.WHITE);
		botao_mais.setFont(new Font("Noto Sans", Font.PLAIN, 25));
		botao_mais.setBorder(null);
		botao_mais.setBackground(new Color(6, 6, 6));
		botao_mais.setBounds(219, 234, 70, 45);
		/* Action */
		botao_mais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operador = '+';
				getNum1();
				getArmazenado();
			}
		});
		/* Action */
		getContentPane().add(botao_mais);

		JButton botao_menos = new JButton("-");
		botao_menos.setForeground(Color.WHITE);
		botao_menos.setFont(new Font("Noto Sans", Font.PLAIN, 25));
		botao_menos.setBorder(null);
		botao_menos.setBackground(new Color(6, 6, 6));
		botao_menos.setBounds(219, 187, 70, 45);
		/* Action */
		botao_menos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operador = '-';
				getNum1();
				getArmazenado();
			}
		});
		/* Action */
		getContentPane().add(botao_menos);

		JButton botao_dividir = new JButton("/");
		botao_dividir.setForeground(Color.WHITE);
		botao_dividir.setFont(new Font("Noto Sans", Font.PLAIN, 22));
		botao_dividir.setBorder(null);
		botao_dividir.setBackground(new Color(6, 6, 6));
		botao_dividir.setBounds(75, 140, 70, 45);
		/* Action */
		botao_dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operador = '/';
				getNum1();
				getArmazenado();
			}
		});
		/* Action */
		getContentPane().add(botao_dividir);

		JButton botao_vezes = new JButton("*");
		botao_vezes.setForeground(Color.WHITE);
		botao_vezes.setFont(new Font("Noto Sans", Font.PLAIN, 20));
		botao_vezes.setBorder(null);
		botao_vezes.setBackground(new Color(6, 6, 6));
		botao_vezes.setBounds(147, 140, 70, 45);
		/* Action */
		botao_vezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operador = '*';
				getNum1();
				getArmazenado();
			}
		});
		/* Action */
		getContentPane().add(botao_vezes);

		JButton botao_del = new JButton("Del");
		botao_del.setForeground(Color.WHITE);
		botao_del.setFont(new Font("Noto Sans", Font.PLAIN, 20));
		botao_del.setBorder(null);
		botao_del.setBackground(new Color(6, 6, 6));
		botao_del.setBounds(219, 140, 70, 45);
		/* Action */
		botao_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela.setText("");
			}
		});
		/* Action */
		getContentPane().add(botao_del);

		JButton botao_limpar = new JButton("C");
		botao_limpar.setForeground(Color.WHITE);
		botao_limpar.setFont(new Font("Noto Sans", Font.PLAIN, 22));
		botao_limpar.setBorder(null);
		botao_limpar.setBackground(new Color(6, 6, 6));
		botao_limpar.setBounds(3, 140, 70, 45);
		/* Action */
		botao_limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = 0;
				num2 = 0;
				calc = 0;
				tela.setText("");
				armazenado.setText("");
			}
		});
		/* Action */
		getContentPane().add(botao_limpar);

		/* Telas */
		tela = new JLabel("");
		tela.setForeground(Color.WHITE);
		tela.setFont(new Font("Noto Sans", Font.BOLD, 30));
		tela.setHorizontalAlignment(SwingConstants.RIGHT);
		tela.setBounds(3, 66, 286, 63);
		getContentPane().add(tela);

		armazenado = new JLabel("");
		armazenado.setHorizontalAlignment(SwingConstants.RIGHT);
		armazenado.setForeground(new Color(255, 255, 255));
		armazenado.setFont(new Font("Noto Sans", Font.BOLD, 20));
		armazenado.setBounds(3, 11, 286, 45);
		getContentPane().add(armazenado);

		this.setVisible(true);
	}

	public void numerosDaTela(char numero) {
		antigo = tela.getText();
		antigo = antigo + numero;
		tela.setText(antigo);
	}

	public void getArmazenado() {
		String x = antigo;
		String y = String.valueOf(operador);
		x = x + " " + y;
		armazenado.setText(x);
	}

	public void trocarSinal() {
		double antigo = Double.valueOf(tela.getText());
		antigo = antigo * -1;
		tela.setText(Double.toString(antigo));
	}

	public void getNum1() {
		if(tela.getText().equals("")) {
			
		} else {
			num1 = Double.parseDouble(tela.getText());
			tela.setText("");
		}
		
	}

	public void getNum2() {
		num2 = Double.parseDouble(tela.getText());
		tela.setText("");
	}

	public void getCalc() {
		if (num1 != 0 && num2 != 0) {

			if (operador == '+') {
				calc = num1 + num2;
			} else if (operador == '-') {
				calc = num1 - num2;
			} else if (operador == '/') {
				calc = num1 / num2;
			} else if (operador == '*') {
				calc = num1 * num2;
			}

		}

		tela.setText(String.valueOf(calc));

	}
}
