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
public class SelectInput implements Component{
    private String[] selection;
    private int width;
    private String label;
    private int value;
    private Input input;

    // Konstruktor
    public SelectInput(String label, String[] selection, int width) {
        this.label = label;
        this.selection = selection;
        this.width = width;
        this.input = new Input(label);
    }
    
    // Method
    public void draw(){
        new Label(label, width).draw();
        for (int i = 0; i < selection.length; i++) {
            System.out.print("|    ");
            String idx = "[" + (i + 1) + "] ";
            System.out.print(idx + selection[i]);

            // padding kanan
            int spaces = width - (idx.length() + selection[i].length()) - 4;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.print("|  Pilihan : ");
        this.value = input.getValueInt(); 
        
    }
    
    public int getValue(){
        return value;
    }

}

