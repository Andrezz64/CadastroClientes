/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroclientes;

import CadastroClientes.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class ClientesData {
    public  ArrayList<Cliente> clientes = new ArrayList<>();
    
    public void registrar(Cliente cliente){
    clientes.add(cliente);
    }
    
    public  ArrayList<Cliente>  GetData(){
        return clientes;
    }
    
    public int getRowCount() {
        return clientes.size();
    }

    
    
}
