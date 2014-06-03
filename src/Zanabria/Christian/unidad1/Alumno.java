/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Zanabria.Christian.unidad1;

/**
 *
 * @author T107
 */
public class Alumno {
    private String nombreMateria;
    private float examenParcial;
    private float practicas;
    private float examenFinal;
    private float asistencia;
    private String nombreAlumno;
    
    
    /**
     * Este es un metodo de tipo set
     * @param examenParcial Tienes que poner dentro del parentesis el valor que va a tomar el atributo Examen parcial
     */
       public void setExamenParcial(float examenParcial){
        this.examenParcial=examenParcial;
           if (examenParcial>10); 
           System.out.println("la calificacion no puede ser mas de 10");
             examenParcial=10;  
        end if
            else (examenParcial<0);
           System.out.println("la calificacion no puede ser menos de 0");
             examenParcial=0;
     end if
    }
    public float getExamenParcial(){
        return examenParcial;
    }        
}
