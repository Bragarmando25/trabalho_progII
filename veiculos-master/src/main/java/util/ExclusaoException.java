/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

public class ExclusaoException extends Exception{
    public ExclusaoException(){
        super("Objeto não pode ser excluído");
    }
}