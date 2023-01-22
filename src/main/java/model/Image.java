/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

import java.io.InputStream;

/**
 *
 * @author Carlos
 */
public interface Image {
    public String name();
    public InputStream stream();
    public Image next();
    public Image prev();
}
