package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubmitPerformAction implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
	String temp = e.getActionCommand();
	if(temp.equals("submit")) {
	    System.out.println("Form Submitted");
	}
	else if(temp.equals("cancel")){
	    System.out.println("Operation Cancelled");
	}
    }
}
