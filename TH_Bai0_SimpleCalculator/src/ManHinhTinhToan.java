import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;
	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình tính toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a):");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(28, 37, 162, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b):");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(28, 108, 162, 32);
		contentPane.add(lblNhpSTh);
		
		textField = new JTextField();
		textField.setBounds(194, 46, -984, -261);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtA = new JTextField();
		txtA.setBounds(222, 42, 210, 28);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(222, 113, 210, 28);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(28, 197, 85, 21);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(142, 199, 85, 21);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(267, 199, 85, 21);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(403, 199, 85, 21);
		contentPane.add(btnChia);
		
		JLabel lblKtQu = new JLabel("Kết quả: ");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(91, 251, 99, 32);
		contentPane.add(lblKtQu);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setBounds(222, 254, 210, 32);
		contentPane.add(txtKetQua);
		txtKetQua.setColumns(10);
	}
	void HamXuLyCong() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		double tong = soA + soB;
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyTru() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		double tong = soA - soB;
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyNhan() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		double tong = soA * soB;
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyChia() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		Double soA = Double.parseDouble(str_soA);
		Double soB = Double.parseDouble(str_soB);
		double tong = soA / soB;
		txtKetQua.setText(String.valueOf(tong));
	}
}
