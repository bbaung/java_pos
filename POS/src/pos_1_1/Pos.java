package pos_1_1;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Insets;

public class Pos {

	private JFrame frmPosVersion;
	private JTable table;
	private JTextField jtxtTax;
	private JTextField jtxtSubTotal;
	private JTextField jtxtTotal;
	private JTextField jtxtDisplay;
	private JTextField jtxtChange;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pos window = new Pos();
					window.frmPosVersion.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void ItemCost()
	{
	double sum = 0 ;
	double tax = 0.5;
	
	for ( int i = 0; i< table.getRowCount(); i++ )
	{
		sum = sum + Double.parseDouble(table.getValueAt(i, 2).toString());
	}
	
	    jtxtSubTotal.setText(Double.toString(sum));
	    double cTotal = Double.parseDouble(jtxtSubTotal.getText());
	    
	    double cTax   = (cTotal * tax)/100;
	    String jTaxTotalString = String.format("%.2f", cTax);
	    jtxtTax.setText(jTaxTotalString);
	    
	    String jSubTotalString = String.format("MMK %.2f", cTotal);
	    jtxtTotal.setText(jSubTotalString);
	    
	    
//	    String jTotal = String.format("$ %.2f", cTax) ;
//	    jtxtTotal.setText(jTotal);
	    
	    String jTotal = String.format("MMK %.2f", cTax + cTotal) ;
	    jtxtTotal.setText(jTotal);
		
	}
	
	
	
	
	public void Change() 
	{
		double sum = 0;
		double tax = 0.5;
		double cash= Double.parseDouble(jtxtDisplay.getText());
		
		for ( int i = 0; i< table.getRowCount(); i++ )
		{
			sum = sum + Double.parseDouble(table.getValueAt(i, 2).toString());
		    	
		}
	    
	    double cTax   = (tax * sum)/100;
		double cChange = (cash - (sum+tax));
		String ChangeGiven = String.format("MMK %.2f", cChange);
		jtxtChange.setText(ChangeGiven);
		
	}
	
	
	
	private void initialize() {
		frmPosVersion = new JFrame();
		frmPosVersion.getContentPane().setBackground(new Color(0, 64, 128));
		frmPosVersion.setTitle("POS version 1_1");
		frmPosVersion.setBounds(0,0, 1450, 800);
		frmPosVersion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPosVersion.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 340, 405);
		frmPosVersion.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton jbtn7 = new JButton("7");
		jbtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = jtxtDisplay.getText();

