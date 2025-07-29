/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rodriguez20250728;

/**
 *
 * @author UFG
 */
public class Main {

    public static String nombres = "Carlos Josue";
    public static String apellidos = "Rodriguez Chavez";
    public static int anio_nacimiento = 2000;
    public static int mes_nacimiento = 12;
    public static float estatura = 1.80f; //Estatura en mentros
    public static float peso = 206;//libras
    public static char genero = 'M';
    public static String estado_familiar = "Con el amor de mivida";
    public static double salario_mensual = 365.43;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double inc = 0.0d; 
        float tasa_kilogramo = 0.453592f;
        int dias_laborales = 22;
        int horas_laborales = 8;
        
        
        //convertir el peso de libras a kilogramos
        
        float peso_kilogramos =Main.peso * tasa_kilogramo;
        
        //Elevando la estatura al cuadrado
        float estatura_al_cuadrado = Main.estatura * Main.estatura;
        
        //Calcular el indice de masa corporal
        
        inc = peso_kilogramos/estatura_al_cuadrado; 
        
        //calculando el salario diario 
        double salario_diario = Main.salario_mensual/dias_laborales;
        
        //Calcular el salario hora
        double salario_hora = salario_diario/horas_laborales;
        
        //******************* Salida de datos
        System.out.println("saludos" +Main.nombres+" "+Main.apellidos);
        System.out.println("su peso en libras es:" +Main.peso+", pero en kiloramos es: "+peso_kilogramos);
        System.out.println("su indice de masa corporal es:"+inc);
        System.out.println("su salario mesual es:"+salario_mensual);
        System.out.println("su salario diario es:"+salario_diario);
        System.out.println("su salario hora es:"+salario_hora);
        
    }
    
}
