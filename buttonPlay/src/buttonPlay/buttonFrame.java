package buttonPlay;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class buttonFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final ActionListener ActionListener = null;
	private JPanel contentPane;
	private  JTextField textField;
	private  JButton buttonFalse;
	private  JButton buttonTrue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					buttonFrame frame = new buttonFrame();
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
	public buttonFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 buttonTrue = new JButton("true");
		buttonTrue.setBounds(5, 121, 192, 136);
		contentPane.add(buttonTrue);
		
	    buttonFalse = new JButton("false");
		buttonFalse.setBounds(207, 121, 222, 136);
		contentPane.add(buttonFalse);
		
		textField = new JTextField();
		textField.setBounds(20, 11, 404, 99);
		contentPane.add(textField);
		textField.setColumns(10);
		
		buttonFalse.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 if (e.getSource() == buttonFalse){
			 			
			 		   // String s1="false";
			 			textField.setText("false");
			 				System.out.println("testing false button");
				
			}
				
			
		
	
	
			}
		
	
	});
		
		buttonTrue.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 if (e.getSource() == buttonTrue){
			 			
			 		   // String s1="true";
			 			textField.setText("true");
			 				System.out.println("testing true button");
				
			}
				
			
		
	
	
			}
		
	
	});
	
			
		
		
	}}
		
		
	
	
