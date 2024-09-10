import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Objects;
import java.util.Vector;

public class panel extends JPanel{
	static short n;
	static Vector<thing>t=new Vector<>();
	JTextArea input=new JTextArea();
	JButton add=new JButton(new AbstractAction(){@Override public void actionPerformed(ActionEvent e){
		if(Objects.equals(input.getText(),""))return;
		t.add(new thing());
		t.get(n).id=n;
		t.get(n).setLocation(n/8*205+5,n%8*55+5);
		t.get(n).info.setText(input.getText());
		input.setText("");
		add(t.get(n));
		updateUI();
		n++;
	}});
	panel(){
		setLayout(null);
		setBackground(Main.back);
		setSize(415,800);
		input.setBackground(Main.back);
		input.setBounds(5,445,360,20);
		input.setBorder(Main.border);
		input.setForeground(Main.fore);
		input.setFont(new Font("consolas",Font.PLAIN,18));
		input.setCaretColor(Main.fore);
		add.setFocusable(false);
		add.setBackground(Main.back);
		add.setBounds(370,445,40,20);
		add.setBorder(Main.border);
		add.setText("ADD");
		add.setForeground(Main.fore);
		add.setFont(new Font("consolas",Font.PLAIN,18));
		add(add);
		add(input);
	}
}