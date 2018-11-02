package com;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        JButton jButton = new JButton("Show dialog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jPanel, "This is sparta !!!", "title", JOptionPane.ERROR_MESSAGE);
            }
        });

        JButton jButton2 = new JButton("Confirmation ");
        jPanel.add(jButton2);
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(JOptionPane.showConfirmDialog(jPanel, "confirm me", "Confirmation dialog", JOptionPane.YES_NO_OPTION));
            }
        });

        JButton jButton3 = new JButton("Conf Opt Dial ");
        jPanel.add(jButton3);
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(JOptionPane.showOptionDialog(jPanel, "Так есть ли выбор?", "Выбор есть?", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[]{"Да", "Нет", "Наверное"}, "Нет"));
            }
        });

        jFrame.add(jPanel);
        JButton jButton4 = new JButton("Input message");
        jPanel.add(jButton4);
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(JOptionPane.showInputDialog(jPanel, "Input here some message"));
            }
        });


    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {
        };
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 500);
        return jFrame;

    }
}
