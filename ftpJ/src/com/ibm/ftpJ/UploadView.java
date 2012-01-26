package com.ibm.ftpJ;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JPasswordField;
import javax.swing.JFileChooser;
import java.awt.Frame;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

public class UploadView extends JFrame{
	
	final ViewController controller;
	private JTextField tHostname;
	private JPasswordField hPassword;
	private JTextField tPath;
	 public UploadView (ViewController vcontroller){
	 super();
	 this.controller=vcontroller;
	setTitle("Upload");
	 vcontroller.registerView(getTitle(), this);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setSize(732,630);
	 GridBagLayout gridBagLayout = new GridBagLayout();
	 gridBagLayout.columnWidths = new int[]{0, 0, 0, 243, 0, 0, 0, 0};
	 gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	 gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
	 gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	 getContentPane().setLayout(gridBagLayout);
	 
	 JLabel lHostname = new JLabel("ip/hostname");
	 GridBagConstraints gbc_lHostname = new GridBagConstraints();
	 gbc_lHostname.insets = new Insets(0, 0, 5, 5);
	 gbc_lHostname.gridx = 2;
	 gbc_lHostname.gridy = 1;
	 getContentPane().add(lHostname, gbc_lHostname);
	 
	 tHostname = new JTextField();
	 tHostname.setText("ip/hostname");
	 GridBagConstraints gbc_tHostname = new GridBagConstraints();
	 gbc_tHostname.insets = new Insets(0, 0, 5, 0);
	 gbc_tHostname.fill = GridBagConstraints.HORIZONTAL;
	 gbc_tHostname.gridx = 3;
	 gbc_tHostname.gridy = 1;
	 getContentPane().add(tHostname, gbc_tHostname);
	 tHostname.setColumns(10);
	 
	 JLabel lPassword = new JLabel("Password");
	 lPassword.setToolTipText("Enter Password Here");
	 lPassword.setHorizontalAlignment(SwingConstants.LEFT);
	 GridBagConstraints gbc_lPassword = new GridBagConstraints();
	 gbc_lPassword.insets = new Insets(0, 0, 5, 5);
	 gbc_lPassword.gridx = 2;
	 gbc_lPassword.gridy = 2;
	 getContentPane().add(lPassword, gbc_lPassword);
	 
	 hPassword = new JPasswordField();
	 hPassword.setText("Password");
	 GridBagConstraints gbc_hPassword = new GridBagConstraints();
	 gbc_hPassword.insets = new Insets(0, 0, 5, 0);
	 gbc_hPassword.fill = GridBagConstraints.HORIZONTAL;
	 gbc_hPassword.gridx = 3;
	 gbc_hPassword.gridy = 2;
	 getContentPane().add(hPassword, gbc_hPassword);
	 
	 JLabel lUploadPath = new JLabel("upload Path");
	 GridBagConstraints gbc_lUploadPath = new GridBagConstraints();
	 gbc_lUploadPath.insets = new Insets(0, 0, 5, 5);
	 gbc_lUploadPath.gridx = 2;
	 gbc_lUploadPath.gridy = 3;
	 getContentPane().add(lUploadPath, gbc_lUploadPath);
	 
	 tPath = new JTextField();
	 GridBagConstraints gbc_tPath = new GridBagConstraints();
	 gbc_tPath.insets = new Insets(0, 0, 5, 0);
	 gbc_tPath.fill = GridBagConstraints.HORIZONTAL;
	 gbc_tPath.gridx = 3;
	 gbc_tPath.gridy = 3;
	 getContentPane().add(tPath, gbc_tPath);
	 tPath.setColumns(10);
	 
	 JFileChooser fileChooser = new JFileChooser();
	 fileChooser.setDialogTitle("Choose File");
	 fileChooser.setAutoscrolls(true);
	 fileChooser.setBorder(new LineBorder(Color.RED, 1, true));
	 GridBagConstraints gbc_fileChooser = new GridBagConstraints();
	 gbc_fileChooser.gridheight = 20;
	 gbc_fileChooser.fill = GridBagConstraints.BOTH;
	 gbc_fileChooser.gridwidth = 6;
	 gbc_fileChooser.insets = new Insets(0, 0, 5, 5);
	 gbc_fileChooser.gridx = 2;
	 gbc_fileChooser.gridy = 5;
	 getContentPane().add(fileChooser, gbc_fileChooser);
	 fileChooser.setMultiSelectionEnabled(true);
 }
}
