/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainFrame;

import java.awt.Canvas;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class Window extends Canvas {

    public Window(int width, int height, String title, PvZGame game) {
        JFrame frame = new JFrame(title);
        frame.add(game);
        frame.setSize(width, height);
        frame.setResizable(false);
        // Set able to use our KeyBoard of Mouse
        frame.setFocusable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.err.println("Exiting Game");
                game.stop();
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.requestFocus();
        game.start();
    }
}
