import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Main{
	static JFrame frame=new JFrame("labeled multi counter");
	static final Color back=new Color(0x171717);
	static final Color fore=new Color(0xb0b0b0);
	static final Border border=new LineBorder(fore,1);
	static panel panel=new panel();
	public static void main(String[] args){
		frame.setSize(430,510);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}