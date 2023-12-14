/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import modelo.Operador;
import util.Dao;

public class OperadorController {
    
    @FXML
    private TextField campoNome;
    
    @FXML
    private TextField campoEndereco;
    
    @FXML
    private TextField campoLogin;
    
    @FXML
    private TextField campoSenha;
    
    @FXML 
    private void cadastrarOperador(){
        Operador operador = new Operador();
        operador.setNome(campoNome.getText());
        operador.setEndereco(campoEndereco.getText());
        operador.setLogin(campoLogin.getText());
        operador.setSenha(campoSenha.getText());
        Dao<Operador> dao = new Dao(Operador.class);
        dao.inserir(operador);
        limparCampos();
        Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setContentText("Operador cadastrado");
        alert.show();
    }
    
    @FXML
    private void limparCampos(){
        campoNome.setText("");
        campoEndereco.setText("");
        campoLogin.setText("");
        campoSenha.setText("");
    }
    
    
    @FXML 
    private void voltarMenu() throws IOException{
        App.setRoot("menu");
    }
}
