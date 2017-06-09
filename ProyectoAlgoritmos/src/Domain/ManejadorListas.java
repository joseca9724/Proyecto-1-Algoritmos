/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Josec
 */
public class ManejadorListas {
    
    private Lista[] arregloListas;

    public ManejadorListas() {
        this.arregloListas=new Lista[6];
        for(int i=1;i<=arregloListas.length;i++){
            arregloListas[i-1]=new Lista((1000*i)+"");
        }
    }

    public Lista[] getArregloListas() {
        return arregloListas;
    }

    public void setArregloListas(Lista[] arregloListas) {
        this.arregloListas = arregloListas;
    }

}
