import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        int x = 10;
        int y = 10;
        int a = 30;


        graphics.setColor(Color.yellow);
        graphics.drawLine(x, y, x + a, y);
        graphics.setColor(Color.red);
        graphics.drawLine(x + a, y, x + a, y + a);
        graphics.setColor(Color.blue);
        graphics.drawLine(x + a, y + a, x, y + a);
        graphics.setColor(Color.green);
        graphics.drawLine(x, y + a, x, y);



    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}