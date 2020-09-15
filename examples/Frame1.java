/*
	This simple extension of the java.awt.Frame class
	contains all the elements necessary to act as the
	main window of an application.
 */

import java.awt.*;

public class Frame1 extends Frame
{
	public Frame1()
	{
		// This code is automatically generated by Visual Cafe when you add
		// components to the visual environment. It instantiates and initializes
		// the components. To modify the code, only use code syntax that matches
		// what Visual Cafe can generate, or Visual Cafe may be unable to back
		// parse your Java file into its visual environment.
		
		//{{INIT_CONTROLS
		setLayout(null);
		setSize(756,563);
		setVisible(false);
		openFileDialog1.setMode(FileDialog.LOAD);
		openFileDialog1.setTitle("Open");
		//$$ openFileDialog1.move(24,312);
		add(list1);
		list1.setBounds(300,144,408,372);
		add(verticalScrollbar1);
		verticalScrollbar1.setBounds(708,144,12,372);
		label1.setText("Skills List");
		add(label1);
		label1.setFont(new Font("SansSerif", Font.BOLD, 14));
		label1.setBounds(312,108,108,24);
		label2.setText("BR");
		add(label2);
		label2.setBounds(12,36,24,12);
		label3.setText("EN");
		add(label3);
		label3.setBounds(12,72,24,12);
		label4.setText("AG");
		add(label4);
		label4.setBounds(84,36,24,12);
		label5.setText("DX");
		add(label5);
		label5.setBounds(84,72,24,12);
		label6.setText("CO");
		add(label6);
		label6.setBounds(156,36,24,12);
		label7.setText("BD");
		add(label7);
		label7.setBounds(156,72,24,12);
		label8.setText("RE");
		add(label8);
		label8.setBounds(228,36,24,12);
		label9.setText("PE");
		add(label9);
		label9.setBounds(228,72,24,12);
		label10.setText("SO");
		add(label10);
		label10.setBounds(300,36,24,12);
		label11.setText("PR");
		add(label11);
		label11.setBounds(300,72,24,12);
		textField1.setText("50");
		add(textField1);
		textField1.setBounds(36,36,24,24);
		textField2.setText("50");
		add(textField2);
		textField2.setBounds(36,72,24,24);
		add(textField3);
		textField3.setBounds(108,36,24,24);
		add(textField4);
		textField4.setBounds(108,72,24,24);
		add(textField5);
		textField5.setBounds(180,36,24,24);
		add(textField6);
		textField6.setBounds(180,72,24,24);
		add(textField7);
		textField7.setBounds(252,36,24,24);
		add(textField8);
		textField8.setBounds(252,72,24,24);
		add(textField9);
		textField9.setBounds(324,36,24,24);
		add(textField10);
		textField10.setBounds(324,72,24,24);
		button1.setLabel("^");
		add(button1);
		button1.setBackground(java.awt.Color.lightGray);
		button1.setBounds(60,36,12,12);
		button2.setLabel("v");
		add(button2);
		button2.setBackground(java.awt.Color.lightGray);
		button2.setBounds(60,48,12,12);
		button3.setLabel("^");
		add(button3);
		button3.setBackground(java.awt.Color.lightGray);
		button3.setBounds(60,72,12,12);
		button4.setLabel("v");
		add(button4);
		button4.setBackground(java.awt.Color.lightGray);
		button4.setBounds(60,84,12,12);
		button5.setLabel("^");
		add(button5);
		button5.setBackground(java.awt.Color.lightGray);
		button5.setBounds(132,36,12,12);
		button6.setLabel("v");
		add(button6);
		button6.setBackground(java.awt.Color.lightGray);
		button6.setBounds(204,84,12,12);
		button7.setLabel("^");
		add(button7);
		button7.setBackground(java.awt.Color.lightGray);
		button7.setBounds(204,36,12,12);
		button8.setLabel("v");
		add(button8);
		button8.setBackground(java.awt.Color.lightGray);
		button8.setBounds(132,48,12,12);
		button9.setLabel("^");
		add(button9);
		button9.setBackground(java.awt.Color.lightGray);
		button9.setBounds(276,36,12,12);
		button10.setLabel("v");
		add(button10);
		button10.setBackground(java.awt.Color.lightGray);
		button10.setBounds(204,48,12,12);
		button11.setLabel("^");
		add(button11);
		button11.setBackground(java.awt.Color.lightGray);
		button11.setBounds(276,72,12,12);
		button12.setLabel("v");
		add(button12);
		button12.setBackground(java.awt.Color.lightGray);
		button12.setBounds(276,84,12,12);
		button13.setLabel("^");
		add(button13);
		button13.setBackground(java.awt.Color.lightGray);
		button13.setBounds(348,72,12,12);
		button14.setLabel("v");
		add(button14);
		button14.setBackground(java.awt.Color.lightGray);
		button14.setBounds(276,48,12,12);
		button15.setLabel("^");
		add(button15);
		button15.setBackground(java.awt.Color.lightGray);
		button15.setBounds(348,36,12,12);
		button16.setLabel("v");
		add(button16);
		button16.setBackground(java.awt.Color.lightGray);
		button16.setBounds(348,84,12,12);
		button17.setLabel("^");
		add(button17);
		button17.setBackground(java.awt.Color.lightGray);
		button17.setBounds(204,72,12,12);
		button18.setLabel("v");
		add(button18);
		button18.setBackground(java.awt.Color.lightGray);
		button18.setBounds(348,48,12,12);
		button19.setLabel("^");
		add(button19);
		button19.setBackground(java.awt.Color.lightGray);
		button19.setBounds(132,72,12,12);
		button20.setLabel("v");
		add(button20);
		button20.setBackground(java.awt.Color.lightGray);
		button20.setBounds(132,84,12,12);
		setTitle("AWT Application");
		//}}
		
		//{{INIT_MENUS
		menu1.setLabel("File");
		menu1.add(newMenuItem);
		newMenuItem.setLabel("New");
		newMenuItem.setShortcut(new MenuShortcut(java.awt.event.KeyEvent.VK_N,false));
		menu1.add(openMenuItem);
		openMenuItem.setLabel("Open...");
		openMenuItem.setShortcut(new MenuShortcut(java.awt.event.KeyEvent.VK_O,false));
		menu1.add(saveMenuItem);
		saveMenuItem.setLabel("Save");
		saveMenuItem.setShortcut(new MenuShortcut(java.awt.event.KeyEvent.VK_S,false));
		menu1.add(saveAsMenuItem);
		saveAsMenuItem.setLabel("Save As...");
		menu1.add(separatorMenuItem);
		separatorMenuItem.setLabel("-");
		menu1.add(exitMenuItem);
		exitMenuItem.setLabel("Exit");
		mainMenuBar.add(menu1);
		menu2.setLabel("Edit");
		menu2.add(cutMenuItem);
		cutMenuItem.setLabel("Cut");
		cutMenuItem.setShortcut(new MenuShortcut(java.awt.event.KeyEvent.VK_X,false));
		menu2.add(copyMenuItem);
		copyMenuItem.setLabel("Copy");
		copyMenuItem.setShortcut(new MenuShortcut(java.awt.event.KeyEvent.VK_C,false));
		menu2.add(pasteMenuItem);
		pasteMenuItem.setLabel("Paste");
		pasteMenuItem.setShortcut(new MenuShortcut(java.awt.event.KeyEvent.VK_V,false));
		mainMenuBar.add(menu2);
		menu3.setLabel("Help");
		menu3.add(aboutMenuItem);
		aboutMenuItem.setLabel("About...");
		mainMenuBar.add(menu3);
		//$$ mainMenuBar.move(0,312);
		setMenuBar(mainMenuBar);
		//}}
		
		//{{REGISTER_LISTENERS
		SymWindow aSymWindow = new SymWindow();
		this.addWindowListener(aSymWindow);
		SymAction lSymAction = new SymAction();
		openMenuItem.addActionListener(lSymAction);
		exitMenuItem.addActionListener(lSymAction);
		aboutMenuItem.addActionListener(lSymAction);
		//}}
	}
	
