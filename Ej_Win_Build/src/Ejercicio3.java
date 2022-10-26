import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ejercicio3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
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
	public Ejercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elige una opcion");
		lblNewLabel.setBounds(26, 50, 127, 14);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		rdbtnNewRadioButton.setBounds(26, 67, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		rdbtnNewRadioButton_1.setBounds(26, 93, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		rdbtnNewRadioButton_2.setBounds(26, 119, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Programacion");
		chckbxNewCheckBox.setBounds(258, 67, 127, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Diseño Grafico");
		chckbxNewCheckBox_1.setBounds(258, 93, 127, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administracion");
		chckbxNewCheckBox_2.setBounds(258, 119, 127, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JLabel lblNewLabel_1 = new JLabel("Elige una especialidad");
		lblNewLabel_1.setBounds(258, 50, 153, 14);
		contentPane.add(lblNewLabel_1);
		
		JSlider slider = new JSlider();
		slider.setValue(0);
		slider.setMaximum(10);
		slider.setBounds(65, 200, 200, 26);
		contentPane.add(slider);
		
		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas en el ordenador");
		lblNewLabel_2.setBounds(65, 175, 220, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Mostrar");
		
		
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String sistema_operativo = null,tarea = null;
				
				if(rdbtnNewRadioButton.isSelected()) {
					sistema_operativo = rdbtnNewRadioButton.getText();
				}
				if(rdbtnNewRadioButton_1.isSelected()) {
					sistema_operativo = rdbtnNewRadioButton_1.getText();
				}
				if(rdbtnNewRadioButton_2.isSelected()) {
					sistema_operativo = rdbtnNewRadioButton_2.getText();
				}
				
				if(chckbxNewCheckBox.isEnabled()) {
					tarea=chckbxNewCheckBox.getText();
				}
				
				if(chckbxNewCheckBox_1.isEnabled()) {
					tarea=chckbxNewCheckBox_1.getText();
				}
				
				if(chckbxNewCheckBox_2.isEnabled()) {
					tarea=chckbxNewCheckBox_2.getText();
				}
				
				int valor_slider=slider.getValue();
				
				JOptionPane.showMessageDialog(null,"Sistema operativo: "+sistema_operativo+"\n Especialidad: "+tarea+"\n Horas dedicadas: "+valor_slider);
			}
		});
		btnNewButton.setBounds(312, 200, 89, 23);
		
		
		contentPane.add(btnNewButton);
	}
}
