/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.ui;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import model.*;

/**
 *
 * @author Carlos
 */
public class SwingImageDisplay  extends JPanel implements ImageDisplay {
    private Image currentImage;
        
    @Override
    public Image current() {
        return currentImage;
    }
    
    @Override
    public void show(Image im) {
        this.currentImage = im;
        this.repaint();
    }
    
    @Override
    public void paint(Graphics g) {
        if (currentImage == null) return;
        g.drawImage(imageOf(currentImage), 0, 0, null);
    }
    
    public BufferedImage imageOf(Image im) {
        try {
            return ImageIO.read(im.stream());
        } catch (IOException e) {
            return null;
        }
    }
    
}
