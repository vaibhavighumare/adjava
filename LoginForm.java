import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class LoginForm implements ActionListener
{
	JFrame f1;
	JPanel p1;
	
	JLabel lun,lpass,leu,lep,ls;
	JTextField tun;
	JPasswordField tpass;

	JButton blogin,breset;

	public LoginForm()
	{
		f1 = new JFrame("LOGIN");
		f1.setSize(200,200);
		f1.setVisible(true);

		p1 = new JPanel();
		
		GridLayout gl = new GridLayout(3,3,5,5);
		p1.setLayout(gl);
		

		lun = new JLabel("Username : ");
		tun = new JTextField(10);
		lpass = new JLabel("Password : ");
		tpass = new JPasswordField(10);
		blogin = new JButton("LOG IN");
		breset = new JButton("RESET");
		leu = new JLabel();
		lep = new JLabel();
		ls = new JLabel();
		
		f1.add(p1);

		p1.add(lun);
		p1.add(tun);
		p1.add(leu);
		p1.add(lpass);
		p1.add(tpass);
		p1.add(lep);
		p1.add(breset);
		p1.add(blogin);	
		p1.add(ls);
		
		breset.addActionListener(this);
		blogin.addActionListener(this);

		
	}

	public void actionPerformed (ActionEvent e)
	{
		if(e.getSource()==blogin)
		{
			String username = tun.getText();
			String password = tpass.getText();
			if(username.equals("admin"))
			{
				if(password.equals("admin"))
				{
					ls.setText("Vaild User");
					RegistrationForm r1 = new RegistrationForm();
					f1.setVisible(false);
				}
				else
				{
					lep.setText("Invalid Password ");
				}
			}
			else
			{
				leu.setText("Invalid Username");
				tun.setText("");
			}
			if(username.equals(""))
			{
				leu.setText("Enter Username Please ");
				tpass.setText("");
			}
			if(password.equals(""))
			{
				lep.setText("Enter Password Please");	
			}
		}
		if(e.getSource()==breset)
		{
			tun.setText("");
			tpass.setText("");
		}
	}
	
	public static void main(String args[])
	{
		LoginForm l1 = new LoginForm();
	}


}
	