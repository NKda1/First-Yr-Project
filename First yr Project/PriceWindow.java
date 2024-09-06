import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PriceWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PriceWindow frame = new PriceWindow();
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
	public PriceWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 690);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Grilled Salmon\t15.95");
		lblNewJgoodiesLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel.setForeground(SystemColor.text);
		lblNewJgoodiesLabel.setBounds(46, 63, 168, 14);
		contentPane.add(lblNewJgoodiesLabel);
		
		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("Fruit Salad \t£10.95\t");
		lblNewJgoodiesLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel_1.setForeground(SystemColor.text);
		lblNewJgoodiesLabel_1.setBounds(46, 88, 136, 14);
		contentPane.add(lblNewJgoodiesLabel_1);
		
		JLabel lblNewJgoodiesLabel_2 = DefaultComponentFactory.getInstance().createLabel("Vegetarian Stir Fry\t £14.95");
		lblNewJgoodiesLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel_2.setForeground(SystemColor.text);
		lblNewJgoodiesLabel_2.setBounds(46, 113, 168, 14);
		contentPane.add(lblNewJgoodiesLabel_2);
		
		JLabel lblNewJgoodiesLabel_3 = DefaultComponentFactory.getInstance().createLabel("Grilled Chicken Salad \t£12.95");
		lblNewJgoodiesLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel_3.setForeground(SystemColor.text);
		lblNewJgoodiesLabel_3.setBounds(46, 138, 168, 14);
		contentPane.add(lblNewJgoodiesLabel_3);
		
		JLabel lblNewJgoodiesLabel_4 = DefaultComponentFactory.getInstance().createLabel("Quinoa Bowl\t£13.95");
		lblNewJgoodiesLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel_4.setForeground(SystemColor.text);
		lblNewJgoodiesLabel_4.setBounds(46, 163, 136, 14);
		contentPane.add(lblNewJgoodiesLabel_4);
		
		JLabel lblNewJgoodiesLabel_5 = DefaultComponentFactory.getInstance().createLabel("Vegetarian Sushi Roll \t£14.95");
		lblNewJgoodiesLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel_5.setForeground(SystemColor.text);
		lblNewJgoodiesLabel_5.setBounds(46, 188, 178, 14);
		contentPane.add(lblNewJgoodiesLabel_5);
		
		JLabel lblNewJgoodiesLabel_6 = DefaultComponentFactory.getInstance().createLabel("Child-friendly Snack Pack\t £8.95");
		lblNewJgoodiesLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel_6.setForeground(SystemColor.text);
		lblNewJgoodiesLabel_6.setBounds(46, 213, 178, 14);
		contentPane.add(lblNewJgoodiesLabel_6);
		
		JLabel lblNewJgoodiesLabel_7 = DefaultComponentFactory.getInstance().createLabel("Vegetarian Wrap\t£13.95\t");
		lblNewJgoodiesLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel_7.setForeground(SystemColor.text);
		lblNewJgoodiesLabel_7.setBounds(46, 238, 136, 14);
		contentPane.add(lblNewJgoodiesLabel_7);
		
		JLabel lblNewJgoodiesLabel_8 = DefaultComponentFactory.getInstance().createLabel("Sushi Combo\t£18.95");
		lblNewJgoodiesLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel_8.setForeground(SystemColor.text);
		lblNewJgoodiesLabel_8.setBounds(46, 263, 136, 14);
		contentPane.add(lblNewJgoodiesLabel_8);
		
		JLabel lblNewJgoodiesLabel_9 = DefaultComponentFactory.getInstance().createLabel("Salmon Teriyaki\t  £14.95");
		lblNewJgoodiesLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel_9.setForeground(SystemColor.text);
		lblNewJgoodiesLabel_9.setBounds(46, 288, 136, 14);
		contentPane.add(lblNewJgoodiesLabel_9);
		
		JLabel lblNewJgoodiesLabel_10 = DefaultComponentFactory.getInstance().createLabel("Fruit Snack Pack\t £8.95\t");
		lblNewJgoodiesLabel_10.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel_10.setForeground(SystemColor.text);
		lblNewJgoodiesLabel_10.setBounds(46, 313, 136, 14);
		contentPane.add(lblNewJgoodiesLabel_10);
		
		JLabel lblNewJgoodiesLabel_11 = DefaultComponentFactory.getInstance().createLabel("Caprese Salad\t £12.95");
		lblNewJgoodiesLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel_11.setForeground(SystemColor.text);
		lblNewJgoodiesLabel_11.setBounds(46, 338, 136, 14);
		contentPane.add(lblNewJgoodiesLabel_11);
		
		JLabel lblNewJgoodiesLabel_12 = DefaultComponentFactory.getInstance().createLabel("Chicken Caesar Salad\t £11.95");
		lblNewJgoodiesLabel_12.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel_12.setForeground(SystemColor.text);
		lblNewJgoodiesLabel_12.setBounds(46, 362, 168, 14);
		contentPane.add(lblNewJgoodiesLabel_12);
		
		JLabel lblNewJgoodiesLabel_14 = DefaultComponentFactory.getInstance().createLabel("Fruit Smoothie\t £4");
		lblNewJgoodiesLabel_14.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel_14.setForeground(SystemColor.text);
		lblNewJgoodiesLabel_14.setBounds(500, 188, 124, 14);
		contentPane.add(lblNewJgoodiesLabel_14);
		
		textField = new JTextField();
		textField.setBounds(243, 61, 86, 17);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Current Food  Price");
		lblNewJgoodiesTitle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewJgoodiesTitle.setForeground(SystemColor.controlLtHighlight);
		lblNewJgoodiesTitle.setBounds(46, 23, 146, 14);
		contentPane.add(lblNewJgoodiesTitle);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(243, 86, 86, 17);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(243, 111, 86, 17);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(243, 136, 86, 17);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(243, 161, 86, 17);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(243, 186, 86, 17);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(243, 211, 86, 17);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(243, 236, 86, 17);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(243, 261, 86, 17);
		contentPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(243, 286, 86, 17);
		contentPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(243, 311, 86, 17);
		contentPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(243, 336, 86, 17);
		contentPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(243, 360, 86, 17);
		contentPane.add(textField_12);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(701, 186, 86, 17);
		contentPane.add(textField_14);
		
		JLabel lblNewJgoodiesLabel_15 = DefaultComponentFactory.getInstance().createLabel("Mineral Water\t £2.5");
		lblNewJgoodiesLabel_15.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel_15.setForeground(SystemColor.text);
		lblNewJgoodiesLabel_15.setBounds(500, 63, 124, 14);
		contentPane.add(lblNewJgoodiesLabel_15);
		
		JLabel lblNewJgoodiesLabel_16 = DefaultComponentFactory.getInstance().createLabel("Herbal Tea\t £2.5");
		lblNewJgoodiesLabel_16.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel_16.setForeground(SystemColor.text);
		lblNewJgoodiesLabel_16.setBounds(500, 88, 92, 14);
		contentPane.add(lblNewJgoodiesLabel_16);
		
		JLabel lblNewJgoodiesLabel_17 = DefaultComponentFactory.getInstance().createLabel("Green Tea\t£2.5");
		lblNewJgoodiesLabel_17.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel_17.setForeground(SystemColor.text);
		lblNewJgoodiesLabel_17.setBounds(500, 113, 92, 14);
		contentPane.add(lblNewJgoodiesLabel_17);
		
		JLabel lblNewJgoodiesLabel_18 = DefaultComponentFactory.getInstance().createLabel("Iced Tea\t£2.5");
		lblNewJgoodiesLabel_18.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel_18.setForeground(SystemColor.text);
		lblNewJgoodiesLabel_18.setBounds(500, 138, 92, 14);
		contentPane.add(lblNewJgoodiesLabel_18);
		
		JLabel lblNewJgoodiesLabel_19 = DefaultComponentFactory.getInstance().createLabel("Iced Lemonade\t £2.5");
		lblNewJgoodiesLabel_19.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewJgoodiesLabel_19.setForeground(SystemColor.text);
		lblNewJgoodiesLabel_19.setBounds(500, 163, 137, 14);
		contentPane.add(lblNewJgoodiesLabel_19);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(701, 60, 86, 17);
		contentPane.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(701, 85, 86, 17);
		contentPane.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(701, 110, 86, 17);
		contentPane.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(701, 135, 86, 17);
		contentPane.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(701, 160, 86, 17);
		contentPane.add(textField_19);
		
		JLabel lblNewJgoodiesTitle_1 = DefaultComponentFactory.getInstance().createTitle("Current Drinks Price");
		lblNewJgoodiesTitle_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewJgoodiesTitle_1.setForeground(SystemColor.text);
		lblNewJgoodiesTitle_1.setBounds(500, 23, 178, 14);
		contentPane.add(lblNewJgoodiesTitle_1);
		
		JLabel lblNewJgoodiesTitle_3 = DefaultComponentFactory.getInstance().createTitle("New Price");
		lblNewJgoodiesTitle_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewJgoodiesTitle_3.setForeground(SystemColor.text);
		lblNewJgoodiesTitle_3.setBounds(241, 23, 88, 14);
		contentPane.add(lblNewJgoodiesTitle_3);
		
		JLabel lblNewJgoodiesTitle_5 = DefaultComponentFactory.getInstance().createTitle("New Price");
		lblNewJgoodiesTitle_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewJgoodiesTitle_5.setForeground(SystemColor.text);
		lblNewJgoodiesTitle_5.setBounds(699, 23, 88, 14);
		contentPane.add(lblNewJgoodiesTitle_5);
		
		JButton btnNewButton = new JButton("Back To Master Page");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				MasterWindow masterWindow= new MasterWindow ();
				masterWindow.setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(164, 502, 168, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Confirm Changes");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "Prices Adjusted");
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(635, 502, 152, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewJgoodiesTitle_2 = DefaultComponentFactory.getInstance().createTitle("");
		lblNewJgoodiesTitle_2.setIcon(new ImageIcon("price window.jpg"));
		lblNewJgoodiesTitle_2.setBounds(0, 0, 1014, 653);
		contentPane.add(lblNewJgoodiesTitle_2);
	}
}
