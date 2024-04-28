/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PasswordStoreAppV3.models;

import PasswordStoreAppV3.models.cli.HLine;
import PasswordStoreAppV3.models.cli.Input;
import PasswordStoreAppV3.models.cli.Label;
import PasswordStoreAppV3.models.cli.SelectInput;
import PasswordStoreAppV3.models.cli.Space;
import PasswordStoreAppV3.models.password.DataPassword;
import PasswordStoreAppV3.models.password.PasswordStore;

/**
 *
 * @author taliyameyswara
 */
public class InputPage extends BasePage{
    private  Input nameInput;
    private  Input usernameInput;
    private  Input passInput;
    private  SelectInput catInput;
    private PasswordStore passStr;

    public InputPage(int width) {
        super("Input Page", width);
        this.nameInput = new Input("Judul: ");
        this.usernameInput = new Input("Username: ");
        this.passInput = new Input("Password: ");
        String[] kategoriOptions = {"Belum terkategori", "Aplikasi Web", "Aplikasi Mobile", "Akun Lainnya"};
        this.catInput = new SelectInput("Kategori", kategoriOptions, width);
    }
    


    public void drawContent() {
      this.nameInput.draw();
      String name = nameInput.getValue();
      this.usernameInput.draw();
      String username = usernameInput.getValue();
      this.passInput.draw();
      String password = passInput.getValue();
      this.catInput.draw();
      int category = catInput.getValue();
     
      this.passStr = new PasswordStore(name, username, password);
      DataPassword.passData.add(this.passStr);
      
      new MainPage(width).draw();
      
    }
}

