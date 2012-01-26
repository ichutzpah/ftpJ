package com.ibm.ftpJ;

import java.awt.EventQueue;

import javax.swing.JPanel;



public class FrameMain {
	

	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewController viewController = new ViewController();
                MainView main = new MainView(viewController);
                //DeleteView delete = new DeleteView(viewController);
                //DownloadView download = new DownloadView(viewController);
                UploadView upload = new UploadView(viewController);
                viewController.showView("Main");
            }
        });
	}}
