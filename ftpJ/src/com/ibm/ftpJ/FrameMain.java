package com.ibm.ftpJ;

import java.awt.EventQueue;

public class FrameMain {
	

	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewController viewController = new ViewController();
                MainView main = new MainView(viewController);
               // DetailView detail = new DetailView(viewController);
                viewController.showView("Main");
            }
        });
	}}
