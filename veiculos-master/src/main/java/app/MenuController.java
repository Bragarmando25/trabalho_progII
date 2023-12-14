package app;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;


public class MenuController {
    
    @FXML
    private void cadastrarMotorista() throws IOException {
        App.setRoot("novoMotorista");
    }
    
    @FXML
    private void cadastrarOperador() throws IOException{
        App.setRoot("novoOperador");
    }
    
    @FXML 
    private void editarOperador() throws IOException{
        App.setRoot("editarOperador");
    }
    
    @FXML 
    private void editarMotorista()throws IOException{
        App.setRoot("editarMotorista");
    }
    @FXML 
    private void cadastrarVeiculo() throws IOException{
        App.setRoot("CadastrarVeiculo");
    }
    
    @FXML
    private void excluirMotorista() throws IOException{
        App.setRoot("excluirMotorista");
    }
    
    @FXML
    private void retiradaVeiculo() throws IOException{
        App.setRoot("retiradaVeiculo");
    }
    
    @FXML 
    private void listarMotorista() throws IOException{
        App.setRoot("ListarMotorista");
    }
    
    @FXML
    private void listarOperadores() throws IOException{
        App.setRoot("ListarOperadores");
    }
    
    @FXML 
    private void excluirOperador() throws IOException{
        App.setRoot("excluirOperadores");
    }
    
    @FXML
    private void sair(){
        Platform.exit();
        System.exit(0);
    }
    
}
