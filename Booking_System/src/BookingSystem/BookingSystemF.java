package BookingSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JTable;
import javax.swing.JTree;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;

public class BookingSystemF {

	private JFrame frame;
	private JTextField textFieldMemID;
	private JTextField textFieldFirstN;
	private JTable table;
	private JTextField textFieldLastN;
	private JTable tableList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingSystemF window = new BookingSystemF();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BookingSystemF() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1370, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Football Club Booking System");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 51));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 1, 3, 3));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 3, 3, 3));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.add(panel_4);
		panel_4.setLayout(new GridLayout(3, 3, 2, 2));
		
		JLabel lblNewLabel_1 = new JLabel("Visitors");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_4 = new JLabel("Ticket Type");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("Gender");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 23));
		panel_4.add(lblNewLabel_7);
		
		JRadioButton rdbtnNonmember = new JRadioButton("Non-Member");
		rdbtnNonmember.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_4.add(rdbtnNonmember);
		
		JRadioButton rdbtnSingle = new JRadioButton("Single");
		rdbtnSingle.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_4.add(rdbtnSingle);
		
		JCheckBox chckbxFem = new JCheckBox("Female");
		chckbxFem.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_4.add(chckbxFem);
		
		JRadioButton rdbtnMembers = new JRadioButton("Members");
		rdbtnMembers.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_4.add(rdbtnMembers);
		
		JRadioButton rdbtnAnnual = new JRadioButton("Annually");
		rdbtnAnnual.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_4.add(rdbtnAnnual);
		
		JCheckBox chckbxMale = new JCheckBox("Male");
		chckbxMale.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_4.add(chckbxMale);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.add(panel_5);
		panel_5.setLayout(new GridLayout(3, 3, 1, 1));
		
		JPanel panel_10 = new JPanel();
		panel_5.add(panel_10);
		
		JLabel lblMemberID = new JLabel("Member ID");
		lblMemberID.setHorizontalAlignment(SwingConstants.LEFT);
		lblMemberID.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_10.add(lblMemberID);
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7);
		
		textFieldMemID = new JTextField();
		textFieldMemID.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_7.add(textFieldMemID);
		textFieldMemID.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel_5.add(panel_8);
		
		JLabel lblNewLabel_2 = new JLabel("Clubs");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel_8.add(lblNewLabel_2);
		
		JComboBox comboBoxList = new JComboBox();
		comboBoxList.setModel(new DefaultComboBoxModel(new String[] {"Sharks FC", "Eyimba", "Kano-United", "Rivers Angel", "Cattle Rangers", "Diobu United", "Taraba Stars", "Lagos Rangers", "Mile 12", "Oshodi Stars", "London Stars", "No Flex Zone", "Carlton Vale"}));
		comboBoxList.setMaximumRowCount(20);
		comboBoxList.setFont(new Font("Tahoma", Font.BOLD, 15));
		panel_8.add(comboBoxList);
		
		JPanel panel_11 = new JPanel();
		panel_5.add(panel_11);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_11.add(lblFirstName);
		
		JPanel panel_12 = new JPanel();
		panel_5.add(panel_12);
		
		textFieldFirstN = new JTextField();
		textFieldFirstN.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_12.add(textFieldFirstN);
		textFieldFirstN.setColumns(10);
		
		JPanel panel_13 = new JPanel();
		panel_5.add(panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_5.add(panel_14);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setHorizontalAlignment(SwingConstants.LEFT);
		lblLastName.setFont(new Font("Tahoma", Font.BOLD, 21));
		panel_14.add(lblLastName);
		
		JPanel panel_15 = new JPanel();
		panel_5.add(panel_15);
		
		textFieldLastN = new JTextField();
		textFieldLastN.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_15.add(textFieldLastN);
		textFieldLastN.setColumns(10);
		
		JPanel panel_16 = new JPanel();
		panel_5.add(panel_16);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_2.add(panel_6);
		panel_6.setLayout(new GridLayout(4, 1, 2, 2));
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnNonmember.setSelected(false);
				rdbtnSingle.setSelected(false);
				rdbtnMembers.setSelected(false);
				rdbtnAnnual.setSelected(false);
				
				chckbxFem.setSelected(false);
				chckbxMale.setSelected(false);
				textFieldMemID.setText("");
				textFieldLastN.setText("");
				textFieldFirstN.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 28));
		panel_6.add(btnClear);
		
		JButton btnShowDet = new JButton("Show Details");
		btnShowDet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableList.getModel();
				model.addRow(new Object[]{
						rdbtnNonmember.isSelected(),rdbtnMembers.isSelected(),rdbtnSingle.isSelected(),
						rdbtnAnnual.isSelected(),chckbxFem.isSelected(),chckbxMale.isSelected(),
						textFieldMemID.getText(),textFieldFirstN.getText(),textFieldLastN.getText(),comboBoxList.getSelectedItem().toString(),});
				
			}
		});
		btnShowDet.setFont(new Font("Tahoma", Font.BOLD, 28));
		panel_6.add(btnShowDet);
		
		JButton btnConfirm = new JButton("Confirm Booking");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)tableList.getModel();
				model.addRow(new Object[]{
						rdbtnNonmember.isSelected(),rdbtnMembers.isSelected(),rdbtnSingle.isSelected(),
						rdbtnAnnual.isSelected(),chckbxFem.isSelected(),chckbxMale.isSelected(),
						textFieldMemID.getText(),textFieldFirstN.getText(),textFieldLastN.getText(),comboBoxList.getSelectedItem().toString(),});
				
				
			}
		});
		btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 28));
		panel_6.add(btnConfirm);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 28));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Booking System Save", "Booking System", JOptionPane.OK_CANCEL_OPTION);
			}
		});
		panel_6.add(btnSave);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(2, 1, 1, 1));
		
		JPanel panel_TableList = new JPanel();
		panel_TableList.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.add(panel_TableList);
		panel_TableList.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		panel_TableList.add(table, BorderLayout.WEST);
		
		tableList = new JTable();
		tableList.setFont(new Font("Tahoma", Font.BOLD, 13));
		tableList.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		tableList.setFillsViewportHeight(true);
		tableList.setColumnSelectionAllowed(true);
		tableList.setCellSelectionEnabled(true);
		tableList.setModel(new DefaultTableModel(
			new Object[][] {
				{"Visitor(NonMember)", "Visitor(Member)", "Ticket(Single)", "Ticket(Annually)", "Female", "Male", "MemberID", "FirstName", "LastName", "Selected Clubs"},
			},
			new String[] {
				"Visitor(NonMember)", "Visitor(Member)", "Ticket(Single)", "Ticket(Annually)", "Female", "Male", "MemberID", "FirstName", "LastName", "Selected Clubs"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		panel_TableList.add(tableList, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_3.add(panel_9);
		panel_9.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_20 = new JPanel();
		panel_9.add(panel_20);
		
		JPanel panel_19 = new JPanel();
		panel_20.add(panel_19);
		FlowLayout flowLayout = (FlowLayout) panel_19.getLayout();
		
		JButton btnDel = new JButton("DELETE");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DefaultTableModel model = (DefaultTableModel)tableList.getModel();
				if(tableList.getSelectedRowCount()==-1){
					if(tableList.getRowCount()==0){
						JOptionPane.showMessageDialog(null, "No data to delete", "Booking System", JOptionPane.OK_OPTION);
					}else{
						JOptionPane.showMessageDialog(null, "Select a row to delete", "Booking System", JOptionPane.OK_OPTION);
					}
						
					}else{
						model.removeRow(tableList.getSelectedRow());
				}
				
				
			}
		});
		btnDel.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_19.add(btnDel);
		
		JPanel panel_17 = new JPanel();
		panel_20.add(panel_17);
		panel_17.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		panel_17.setLayout(new GridLayout(1, 4, 1, 1));
		
		JPanel panel_21 = new JPanel();
		panel_20.add(panel_21);
		panel_21.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		
		JPanel panel_22 = new JPanel();
		panel_21.add(panel_22);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel)tableList.getModel();
				if(tableList.getSelectedRowCount()==-1){
					if(tableList.getRowCount()==0){
						JOptionPane.showMessageDialog(null, "Booking System Update Confirmed", "Booking System", JOptionPane.OK_OPTION);
					}
				}
				
				
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_22.add(btnUpdate);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame ("EXIT");
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Booking System", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_21.add(btnExit);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				rdbtnNonmember.setSelected(false);
				rdbtnSingle.setSelected(false);
				rdbtnMembers.setSelected(false);
				rdbtnAnnual.setSelected(false);
				
				chckbxFem.setSelected(false);
				chckbxMale.setSelected(false);
				textFieldMemID.setText("");
				textFieldLastN.setText("");
				textFieldFirstN.setText("");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_20.add(btnReset);
	}
}
