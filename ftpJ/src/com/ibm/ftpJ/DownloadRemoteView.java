package com.ibm.ftpJ;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;

public class DownloadRemoteView extends JFrame implements ActionListener{
	final ViewController controller;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;
	private JLabel lblFrom;
	private JLabel lblTo;
	private JLabel lblIphostname_1;
	private JTextField textField_2;
	private JLabel lblUserId_1;
	private JTextField textField_3;
	private JLabel lblPassword_1;
	private JPasswordField passwordField_1;
	private JLabel lblPath;
	private JTextField textField_4;
	private JLabel lblPath_1;
	private JTextField textField_5;
	private JButton btnChooseFilesTo;
	private JButton btnChooseToPath;
	private JButton btnConfirmTransfer;
 
	JFileChooser fc1;
	JFileChooser fc2;
	private JButton btnBack;
	
	
	 public DownloadRemoteView (ViewController vcontroller){
		 super();
		 this.controller=vcontroller;
		 setTitle("DownloadRemote");
		 vcontroller.registerView(getTitle(), this);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setSize(732,630);
		 
		 fc1=new JFileChooser(); //created in constructor
		 fc1.setMultiSelectionEnabled(true);
		 
		 fc2=new JFileChooser(); //created in constructor
		 fc2.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		 fc2.setMultiSelectionEnabled(false);
		 
		 GridBagLayout gridBagLayout = new GridBagLayout();
		 gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		 gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		 gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		 gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		 getContentPane().setLayout(gridBagLayout);
		 
		 lblFrom = new JLabel("From");
		 GridBagConstraints gbc_lblFrom = new GridBagConstraints();
		 gbc_lblFrom.insets = new Insets(0, 0, 5, 0);
		 gbc_lblFrom.gridx = 3;
		 gbc_lblFrom.gridy = 0;
		 getContentPane().add(lblFrom, gbc_lblFrom);
		 
		 JLabel lblIphostname = new JLabel("ip/hostname");
		 GridBagConstraints gbc_lblIphostname = new GridBagConstraints();
		 gbc_lblIphostname.insets = new Insets(0, 0, 5, 5);
		 gbc_lblIphostname.gridx = 1;
		 gbc_lblIphostname.gridy = 1;
		 getContentPane().add(lblIphostname, gbc_lblIphostname);
		 
		 textField = new JTextField();
		 GridBagConstraints gbc_textField = new GridBagConstraints();
		 gbc_textField.insets = new Insets(0, 0, 5, 0);
		 gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		 gbc_textField.gridx = 3;
		 gbc_textField.gridy = 1;
		 getContentPane().add(textField, gbc_textField);
		 textField.setColumns(10);
		 
		 JLabel lblUserId = new JLabel("user id");
		 GridBagConstraints gbc_lblUserId = new GridBagConstraints();
		 gbc_lblUserId.insets = new Insets(0, 0, 5, 5);
		 gbc_lblUserId.gridx = 1;
		 gbc_lblUserId.gridy = 3;
		 getContentPane().add(lblUserId, gbc_lblUserId);
		 
		 textField_1 = new JTextField();
		 GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		 gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		 gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		 gbc_textField_1.gridx = 3;
		 gbc_textField_1.gridy = 3;
		 getContentPane().add(textField_1, gbc_textField_1);
		 textField_1.setColumns(10);
		 
		 JLabel lblPassword = new JLabel("Password");
		 GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		 gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		 gbc_lblPassword.gridx = 1;
		 gbc_lblPassword.gridy = 4;
		 getContentPane().add(lblPassword, gbc_lblPassword);
		 
		 passwordField = new JPasswordField();
		 GridBagConstraints gbc_passwordField = new GridBagConstraints();
		 gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		 gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		 gbc_passwordField.gridx = 3;
		 gbc_passwordField.gridy = 4;
		 getContentPane().add(passwordField, gbc_passwordField);
		 
		 btnChooseFilesTo = new JButton("Choose Files to Download");
		 GridBagConstraints gbc_btnChooseFilesTo = new GridBagConstraints();
		 gbc_btnChooseFilesTo.insets = new Insets(0, 0, 5, 0);
		 gbc_btnChooseFilesTo.gridx = 3;
		 gbc_btnChooseFilesTo.gridy = 5;
		 getContentPane().add(btnChooseFilesTo, gbc_btnChooseFilesTo);
		 
		 lblPath = new JLabel("Path");
		 GridBagConstraints gbc_lblPath = new GridBagConstraints();
		 gbc_lblPath.insets = new Insets(0, 0, 5, 5);
		 gbc_lblPath.gridx = 1;
		 gbc_lblPath.gridy = 6;
		 getContentPane().add(lblPath, gbc_lblPath);
		 
		 textField_4 = new JTextField();
		 GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		 gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		 gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		 gbc_textField_4.gridx = 3;
		 gbc_textField_4.gridy = 6;
		 getContentPane().add(textField_4, gbc_textField_4);
		 textField_4.setColumns(10);
		 
		 lblTo = new JLabel("To");
		 GridBagConstraints gbc_lblTo = new GridBagConstraints();
		 gbc_lblTo.insets = new Insets(0, 0, 5, 0);
		 gbc_lblTo.gridx = 3;
		 gbc_lblTo.gridy = 7;
		 getContentPane().add(lblTo, gbc_lblTo);
		 
		 lblIphostname_1 = new JLabel("ip/hostname");
		 GridBagConstraints gbc_lblIphostname_1 = new GridBagConstraints();
		 gbc_lblIphostname_1.insets = new Insets(0, 0, 5, 5);
		 gbc_lblIphostname_1.gridx = 1;
		 gbc_lblIphostname_1.gridy = 8;
		 getContentPane().add(lblIphostname_1, gbc_lblIphostname_1);
		 
		 textField_2 = new JTextField();
		 GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		 gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		 gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		 gbc_textField_2.gridx = 3;
		 gbc_textField_2.gridy = 8;
		 getContentPane().add(textField_2, gbc_textField_2);
		 textField_2.setColumns(10);
		 textField_2.addActionListener(this);
		 
		 lblUserId_1 = new JLabel("user id");
		 GridBagConstraints gbc_lblUserId_1 = new GridBagConstraints();
		 gbc_lblUserId_1.insets = new Insets(0, 0, 5, 5);
		 gbc_lblUserId_1.gridx = 1;
		 gbc_lblUserId_1.gridy = 9;
		 getContentPane().add(lblUserId_1, gbc_lblUserId_1);
		 
		 textField_3 = new JTextField();
		 GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		 gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		 gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		 gbc_textField_3.gridx = 3;
		 gbc_textField_3.gridy = 9;
		 getContentPane().add(textField_3, gbc_textField_3);
		 textField_3.setColumns(10);
		 
		 lblPassword_1 = new JLabel("Password");
		 GridBagConstraints gbc_lblPassword_1 = new GridBagConstraints();
		 gbc_lblPassword_1.insets = new Insets(0, 0, 5, 5);
		 gbc_lblPassword_1.gridx = 1;
		 gbc_lblPassword_1.gridy = 10;
		 getContentPane().add(lblPassword_1, gbc_lblPassword_1);
		 
		 passwordField_1 = new JPasswordField();
		 GridBagConstraints gbc_passwordField_1 = new GridBagConstraints();
		 gbc_passwordField_1.insets = new Insets(0, 0, 5, 0);
		 gbc_passwordField_1.fill = GridBagConstraints.HORIZONTAL;
		 gbc_passwordField_1.gridx = 3;
		 gbc_passwordField_1.gridy = 10;
		 getContentPane().add(passwordField_1, gbc_passwordField_1);
		 
		 lblPath_1 = new JLabel("Path");
		 GridBagConstraints gbc_lblPath_1 = new GridBagConstraints();
		 gbc_lblPath_1.insets = new Insets(0, 0, 5, 5);
		 gbc_lblPath_1.gridx = 1;
		 gbc_lblPath_1.gridy = 11;
		 getContentPane().add(lblPath_1, gbc_lblPath_1);
		 
		 textField_5 = new JTextField();
		 GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		 gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		 gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		 gbc_textField_5.gridx = 3;
		 gbc_textField_5.gridy = 11;
		 getContentPane().add(textField_5, gbc_textField_5);
		 textField_5.setColumns(10);
		 textField_5.addActionListener(this);
		 
		 btnChooseToPath = new JButton("Choose to Path");
		 GridBagConstraints gbc_btnChooseToPath = new GridBagConstraints();
		 gbc_btnChooseToPath.insets = new Insets(0, 0, 5, 0);
		 gbc_btnChooseToPath.gridx = 3;
		 gbc_btnChooseToPath.gridy = 12;
		 getContentPane().add(btnChooseToPath, gbc_btnChooseToPath);
		 
		 btnConfirmTransfer = new JButton("Confirm Transfer");
		 GridBagConstraints gbc_btnConfirmTransfer = new GridBagConstraints();
		 gbc_btnConfirmTransfer.insets = new Insets(0, 0, 5, 0);
		 gbc_btnConfirmTransfer.gridx = 3;
		 gbc_btnConfirmTransfer.gridy = 14;
		 getContentPane().add(btnConfirmTransfer, gbc_btnConfirmTransfer);
		 
		 btnBack = new JButton("Back");
		 GridBagConstraints gbc_btnBack = new GridBagConstraints();
		 gbc_btnBack.gridx = 3;
		 gbc_btnBack.gridy = 16;
		 getContentPane().add(btnBack, gbc_btnBack);
		 
		 btnChooseToPath.addActionListener(this);
		 btnChooseFilesTo.addActionListener(this);
		// btnChooseFilesTo
		 btnBack.addActionListener(this);
	 }


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnChooseFilesTo){
			int returnval=fc1.showOpenDialog(btnChooseFilesTo);
			
			//int returnval=fcChooser.showOpenDialog(DownloadLocalView.this);
			if (returnval==JFileChooser.APPROVE_OPTION){
				File[] fil1 = fc1.getSelectedFiles();
				String text="";
				for (int i=0;i<fil1.length;i++)
					{
					
					text=text+"\""+fil1[i].getName()+"\""+" ";
					}
				
				textField_2.setText(text);
			}
		}
		
		if (e.getSource()==btnChooseToPath){
			int returnval=fc1.showOpenDialog(btnChooseToPath);
			
			//int returnval=fcChooser.showOpenDialog(DownloadLocalView.this);
			if (returnval==JFileChooser.APPROVE_OPTION){
				File fil2 = fc2.getSelectedFile();
								
				textField_2.setText(fil2.getAbsolutePath());
			}
		}
		
		if (e.getSource()==btnBack){
			this.controller.showView("Main");
		}
		
		}
		
	}