	public Frame1(String title)
	{
		this();
		setTitle(title);
	}
	
    /**
     * Shows or hides the component depending on the boolean flag b.
     * @param b  if true, show the component; otherwise, hide the component.
     * @see java.awt.Component#isVisible
     */
    public void setVisible(boolean b)
	{
		if(b)
		{
			setLocation(50, 50);
		}	
		super.setVisible(b);
	}
	
	static public void main(String args[])
	{
		try
		{
			//Create a new instance of our application's frame, and make it visible.
    		(new Frame1()).setVisible(true);
		}
		catch (Throwable t)
		{
			System.err.println(t);
			t.printStackTrace();
			//Ensure the application exits with an error condition.
			System.exit(1);
		}
	}
	
	public void addNotify()
	{
		// Record the size of the window prior to calling parents addNotify.
		Dimension d = getSize();
		
		super.addNotify();
	
		if (fComponentsAdjusted)
			return;
	
		// Adjust components according to the insets
		setSize(getInsets().left + getInsets().right + d.width, getInsets().top + getInsets().bottom + d.height);
		Component components[] = getComponents();
		for (int i = 0; i < components.length; i++)
		{
			Point p = components[i].getLocation();
			p.translate(getInsets().left, getInsets().top);
			components[i].setLocation(p);
		}
		fComponentsAdjusted = true;
	}
	
