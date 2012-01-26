package com.ibm.ftpJ;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


	 class MainView extends JFrame {
	        final ViewController viewController;
	 
	        public MainView(ViewController controller){
	            super();
	            this.viewController = controller;
	 
	            setTitle("Main");
	            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	            getContentPane().setLayout(new BorderLayout());
	            JButton button = new JButton("Show Detail");
	            button.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                    viewController.showView("Detail");
	                }
	            });
	            getContentPane().add(button, BorderLayout.SOUTH);
	            pack();
	            setSize(200,200);
	            viewController.registerView(getTitle(), this);
	        }
	    }

