/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;


public class Login {
    @FXML
    private void entrar() throws IOException {
        App.setRoot("menu");
    }
}
