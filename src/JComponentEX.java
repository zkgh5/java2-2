import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComponentEX extends JFrame {
    public JComponentEx() {
        super("JComponent의 공통 메소드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton b1 = new JButton("Magenta/Yellow Button");
        JButton b2 = new JButton("disabled Button");
        JButton b3 = new JButton("getX(), gety()");
        b1.setBackground(Color.YELLOW);
        b1.setBackground(Color.MAGENTA);
        b1.setFont(new Font("Arial", Font.ITALIC, 20));
        b2.setEnabled(false);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton)e.getsource();
                setTitle(b.getX() + "," b.getY());
            }
        });
        
    }
}
