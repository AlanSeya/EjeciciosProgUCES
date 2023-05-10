import java.util.*;

class Main {

    public static void main(String[] args) {


   /*int edad;
   Scanner teclado = new Scanner(System.in);
   System.out.println("Introduce tu edad: ");
   edad=teclado.nextInt();

   if(edad<=18){
    System.out.println("Eres menor de 18 años");
   }else{
    System.out.println("Eres mayor de 18 años");
   }*/
   //promptUser();
   //compra();
   //Promedio();
   //Salario();
    Anidado();

     }
     private static void Anidado(){
        int operacion, num1, num2, resultado;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer entero: ");
        num1=teclado.nextInt();
        
        System.out.print("Introduce el segundo entero: ");
        num2=teclado.nextInt();
        
        System.out.print("Introduce el tercer entero: ");
        num3=teclado.nextInt();

     }








     private static void Salario(){
        int horasTrabajadas, horasExtras, salarioSemanal;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce las horas que trabajaste: ");
        horasTrabajadas=teclado.nextInt();

        if(horasTrabajadas>40){
            horasExtras = horasTrabajadas-40;
            salarioSemanal= horasExtras*20+ 40*16;

            System.out.println("El salario con horas extras es de: "+salarioSemanal);
        }else {
            salarioSemanal= horasTrabajadas*16;
            System.out.println("Su sueldo es de: "+ salarioSemanal);
        }


     }







     private static void Promedio(){
        double num1,num2,num3,prom;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el primer entero: ");
        num1=teclado.nextInt();
        
        System.out.print("Introduce el segundo entero: ");
        num2=teclado.nextInt();
        
        System.out.print("Introduce el tercer entero: ");
        num3=teclado.nextInt();

        prom=(num1+num2+num3)/3;
        
        if(prom >=4){
            System.out.println("El alumno aprobo: "+prom);
        }else{
            System.out.println("El alumno reprono: "+prom);}
        }
     




     private static void compra(){
        double compra, descuento, total =0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor total de su compra: ");
        compra=teclado.nextInt();

        descuento= compra*0.5;
        total= compra;

        if(compra>300){
            total= compra - descuento;
            System.out.println("El descuento es de: "+descuento);
            System.out.println("El total a pagar es: "+total);
        }else {
            System.out.println("Sin descuento, el total es: "+total);
        }

     }







     private static void promptUser(){
        String name;

       Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        name=teclado.nextLine();



        if (name ==null || name.trim().isEmpty()){
            System.out.println("No entro su numbre");
        }else{
            System.out.println("Entro su nombre: "+ name);
        }
     }



     }
