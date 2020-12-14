package ≤∂”„;

import javax.swing.JFrame;

public class Test_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame();
		jf.setBounds(400, 50, 800, 480);
		MainPanel mp=new MainPanel();
		jf.add(mp);
		jf.setDefaultCloseOperation(3);
		jf.setVisible(true);
		mp.go();
	}

}
