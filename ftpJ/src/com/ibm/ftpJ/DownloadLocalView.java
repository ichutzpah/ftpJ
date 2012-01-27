package com.ibm.ftpJ;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;
import javax.swing.JButton;

public class DownloadLocalView extends JFrame implements ActionListener{
	final ViewController controller;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JTextField textField_2;
	
	JFileChooser fcChooser;
	private JButton btnSelectFiles;
	private JButton btnConfirmDownload;
	private JButton btnBack;
	 public DownloadLocalView (ViewController vcontroller){
		 super();
		 fcChooser=new JFileChooser(); //created in constructor
		 fcChooser.setMultiSelectionEnabled(true);
		 setTitle("Download");
		 this.controller=vcontroller;
		 vcontroller.registerView(getTitle(), this);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setSize(732,630);
		 GridBagLayout gridBagLayout = new GridBagLayout();
		 gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		 gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		 gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		 gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		 getContentPane().setLayout(gridBagLayout);
		 
		 JLabel lblIphostnmae = new JLabel("ip/hostnmae");
		 GridBagConstraints gbc_lblIphostnmae = new GridBagConstraints();
		 gbc_lblIphostnmae.insets = new Insets(0, 0, 5, 5);
		 gbc_lblIphostnmae.gridx = 1;
		 gbc_lblIphostnmae.gridy = 2;
		 getContentPane().add(lblIphostnmae, gbc_lblIphostnmae);
		 
		 textField = new JTextField();
		 GridBagConstraints gbc_textField = new GridBagConstraints();
		 gbc_textField.insets = new Insets(0, 0, 5, 0);
		 gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		 gbc_textField.gridx = 3;
		 gbc_textField.gridy = 2;
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
		 
		 JLabel lblNewLabel = new JLabel("Password");
		 GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		 gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		 gbc_lblNewLabel.gridx = 1;
		 gbc_lblNewLabel.gridy = 4;
		 getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		 
		 passwordField = new JPasswordField();
		 GridBagConstraints gbc_passwordField = new GridBagConstraints();
		 gbc_passwordField.insets = new Insets(0, 0, 5, 0);
		 gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		 gbc_passwordField.gridx = 3;
		 gbc_passwordField.gridy = 4;
		 getContentPane().add(passwordField, gbc_passwordField);
		 
		 btnSelectFiles = new JButton("Select Files");
		 GridBagConstraints gbc_btnSelectFiles = new GridBagConstraints();
		 gbc_btnSelectFiles.insets = new Insets(0, 0, 5, 0);
		 gbc_btnSelectFiles.gridx = 3;
		 gbc_btnSelectFiles.gridy = 5;
		 getContentPane().add(btnSelectFiles, gbc_btnSelectFiles);
		 btnSelectFiles.addActionListener(this);
		 
		 JLabel lblFilePath = new JLabel("File Path");
		 GridBagConstraints gbc_lblFilePath = new GridBagConstraints();
		 gbc_lblFilePath.insets = new Insets(0, 0, 5, 5);
		 gbc_lblFilePath.gridx = 1;
		 gbc_lblFilePath.gridy = 6;
		 getContentPane().add(lblFilePath, gbc_lblFilePath);
		 
		 textField_2 = new JTextField();
		  File[] file;
		// JFileChooser fc;
		  
		 textField_2.addActionListener(this);
		 
		 
		
		 GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		 gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		 gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		 gbc_textField_2.gridx = 3;
		 gbc_textField_2.gridy = 6;
		 getContentPane().add(textField_2, gbc_textField_2);
		 textField_2.setColumns(10);
		 
		 btnConfirmDownload = new JButton("Confirm Download");
		 GridBagConstraints gbc_btnConfirmDownload = new GridBagConstraints();
		 gbc_btnConfirmDownload.insets = new Insets(0, 0, 5, 0);
		 gbc_btnConfirmDownload.gridx = 3;
		 gbc_btnConfirmDownload.gridy = 8;
		 getContentPane().add(btnConfirmDownload, gbc_btnConfirmDownload);
		 
		 btnBack = new JButton("Back");
		 GridBagConstraints gbc_btnBack = new GridBagConstraints();
		 gbc_btnBack.gridx = 3;
		 gbc_btnBack.gridy = 10;
		 getContentPane().add(btnBack, gbc_btnBack);
		 btnBack.addActionListener(this);
		 
		 
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//
	if (e.getSource()==btnSelectFiles){
		int returnval=fcChooser.showOpenDialog(btnSelectFiles);
		
		//int returnval=fcChooser.showOpenDialog(DownloadLocalView.this);
		if (returnval==JFileChooser.APPROVE_OPTION){
			File[] fil1 = fcChooser.getSelectedFiles();
			String text="";
			for (int i=0;i<fil1.length;i++)
				{
				
				text=text+"\""+fil1[i].getName()+"\""+" ";
				}
			
			textField_2.setText(text);
		}
	}
	
	if (e.getSource()==btnBack){
		this.controller.showView("Main");
	}
	
		//btext selection
		/*if (e.getSource()==textField_2) {
		//show open dialog
		int returnval =fcChooser.showOpenDialog(DownloadLocalView.this);
		
		
				if (returnval == JFileChooser.APPROVE_OPTION) {
					
					File fil1 = fcChooser.getSelectedFile();
					
		textField_2.setText(fil1.getPath());}
	
}*/
}
	}