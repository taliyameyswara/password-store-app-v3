/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PasswordStoreAppV3.models.cli;

import PasswordStoreAppV3.models.Component;

/**
 *
 * @author taliyameyswara
 */
public class Label implements Component{
    private int width;
    public String text;
    
    public Label(String text, int width){
        this.text = text;
        this.width = width;
    }
    
    public void draw(){
        System.out.print("|");
        if(text.length() > width){
            System.out.print("  "+text);
            for(int i = 0; i<width; i++){
                System.out.print(" ");
            }
        }else{
            System.out.print("  "+text);
            for(int i = 0; i<width-text.length()-2; i++){
                System.out.print(" ");
            }
        }
        System.out.println("|");
    }
}

