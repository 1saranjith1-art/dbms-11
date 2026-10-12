
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
    JTextField user;
    JPasswordField pass;
    JButton login;

    Login() {
        setTitle("Student Login");
        setLayout(new FlowLayout());

        add(new JLabel("Username:"));
        user = new JTextField(15);
        add(user);

        add(new JLabel("Password:"));
        pass = new JPasswordField(15);
        add(pass);

        login = new JButton("Login");
        add(login);
        login.addActionListener(this);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/swing_demo",
                "root", "root");

            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM student WHERE name=? AND password=?");

            ps.setString(1, user.getText());
            ps.setString(2, new String(pass.getPassword()));

            ResultSet rs = ps.executeQuery();

            JOptionPane.showMessageDialog(this,
                rs.next() ? "Login Successful" : "Invalid Login");

            rs.close();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error");
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
