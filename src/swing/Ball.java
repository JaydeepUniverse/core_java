package swing;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Ball extends JFrame implements Runnable {
    Thread t1;
    Thread t2;
    Thread t3;
    private int x1;
    private int x2;
    private int x3;
    public Ball() {
	t1 = new Thread(this);
	t2 = new Thread(this);
	t3 = new Thread(this);
	t1.start();
	t2.start();
	t3.start();
	x1=0;
	x2=0;
	x3=0;
	this.setVisible(true);
	this.setSize(500, 500);
	this.setLocation(200, 100);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g) {
	super.paint(g);
	g.setColor(Color.BLUE);
	g.fillOval(x1, 100, 60, 60);
	g.setColor(Color.GREEN);
	g.fillOval(x2, 250, 60, 60);
	g.setColor(Color.RED);
	g.fillOval(x3, 450, 60, 60);
    }
    @Override
    public void run() {
	try {
	    while(true) {
		if(Thread.currentThread()==t1) {
		    x1++;
		    synchronized(this) {
			if(x1==300)
			    this.wait();
		    }
		    repaint();
		    Thread.sleep(15);
		}
		
		if(Thread.currentThread()==t2) {
		    x2++;
		    synchronized(this) {
			if(x2==300)
			    this.wait();
		    }
		    repaint();
		    Thread.sleep(10);
		}
		
		if(Thread.currentThread()==t3) {
		    x3++;
		    synchronized(this) {
			if(x3==300)
			    this.notifyAll();
		    }
		    repaint();
		    Thread.sleep(40);
		}
	    }
	}catch(InterruptedException e) {
	    e.printStackTrace();
	}
    }
    public static void main(String[] args) {
	new Ball();
    }
}