                if (EnterNumber == "")
                {
                	jtxtDisplay.setText(jbtn7.getText());
				}
                else 
                {
					EnterNumber = jtxtDisplay.getText() + jbtn7.getText();
					jtxtDisplay.setText(EnterNumber);
				}
			}
		});
		jbtn7.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn7.setBounds(10, 11, 102, 80);
		panel.add(jbtn7);
		
		JButton jbtn8 = new JButton("8");
		jbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = jtxtDisplay.getText();

                if (EnterNumber == "")
                {
                	jtxtDisplay.setText(jbtn8.getText());
				}
                else 
                {
					EnterNumber = jtxtDisplay.getText() + jbtn8.getText();
					jtxtDisplay.setText(EnterNumber);
				}
				
			}
		});
		jbtn8.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn8.setBounds(122, 11, 102, 80);
		panel.add(jbtn8);
		
		JButton jbtn9 = new JButton("9");
		jbtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String EnterNumber = jtxtDisplay.getText();

                if (EnterNumber == "")
                {
                	jtxtDisplay.setText(jbtn9.getText());
				}
                else 
                {
					EnterNumber = jtxtDisplay.getText() + jbtn9.getText();
					jtxtDisplay.setText(EnterNumber);
				}
				
			}
		});
		jbtn9.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn9.setBounds(231, 11, 102, 80);
		panel.add(jbtn9);
		
		JButton jbtn4 = new JButton("4");
		jbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = jtxtDisplay.getText();

                if (EnterNumber == "")
                {
                	jtxtDisplay.setText(jbtn4.getText());
				}
                else 
                {
					EnterNumber = jtxtDisplay.getText() + jbtn4.getText();
					jtxtDisplay.setText(EnterNumber);
				}
				
			}
		});
		jbtn4.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn4.setBounds(10, 102, 102, 80);
		panel.add(jbtn4);
		
		JButton jbtn5 = new JButton("5");
		jbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = jtxtDisplay.getText();

                if (EnterNumber == "")
                {
                	jtxtDisplay.setText(jbtn5.getText());
				}
                else 
                {
					EnterNumber = jtxtDisplay.getText() + jbtn5.getText();
					jtxtDisplay.setText(EnterNumber);
				}
				
			}
		});
		jbtn5.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn5.setBounds(122, 102, 102, 80);
		panel.add(jbtn5);
		
		JButton jbtn6 = new JButton("6");
		jbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String EnterNumber = jtxtDisplay.getText();

                if (EnterNumber == "")
                {
                	jtxtDisplay.setText(jbtn6.getText());
				}
                else 
                {
					EnterNumber = jtxtDisplay.getText() + jbtn6.getText();
					jtxtDisplay.setText(EnterNumber);
				}
			
			}
			
		});
		jbtn6.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn6.setBounds(231, 102, 102, 80);
		panel.add(jbtn6);
		
		JButton jbtn1 = new JButton("1");
		jbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = jtxtDisplay.getText();

                if (EnterNumber == "")
                {
                	jtxtDisplay.setText(jbtn7.getText());
				}
                else 
                {
					EnterNumber = jtxtDisplay.getText() + jbtn7.getText();
					jtxtDisplay.setText(EnterNumber);
				}
				
			}
		});
		jbtn1.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn1.setBounds(10, 195, 102, 80);
		panel.add(jbtn1);
		
		JButton jbtn2 = new JButton("2");
		jbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = jtxtDisplay.getText();

                if (EnterNumber == "")
                {
                	jtxtDisplay.setText(jbtn2.getText());
				}
                else 
                {
					EnterNumber = jtxtDisplay.getText() + jbtn2.getText();
					jtxtDisplay.setText(EnterNumber);
				}
				
			}
		});
		jbtn2.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn2.setBounds(122, 195, 102, 80);
		panel.add(jbtn2);
		
		JButton jbtn3 = new JButton("3");
		jbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = jtxtDisplay.getText();

                if (EnterNumber == "")
                {
                	jtxtDisplay.setText(jbtn3.getText());
				}
                else 
                {
					EnterNumber = jtxtDisplay.getText() + jbtn3.getText();
					jtxtDisplay.setText(EnterNumber);
				}
				
			}
		});
		jbtn3.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn3.setBounds(231, 195, 102, 80);
		panel.add(jbtn3);
		
		JButton jbtn0 = new JButton("0");
		jbtn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = jtxtDisplay.getText();

                if (EnterNumber == "")
                {
                	jtxtDisplay.setText(jbtn0.getText());
				}
                else 
                {
					EnterNumber = jtxtDisplay.getText() + jbtn0.getText();
					jtxtDisplay.setText(EnterNumber);
				}
				
			}
		});
		jbtn0.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtn0.setBounds(10, 286, 102, 80);
		panel.add(jbtn0);
		
		JButton jbtnDot = new JButton(".");
		jbtnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (! jtxtDisplay.getText().contains("."))
				{
				       jtxtDisplay.setText(jtxtDisplay.getText() + jbtnDot.getText());	
				}
				
			}
		});
		jbtnDot.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtnDot.setBounds(122, 286, 102, 80);
		panel.add(jbtnDot);
		
		JButton jbtnC = new JButton("C");
		jbtnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtxtDisplay.setText(null);
				jtxtChange.setText(null);
				
				
			}
		});
		jbtnC.setFont(new Font("Tahoma", Font.BOLD, 40));
		jbtnC.setBounds(231, 286, 102, 80);
		panel.add(jbtnC);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(351, 11, 258, 405);
		frmPosVersion.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Items", "Qty", "Amount"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(15);
		table.getColumnModel().getColumn(2).setPreferredWidth(30);
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(605, 11, 755, 405);
		frmPosVersion.getContentPane().add(panel_1);
		
		JButton jbtn7_1 = new JButton("Burger");
		jbtn7_1.setMargin(new Insets(2, 45, 2, 14));
		jbtn7_1.setIcon(new ImageIcon("D:\\tool\\eclipse_test\\POS\\img\\BURGER.png"));
		jbtn7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 4500;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[] {"Burger","1",PriceOfItem});
				ItemCost();
				
			}
		});
		jbtn7_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtn7_1.setBounds(10, 11, 140, 124);
		panel_1.add(jbtn7_1);
		
		JLabel lblNewLabel_1 = new JLabel("8.50 $");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(41, 91, 65, 29);
		panel_1.add(lblNewLabel_1);
		
		JButton jbtn7_1_1 = new JButton("Coca");
		jbtn7_1_1.setMargin(new Insets(2, 45, 2, 14));
		jbtn7_1_1.setIcon(new ImageIcon("D:\\tool\\eclipse_test\\POS\\img\\CoCa.png"));
		jbtn7_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 2000;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[] {"Coca","1",PriceOfItem});
				ItemCost();
				
			}
		});
		jbtn7_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtn7_1_1.setBounds(160, 11, 140, 124);
		panel_1.add(jbtn7_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("3.20$");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_1.setBounds(170, 91, 65, 29);
		panel_1.add(lblNewLabel_1_1);
		
		JButton jbtn7_1_2 = new JButton("Pizza");
		jbtn7_1_2.setMargin(new Insets(2, 45, 2, 14));
		jbtn7_1_2.setIcon(new ImageIcon("D:\\tool\\eclipse_test\\POS\\img\\PIZZA.png"));
		jbtn7_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 15000;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[] {"Pizza","1",PriceOfItem});
				ItemCost();
			}
		});
		jbtn7_1_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtn7_1_2.setBounds(310, 11, 140, 124);
		panel_1.add(jbtn7_1_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("11.30$");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_2.setBounds(329, 91, 65, 29);
		panel_1.add(lblNewLabel_1_2);
		
		JButton jbtn7_1_3 = new JButton("Sandwich");
		jbtn7_1_3.setMargin(new Insets(2, 36, 2, 14));
		jbtn7_1_3.setIcon(new ImageIcon("D:\\tool\\eclipse_test\\POS\\img\\SandWish.png"));
		jbtn7_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 2500;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[] {"Sandwich","1",PriceOfItem});
				ItemCost();
			}
		});
		jbtn7_1_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		jbtn7_1_3.setBounds(460, 11, 140, 124);
		panel_1.add(jbtn7_1_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("6.40$");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_3.setBounds(486, 91, 65, 29);
		panel_1.add(lblNewLabel_1_3);
		
		JButton jbtn7_1_4 = new JButton("BlackCoffee");
		jbtn7_1_4.setMargin(new Insets(2, 34, 2, 14));
		jbtn7_1_4.setIcon(new ImageIcon("D:\\tool\\eclipse_test\\POS\\img\\BlackCoffee.png"));
		jbtn7_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 3000;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[] {"Black Coffee","1",PriceOfItem});
				ItemCost();
			}
		});
		jbtn7_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		jbtn7_1_4.setBounds(610, 11, 140, 124);
		panel_1.add(jbtn7_1_4);
		
		JLabel lblNewLabel_1_4 = new JLabel("5.59$");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_4.setBounds(549, 91, 65, 29);
		panel_1.add(lblNewLabel_1_4);
		
		JButton jbtn7_1_5 = new JButton("HotDog");
		jbtn7_1_5.setMargin(new Insets(2, 42, 2, 14));
		jbtn7_1_5.setIcon(new ImageIcon("D:\\tool\\eclipse_test\\POS\\img\\HOTDOG.png"));
		jbtn7_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 2000;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[] {"HotDog","1",PriceOfItem});
				ItemCost();
			}
		});
		jbtn7_1_5.setFont(new Font("Tahoma", Font.BOLD, 21));
		jbtn7_1_5.setBounds(10, 145, 140, 124);
		panel_1.add(jbtn7_1_5);
		
		JLabel lblNewLabel_1_5 = new JLabel("8.50 $");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_5.setBounds(41, 207, 65, 29);
		panel_1.add(lblNewLabel_1_5);
		
		JButton jbtn7_1_1_1 = new JButton("Ice cream");
		jbtn7_1_1_1.setMargin(new Insets(2, 40, 2, 14));
		jbtn7_1_1_1.setIcon(new ImageIcon("D:\\tool\\eclipse_test\\POS\\img\\IceCream.png"));
		jbtn7_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 1500;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[] {"Ice Cream","1",PriceOfItem});
				ItemCost();
				
			}
		});
		jbtn7_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		jbtn7_1_1_1.setBounds(160, 145, 140, 124);
		panel_1.add(jbtn7_1_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("7.00$");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_1_1.setBounds(170, 207, 65, 29);
		panel_1.add(lblNewLabel_1_1_1);
		
		JButton jbtn7_1_2_1 = new JButton("chocolet cake");
		jbtn7_1_2_1.setMargin(new Insets(2, 35, 2, 14));
		jbtn7_1_2_1.setIcon(new ImageIcon("D:\\tool\\eclipse_test\\POS\\img\\Chocolate_cake.png"));
		jbtn7_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 20000;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[] {"Chocolet Cake","1",PriceOfItem});
				ItemCost();
				
			}
		});
		jbtn7_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		jbtn7_1_2_1.setBounds(160, 279, 140, 124);
		panel_1.add(jbtn7_1_2_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("8.50 $");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_2_1.setBounds(170, 325, 65, 29);
		panel_1.add(lblNewLabel_1_2_1);
		
		JButton jbtn7_1_3_1 = new JButton("Ice Tea");
		jbtn7_1_3_1.setMargin(new Insets(2, 38, 2, 14));
		jbtn7_1_3_1.setIcon(new ImageIcon("D:\\tool\\eclipse_test\\POS\\img\\IceTea.png"));
		jbtn7_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem = 2500;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[] {"Ice Tea","1",PriceOfItem});
				ItemCost();
				
			}
		});
		jbtn7_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		jbtn7_1_3_1.setBounds(10, 279, 140, 124);
		panel_1.add(jbtn7_1_3_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("6.50$");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_3_1.setBounds(214, 220, 65, 29);
		panel_1.add(lblNewLabel_1_3_1);
		
		JButton jbtn7_1_4_1 = new JButton("Thai Tea");
		jbtn7_1_4_1.setMargin(new Insets(2, 40, 2, 14));
		jbtn7_1_4_1.setIcon(new ImageIcon("D:\\tool\\eclipse_test\\POS\\img\\IceTea.png"));
		jbtn7_1_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 2500;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[] {"Thai Tea","1",PriceOfItem});
				ItemCost();
			}
		});
		jbtn7_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtn7_1_4_1.setBounds(310, 145, 140, 124);
		panel_1.add(jbtn7_1_4_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("10.00$");
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_4_1.setBounds(224, 231, 65, 29);
		panel_1.add(lblNewLabel_1_4_1);
		
		JButton jbtn7_1_6 = new JButton("Coca cream ");
		jbtn7_1_6.setMargin(new Insets(2, 35, 2, 14));
		jbtn7_1_6.setIcon(new ImageIcon("D:\\tool\\eclipse_test\\POS\\img\\CocaIceCream.png"));
		jbtn7_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PriceOfItem =2000;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[] {"Coca ice cream","1",PriceOfItem});
				ItemCost();
				
			}
		});
		jbtn7_1_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		jbtn7_1_6.setBounds(460, 145, 140, 124);
		panel_1.add(jbtn7_1_6);
		
		JLabel lblNewLabel_1_6 = new JLabel("5.00$");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_6.setBounds(41, 325, 65, 29);
		panel_1.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("3.00$");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_2_2.setBounds(343, 220, 65, 29);
		panel_1.add(lblNewLabel_1_2_2);
		
		JButton jbtn7_1_3_2 = new JButton("Burger Set");
		jbtn7_1_3_2.setMargin(new Insets(2, 35, 2, 14));
		jbtn7_1_3_2.setIcon(new ImageIcon("D:\\tool\\eclipse_test\\POS\\img\\BURGERset.png"));
		jbtn7_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 8000;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[] {"Burger Set","1",PriceOfItem});
				ItemCost();
			}
		});
		jbtn7_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		jbtn7_1_3_2.setBounds(310, 279, 140, 124);
		panel_1.add(jbtn7_1_3_2);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("12.00$");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1_3_2.setBounds(389, 325, 65, 29);
		panel_1.add(lblNewLabel_1_3_2);
		
		JButton jbtn7_1_3_1_1 = new JButton("pepsi");
		jbtn7_1_3_1_1.setMargin(new Insets(2, 38, 2, 14));
		jbtn7_1_3_1_1.setIcon(new ImageIcon("D:\\tool\\eclipse_test\\POS\\img\\pepsi.png"));
		jbtn7_1_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double PriceOfItem = 3000;
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[] {"pepsi","1",PriceOfItem});
				ItemCost();
				
			}
		});
		jbtn7_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		jbtn7_1_3_1_1.setBounds(460, 279, 140, 124);
		panel_1.add(jbtn7_1_3_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(10, 427, 1350, 216);
		frmPosVersion.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(255, 255, 255));
		panel_2_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2_1.setBounds(10, 11, 387, 194);
		panel_2.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tax");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 11, 103, 42);
		panel_2_1.add(lblNewLabel);
		
		jtxtTax = new JTextField();
		jtxtTax.setFont(new Font("Tahoma", Font.BOLD, 25));
		jtxtTax.setBounds(137, 11, 240, 42);
		panel_2_1.add(jtxtTax);
		jtxtTax.setColumns(10);
		
		JLabel lblSubtotal = new JLabel("SubTotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblSubtotal.setBounds(10, 76, 126, 42);
		panel_2_1.add(lblSubtotal);
		
		jtxtSubTotal = new JTextField();
		jtxtSubTotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		jtxtSubTotal.setColumns(10);
		jtxtSubTotal.setBounds(137, 76, 240, 42);
		panel_2_1.add(jtxtSubTotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblTotal.setBounds(10, 141, 103, 42);
		panel_2_1.add(lblTotal);
		
		jtxtTotal = new JTextField();
		jtxtTotal.setFont(new Font("Tahoma", Font.BOLD, 25));
		jtxtTotal.setColumns(10);
		jtxtTotal.setBounds(137, 141, 240, 42);
		panel_2_1.add(jtxtTotal);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(407, 11, 387, 194);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblDisplayCash = new JLabel("Cash");
		lblDisplayCash.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblDisplayCash.setBounds(10, 76, 154, 42);
		panel_3.add(lblDisplayCash);
		
		JLabel lblChange = new JLabel("Change");
		lblChange.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblChange.setBounds(10, 141, 103, 42);
		panel_3.add(lblChange);
		
		jtxtDisplay = new JTextField();
		jtxtDisplay.setFont(new Font("Tahoma", Font.BOLD, 25));
		jtxtDisplay.setColumns(10);
		jtxtDisplay.setBounds(175, 76, 202, 42);
		panel_3.add(jtxtDisplay);
		
		jtxtChange = new JTextField();
		jtxtChange.setFont(new Font("Tahoma", Font.BOLD, 25));
		jtxtChange.setColumns(10);
		jtxtChange.setBounds(175, 141, 202, 42);
		panel_3.add(jtxtChange);
		
		JLabel lblSubtotal_1_1 = new JLabel("Pay Method");
		lblSubtotal_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblSubtotal_1_1.setBounds(10, 11, 154, 42);
		panel_3.add(lblSubtotal_1_1);
		
		JComboBox jcboPayMethod = new JComboBox();
		jcboPayMethod.setModel(new DefaultComboBoxModel(new String[] {"", "Cash", "Wave Pay", "KBZ Pay"}));
		jcboPayMethod.setBounds(175, 11, 202, 54);
		panel_3.add(jcboPayMethod);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3_1.setBounds(804, 11, 536, 194);
		panel_2.add(panel_3_1);
		
		JButton jbtnPay = new JButton("Pay");
		jbtnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (jcboPayMethod.getSelectedItem().equals("Cash")) {
					Change();
					
				}
				else {
					jtxtChange.setText(null);
					jtxtDisplay.setText("");
				}
				
			}
		});
		jbtnPay.setFont(new Font("Tahoma", Font.BOLD, 34));
		jbtnPay.setBounds(10, 11, 137, 80);
		panel_3_1.add(jbtnPay);
		
		JButton jbtnPrint = new JButton("Print");
		jbtnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MessageFormat header= new MessageFormat("Printing in Progress");
				MessageFormat footer= new MessageFormat("Page {0,number,integer}");
				
				try {
					table.print(JTable.PrintMode.NORMAL,header,footer);
				} catch (PrinterException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		jbtnPrint.setFont(new Font("Tahoma", Font.BOLD, 34));
		jbtnPrint.setBounds(162, 11, 137, 80);
		panel_3_1.add(jbtnPrint);
		
		JButton jbtnReset = new JButton("Reset");
		jbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jtxtDisplay.setText(null);
				jtxtChange.setText(null);
				jtxtTax.setText(null);
				jtxtSubTotal.setText(null);
				jtxtTotal.setText(null);
				
				DefaultTableModel RecordTable= (DefaultTableModel) table.getModel();
				RecordTable.setRowCount(0);
				
			}
		});
		jbtnReset.setFont(new Font("Tahoma", Font.BOLD, 34));
		jbtnReset.setBounds(309, 11, 217, 80);
		panel_3_1.add(jbtnReset);
		
		JButton jbtnRemoveItems = new JButton("Remove Items");
		jbtnRemoveItems.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				 
				int RemoveItem = table.getSelectedRow();
				if (RemoveItem >=0) {
					model.removeRow(RemoveItem);
				}
				ItemCost();
				
				
				if (jcboPayMethod.getSelectedItem().equals("Cash")) {
					Change();
					
				}
				else {
					jtxtChange.setText(null);
					jtxtDisplay.setText("");
				}
				
			}
		});
		jbtnRemoveItems.setFont(new Font("Tahoma", Font.BOLD, 30));
		jbtnRemoveItems.setBounds(10, 103, 258, 80);
		panel_3_1.add(jbtnRemoveItems);
		
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmPosVersion = new JFrame();
				if (JOptionPane.showConfirmDialog(frmPosVersion, "Confirm if you want to exit","Point of Sales",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		jbtnExit.setFont(new Font("Tahoma", Font.BOLD, 34));
		jbtnExit.setBounds(278, 102, 248, 80);
		panel_3_1.add(jbtnExit);
	}
}
