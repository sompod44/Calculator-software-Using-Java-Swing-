
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Sompod_Programmer
 */
public class Calculator {

    public JFrame jFrame;
    public JLabel jLabel1, jLabel2, jLabel3;
    public JTextField jTextField;
    public JButton[] jButtons = new JButton[16];
    public JButton root, Memory, Clear, sqrt, pow;
    public static final int width = 380;
    public static final int height = 450;

    public Calculator() {
        jFrame = new JFrame("Simple Calculator @author Sompod_Programmer");

        jLabel1 = new JLabel("12 Digit Calculator.");
        jLabel1.setBounds(50, 0, 260, 20);
        jLabel2 = new JLabel("Only for Binary Expression");
        jLabel2.setBounds(50, 11, 260, 20);

        jLabel3 = new JLabel("Date : 17/03/2018     Creator : Sompod");
        jLabel3.setBounds(50, 350, 250, 20);
        jTextField = new JTextField();
        jTextField.setBounds(50, 30, 260, 40);

        String[] Button_text = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", ".", "x", "/", "+", "-", "="};

        for (int i = 0; i < 16; i++) {
            jButtons[i] = new JButton(Button_text[i]);
        }

        root = new JButton("M");
        Memory = new JButton("M" + "+");
        Clear = new JButton("Clear");
        Clear.setBackground(Color.RED);
        sqrt = new JButton("Sqrt");
        sqrt.setBackground(Color.GREEN);
        pow = new JButton("^2");
        pow.setBackground(Color.GREEN);

        int x = 50;
        int y = 80;
        int Width = 50;
        int Height = 50;

        int check_value = 0;
        for (int i = 0; i < 9; i++) {

            if (check_value == 3) {
                x = 50;
                check_value = 0;
                y = y + 50;
            }
            jButtons[i].setBounds(x, y, Width, Height);
            x = x + Width;
            ++check_value;

        }

        final int more_X = 10;

        jButtons[9].setBounds(50, y + Height, Width + Width, Height);
        jButtons[10].setBounds(50 + Width + Width, y + Height, Width, Height);
        jButtons[11].setBounds(more_X + 200, 80, 50, 50);
        jButtons[12].setBounds(more_X + 250, 80, 50, 50);
        jButtons[13].setBounds(more_X + 200, 130, 50, 50);
        jButtons[14].setBounds(more_X + 250, 130, 50, 50);
        root.setBounds(more_X + 200, 180, 45, 50);
        Memory.setBounds(more_X + 245, 180, 55, 50);
        jButtons[15].setBounds(more_X + 200, 230, 100, 50);
        Clear.setBounds(60, y + Height + Height + 10, Width + 20 + 10, 30);
        sqrt.setBounds(Width + 90 + 10, y + Height + Height + 10, Width + 20, 30);
        pow.setBounds(Width + 180, y + Height + Height + 10, Width + 20, 30);

        jButtons[4].setBackground(Color.BLUE);
        jButtons[11].setBackground(Color.YELLOW);
        jButtons[12].setBackground(Color.YELLOW);
        jButtons[13].setBackground(Color.YELLOW);
        jButtons[14].setBackground(Color.YELLOW);
        jButtons[15].setBackground(Color.GRAY);
        jFrame.add(jLabel1);
        jFrame.add(jLabel2);
        jFrame.add(jTextField);
        jFrame.add(root);
        jFrame.add(Memory);
        jFrame.add(Clear);
        jFrame.add(sqrt);
        jFrame.add(pow);
        jFrame.add(jLabel3);
        for (int i = 0; i < 16; i++) {
            jFrame.add(jButtons[i]);
        }

        jFrame.setSize(width, height);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new Listener_Hadler();
    }
}
