import java.swing.*;

import javax.swing.JButton;

import java.awt.*;

public class GridLayoutEx extends JFrame{
    public GridLayoutEx() {
        setTitle("GridLayoutEx 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new GridLayout(1, 10));

        for(int i=0; i<10; i++) {
            String text = Integer.toString(i);
            JButton button = new JButton(text);
            contentPane.add(button);
        }

        JButton button = new JButton("*");
        contentPane.add(button);


        setSize(500, 200);
        setVisible(true);
    
    }    
}

