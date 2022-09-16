package paisesapp;

import paisEntidades.Paises;
import serviPais.ServiPais;

public class PaisesAPP {

    public static void main(String[] args) {
       
     ServiPais sp = new ServiPais();
     //sp.crearLista();
     sp.crearListaPredeterminada();
     
     sp.printList();
     sp.eliminarPaisIt();
     sp.printList();
     sp.convertirAtreeSet();
     
     
        
        
        
        
    }
    
}
