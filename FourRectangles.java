import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        int x = 70;
        int y = 70;
        int a = 80;

        drawRect(graphics, x, y, a);

        for (int i = 0; i < 4; i++) {

            Random rand = new Random();
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            Color randomColor = new Color(r, g, b);

            graphics.setColor(randomColor);
            drawRect(graphics, x+i*5, y+i*5, a+i*5);
        }


    }

    private static void drawRect(Graphics graphics, int x, int y, int a) {
        graphics.drawLine(x, y, x + a, y);
        graphics.drawLine(x + a, y, x + a, y + a);
        graphics.drawLine(x + a, y + a, x, y + a);
        graphics.drawLine(x, y + a, x, y);
    }

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}