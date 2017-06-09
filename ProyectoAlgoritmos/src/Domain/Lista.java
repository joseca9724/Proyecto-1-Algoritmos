/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import static GUI.VentanaArchivo.QUOTE;
import static GUI.VentanaArchivo.SEPARATOR;
import com.opencsv.CSVReader;
import java.io.FileReader;

/**
 *
 * @author Josec
 */
public class Lista {
    
    Nodo primero;
    Nodo ultimo;
    
    private String genero;
    private String codigoGenero;
    
    public Lista(String codigo){
        this.primero=null;
        this.ultimo=null;
        this.codigoGenero=codigo;
        if(codigo.equals("1000"))
            this.genero = "Drama";
        else if(codigo.equals("2000"))
            this.genero = "Comedia";
        else if(codigo.equals("3000"))
            this.genero = "Infantil";
        else if(codigo.equals("4000"))
            this.genero = "Accion";
        else if(codigo.equals("5000"))
            this.genero = "Romance";
        else
            this.genero = "Ficcion";
    }
    
    public void ingresarPelicula(Pelicula pelicula){
        if(this.genero.equalsIgnoreCase(pelicula.getGenero())){
        Nodo nuevo=new Nodo();
        nuevo.pelicula=pelicula;
        Nodo actual=new Nodo();
        actual=primero;
        do{
        if(primero==null){
            primero=nuevo;
            primero.siguiente=primero;
            nuevo.anterior=ultimo;
            ultimo=nuevo;
            break;
        }
        else if((pelicula.getNombre().compareToIgnoreCase(primero.pelicula.getNombre()))<0){
            primero.anterior=nuevo;
            ultimo.siguiente=nuevo;
            nuevo.anterior=ultimo;
            nuevo.siguiente=primero;
            primero=nuevo;
            break;
        }
        else if((pelicula.getNombre().compareToIgnoreCase(actual.pelicula.getNombre()))<0){
            nuevo.siguiente=actual;
            actual.anterior.siguiente=nuevo;
            nuevo.anterior=actual.anterior;
            actual.anterior=nuevo;
            break;
        }
        else if((pelicula.getNombre().compareToIgnoreCase(ultimo.pelicula.getNombre()))>0){
            ultimo.siguiente=nuevo;
            nuevo.siguiente=primero;
            nuevo.anterior=ultimo;
            ultimo=nuevo;
            primero.anterior=ultimo;
            break;
        }
        actual=actual.siguiente;
        }while(actual!= primero);
        }
            
    }
    public String buscarPelicula(String busqueda){
        Nodo actual=new Nodo();
        actual=primero;
        String lista="";
        do{
            String comparacion=actual.pelicula.getNombre().toLowerCase();
            busqueda=busqueda.toLowerCase();
            if(comparacion.indexOf(busqueda)>=0){
                lista+=actual.pelicula.toString();
                lista+="\n";
            }
            actual=actual.siguiente;
        }while(actual!=primero);
        return lista;
    }

    public String imprimir(){
        Nodo actual=new Nodo();
        actual=primero;
        String lista="";
        do{
            lista+=actual.pelicula.getNombre();
            lista+="\n";
            actual=actual.siguiente;
        }while(actual!=primero);
        return lista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCodigoGenero() {
        return codigoGenero;
    }

    public void setCodigoGenero(String codigoGenero) {
        this.codigoGenero = codigoGenero;
    }
    
    
}
