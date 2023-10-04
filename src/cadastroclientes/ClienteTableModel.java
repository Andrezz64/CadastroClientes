/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroclientes;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import CadastroClientes.Cliente;
/**
 *
 * @author Andre.infra
 */
public class ClienteTableModel extends  AbstractTableModel {
    ClientesData data = new ClientesData();
    private ArrayList<Cliente> clientes;
    private  String[] colunas = {"Nome", "Telefone", "Email", "Logradouro", "Número", "Complemento", "Bairro", "Cidade", "Estado", "CEP"};

   public ClienteTableModel(){
   this.clientes = data.GetData();
   }
    
    @Override
    public int getRowCount() {
        return clientes.size(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getColumnCount() {
        return  colunas.length;
    }
    
      @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = clientes.get(rowIndex);
        switch (columnIndex) {
            case 0: return cliente.getNome();
            case 1: return cliente.getTelefone();
            case 2: return cliente.getEmail();
            case 3: return cliente.getLogradouro();
            case 4: return cliente.getNumero();
            case 5: return cliente.getComplemento();
            case 6: return cliente.getBairro();
            case 7: return cliente.getCidade();
            case 8: return cliente.getEstado();
            case 9: return cliente.getCep();
            default: return null;
    }
   }
     
}
