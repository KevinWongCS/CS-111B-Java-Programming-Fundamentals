package cs111b;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CelsiusConverterGUI extends JFrame implements ActionListener {
	private JLabel celsiusLabel;
	private JLabel fahrenheitLabel;
	private JTextField celsiusField;
	private JTextField fahrenheitField;
	private JButton convertButton;
	private GridBagConstraints layoutConst;
	private JPanel panel;
	
	
	CelsiusConverterGUI() {
		// Used to specify GUI component layout
		GridBagConstraints layoutConst = null;
		
		// frame's title
		setTitle("Celsius Converter");
		
		// Set header for celsius and fahrenheit
		celsiusLabel = new JLabel("Celsius: ");
		fahrenheitLabel = new JLabel("Fahrenheit: ");
		
		// creating text field for celsius
		celsiusField = new JTextField(15);
		celsiusField.setEditable(true);
		celsiusField.setText("");
		
		// creating text field for fahrenheit
		fahrenheitField = new JTextField(15);
		fahrenheitField.setEditable(false);
		
		// Create a "Calculate" button
	    convertButton = new JButton("Convert");
	    
		// Use "this" class to handle button presses
	    convertButton.addActionListener(this);
	
		// use GridBagLayout
		setLayout(new GridBagLayout());
	    
		// Create GridBagConstraints
		layoutConst = new GridBagConstraints();
		
	    // Specify component's grid location
	    layoutConst.gridx = 0;
	    layoutConst.gridy = 0;
		
		// 10 pixels of padding around component
	    layoutConst.insets = new Insets(10, 10, 10, 10);
	    
		// adding header for celsius
		layoutConst = new GridBagConstraints();
	    layoutConst.gridx = 0;
	    layoutConst.gridy = 0;
	    layoutConst.insets = new Insets(10, 10, 10, 10);
		add(celsiusLabel, layoutConst);
	
		// adding text field for celsius
	    layoutConst.gridx = 1;
	    layoutConst.gridy = 0;
	    layoutConst.insets = new Insets(10, 10, 10, 10);
	    add(celsiusField, layoutConst);
	    
	    // adding header for fahrenheit
	    layoutConst.gridx = 0;
	    layoutConst.gridy = 1;
	    layoutConst.insets = new Insets(10, 10, 10, 10);
		add(fahrenheitLabel, layoutConst);
		
		// adding text field for farenheit
	    layoutConst.gridx = 1;
	    layoutConst.gridy = 1;
	    layoutConst.insets = new Insets(10, 10, 10, 10);
		add(fahrenheitField, layoutConst);
		
		// adding text field for convert button	
		layoutConst.gridx = 1;
		layoutConst.gridy = 2;
		layoutConst.insets = new Insets(10, 10, 10, 10);
	    add(convertButton, layoutConst);
		}
		
		   /* Method is automatically called when an event 
	    occurs (e.g, button is pressed) */
		@Override
		public void actionPerformed(ActionEvent event) {
			String userInput;
			int celsius;
			
			// get user's celsius input
			userInput = celsiusField.getText();
			
			// convert string to integer
			celsius = Integer.parseInt(userInput);
			
			// display calculated fahrenheit
			fahrenheitField.setText(Integer.toString((celsius * 9/5) + 32) + " Degrees");
		}
	
		public static void main(String[] args) {
	      // Creates SalaryLabelFrame and its components
		CelsiusConverterGUI myFrame = new CelsiusConverterGUI();
	   	  
	   	  // exits program if window is closed
	      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      // sizes frame dimensions to content
	      myFrame.pack();
	      // keeps the frame up till user exits frame
	      myFrame.setVisible(true);
		}
}
