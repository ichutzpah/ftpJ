package com.ibm.ftpJ;

import java.util.HashMap;

import javax.swing.JFrame;

public class ViewController {

	HashMap<String,JFrame> views;
	
	public ViewController(){
		views = new HashMap<String, JFrame>(); 
				
	}
	
	public void registerView(String name, JFrame view) {
		views.put(name,view);
		
	}
	
	public void showView(String name) {

		if (views.containsKey(name)){
            for (String key : views.keySet()){
                views.get(key).setVisible(key.equals(name));
            }
		}
	
	}
}