package anis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jpassdemo extends JFrame {

public Container c;
public JPasswordField pf;
public Font font;
public JLabel passlabel;
public JButton passbtn;
//ResultSet rs;

    Jpassdemo(Connection con, Statement st)
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        font = new Font("Arial",Font.BOLD,20);

        passlabel = new JLabel("Password : ");
        passlabel.setBounds(5,150,150,50);
        passlabel.setFont(font);
        c.add(passlabel);

        pf = new JPasswordField();
        pf.setBounds(120,150,200,50);
        pf.setBackground(Color.BLACK);
        pf.setForeground(Color.WHITE);
        pf.setEchoChar('*');
        pf.setFont(font);
        pf.setToolTipText("Enter Password Here.");
        c.add(pf);

        passbtn = new JButton("Submit");
        passbtn.setBounds(360,150,100,50);
        passbtn.setBackground(Color.green);
        passbtn.setForeground(Color.WHITE);
        passbtn.setFont(font);
        c.add(passbtn);

        passbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String psftxt = pf.getText();

                String psftxt = new String(pf.getPassword());

                //JOptionPane.showMessageDialog(null,"Password = " + psftxt);

                String query = "Insert into password values ('"+psftxt+"')";

                try {
//                    rs = st.executeQuery(query);
                    st.executeQuery(query);
                    st.close();
                    con.close();

                } catch (Exception exception)
                {

                }


            }
        });

    }

}
