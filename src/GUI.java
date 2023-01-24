import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUI extends JFrame{
    public GUI (){

        //Opens a window
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize (400, 300);
        frame.setLayout (new FlowLayout());

        //Contains a menu for quitting the program
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Quit");
        JMenuItem quitItem = new JMenuItem ("Quit");

        quitItem.addActionListener ((ActionEvent e) -> System.exit (0));
        menuBar.add(menu);
        menu.add(quitItem);

        //Contains a text field with space for 10 characters
        JTextField textField = new JTextField(10);

        //Contains a progress bar which tracks the progress of the input in the text field
        JProgressBar progressBar = new JProgressBar(0,10);
        textField.addActionListener((ActionEvent e) -> {progressBar.setValue(textField.getText().length());
                                                        progressBar.setString(String.valueOf(textField.getText().length()));
                                                        progressBar.setStringPainted(true);});

        frame.add(panel);
        frame.setJMenuBar (menuBar);
        frame.setTitle("Homework_3_GUI");
        frame.setVisible(true);
        panel.add(textField);
        panel.add(progressBar);
    }
}