import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKetQua;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public ManHinhTinh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập a:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(30, 39, 80, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpB = new JLabel("Nhập b:");
		lblNhpB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpB.setBounds(30, 92, 80, 47);
		contentPane.add(lblNhpB);
		
		JLabel lblNhpC = new JLabel("Nhập c:");
		lblNhpC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpC.setBounds(30, 148, 80, 47);
		contentPane.add(lblNhpC);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(120, 39, 371, 35);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(120, 92, 371, 35);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtC.setColumns(10);
		txtC.setBounds(120, 148, 371, 35);
		contentPane.add(txtC);
		
		JButton btnTinh = new JButton("Tính ");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TinhPTB2();
			}
		});
		btnTinh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTinh.setBounds(120, 238, 121, 59);
		contentPane.add(btnTinh);
		
		JLabel lblKtQu = new JLabel("Kết quả:");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(30, 316, 80, 47);
		contentPane.add(lblKtQu);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(120, 317, 371, 35);
		contentPane.add(txtKetQua);
	}
	void TinhPTB2() {
	    try {
	        double a = Double.parseDouble(txtA.getText());
	        double b = Double.parseDouble(txtB.getText());
	        double c = Double.parseDouble(txtC.getText());

	        double delta = b * b - 4 * a * c;
	        double x1, x2;

	        if (delta < 0) {
	            txtKetQua.setText("Phương trình không có nghiệm thực.");
	        } else if (delta == 0) {
	            x1 = -b / (2 * a);
	            txtKetQua.setText(String.format("Nghiệm kép: x = %.2f", x1));
	        } else {
	            x1 = (-b + Math.sqrt(delta)) / (2 * a);
	            x2 = (-b - Math.sqrt(delta)) / (2 * a);
	            txtKetQua.setText(String.format("Nghiệm 1: x1 = %.2f, Nghiệm 2: x2 = %.2f", x1, x2));
	        }
	    } catch (NumberFormatException e) {
	        txtKetQua.setText("Vui lòng nhập số hợp lệ cho các hệ số a, b, c.");
	    }
	}
}
