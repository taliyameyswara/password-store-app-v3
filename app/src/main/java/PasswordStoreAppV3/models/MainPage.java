/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PasswordStoreAppV3.models;

import PasswordStoreAppV3.models.cli.Label;
import PasswordStoreAppV3.models.cli.SelectInput;
import PasswordStoreAppV3.models.cli.Space;
import PasswordStoreAppV3.models.password.DataPassword;

/**
 *
 * @author taliyameyswara
 */
public class MainPage extends BasePage {

    SelectInput pageSelect;

    public MainPage(int width) {
        super("Aplikasi Penyimpanan Password", width);
        this.components.add(new Label("Selamat datang di aplikasi Password Vault",
                this.width));
        this.components.add(new Label("Simpan password anda dengan aman di sini",
                this.width));
        this.components.add(new Space(this.width));
        String[] pages = {"Input Password", "Tampil Password", "Keluar Aplikasi"};
        this.pageSelect = new SelectInput("Pilih halaman berikut:",
                pages, this.width);
        this.components.add(pageSelect);
    }

    @Override
    public void drawContent() {
        int select;
        for (Component widget : this.components) {
            widget.draw();
        }
        select = this.pageSelect.getValue() - 1;
        switch (select) {
            case 0 -> {
                drawFooter();
                new InputPage(this.width).draw();
            }
            case 1 -> {
                drawFooter();
                new PasswordListPage(this.width).draw();
            }
            case 2 -> {
                new Label("Menyimpan data ... ...", this.width).draw();
                DataPassword.saveCSVData();
                new Label("Terima kasih telah menggunakan aplikasi", this.width).draw();
                drawFooter();
                System.exit(0);
            }
            default -> {
                new MainPage(this.width).draw();
            }
        }
    }
}
