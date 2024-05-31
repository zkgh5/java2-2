import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class CheckBoxItemEventEx extends JFrame {
    private JCheckBox [] fruits = new JCheckBox [3];
    private String [] names = {"사과", "배", "체리"};
    private JLabel sumLabel;

    public CheckBoxItemEventEx() {
        setTitle("체크박스와 ItemEvent 예제");
        setDefaultCloseOperation(JFrame.EXIST_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("사과 100원, 배 500원 , 체리 800원"));
        myItemListner listener = new MyItemListener();
        for(int i=0; i<frutis.length; i++) {
            fruits
        }
    }

}
