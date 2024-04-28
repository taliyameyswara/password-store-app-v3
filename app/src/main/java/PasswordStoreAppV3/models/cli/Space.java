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
public class Space implements Component{
    // Atribut
    private int width;
    
    // Konstruktor
    public Space(int width){
        this.width = width;
    }
    
    // Method
    public void draw(){
        System.out.print("|");
        for(int i = 0; i<width; i++){
            System.out.print(" ");
        }
        System.out.println("|");
    }
    
}
