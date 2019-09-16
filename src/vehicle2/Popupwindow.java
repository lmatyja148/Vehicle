package vehicle2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;

public class Popupwindow extends JFrame {

	private JPanel contentPane;

	
	 
	
					
	public Popupwindow(ImageIcon pic, String P) {
	
		
		
		this.setSize(833,624);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 550, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Chiller", Font.PLAIN, 11));
		lblNewLabel.setBounds(61, 142, 413, 369);
		lblNewLabel.setIcon(pic);
		
		contentPane.add(lblNewLabel);
		
		JTextArea txtArea1 = new JTextArea(); 
		txtArea1.setForeground(Color.BLACK);
		txtArea1.setFont(new Font("Dubai", Font.PLAIN, 13));
		txtArea1.setBounds(5, 28, 529, 103);
		 
		
		txtArea1.setText(P);
		txtArea1.setLineWrap( true );
		txtArea1.setWrapStyleWord(true);
		
	
		contentPane.add(txtArea1);
		setVisible(true);
		 
		

}
}
	