	// Used for addNotify check.
	boolean fComponentsAdjusted = false;
	
	//{{DECLARE_CONTROLS
	java.awt.FileDialog openFileDialog1 = new java.awt.FileDialog(this);
	java.awt.List list1 = new java.awt.List(0);
	java.awt.Scrollbar verticalScrollbar1 = new java.awt.Scrollbar(Scrollbar.VERTICAL);
	java.awt.Label label1 = new java.awt.Label();
	java.awt.Label label2 = new java.awt.Label();
	java.awt.Label label3 = new java.awt.Label();
	java.awt.Label label4 = new java.awt.Label();
	java.awt.Label label5 = new java.awt.Label();
	java.awt.Label label6 = new java.awt.Label();
	java.awt.Label label7 = new java.awt.Label();
	java.awt.Label label8 = new java.awt.Label();
	java.awt.Label label9 = new java.awt.Label();
	java.awt.Label label10 = new java.awt.Label();
	java.awt.Label label11 = new java.awt.Label();
	java.awt.TextField textField1 = new java.awt.TextField();
	java.awt.TextField textField2 = new java.awt.TextField();
	java.awt.TextField textField3 = new java.awt.TextField();
	java.awt.TextField textField4 = new java.awt.TextField();
	java.awt.TextField textField5 = new java.awt.TextField();
	java.awt.TextField textField6 = new java.awt.TextField();
	java.awt.TextField textField7 = new java.awt.TextField();
	java.awt.TextField textField8 = new java.awt.TextField();
	java.awt.TextField textField9 = new java.awt.TextField();
	java.awt.TextField textField10 = new java.awt.TextField();
	java.awt.Button button1 = new java.awt.Button();
	java.awt.Button button2 = new java.awt.Button();
	java.awt.Button button3 = new java.awt.Button();
	java.awt.Button button4 = new java.awt.Button();
	java.awt.Button button5 = new java.awt.Button();
	java.awt.Button button6 = new java.awt.Button();
	java.awt.Button button7 = new java.awt.Button();
	java.awt.Button button8 = new java.awt.Button();
	java.awt.Button button9 = new java.awt.Button();
	java.awt.Button button10 = new java.awt.Button();
	java.awt.Button button11 = new java.awt.Button();
	java.awt.Button button12 = new java.awt.Button();
	java.awt.Button button13 = new java.awt.Button();
	java.awt.Button button14 = new java.awt.Button();
	java.awt.Button button15 = new java.awt.Button();
	java.awt.Button button16 = new java.awt.Button();
	java.awt.Button button17 = new java.awt.Button();
	java.awt.Button button18 = new java.awt.Button();
	java.awt.Button button19 = new java.awt.Button();
	java.awt.Button button20 = new java.awt.Button();
	//}}
	
