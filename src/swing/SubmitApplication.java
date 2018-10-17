package swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SubmitApplication {
    public static void main(String[] args) {
	JFrame frame = new JFrame();
	JLabel username = new JLabel("username");
	JTextField usern = new JTextField(20);
	username.setLabelFor(usern);
	JLabel password = new JLabel("password");
	JPasswordField passw =  new JPasswordField(20);
	password.setLabelFor(passw);
	JButton bcancel = new JButton("cancel");
	JButton bsubmit = new JButton("submit");
	JButton bclear = new JButton("clear");
	bsubmit.addActionListener(new SubmitPerformAction());
	bcancel.addActionListener(new SubmitPerformAction());
	bclear.addActionListener(new SubmitPerformAction(){
	    @Override
	    public void actionPerformed(ActionEvent e) {
		usern.setText("");
		passw.setText(" ");
	    }
	});
	JPanel panel = new JPanel();
	panel.setLayout(new FlowLayout());
	panel.add(username);
	panel.add(usern);
	panel.add(password);
	panel.add(passw);
	panel.add(bclear);
	panel.add(bsubmit);
	panel.add(bcancel);
	frame.setSize(400, 300);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(panel);
    }
}
