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
    private void cadastrarVeiculo() throws IOException {
        App.setRoot("CadastrarVeiculo");
    }
    @FXML
    private void excluirVeículo () throws IOException{
        App.setRoot("excluirVeiculo");
    }
    
    @FXML
    private void sair(){
        Platform.exit();
        System.exit(0);
    }
    
}
