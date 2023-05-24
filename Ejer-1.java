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
   //Anidado();
   //Escalonador();
   //FormatoRest1();
   //CadenaChart();
   //ContRegresivo();
  }
  private static void ContRegresivo(){
    int numero=0;
    int contador=15;

    while (contador>numero){
      System.out.println("El numero es: "+contador);
      contador--;
    }
  }



  private static void CadenaChart(){
   
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce su nombre: "); 
    String name=teclado.nextLine();
    System.out.println("Su nombre es: "+name);
    System.out.println("Su nombre tiene: "+name.length()+" letras"); 
    //System.out.println("La segunda es:"+name.CharAt(1)); PAGINA 65
  }

private static void FormatoRest1(){
  int num;
  Scanner teclado = new Scanner(System.in);
  System.out.print("Introduce un numero\n");
  num=teclado.nextInt();
 System.out.printf("Ese numero en Hexa es: %x \n En String es: %s \n En Octal es: %o ",num,num,num);

}


  private static void Anidado(){
     int scanner, num1, num2, resultado;
     num1=8;
     num2=2;

     Scanner teclado = new Scanner(System.in);
     System.out.print("Introduce 1 para sumar\n");
     System.out.print("Introduce 2 para restar\n");
     System.out.print("Introduce 3 para multiplicar\n");
     System.out.print("Introduce 4 para dividir\n");
     scanner=teclado.nextInt();

     if (scanner==1){
      resultado= num1+num2;
      System.out.print("El resultado de la suma es: "+resultado);
     }else if(scanner==2){
      resultado= num1-num2;
      System.out.print("El resultado de la resta es: "+resultado);
     }else if(scanner==3){
      resultado= num1*num2;
      System.out.print("El resultado de la multiplicacion es: "+resultado);
     }else if(scanner==4){
      resultado= num1/num2;
      System.out.print("El resultado de la division es: "+resultado);
     }

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