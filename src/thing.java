import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class thing extends JPanel{
	long n;
	short id;
	JButton add=new JButton(new AbstractAction(){@Override public void actionPerformed(ActionEvent e){n++;number.setText(String.valueOf(n));}}),subtract=new JButton(new AbstractAction(){@Override public void actionPerformed(ActionEvent e){if(n>0)n--;number.setText(String.valueOf(n));}}),remove=new JButton(new AbstractAction(){@Override public void actionPerformed(ActionEvent e){
		Main.panel.remove(panel.t.get(id));
		Main.panel.updateUI();
		panel.t.remove(id);
		for(int i=id;i<panel.n-1;i++){
			panel.t.get(i).id--;
			panel.t.get(i).setLocation(panel.t.get(i).id/8*205+5,panel.t.get(i).id%8*55+5);
		}
		Main.panel.updateUI();
		panel.n--;
	}});
	JLabel info=new JLabel(),number=new JLabel();
	thing(){
		setBackground(Main.back);
		setBorder(Main.border);
		setLayout(null);
		setSize(200,50);
		add.setFocusable(false);
		add.setBackground(Main.back);
		add.setBounds(5,5,18,18);
		add.setBorder(Main.border);
		add.setText("+");
		add.setForeground(Main.fore);
		add.setFont(new Font("consolas",Font.PLAIN,18));
		subtract.setFocusable(false);
		subtract.setBackground(Main.back);
		subtract.setBounds(27,5,18,18);
		subtract.setBorder(Main.border);
		subtract.setText("-");
		subtract.setForeground(Main.fore);
		subtract.setFont(new Font("consolas",Font.PLAIN,18));
		remove.setFocusable(false);
		remove.setBackground(Main.back);
		remove.setBounds(160,5,35,18);
		remove.setBorder(Main.border);
		remove.setText("DEL");
		remove.setForeground(Main.fore);
		remove.setFont(new Font("consolas",Font.PLAIN,18));
		number.setBackground(Main.back);
		number.setBounds(50,7,120,18);
		number.setText("0");
		number.setForeground(Main.fore);
		number.setFont(new Font("consolas",Font.PLAIN,18));
		info.setBackground(Main.back);
		info.setBounds(5,30,200,18);
		info.setText("0");
		info.setForeground(Main.fore);
		info.setFont(new Font("consolas",Font.PLAIN,14));
		info.setText("kkkkkkkkkkkk");
		add(add);
		add(subtract);
		add(remove);
		add(number);
		add(info);
	}
}
