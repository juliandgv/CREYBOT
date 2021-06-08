import javax.swing.*;
import java.awt.*;

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
        lTitle.setText("Sonido en java 2021");
        panel.add(lTitle);

        
        //background
        JLabel lBackground = new JLabel();
        lBackground.setBounds(30, 130, 180, 28);
        lBackground.setText("Sonido de background");
        panel.add(lBackground);

        JButton btPlayBackground = new JButton();
        btPlayBackground.setBounds(180, 130, 60, 20);
        btPlayBackground.setText("play");
        btPlayBackground.setBorder(BorderFactory.createLineBorder(Color.black,1, true));
        btPlayBackground.setFocusable(false);
        btPlayBackground.addActionListener((e)->background.play());
        panel.add(btPlayBackground);

        JButton btLoopBackground = new JButton();
        btLoopBackground.setBounds(250, 130, 60, 20);
        btLoopBackground.setText("loop");
        btLoopBackground.setBorder(BorderFactory.createLineBorder(Color.black,1, true));
        btLoopBackground.setFocusable(false);
        btLoopBackground.addActionListener((e)->background.loop());
        panel.add(btLoopBackground);

        JButton btStopBackground = new JButton();
        btStopBackground.setBounds(320, 130, 60, 20);
        btStopBackground.setText("stop");
        btStopBackground.setBorder(BorderFactory.createLineBorder(Color.black,1, true));
        btStopBackground.setFocusable(false);
        btStopBackground.addActionListener((e)->background.stop());
        panel.add(btStopBackground);

        //frame
        getContentPane().setBackground(new Color(130, 134, 255));
        setTitle("Sonido en java 2021");
        setSize(600,300);
        setLocationRelativeTo(this);
        setLayout(null);
        setVisible(true);
    }


}
