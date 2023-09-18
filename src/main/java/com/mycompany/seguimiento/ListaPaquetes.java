
package com.mycompany.seguimiento;

import java.util.ArrayList;
import java.util.List;

public class ListaPaquetes {
    
    private List <Paquete> paqueteList;

    public ListaPaquetes(List<Paquete> paqueteList) {
        this.paqueteList = paqueteList;
    }
    
    public void showList(){
       for (Paquete paquete : paqueteList){
           paquete.showInfo();
       }
   }
    
   public ListaPaquetes(){
       paqueteList= new ArrayList<>();
   }
   
   public void addPaqueteToList(Paquete p){
       this.paqueteList.add(p);
   }

    public List<Paquete> getPaqueteList() {
        return paqueteList;
    }

   
    
   
    
    
    
}
