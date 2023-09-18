
package com.mycompany.seguimiento;

import java.util.ArrayList;
import java.util.List;

public class ListaClientes {
    
    List<Cliente> clienteList;

    public ListaClientes(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }
    
    public ListaClientes(){
        this.clienteList=new ArrayList<>();
    }
    
    public void addClienteToList(Cliente c){
        this.clienteList.add(c);
    }
    
    public void showList(){
    for (Cliente c: this.clienteList){
       c.showInfo();
    }
}
    
}
