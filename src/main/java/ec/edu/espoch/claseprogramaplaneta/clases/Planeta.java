
package ec.edu.espoch.claseprogramaplaneta.clases;

import ec.edu.espoch.claseprogramaplaneta.enumeracion.TipoPlaneta;


public class Planeta {
   
    
    // atributos
    
    public String name;
    
    public int cantidadSatelital;
    public float masakilo3;
    public float volumen;
    public float diametrokilometros;
    public float distanciakmsol;
//declaracion de enumeracion
    public TipoPlaneta tipoPlaneta;
    public boolean exterior=false;
 
    //constructor 
    //permite inicializar los valores

    public Planeta(String name, int cantidadSatelital, float masakilo3, float volumen, float diametrokilometros, float distanciakmsol, TipoPlaneta tipoPlaneta){
    
    this.name=name;
    this.cantidadSatelital=cantidadSatelital;
    this.masakilo3=masakilo3;
    this.volumen=volumen;
    this.diametrokilometros=diametrokilometros;
    this.distanciakmsol=distanciakmsol;
    this.tipoPlaneta=tipoPlaneta;
    this.exterior();
    
    }
    public Planeta(){
    
        this.exterior();
    }
    

    
    //constructor no vacio
    
    public void imprimirAtributos(){
        //System.out.println("Nombre:"+name);
        
        System.out.println("Cantidad de satelites:"+cantidadSatelital);
        System.out.println("Masa en kilogramo:"+masakilo3);
        System.out.println("Volumen en kilometros cubicos:"+volumen);
        System.out.println("Kilometros:"+diametrokilometros);
        System.out.println("Distancia a millones del sol:"+distanciakmsol);
        System.out.println("tipos de planeta:"+tipoPlaneta);
    }
    
    public float calcularPlaneta(){
    return masakilo3/volumen;
    }
    
    public boolean exterior(){
    
        double maximo=3.4;
        double distancia=149597870;
        double limite=maximo*distancia;
        
        
        if (distanciakmsol>limite){
        
            exterior = true;
        }
        
        return exterior;
    }
}
