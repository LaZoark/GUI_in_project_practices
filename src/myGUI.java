import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Arrays;

public class myGUI {

    private JButton OKButton;
    private JButton closeButton;
    private JLabel labelName;
    private JLabel labelPswd;
    private JTextArea labeldebug;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JPanel Panel1;

    private final String DEF_NAME = "b0742006";
    private final String DEF_PSWD = "12345678";

    public myGUI() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                check(textField1,passwordField1);
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Panel1.setVisible(false); //you can't see me!
            }
        });
    }
    protected void check(JTextField name, JPasswordField password){
        if(name.getText().equals(DEF_NAME)){
            labeldebug.setText("Hello " + DEF_NAME);
            if(Arrays.equals(password.getPassword(),DEF_PSWD.toCharArray())){
                labeldebug.setText("Hello " + DEF_NAME + ",\n It is nice to meet you! ");
            }else{
                labeldebug.setText("You got wrong password.");
            }
        }else{
            labeldebug.setText("Who the hell are you?!");
        }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("myGUI");
        frame.setContentPane(new myGUI().Panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
