package com.practice;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JframeCel extends JFrame {

	private JPanel contentPane;
	private JTextField txtCel;
	private final JLabel lblNewLabel = new JLabel("Celsius");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JframeCel frame = new JframeCel();
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
	public JframeCel() {
		setTitle("Celsius Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		txtCel = new JTextField();
		txtCel.setText("");
		contentPane.add(txtCel, BorderLayout.SOUTH);
		txtCel.setColumns(10);
		contentPane.add(lblNewLabel, BorderLayout.WEST);
		final JLabel fahrCap = new JLabel("Fahrenheit");
		contentPane.add(fahrCap, BorderLayout.EAST);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
	
				
				   try {
					int tempFahr = (int)((Double.parseDouble(txtCel.getText()))
					            * 1.8 + 32);
					           fahrCap.setText(tempFahr+" "+"F");
				} catch (NumberFormatException e) {
					
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				  //  fahrenheitLabel.setText(tempFahr + " Fahrenheit");
			}
		});
		btnNewButton.setMinimumSize(new Dimension(23, 23));
		btnNewButton.setMaximumSize(new Dimension(23, 23));
		btnNewButton.setPreferredSize(new Dimension(23, 23));
		contentPane.add(btnNewButton, BorderLayout.CENTER);
		
		
	}

}
