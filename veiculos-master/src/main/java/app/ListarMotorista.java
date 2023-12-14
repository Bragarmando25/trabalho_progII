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
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import modelo.Motorista;
import util.Dao;

public class ListarMotorista {
    @FXML
    private TextField campoNome; 
    
    @FXML
    private TextField campoEndereco; 
    
    @FXML
    private TextField campoCnh; 
    
    @FXML
    private TextField campoCategoria; 
    
    @FXML
    private TextField campoSetor; 
    
    @FXML
    private ListView<Motorista> view;
    private ObservableList<Motorista> listaOb;
    private List<Motorista> lista;
    private Dao<Motorista> dao;
    
    @FXML
    private void initialize(){
        dao = new Dao(Motorista.class);
        lista = dao.listarTodos();
        listaOb = FXCollections.observableArrayList(lista);
        view.setItems(listaOb);
    }
    
    @FXML
    private void voltarAoMenu() throws IOException{
        App.setRoot("menu");
    }
}
