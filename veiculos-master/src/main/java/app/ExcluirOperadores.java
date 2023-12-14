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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import modelo.Operador;
import util.Dao;
import util.ExclusaoException;

public class ExcluirOperadores {
    
    @FXML
    private ComboBox<Operador> comboOperador;
    
    private ObservableList<Operador> listaOb;
    private List<Operador> lista;
    private Dao<Operador> dao;
    
    @FXML
    private void initialize(){
        dao = new Dao(Operador.class);
        lista = dao.listarTodos();
        listaOb = FXCollections.observableArrayList(lista);
        comboOperador.setItems(listaOb);
    }
    
    @FXML
    private void excluirOperador(){
        Operador temp = comboOperador.getSelectionModel().getSelectedItem();
        try{
            dao.excluir(temp);
        } catch(ExclusaoException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Selecione um operador");
            alert.show();
        }
        lista = dao.listarTodos();
        listaOb = FXCollections.observableArrayList(lista);
        comboOperador.setItems(listaOb);
    }
    
    @FXML
    private void voltarAoMenu() throws IOException{
        App.setRoot("menu");
    }
    
}
