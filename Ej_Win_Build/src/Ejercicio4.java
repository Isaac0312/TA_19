import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio4 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 frame = new Ejercicio4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 79, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 79, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(65, 34, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Suma");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int operador1=Integer.parseInt(textField.getText());
				int operador2=Integer.parseInt(textField_1.getText());
				int resultat = operador1+operador2;
				textField_2.setText(Integer.toString(resultat));
			}
		});
		btnNewButton.setBounds(10, 133, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Resta");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int operador1=Integer.parseInt(textField.getText());
				int operador2=Integer.parseInt(textField_1.getText());
				int resultat = operador1-operador2;
				textField_2.setText(Integer.toString(resultat));
			}
		});
		btnNewButton_1.setBounds(120, 133, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Multiplicacion");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int operador1=Integer.parseInt(textField.getText());
				int operador2=Integer.parseInt(textField_1.getText());
				int resultat = operador1*operador2;
				textField_2.setText(Integer.toString(resultat));
			}
		});
		btnNewButton_2.setBounds(10, 187, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Division");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int operador1=Integer.parseInt(textField.getText());
				int operador2=Integer.parseInt(textField_1.getText());
				int resultat = operador1/operador2;
				textField_2.setText(Integer.toString(resultat));
			}
		});
		btnNewButton_3.setBounds(117, 187, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Salir");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		
		btnNewButton_4.setBounds(277, 158, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("Resultado");
		lblNewLabel.setBounds(90, 11, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Operador2");
		lblNewLabel_1.setBounds(142, 65, 77, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Operador1");
		lblNewLabel_2.setBounds(31, 65, 68, 14);
		contentPane.add(lblNewLabel_2);
	}
}
