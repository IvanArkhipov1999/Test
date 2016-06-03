/**
 * Created by user on 6/3/2016.
 */

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

//Code Listing: CurrentIP.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Main {
    public static void main(String[] args) {

        int width = 1000;
        int height = 1000;

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();

        int ScreenHeight = screenSize.height;
        int ScreenWidth = screenSize.width;

//        //Установка Java Look and Feel (по умолчанию)
//        try {
//            UIManager.setLookAndFeel(
//                    UIManager.getSystemLookAndFeelClassName());
//        }
//        catch (Exception e) { }
//        //остальная часть программы
//    }

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(" Hello!"));

        JFrame frame = new JFrame("Game");
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.getContentPane().add(panel);

        //frame.pack();
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.setLocation(ScreenWidth / 3, ScreenHeight /3);

//        JLabel label = new JLabel();
//        label.setText(" Hello, World!");
//        label.getLabelFor(frame);

        JButton button = new JButton();
        button.setText("BUTTON");
        //button.setHorizontalAlignment(100);
        frame.add(button);

    }
}
