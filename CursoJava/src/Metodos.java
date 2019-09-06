import java.util.Scanner;

public class Metodos {
    // Atributos d euna clase
    //no  siempre son nescesarios
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;

    public static void Variables () {
        String holamundo = "Hola Mundo";
        String nombre = "Karla";
        String apellido = "Esparza";

        var bye = "despedirse";
        var usuario = "Juan";
        System.out.printf("Calse 10 \n");
        System.out.println(holamundo);

        System.out.println(bye);
        System.out.printf("Clase 11 \n");

        System.out.println("Saludos  mi nombre es " + usuario);
        System.out.println("Clase 12 \n");
        System.out.println(nombre+" "+apellido);
        System.out.println("Nueva linea \n" + nombre);
        System.out.println("tabulacion: \t"+ nombre);
        System.out.println("Retroceso: \b"+ nombre);
        System.out.println("Retorno de carro: \r"+ nombre);
        System.out.println("Comilla simple \'"+ nombre +"\'");
        System.out.println("Comilla Doble \""+ nombre + "\"" );

    }

    public static void Scanear() {

       Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor Ingrese el  nombre de usuario");
       var usuario = scanner.nextLine();
        String saludar = "saludos";

        System.out.println(saludar + " " + usuario);
    }
    public static void Enteros() {

        //byte, short, int, long
        System.out.println("bits tipo byte " + Byte.SIZE);
        System.out.println("bit tipo byte " + Byte.BYTES);
        System.out.println("Valor minimo  tipo byte " + Byte.MIN_VALUE);
        System.out.println("Valor maximo  tipo byte " + Byte.MAX_VALUE);
        System.out.println("Short tipo short" + Short.SIZE);
        System.out.println("short tipo shorts " + Short.BYTES);
        System.out.println("Valor minimo  tipo Short " + Short.MIN_VALUE);
        System.out.println("Valor maximo  tipo Short " + Short.MAX_VALUE);
        System.out.println("Integer tipo Integer" + Integer.SIZE);
        System.out.println("Integer tipo Integers " + Integer.BYTES);
        System.out.println("Valor minimo  tipo Integer " + Integer.MIN_VALUE);
        System.out.println("Valor maximo  tipo Integer " + Integer.MAX_VALUE);
        System.out.println("Long tipo Long" + Long.SIZE);
        System.out.println("Long tipo Longs " + Long.BYTES);
        System.out.println("Valor minimo  tipo Long " + Long.MIN_VALUE);
        System.out.println("Valor maximo  tipo Long " + Long.MAX_VALUE);
        byte byteVar = 15;
        System.out.println("byteVar = " + byteVar);
        short shortVar = 100;
        System.out.println("shortVar = " + shortVar);
        int intVar = 500;
        System.out.println("intVar = " + intVar);
        long longVar = 1000;
        System.out.println("longVar = " + longVar);


    }
    public static void Decimales() {

        byte b0=10;
        System.out.println("b0 = " + b0);
        byte b1=0xa;
        System.out.println("b1 = " + b1);

        byte b2=012;

        System.out.println("b2 = " + b2);
                

    }
    public static void Flotantes() {

        System.out.println("bits tipo float " + Float.SIZE);
        System.out.println("bytes tipo float " + Float.BYTES);
        System.out.println("Valor minimo  tipo float " + Float.MIN_VALUE);
        System.out.println("Valor maximo  tipo float " + Float.MAX_VALUE);
        System.out.println("bits tipo Double" + Double.SIZE);
        System.out.println("bytes tipo Double " + Double.BYTES);
        System.out.println("Valor minimo  tipo Double " + Double.MIN_VALUE);
        System.out.println("Valor maximo  tipo Double " + Double.MAX_VALUE);

        float floatVar =0.5F;
        double doubleVar =0.10;

    }
    public static void Caracteres() {



        System.out.println("bits tipo Character " + Character.SIZE);
        System.out.println("bytes tipo Character " + Character.BYTES);
        System.out.println("Valor minimo  tipo Character " + Character.MIN_VALUE);
        System.out.println("Valor maximo  tipo Character " + Character.MAX_VALUE);
        char a='@';


    }
    public static void Boolean() {


        System.out.println("Valor minimo  tipo Boolean " + Boolean.TRUE);
        System.out.println("Valor maximo  tipo Boolean " + Boolean.FALSE);
        boolean bolleanVar = false;
        if (bolleanVar) {

            System.out.println("la variabkle tiene un valor verdadero");
        } else {
            System.out.println("la variabkle tiene un valor falso");

        }
    }
        public static void Operadores() {
        
            int a=3, b=2;
            int c = a+b;

            System.out.println("c = " + c);
            System.out.println("Resultado: "+(a+b));
            int d= a-b;

            System.out.println("d = " + d);
            System.out.println("resultado resta : " +(a-b));

            int e = a*b;
            System.out.println("e = " + e);

            int f =a/b;

            System.out.println("f = " + f);
                    
    }

