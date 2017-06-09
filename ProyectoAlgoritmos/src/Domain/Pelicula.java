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
public class Pelicula {
    
    private int codigo;
    private String nombre;
    private String genero;
    private int total;
    private String subtitulos;
    private String premier;

    public Pelicula(String codigo,String nombre, String genero, String total, String subtitulos, String premier) {
        this.codigo=Integer.parseInt(codigo);
        this.nombre = nombre;
        if(genero.equals("1000"))
            this.genero = "Drama";
        else if(genero.equals("2000"))
            this.genero = "Comedia";
        else if(genero.equals("3000"))
            this.genero = "Infantil";
        else if(genero.equals("4000"))
            this.genero = "Accion";
        else if(genero.equals("5000"))
            this.genero = "Romance";
        else
            this.genero = "Ficcion";
        
        
        this.total = Integer.parseInt(total);
        
        if("0".equals(subtitulos)){
            this.subtitulos = "No";
        }
        else{
            this.subtitulos= "Si";
        }

        if("0".equals(premier)){
            this.premier = "No";
        }
        else{
            this.premier= "Si";
        }
    }

    public Pelicula() {
        this.codigo=0;
        this.nombre = "";
        this.genero = "";
        this.total = 0;
        this.subtitulos = "";
        this.premier = "";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(String subtitulos) {
        this.subtitulos = subtitulos;
    }

    public String getPremier() {
        return premier;
    }

    public void setPremier(String premier) {
        this.premier = premier;
    }

    @Override
    public String toString() {
        return "Pelicula: " + "Codigo: " + codigo + ", Nombre: " + nombre + ", Genero: " + genero + ", Total: " + total + ", Subtitulos: " + subtitulos + ", Premier: " + premier;
    }

    
    
    
    


    
    
    
}
