/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PasswordStoreAppV3.models;

import PasswordStoreAppV3.models.cli.HLine;
import PasswordStoreAppV3.models.cli.Label;
import PasswordStoreAppV3.models.cli.Space;
import PasswordStoreAppV3.models.password.DataPassword;
import PasswordStoreAppV3.models.password.PasswordStore;
import java.util.ArrayList;

/**
 *
 * @author taliyameyswara
 */
public class PasswordListPage extends BasePage{

    public PasswordListPage(int width) {
        super("Password List Page", width);
    }
    
    @Override
    public void drawContent() {
        int totalPasswords = DataPassword.passData.size();
        this.space.draw();
        this.label.text = "Terdapat " + totalPasswords + " tersimpan.";
        this.label.draw();
        this.label.text = "----- ----- -----";
        this.label.draw();

        ArrayList<PasswordStore> passwords = DataPassword.passData;


        for (PasswordStore password : passwords) {

            String colName = String.format("| %-25s", password.name);
            String colUsername = String.format("| %-20s", password.username);
            String colCategory = String.format("| %-20s |", password.getCategory());

            this.label.text = "  " + colName + colUsername + colCategory;
            this.label.draw();
        }

        this.space.draw();
        new MainPage(width).draw();
    }
}