	//{{DECLARE_MENUS
	java.awt.MenuBar mainMenuBar = new java.awt.MenuBar();
	java.awt.Menu menu1 = new java.awt.Menu();
	java.awt.MenuItem newMenuItem = new java.awt.MenuItem();
	java.awt.MenuItem openMenuItem = new java.awt.MenuItem();
	java.awt.MenuItem saveMenuItem = new java.awt.MenuItem();
	java.awt.MenuItem saveAsMenuItem = new java.awt.MenuItem();
	java.awt.MenuItem separatorMenuItem = new java.awt.MenuItem();
	java.awt.MenuItem exitMenuItem = new java.awt.MenuItem();
	java.awt.Menu menu2 = new java.awt.Menu();
	java.awt.MenuItem cutMenuItem = new java.awt.MenuItem();
	java.awt.MenuItem copyMenuItem = new java.awt.MenuItem();
	java.awt.MenuItem pasteMenuItem = new java.awt.MenuItem();
	java.awt.Menu menu3 = new java.awt.Menu();
	java.awt.MenuItem aboutMenuItem = new java.awt.MenuItem();
	//}}
	
	class SymWindow extends java.awt.event.WindowAdapter
	{
		public void windowClosing(java.awt.event.WindowEvent event)
		{
			Object object = event.getSource();
			if (object == Frame1.this)
				Frame1_WindowClosing(event);
		}
	}
	
	void Frame1_WindowClosing(java.awt.event.WindowEvent event)
	{
		// to do: code goes here.
			 
		Frame1_WindowClosing_Interaction1(event);
	}


	void Frame1_WindowClosing_Interaction1(java.awt.event.WindowEvent event)
	{
		try {
			// QuitDialog Create and show as modal
			(new QuitDialog(this, true)).setVisible(true);
		} catch (Exception e) {
		}
	}

	
	class SymAction implements java.awt.event.ActionListener
	{
		public void actionPerformed(java.awt.event.ActionEvent event)
		{
			Object object = event.getSource();
			if (object == openMenuItem)
				openMenuItem_ActionPerformed(event);
			else if (object == aboutMenuItem)
				aboutMenuItem_ActionPerformed(event);
			else if (object == exitMenuItem)
				exitMenuItem_ActionPerformed(event);
		}
	}
	
	void openMenuItem_ActionPerformed(java.awt.event.ActionEvent event)
	{
		// to do: code goes here.
			 
		openMenuItem_ActionPerformed_Interaction1(event);
	}


	void openMenuItem_ActionPerformed_Interaction1(java.awt.event.ActionEvent event)
	{
		try {
			// OpenFileDialog Create and show as modal
		    int		defMode         = openFileDialog1.getMode();
		    String	defTitle        = openFileDialog1.getTitle();
		    String defDirectory     = openFileDialog1.getDirectory();
		    String defFile          = openFileDialog1.getFile();

		    openFileDialog1 = new java.awt.FileDialog(this, defTitle, defMode);
		    openFileDialog1.setDirectory(defDirectory);
		    openFileDialog1.setFile(defFile);
		    openFileDialog1.setVisible(true);
		} catch (Exception e) {
		}
	}


	void aboutMenuItem_ActionPerformed(java.awt.event.ActionEvent event)
	{
		// to do: code goes here.
			 
		aboutMenuItem_ActionPerformed_Interaction1(event);
	}


	void aboutMenuItem_ActionPerformed_Interaction1(java.awt.event.ActionEvent event)
	{
		try {
			// AboutDialog Create and show as modal
			(new AboutDialog(this, true)).setVisible(true);
		} catch (Exception e) {
		}
	}
	
	
	void exitMenuItem_ActionPerformed(java.awt.event.ActionEvent event)
	{
		// to do: code goes here.
			 
		exitMenuItem_ActionPerformed_Interaction1(event);
	}


	void exitMenuItem_ActionPerformed_Interaction1(java.awt.event.ActionEvent event)
	{
		try {
			// QuitDialog Create and show as modal
		    (new QuitDialog(this, true)).setVisible(true);
		} catch (Exception e) {
		}
	}

}
