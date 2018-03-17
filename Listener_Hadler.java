

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Sompod_Programmer
 */
public class Listener_Hadler extends Calculator implements ActionListener {

    StringBuilder main_string = new StringBuilder("");
    String calactor = "";
    public int mul = 1, div, add, sub;
    public int value = 0, final_value = 0, dot = 0, for_ans = 0;
    private String memory_result, memory_store;

    public Listener_Hadler() {
        for (int i = 0; i < 16; i++) {
            jButtons[i].addActionListener(this);
        }

        root.addActionListener(this);
        Memory.addActionListener(this);
        Clear.addActionListener(this);
        sqrt.addActionListener(this);
        pow.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == jButtons[0]) {

            if (value <= 12) {

                jTextField.setText(main_string.append(jButtons[0].getText()).toString());
                ++value;
            }

        }
        if (e.getSource() == jButtons[1]) {

            if (value <= 12) {

                jTextField.setText(main_string.append(jButtons[1].getText()).toString());

                ++value;
            }

        }
        if (e.getSource() == jButtons[2]) {

            if (value <= 12) {

                jTextField.setText(main_string.append(jButtons[2].getText()).toString());
                ++value;
            }

        }
        if (e.getSource() == jButtons[3]) {

            if (value <= 12) {

                jTextField.setText(main_string.append(jButtons[3].getText()).toString());
                ++value;
            }

        }
        if (e.getSource() == jButtons[4]) {

            if (value <= 12) {

                jTextField.setText(main_string.append(jButtons[4].getText()).toString());
                ++value;
            }

        }
        if (e.getSource() == jButtons[5]) {

            if (value <= 12) {

                jTextField.setText(main_string.append(jButtons[5].getText()).toString());

                ++value;
            }

        }
        if (e.getSource() == jButtons[6]) {

            if (value <= 12) {

                jTextField.setText(main_string.append(jButtons[6].getText()).toString());

                ++value;
            }

        }
        if (e.getSource() == jButtons[7]) {

            if (value <= 12) {

                jTextField.setText(main_string.append(jButtons[7].getText()).toString());
                ++value;
            }

        }
        if (e.getSource() == jButtons[8]) {

            if (value <= 12) {

                jTextField.setText(main_string.append(jButtons[8].getText()).toString());

                ++value;
            }

        }
        if (e.getSource() == jButtons[9]) {

            if (value <= 12) {

                jTextField.setText(main_string.append(jButtons[9].getText()).toString());

                ++value;
            }

        }
        if (e.getSource() == jButtons[10]) {
            if (value <= 12 && dot == 0) {

                jTextField.setText(main_string.append(jButtons[10].getText()).toString());
                ++dot;
                ++value;
            }
        }
        if (e.getSource() == jButtons[11]) {
            if (final_value == 0) {
                final_value = 1;
                value = 0;
                for_ans = 0;
                jTextField.setText(main_string.append(" X ").toString());
            }
        }
        if (e.getSource() == jButtons[12]) {
            if (final_value == 0) {
                final_value = 1;
                value = 0;
                dot = 0;
                for_ans = 0;
                jTextField.setText(main_string.append(" / ").toString());
            }
        }
        if (e.getSource() == jButtons[13]) {
            if (final_value == 0) {
                final_value = 1;
                value = 0;
                dot = 0;
                for_ans = 0;
                jTextField.setText(main_string.append(" + ").toString());
            }
        }
        if (e.getSource() == jButtons[14]) {
            if (final_value == 0) {
                final_value = 1;
                value = 0;
                dot = 0;
                for_ans = 0;
                jTextField.setText(main_string.append(" - ").toString());
            }
        }
        if (e.getSource() == jButtons[15]) {
            if (for_ans == 1) {
                String str1 = jTextField.getText();
                jTextField.setText(str1);
            } else {
                String str = jTextField.getText();
                String[] string = str.split(" ");
                if (string[1].equals("X")) {
                    double Do = Double.parseDouble(string[0]);
                    double Do1 = Double.parseDouble(string[2]);
                    double ans = Do * Do1;
                    String result = String.valueOf(ans);
                    jTextField.setText(result);
                    memory_result = result;
                    main_string.delete(0, main_string.length());
                    final_value = 0;
                    value = 0;
                    dot = 0;
                    for_ans = 1;
                } else if (string[1].equals("/")) {
                    double Do = Double.parseDouble(string[0]);
                    double Do1 = Double.parseDouble(string[2]);
                    double ans = Do / Do1;
                    String result = String.valueOf(ans);
                    jTextField.setText(result);
                    memory_result = result;
                    main_string.delete(0, main_string.length());
                    final_value = 0;
                    value = 0;
                    dot = 0;
                    for_ans = 1;
                } else if (string[1].equals("+")) {
                    double Do = Double.parseDouble(string[0]);
                    double Do1 = Double.parseDouble(string[2]);
                    double ans = Do + Do1;
                    String result = String.valueOf(ans);
                    jTextField.setText(result);
                    memory_result = result;
                    main_string.delete(0, main_string.length());
                    final_value = 0;
                    value = 0;
                    dot = 0;
                    for_ans = 1;
                } else if (string[1].equals("-")) {
                    double Do = Double.parseDouble(string[0]);
                    double Do1 = Double.parseDouble(string[2]);
                    double ans = Do - Do1;
                    String result = String.valueOf(ans);
                    jTextField.setText(result);
                    memory_result = result;
                    main_string.delete(0, main_string.length());
                    final_value = 0;
                    value = 0;
                    dot = 0;
                    for_ans = 1;
                }
            }

        }
        if (e.getSource() == root) {
            memory_store = memory_result;
            jTextField.setText("Your Answer is saved.");

        }
        if (e.getSource() == Memory) {
            jTextField.setText(memory_store);
        }
        if (e.getSource() == Clear) {
            main_string.delete(0, main_string.length());
            jTextField.setText(main_string.toString());
            final_value = 0;
            value = 0;
        }
        if (e.getSource() == sqrt) {
            String str = jTextField.getText();
            double reasult = Double.parseDouble(str);
            reasult = Math.sqrt(reasult);
            jTextField.setText("Sqrt of " + str + " is : " + reasult);
            String string = String.valueOf(reasult);
            memory_result = string;
            main_string.delete(0, main_string.length());
            final_value = 0;
            value = 0;
        }
        if (e.getSource() == pow) {
            String str = jTextField.getText();
            double reasult = Double.parseDouble(str);
            reasult = Math.pow(reasult, 2);
            jTextField.setText("Pow of " + str + " is : " + reasult);
            String string = String.valueOf(reasult);
            memory_result = string;
            main_string.delete(0, main_string.length());
            final_value = 0;
            value = 0;
        }
    }

}