    public static void OperadoresArit() {
        int a=3,b=2;
        int c= a;
        a +=1;
        System.out.println("a = " + a);
        a+=3;
        System.out.println("a = " + a);
        b-=1;
        System.out.println("b"+ b);

        a = -a;
        System.out.println("a = " + a);

        boolean e=true;
        e = !e;
        System.out.println("e = " + e);

        int f =3;
        int g = f++;

        System.out.println("f = " + f);
        System.out.println("g = " + g);

        int i=3;
        int j = ++i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);


    }
    public static void operadoresIgualdad(){



            int a=3, b= 2;
            boolean c= a==b;
            System.out.println("c = " + c);
            //Simbolo diferente !=
            int d=3, e= 2;
            boolean f= d!=e;
            System.out.println("f = " + f);
            //igualar String

            String h="hi",i="hi";
            boolean g = h.equals(i);
            System.out.println("g = " + g);


    }
    public static void condiciones (){

        int a = 3;
        int valorMinimo = 0, valorMaximo = 10;

       if( a>=valorMinimo && a<= valorMaximo) {

           System.out.println("Dentro del rango");
       }else{
           System.out.println("Fuera del rango");
        }

       boolean vacaciones=false;
       boolean diaDescanso = true;

       if (vacaciones || diaDescanso){

           System.out.println("puede asistir");
       }else{

           System.out.println("esta ocupado");

       }


    }
    public static void operadorTernario(){

        int numero =10;
        var resultado = (numero % 2==0) ? "Es numero par" : "Es numero impar";
        System.out.println("resultado = " + resultado);

            var par =(numero % 2 ==0) ? true :false ;
            if (par){
                System.out.println("el numero es par");
            }else{
                System.out.println("el numero es impar");
            }
    }



    public static void precedencia(){

        int x =5;
        int y =10;
        var z =++x + y--;//x =6 , y =10
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);


    }

    public static void setenciaIf(){

        var numero =1;

        if(numero == 1){

            System.out.println("Numero  uno");
        }else if(numero==2){
            System.out.println("Numero dos");
        }else if(numero ==3){
            System.out.println("numero tres");
        }else {
            System.out.println("numero desconocido");
        }


    }
    public static void setenciaSwitch(){

        var numero =1;
        switch (numero){
            case 1:
                System.out.println("Numero  uno");
                break;
            case 2:
                System.out.println("Numero  dos");
               break;
            case 3:
                System.out.println("Numero  tres");
                break;
            default:
                System.out.println("numero desconocido");
                break;
        }
    }

    public static void cicloWhileyDo(){

        var i = 0;

        // Ciclo While
        while (i<200){
            System.out.println("i = " + i);
            i++;
        }
        // Ciclo DO
        do {

            System.out.println("i = " + i);
            i++;
        }while (i<500);



    }
    public static void cicloFor(){
            // ciclo for
        for (int i=0; i<= 200;i++){
            System.out.println("i = " + i);
        }

    }
    public static void breakyContinue(){


        for (var i=0;i<3;i++){

            if(i%2==0){
                System.out.println("i = " + i);
                break;
            }
        }
        for (var i=0;i<3;i++){

            if(i%2!=0){

                continue;
            }
            System.out.println("i = " + i);
        }
    }


    public void desplegarNombre(){


        System.out.println("nombre = " + nombre);
        System.out.println("apellidoPaterno = " + apellidoPaterno);
        System.out.println("apellidoMaterno = " + apellidoMaterno);


    }

}
