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
import javafx.scene.control.DatePicker;
import modelo.Motorista;
import modelo.UsoVeiculo;
import modelo.Veiculo;
import util.Dao;
import util.ExclusaoException;

public class RetiradaVeiculo {
    
    @FXML
    private ComboBox<Motorista> comboMotorista;
    
    private ObservableList<Motorista> listaOb;
    private List<Motorista> lista;
    private Dao<Motorista> dao;
    
    @FXML
    private ComboBox<Veiculo> comboVeiculo;
    
    private ObservableList<Veiculo> listaObVeiculo;
    private List<Veiculo> lista2;
    private Dao<Veiculo> daoVeiculo;
    
    @FXML
    private DatePicker data;
    
    @FXML
    private void initialize(){
        dao = new Dao(Motorista.class);
        lista = dao.listarTodos();
        listaOb = FXCollections.observableArrayList(lista);
        comboMotorista.setItems(listaOb);
        
        daoVeiculo = new Dao(Veiculo.class);
        lista2 = daoVeiculo.listarTodos();
        listaObVeiculo = FXCollections.observableArrayList(lista2);
        comboVeiculo.setItems(listaObVeiculo);
    
        
    }
    
    @FXML
    private void retiradaVeiculo(){
        UsoVeiculo uso = new UsoVeiculo();
        uso.setMotorista(comboMotorista.getSelectionModel().getSelectedItem());
        uso.setVeiculo(comboVeiculo.getSelectionModel().getSelectedItem());
        uso.setRetirada(data.getValue());
        Dao<UsoVeiculo> dao = new Dao(UsoVeiculo.class);
        dao.inserir(uso);
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Cadastro Realizado");
        alert.show();
    }
    
    
    @FXML
    private void voltarAoMenu() throws IOException{
        App.setRoot("menu");
    }
    
}
