import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JFrame;



public class Start extends JFrame{


    public static void Start(){


        final JPanel panel = new JPanel();
    final JPanel panel2 = new JPanel();
    final JFrame frame = new JFrame("Quiz-Wiz");
    panel.setLayout(new FlowLayout());
    panel2.setLayout(new FlowLayout());
    JLabel title = new JLabel("Welcome to the Quiz-Wiz!");


    JButton quiz = new JButton();
    quiz.setText("Create Quiz");


    panel.add(title);
    panel2.add(quiz);

    title.setFont(new Font("Serif", Font.BOLD, 32));


    panel2.setLayout(new BorderLayout());
    panel2.setLayout(new FlowLayout(FlowLayout.CENTER));

    //panel2.setLayout(new BorderLayout());
    frame.add(panel2, BorderLayout.SOUTH);

    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();



    frame.add(panel);
    frame.setSize(700, 150);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);




    quiz.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
            panel.setVisible(false);
            panel2.setVisible(false);
            Create_Quiz();
            frame.setVisible(false);


        }
    });


}

    static void Create_Quiz(){

        Quiz_Type qui = new Quiz_Type();
        qui.Quiz_Type();

    }

}
