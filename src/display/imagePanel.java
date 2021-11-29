package display;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class imagePanel extends JPanel{
    
    // create the panel
    public imagePanel() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.BLACK);
        ImageIcon icon = new ImageIcon(imagePanel.class.getResource("/resources/images/HackerWallpaper.jpeg"));

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int height = (int) screenSize.getHeight() - 200;
        int width = (int) screenSize.getWidth() - 200;
        int x = (screenSize.width - width) / 2;
        int y = (screenSize.height - height) / 2;

        Image image = icon.getImage();
        Image newimg = image.getScaledInstance(width, height,  java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newimg);
        

        icon.paintIcon(this, g, x, y - 70);
    }
}
