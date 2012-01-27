package com.ibm.ftpJ;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.io.File;
import java.util.Locale;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;


	 class MainView extends JFrame implements ActionListener{
	        final ViewController viewController;
			private JButton btnDownload;
			private JRadioButton local;
			private JRadioButton server;
			private JButton btnDelete;
			private ButtonGroup grp;
	        
	       
	        
	        public MainView(ViewController controller){
	            super();
	            this.viewController = controller;
	 
	            setTitle("Main");
	            GridBagLayout gridBagLayout = new GridBagLayout();
	            gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	            gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	            gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	            gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
	            getContentPane().setLayout(gridBagLayout);
	            
	            JButton btnUpload = new JButton("Upload");
	            btnUpload.addActionListener(new ActionListener() {
	            	public void actionPerformed(ActionEvent arg0) {
	            		viewController.showView("Upload");
	            	}
	            });
	            GridBagConstraints gbc_btnUpload = new GridBagConstraints();
	            gbc_btnUpload.insets = new Insets(0, 0, 5, 5);
	            gbc_btnUpload.gridx = 2;
	            gbc_btnUpload.gridy = 2;
	            getContentPane().add(btnUpload, gbc_btnUpload);
	            
	            btnDownload = new JButton("Download");
	            GridBagConstraints gbc_btnDownload = new GridBagConstraints();
	            gbc_btnDownload.insets = new Insets(0, 0, 5, 5);
	            gbc_btnDownload.gridx = 10;
	            gbc_btnDownload.gridy = 2;
	            getContentPane().add(btnDownload, gbc_btnDownload);
	            btnDownload.addActionListener(this);
	            
	            
	            
	            local = new JRadioButton("local");
	            local.setHorizontalAlignment(SwingConstants.LEFT);
	            GridBagConstraints gbc_local = new GridBagConstraints();
	            gbc_local.insets = new Insets(0, 0, 5, 5);
	            gbc_local.gridx = 10;
	            gbc_local.gridy = 3;
	            getContentPane().add(local, gbc_local);
	            
	            
	            server = new JRadioButton("server");
	            server.setHorizontalAlignment(SwingConstants.LEFT);
	            GridBagConstraints gbc_server = new GridBagConstraints();
	            gbc_server.insets = new Insets(0, 0, 5, 5);
	            gbc_server.gridx = 10;
	            gbc_server.gridy = 4;
	            getContentPane().add(server, gbc_server);
	            
	            btnDelete = new JButton("Delete");
	            GridBagConstraints gbc_btnDelete = new GridBagConstraints();
	            gbc_btnDelete.insets = new Insets(0, 0, 0, 5);
	            gbc_btnDelete.gridx = 7;
	            gbc_btnDelete.gridy = 9;
	            getContentPane().add(btnDelete, gbc_btnDelete);
	            
	            grp = new ButtonGroup();
	    		grp.add(server);
	    		grp.add(local);
	            
	            pack();
	            viewController.registerView(getTitle(), this);
	            
	            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 /*
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
	            */
	            
	            
	        }


			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if (e.getSource()==btnDownload){
					
					boolean returnval=true;
					//int returnval=fcChooser.showOpenDialog(DownloadLocalView.this);
					if (returnval==local.isSelected()){
						viewController.showView("Download");
						
					}
					if (returnval==server.isSelected()){
						
						viewController.showView("DownloadRemote");
					}
				}
				
				
			}
	    }

