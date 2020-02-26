
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shancks
 */
public class Libro2 {
    public String titulo;
    String autor;
    public int codigo;
    public int numEjemplares;
    public int numEjemplaresPrestados=0;
    //constructor sin parametros
    public Libro2(){}
    //constructor con parametros
    public Libro2(String titulo,String autor,int codigo,int numEjemplares,int numEjemplaresPrestados){
    this.titulo=titulo;
    this.autor=autor;
    this.codigo=codigo;
    this.numEjemplares=numEjemplares;
    this.numEjemplaresPrestados=numEjemplaresPrestados;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }
    //metodo prestar
    public boolean prestar(){
        if(numEjemplares==numEjemplaresPrestados){
            return false;            
        }
        else{            
             numEjemplaresPrestados--;
            return true;
            //se reduce el numero de ejemplares prestados
        }
    }
    //metodo devolver
    public boolean devolver(){    
        if (numEjemplares<numEjemplaresPrestados) {            
             numEjemplaresPrestados++;
             return true;
        }
        else {
            return false;
        }        
        
    }
    class pruebaLibro{
        
    }
    public static void main(String[] args) {
        //      (String titulo,String autor,int codigo,int numEjemplares,int numEjemplaresPrestados)
        Libro2 Libro1= new Libro2("Don Quijote de la Manch","Miguel de Cervantes",1,10,5);        
        Libro2 Libro2= new Libro2();        
        Scanner reader=new Scanner(System.in);
        //Libro2.setTitulo("El caballero de la armadura oxidada");manualmente 
        System.out.println("Ingrese un titulo");        /**
         * String Titulo =reader.nextLine();mas paso por paso de la linea de abajo
         *  Libro2.setTitulo(Titulo);*/
        Libro2.setTitulo(reader.nextLine());
        System.out.println("Ingrese un autor"); 
        //Libro2.setAutor("Robert Fisher");
        Libro2.setAutor(reader.nextLine());        
        System.out.println("Ingrese un codigo");        
        Libro2.setCodigo(reader.nextInt()); 
        System.out.println("Ingrese el numero de ejemplares que tiene"); 
        //Libro2.setAutor("Robert Fisher");
        Libro2.setNumEjemplares(reader.nextInt());        
        System.out.println("Ingrese el numero de ejemplares que ha prestado");        
        Libro2.setNumEjemplaresPrestados(reader.nextInt()); 
        
        //muestra los atributos de los libros con metodos getters
        System.out.println("el libro es "+Libro2.getTitulo()+" escrito por "+Libro2.getAutor()+" codigo "+Libro2.getCodigo());
        System.out.println("el libro es "+Libro1.getTitulo()+" escrito por "+Libro1.getAutor()+" codigo "+Libro1.getCodigo());
        //haz prueba de prestamos y devolucion de libros
        //prueba de prestado
        Libro1.prestar();
        if(Libro1.prestar())
            System.out.println("prestamo exitoso");
        else{
            System.out.println("libro ya prestado");
        }
        Libro2.devolver();        
        if(Libro2.devolver())
            System.out.println("devuelto exitosamente ,quedan "+Libro2.numEjemplares+" y prestados"+Libro2.numEjemplaresPrestados);
        else{
            System.out.println("no se ha prestado este libro");
        }
    }
}