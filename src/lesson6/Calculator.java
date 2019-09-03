package lesson6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    public Calculator() {

        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(240,170);
        frame.setResizable(false);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        JTextField arg1 = new JTextField(20);
        arg1.setToolTipText("The first argument.");
        arg1.grabFocus();
        JTextField arg2 = new JTextField(20);
        arg2.setToolTipText("The second argument.");

        JTextField result = new JTextField(20);
        result.setToolTipText("Result");
        result.setEnabled(false);


        JRadioButton plus = new JRadioButton("+");
        JRadioButton minus = new JRadioButton("-");
        JRadioButton multiply = new JRadioButton("x");
        JRadioButton div = new JRadioButton("/");
        JRadioButton power = new JRadioButton("^");

        ButtonGroup operations = new ButtonGroup();
        operations.add(plus);
        operations.add(minus);
        operations.add(multiply);
        operations.add(div);
        operations.add(power);


        JButton clear = new JButton("C");

        JButton equal = new JButton("=");


        frame.add(arg1);

        frame.add(plus);
        frame.add(minus);
        frame.add(multiply);
        frame.add(div);
        frame.add(power);

        frame.add(arg2);

        frame.add(clear);
        frame.add(equal);

        frame.add(result);

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                arg1.setText("");
                arg2.setText("");
                result.setText(" ");
            }
        });

        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double firstArg = Double.parseDouble(arg1.getText());
                double secondArg = Double.parseDouble(arg2.getText());

                if(plus.isSelected()) {
                    double answer = firstArg + secondArg;
                    result.setText("" + answer);
                }

                else if(minus.isSelected()){
                    double answer = firstArg - secondArg;
                    result.setText("" + answer);
                }

                else if(multiply.isSelected()){
                    double answer = firstArg * secondArg;
                    result.setText("" + answer);
                }

                else if(div.isSelected()){
                    double answer = firstArg / secondArg;
                    result.setText("" + answer);
                }

                else if(power.isSelected()) {
                    double answer = Math.pow(firstArg, secondArg);
                    result.setText("" + answer);
                }
                else{
                    result.setText("Выбирите операцию");
                }
            }
        });

    }
}
