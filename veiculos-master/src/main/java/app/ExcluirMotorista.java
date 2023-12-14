/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.io.IOException;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import modelo.Motorista;
import util.Dao;
import util.ExclusaoException;

public class ExcluirMotorista {
    
    @FXML
    private ComboBox<Motorista> comboMotoristas;
    
    private ObservableList<Motorista> listaOb;
    private List<Motorista> lista;
    private Dao<Motorista> dao;
    
    @FXML
    private void initialize(){
        dao = new Dao(Motorista.class);
        lista = dao.listarTodos();
        listaOb = FXCollections.observableArrayList(lista);
        comboMotoristas.setItems(listaOb);
    }
    
    @FXML
    private void excluirMotorista(){
        Motorista temp = comboMotoristas.getSelectionModel().getSelectedItem();
        try{
            dao.excluir(temp);
        } catch(ExclusaoException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Este Motorista não pode ser excluído\nTente outro");
            alert.show();
        }
        lista = dao.listarTodos();
        listaOb = FXCollections.observableArrayList(lista);
        comboMotoristas.setItems(listaOb);
    }
    
    @FXML
    private void voltarAoMenu() throws IOException{
        App.setRoot("menu");
    }
    
}
