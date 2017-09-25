package humano;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public abstract class humanito {
    String sexo;
    int edad;
    int peso;
    double estatura;
    String piel;
    
    public abstract void IMC();
    public abstract void respirar();
    public abstract void caminar();
    public abstract void hablar();
    
    humanito(String sexo, int edad, int peso, double estatura, String piel){
    this.sexo=sexo;
    this.edad=edad;
    this.peso=peso;
    this.estatura=estatura;
    this.piel=piel;
   
    
    }
    
}
