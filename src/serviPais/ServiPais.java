/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen
repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
guardará el país en el conjunto y después se le preguntará al usuario si quiere
guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
guardados en el conjunto.
Después deberemos mostrar el conjunto ordenado alfabéticamente para esto
recordar como se ordena un conjunto.
Y por ultimo, al usuario se le pedirá un país y se recorrerá el conjunto con un
Iterator, se buscará el país en el conjunto y si está en el conjunto se eliminará el
país que ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra
en el conjunto se le informará al usuario.


*/
package serviPais;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import paisEntidades.Paises;

/**
 *
 * @author PC-Gabriel
 */
public class ServiPais {
    
   public Scanner leer;
   public Set <String> listado;

    public ServiPais() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.listado = new HashSet();
    }
    public Paises crearListaPredeterminada(){
        listado.add("Argentina");
        listado.add("Perú");
        listado.add("Chile");
        listado.add("Cuba");
        listado.add("Congo");
        return new Paises();
    }
    public Paises crearLista(){
        String aux = "";
        String carga = "";
        do{
            System.out.println("Ingrese un nuevo país para incorporar al listado");
            aux=leer.next();
            listado.add(aux);
             
            System.out.println("Si desea ingresar un nuevo país presione <<s>> o <<n>> si desea terminar");
            carga = leer.next();
            if (carga.equals("N")||carga.equals("n")){
                break;
            }
            
        }while (!carga.equals("n")||!carga.equals("N"));
        
        return new Paises(aux);     
    }
    
    
    public void printList(){
        System.out.println("El listado de paises cargados es:");
        for (String pais : listado) {
            System.out.println(pais);
        }
    }
    
    public void eliminarPaisIt(){
        System.out.println("Ingrese el pais a eliminar");
        String aux = leer.next();
        Iterator<String> it = listado.iterator();
        while (it.hasNext()) {
            if (it.next().equals(aux)){
                it.remove();
            }
            
        }
        }
    
   public void convertirAtreeSet(){
       Set<String> nuevoListado = new TreeSet<>(listado);
       System.out.println("El listado de paises cargados es:");
        for (String pais : nuevoListado) {
            System.out.println(pais);
   }
            
   }
}
                
    
    
  
    

