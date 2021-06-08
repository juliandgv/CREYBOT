import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        new Window();
    }

}

class Window extends JFrame {
    private final SClip background = new SClip("resources/background.wav");
   
    public Window() {
        //panel
        JPanel panel = new JPanel();
        panel.setBounds(90, 40, 410, 180);
        panel.setBackground(new Color(232, 251, 252));
        panel.setLayout(null);
        add(panel);

        //title
        JLabel lTitle = new JLabel();
        lTitle.setFont(new Font("Arial", Font.BOLD, 17));
        lTitle.setBounds(130, 20, 180, 28);
        lTitle.setText("menu de robot.folder");
        panel.add(lTitle);

        
        //background
      

        JButton btPlayBackground = new JButton();
        btPlayBackground.setBounds(110, 130, 80, 40);
        btPlayBackground.setText("play");
        btPlayBackground.setBorder(BorderFactory.createLineBorder(Color.black,1, true));
        btPlayBackground.setFocusable(false);
        btPlayBackground.addActionListener((e)->background.play());
        panel.add(btPlayBackground);


        JButton btStopBackground = new JButton();
        btStopBackground.setBounds(250, 130, 80, 40);
        btStopBackground.setText("stop");
        btStopBackground.setBorder(BorderFactory.createLineBorder(Color.black,1, true));
        btStopBackground.setFocusable(false);
        btStopBackground.addActionListener((e)->background.stop());
        panel.add(btStopBackground);

        //frame
        getContentPane().setBackground(new Color(130, 134, 255));
        setTitle("CREIBOTS");
        setSize(600,300);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
        
    }


}
