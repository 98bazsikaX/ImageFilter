import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ErrorPanel {


    public ErrorPanel(String message){

        JFrame errorFrame = new JFrame("ERROR");
        errorFrame.setPreferredSize(new Dimension(300,100));

        JLabel errormsg = new JLabel(message);

        JButton ok = new JButton("Ok");

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(420);
            }
        });


        errorFrame.add(ok,BorderLayout.AFTER_LAST_LINE);
        errorFrame.add(errormsg,BorderLayout.BEFORE_FIRST_LINE);
        errorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        errorFrame.pack();
        errorFrame.setVisible(true);


    }


}
