import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
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
	public Window() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JPanel panel_2 = new JPanel();
		
		JLabel lbResult = new JLabel("k");
		lbResult.setBackground(Color.WHITE);
		
		JPanel panel_3 = new JPanel();
		
		JLabel lblWord = new JLabel("word2");
		panel_3.add(lblWord);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		panel_3.add(textField2);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
						.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 428, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 427, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbResult, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(14)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lbResult, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(31, Short.MAX_VALUE))
		);
		
		JButton btCreate = new JButton("check");
		btCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input1 = textField1.getText();
				String input2 = textField2.getText();
				CheckAnagram myobj = new CheckAnagram();
				boolean result = myobj.CheckAnagram(input1, input2);
				if(result == true) {
					lbResult.setText("Anagrams");
					
				}else {
					
					lbResult.setText("Not Anagrams");
				}
				
				
			}
		});
		panel_2.add(btCreate);
		
		JLabel lblNewLabel = new JLabel("word1");
		panel_1.add(lblNewLabel);
		
		textField1 = new JTextField();
		panel_1.add(textField1);
		textField1.setColumns(10);
		
		JLabel lblAnagramGenerator = new JLabel("Anagram Generator");
		panel.add(lblAnagramGenerator);
		contentPane.setLayout(gl_contentPane);
	}
}
