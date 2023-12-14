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
import modelo.Operador;
import util.Dao;

public class ListarOperadores {
     @FXML
    private TextField campoNome;
    
    @FXML
    private TextField campoEndereco;
    
    @FXML
    private TextField campoLogin;
    
    @FXML
    private TextField campoSenha;

    @FXML
    private ListView<Operador> view;
    private ObservableList<Operador> listaOb;
    private List<Operador> lista;
    private Dao<Operador> dao;
    
    @FXML
    private void initialize(){
        dao = new Dao(Operador.class);
        lista = dao.listarTodos();
        listaOb = FXCollections.observableArrayList(lista);
        view.setItems(listaOb);
    }
    
    @FXML
    private void voltarAoMenu() throws IOException{
        App.setRoot("menu");
    }
}
