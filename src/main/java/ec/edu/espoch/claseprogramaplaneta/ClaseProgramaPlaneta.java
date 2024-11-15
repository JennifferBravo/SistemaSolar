
package ec.edu.espoch.claseprogramaplaneta;

import ec.edu.espoch.claseprogramaplaneta.clases.Planeta;
import ec.edu.espoch.claseprogramaplaneta.enumeracion.TipoPlaneta;


public class ClaseProgramaPlaneta {

    public static void main(String[] args) {
        
        Planeta objPlaneta=new Planeta();
        
        //objPlaneta.name="Jupiter";
        //objPlaneta.cantidadSatelital=0;
        //objPlaneta.masakilo3=0;
        //objPlaneta.volumen=0;
        //objPlaneta.diametrokilometros=0;
        //objPlaneta.distanciakmsol=0;
        //objPlaneta.tipoPlaneta=TipoPlaneta.ENANO;
        
        objPlaneta.imprimirAtributos();
        
        float densidad=objPlaneta.calcularPlaneta();
        System.out.println("La densidad es:"+densidad);
    }
}
