
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

public class cd extends JFrame implements ActionListener {
    JFrame window;
    JButton btn1;
    JButton btn2;
    static File file;
    static File file2;

    cd(){
        window = new JFrame("Compressor And Decompressor");
        btn1 = new JButton("Select for compress");
        btn2 = new JButton("Select for decompress");
        window.setVisible(true);
        window.setLayout(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setSize(400, 500);
        btn1.setBounds(0, 150, 180, 30);
        btn2.setBounds(200, 150, 180, 30);

        window.add(btn1);
        window.add(btn2);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

    public static void main(String[] args) {
        new cd();

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn1) {
            JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                file = new File(filechooser.getSelectedFile().getAbsolutePath());

            }
            try {
                compressor.method(file);
            } catch (Exception ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }

        }
        if (e.getSource() == btn2) {
            JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            if (response == JFileChooser.APPROVE_OPTION) {
                file2 = new File(filechooser.getSelectedFile().getAbsolutePath());

            }
            try {
                decompressor.method(file2);
            } catch (Exception ee) {
                JOptionPane.showMessageDialog(null, ee.toString());
            }
        }
    }

}