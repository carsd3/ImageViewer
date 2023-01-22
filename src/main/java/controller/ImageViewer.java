/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import model.Image;
import view.persistence.FileImageLoader;
/**
 *
 * @author Carlos
 */
public class ImageViewer {
    public static void main(String[] args) {    
        File folder = new File("C:\\Users\\Meni\\Desktop\\images");
        FileImageLoader imageLoader = new FileImageLoader(folder);
        Image image = imageLoader.load();
        MainFrame mf = new MainFrame();
        mf.getImageDisplay().show(image);
    }
}
