/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Clase principal
 * @author alumno
 */
public class MPOOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File archivo=new File("archivo.txt");
        System.out.println(archivo.exists());
        try {
            boolean seCreo=archivo.createNewFile();
            System.out.println("Se creò = "+seCreo);
            System.out.println(archivo.exists());
        } catch (IOException ex) {
            Logger.getLogger(MPOOP12.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("######################File Writer########################");
        try {        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escriba el texto para el archivo");
            String texto=br.readLine();
            
            FileWriter fw=new FileWriter("fw.csv");
            BufferedWriter bw= new BufferedWriter(fw);
            PrintWriter salida=new PrintWriter(bw);
            salida.println(texto);
            for (int i = 0; i < 10; i++) {
                salida.println("Linea del for "+i);
                
            }
            salida.close();
            
        } catch (IOException ex) {
            Logger.getLogger(MPOOP12.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println("######################File Reader########################");
            FileReader fr= new FileReader("fw.txt");
                    
            BufferedReader br=new BufferedReader(fr);
            System.out.println("El texto del archivo es");
            String linea=br. readLine();
            while(linea!=null){
                System.out.println(linea);
                linea=br.readLine();
            }
            br.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(MPOOP12.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MPOOP12.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("############StringTokenizer");
        Platillo platillo=new Platillo();
        float temp=0;
        String textoTemporal;
        String linea="Enchiladas,50.44,Pollo/crema/queso";
        StringTokenizer tokenizador=new StringTokenizer(linea,",");
        while(tokenizador.hasMoreTokens()){
            textoTemporal=tokenizador.nextToken();
            if(temp==0)
                platillo.setNombre(textoTemporal);
            else if(temp ==1)
                platillo.setPrecio(Double.parseDouble(textoTemporal));
            else if(temp==2)
                platillo.setIngredientes(textoTemporal);
            System.out.println(textoTemporal);
            temp++;
        }
        System.out.println(platillo);
        System.out.println("######Actividad extra######");
        System.out.println("Creando arreglo de platillos");
        Platillo[] platillos=new Platillo[10];
        platillos[0]= new Platillo("Taco de pastor","Tortilla/carne de pastor/cilantro/cebolla",10);
        platillos[1]= new Platillo("Pozole","Maíz/maciza/lechuga/orégano",93);
        platillos[2]= new Platillo("Taco de longaniza","Tortilla/longaniza/cilantro/cebolla",9);
        platillos[3]= new Platillo("Taco de bistec","Tortilla/bistec/cilantro/cebolla",12);
        platillos[4]= new Platillo("Omelette","Huevos/sal/pimienta/aceite vegetal",75);
        platillos[5]= new Platillo("Tostada de tinga","Tostada/tinga/lechuga/crema/queso",22);
        platillos[6]= new Platillo("Tostada de pata","Tostada/pata/lechuga/crema/queso",25);
        platillos[7]= new Platillo("Pambazo","Pan/chile guajillo/papas/longaniza/lechuga/crema/queso",22);
        platillos[8]= new Platillo("Taco de barbacoa","Chile guajillo/chile de árbol/orégano/comino/cebolla/carne de cordero",20);
        platillos[9]= new Platillo("Tlayuda","Frijoles/lechuga/jitomate/nopales/queso",30);
        System.out.println(Arrays.toString(platillos));
        
        
        System.out.println("Escribiendo en archivo de texto");
        PrintWriter listaPlatillos=null;
        String text="Taco de pastor,Tortilla/carne de pastor/cilantro/cebolla,10.0\n"
                + "Pozole,Maíz/maciza/lechuga/orégano,93.0\n"
                + "Taco de longaniza,Tortilla/longaniza/cilantro/cebolla,9.0\n"
                + "Taco de bistec,Tortilla/bistec/cilantro/cebolla,12.0\n"
                + "Omelette,Huevos/sal/pimienta/aceite vegetal,75.0\n"
                + "Tostada de tinga,Tostada/tinga/lechuga/crema/queso,22.0\n"
                + "Tostada de pata,Tostada/pata/lechuga/crema/queso,25.0\n"
                + "Pambazo,Pan/chile guajillo/papas/longaniza/lechuga/crema/queso,22.0\n"
                + "Taco de barbacoa,Chile guajillo/chile de árbol/orégano/comino/cebolla/carne de cordero,20.0\n"
                + "Tlayuda,Frijoles/lechuga/jitomate/nopales/queso,30.0";
        try {        
            listaPlatillos=new PrintWriter("listaPlatillos.csv");
            Objects.requireNonNull(listaPlatillos).println(text);
            listaPlatillos.close();
        } catch (IOException ex) {
            Logger.getLogger(MPOOP12.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Leyendo el artchivo de texto");
        Platillo []lista =new Platillo[10];
        try {
            FileReader fr= new FileReader("listaPlatillos.csv");
            BufferedReader br=new BufferedReader(fr);
            System.out.println("El texto del archivo es");
            String linea2=br. readLine();
            int tmp=0;
            while(linea2!=null){
                System.out.println("La siguiente linea a tokenizar es: "+linea2);
                lista[tmp]=new Platillo();
                float temp1=0;
                String textoTemporalL;
                StringTokenizer tokenizador1=new StringTokenizer(linea2,",");
                while(tokenizador1.hasMoreTokens()){
                    textoTemporalL=tokenizador1.nextToken();
                    if(temp1==0){
                        lista[tmp].setNombre(textoTemporalL);
                    }
                    else if(temp1 ==2){
                        lista[tmp].setPrecio(Double.parseDouble(textoTemporalL));
                    }
                    else if(temp1==1)
                        lista[tmp].setIngredientes(textoTemporalL);
                    System.out.println(textoTemporalL);    
                    temp1++;    
                }
                tmp++;
                linea2=br.readLine();
            }
            br.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MPOOP12.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MPOOP12.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(Arrays.toString(lista));
        
        System.out.println("######Ingreso de alumnos######");
        Alumno[] alumnoIngresar=new Alumno[10];
        Alumno[] alumnoLeido=new Alumno[10];
        alumnoIngresar=inicial();
        agregar(alumnoIngresar, "Datos");
         alumnoLeido=leer("Datos");
         for(int i=0;i<10;i++){
             System.out.println(alumnoLeido[i]);
         }
    }
     /**
      * Metodo que mete 10 datos tipo alumno a un arreglo
      * @return arreglo tipo alumno de 10 objetos
      */
     public static Alumno[] inicial(){
         Alumno[] alum=new Alumno[10];
         for(int i=0;i<10;i++){
             alum[i]=new Alumno(i+"nombre",i+"apPaterno",i+"apMaterno", i+120212,i+15);
         }
        return alum;
        }
     /**
      * Metodo que agrega datos a un .csv
      * @param alumnos arreglo de 10 objetos tipo alumno
      * @param texto nombre del archivo en el que se guarda
      */
     public static void agregar(Alumno[] alumnos, String texto){
        try {
             FileWriter fw = new FileWriter(texto+".csv");//Crea un archivo con nombre
             BufferedWriter bw= new BufferedWriter(fw);//Inicializa el buffer
             PrintWriter salida = new PrintWriter(bw);//Inicializa la comunicacion con el buffer
             for (int i = 0; i < 10; i++) {
                 salida.println(alumnos[i].getApMaterno()+","+alumnos[i].getApPaterno()+","+alumnos[i].getNombre()+","+alumnos[i].getNumCuenta()+","+alumnos[i].getEdad());//imprime lo que tu quieras
             }
             salida.close();//cierra el archivo
         } catch (IOException ex) {
             Logger.getLogger(MPOOP12.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     /**
      * Clase que lee un archivo y lo incerta en un arreglo de 10 de tipo alumno
      * @param texto nombre del archivo
      * @return un arreglo de 10 objetos tipo Alumno
      */
     public static Alumno[] leer(String texto){
         Alumno[] alumnosBD=new Alumno[10];
         double doubleValue;
         try {
             FileReader fr = new FileReader(texto+".csv");
             BufferedReader br=new BufferedReader(fr);
             String linea = br.readLine();
             int i=0,j=0;
             while(linea!=null){
                 StringTokenizer token=new StringTokenizer(linea,",");
                 alumnosBD[i]=new Alumno();
                     alumnosBD[i].setApMaterno(token.nextToken());
                     alumnosBD[i].setApPaterno(token.nextToken());
                     alumnosBD[i].setNombre(token.nextToken());
                     doubleValue = Double.parseDouble(token.nextToken());
                     alumnosBD[i].setNumCuenta(doubleValue);
                     doubleValue = Double.parseDouble(token.nextToken());
                     alumnosBD[i].setEdad(doubleValue);
                 i++;
                 linea=br.readLine();
             }
             br.close();//Cierra el buffer
         } catch (FileNotFoundException ex) {
             Logger.getLogger(MPOOP12.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(MPOOP12.class.getName()).log(Level.SEVERE, null, ex);
         }
         return alumnosBD;
    }
}