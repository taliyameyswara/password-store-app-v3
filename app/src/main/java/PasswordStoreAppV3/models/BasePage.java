/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PasswordStoreAppV3.models;

import PasswordStoreAppV3.models.cli.HLine;
import PasswordStoreAppV3.models.cli.Label;
import PasswordStoreAppV3.models.cli.Space;
import java.util.ArrayList;

/**
 *
 * @author taliyameyswara
 */
public abstract class BasePage {
    public String title;
    public int width;
    protected HLine hline;
    protected Space space;
    protected Label label;
    ArrayList<Component> components = new ArrayList<>();

    public BasePage(String title, int width){
        this.title = title;
        this.width = width;
        this.hline = new HLine(width);
        this.space = new Space(width);
        this.label = new Label(title, width);
    }
    
    public void draw() {
        drawHeader();
        drawContent();
    }

    public void drawHeader() {
        hline.draw();
        space.draw();
        label.draw();
        space.draw();
        hline.draw();
    }

    public void drawFooter() {
        space.draw();
        hline.draw();
    }
    
    public abstract void drawContent();
}
