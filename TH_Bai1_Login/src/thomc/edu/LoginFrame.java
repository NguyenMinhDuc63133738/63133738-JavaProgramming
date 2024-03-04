package thomc.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenDangNhap;
	private JPasswordField txtMatKhau;

	public LoginFrame() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Đăng nhập hệ thống quản lí bán hàng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đăng nhập: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 34, 149, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("Mật khẩu:");
		lblMtKhu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMtKhu.setBounds(10, 108, 149, 52);
		contentPane.add(lblMtKhu);
		
		txtTenDangNhap = new JTextField();
		txtTenDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTenDangNhap.setBounds(169, 34, 333, 38);
		contentPane.add(txtTenDangNhap);
		txtTenDangNhap.setColumns(10);
		
		JButton btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnDangNhap.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDangNhap.setBounds(169, 224, 333, 44);
		contentPane.add(btnDangNhap);
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setBounds(169, 108, 333, 38);
		contentPane.add(txtMatKhau);
	}
	void XuLyDangNhap()
	{
		String strTen = txtTenDangNhap.getText();
		String strMK = txtMatKhau.getText();
		if(strTen.equals("63CNTT")&&strMK.equals("123"))
			{
				HomeFrame homePage = new HomeFrame();
				homePage.setVisible(true);
				this.setVisible(false);
			}
			else
			{
				txtTenDangNhap.setText("");
				txtTenDangNhap.setText("");
				JOptionPane hopThoai = new JOptionPane();
				hopThoai.showMessageDialog(this,"Đăng nhập thất bại");
			}
		
	}
}
