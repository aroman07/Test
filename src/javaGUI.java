import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class javaGUI extends JFrame {
    private JPanel Main;
    private JTextField txtName;
    private JTextField txtAddress;
    private JButton button1;

    public javaGUI() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = txtName.getText();
                String address = txtAddress.getText();

                JOptionPane.showMessageDialog(null,name);
                JOptionPane.showMessageDialog(null,address);
            }
        });
    }

    public static void main(String[] args)
    {
        JFrame j = new JFrame("App");
        j.setContentPane(new javaGUI().Main);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        j.pack();
    }
}
