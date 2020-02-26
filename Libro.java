
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
public class Libro {
   private String Titulo;
   private String autor;
   private int codigo;
   private boolean prestado=true;
    /**
     * constructores
     * constructor por defecto*/
    public  Libro(){    
        
    }
    //constructor con argumentos
    public Libro(String Titulo,String autor,int codigo){
        this.Titulo=Titulo;
        this.autor=autor;
        this.codigo=codigo;
    }
    //metodos getter y setters

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
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

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    //Metodo prestar
    //devuelve true en caso de prestamo exitoso
    //devuelve false en caso de prestamo no exitoso(ya prestado)
     public boolean prestar() {
        if (prestado) {
            
        }
        else {
            prestado = false;
        }
        return prestado;
    }

    //metodo devolver
     //devuelve true en caso de poder devolverse (por estar prestado=true)
     //devuelve false en caso de no poder devolverse(por no estar prestado=false)
     public boolean devolver(){ 
         //
        if (!prestado) {
            prestado=true;
        }
        else {
            prestado = false;
        }
        return prestado;
    }
     //Incorpor una clase llamada Prueba libro en la que se instancien 2 libros usando los 2 posibles constructores
     //para el libro instanciado por constructor por defecto incorpora sus atributos leyendolos del teclado usando metodos setter
    public class PruebaLibro{        
    }
    
    public static void main(String[] args) {          
        Libro Libro1= new Libro("Don Quijote de la Manch","Miguel de Cervantes",1);
        
        Libro Libro2= new Libro();        
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
        
        //muestra los atributos de los libros con metodos getters
        System.out.println("el libro es "+Libro2.getTitulo()+" escrito por "+Libro2.getAutor()+" codigo "+Libro2.getCodigo());
        System.out.println("el libro es "+Libro1.getTitulo()+" escrito por "+Libro1.getAutor()+" codigo "+Libro1.getCodigo());
        //haz prueba de prestamos y devolucion de libros
        //prueba de prestado
        Libro1.prestar();
        if(Libro1.prestado)
            System.out.println("prestamo exitoso");
        else{
            System.out.println("libro ya prestado");
        }
        Libro2.devolver();        
        if(Libro2.prestado)
            System.out.println("devuelto exitosamente");
        else{
            System.out.println("no se ha prestado este libro");
        }
    }
}
