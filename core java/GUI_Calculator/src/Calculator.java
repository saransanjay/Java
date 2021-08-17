import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 200, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);

		JLabel lblNewLabel = new JLabel("Dev by SS");
		lblNewLabel.setBounds(4, 8, 96, 13);
		desktopPane.add(lblNewLabel);

		JLabel Input1 = new JLabel("Input1");
		Input1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Input1.setBounds(70, 60, 60, 39);
		desktopPane.add(Input1);

		JLabel Input2 = new JLabel("Input2");
		Input2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Input2.setBounds(70, 124, 60, 39);
		desktopPane.add(Input2);

		JLabel lblNewLabel_1 = new JLabel("Result");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(70, 192, 60, 39);
		desktopPane.add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setBounds(140, 67, 96, 26);
		desktopPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(140, 134, 96, 26);
		desktopPane.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(140, 202, 96, 26);
		desktopPane.add(textField_3);

		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float num1, num2, result;
				num1 = Float.parseFloat(textField_1.getText());
				num2 = Float.parseFloat(textField_2.getText());
				result = num1 + num2;
				textField_3.setText(String.valueOf(result));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton.setBounds(323, 17, 93, 54);
		desktopPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Sub");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float num1, num2, result;
				num1 = Float.parseFloat(textField_1.getText());
				num2 = Float.parseFloat(textField_2.getText());
				result = num1 - num2;
				textField_3.setText(String.valueOf(result));
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_1.setBounds(325, 86, 91, 54);
		desktopPane.add(btnNewButton_1);

		JButton btnX = new JButton("Mul");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float num1, num2, result;
				num1 = Float.parseFloat(textField_1.getText());
				num2 = Float.parseFloat(textField_2.getText());
				result = num1 * num2;
				textField_3.setText(String.valueOf(result));
			}
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnX.setBounds(323, 154, 93, 54);
		desktopPane.add(btnX);

		JButton btnNewButton_2 = new JButton("Div");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float num1, num2, result;
				num1 = Float.parseFloat(textField_1.getText());
				num2 = Float.parseFloat(textField_2.getText());
				result = num1 / num2;
				textField_3.setText(String.valueOf(result));
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnNewButton_2.setBounds(322, 223, 94, 54);
		desktopPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Clear");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_3.setBounds(140, 254, 96, 21);
		desktopPane.add(btnNewButton_3);
	}
}
