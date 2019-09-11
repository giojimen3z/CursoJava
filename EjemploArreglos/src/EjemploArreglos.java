public class EjemploArreglos {

    public static void main(String[] args) {

        //1. Declaracion arreglo tipo entero

        int [] edades;
        // 2. se intancia el arreglod e enteros
        edades = new int [3];
        //3. se inicializan los valores del arreglo enteros
        edades[0]= 25;
        edades[1]= 15;
        edades[2]=18;

        //imprimir los valores a la salida standard
        System.out.println("edades[0] = " + edades[0]);
        System.out.println("edades[1] = " + edades[1]);
        System.out.println("edades[2] = " + edades[2]);
        //1. Se declara erl arreglo
        Persona [] personas;

        //2. se intancia el arreglo de tipo object

        personas = new Persona[4];

        //3. Se inicializan los valores del arreglo

        personas[0] = new Persona("Gio");
        personas[1] = new Persona("Adri");
        //4.se imprime de manera manual

        System.out.println("personas[0] = " + personas[0]);
        System.out.println("personas[1] = " + personas[1]);
        System.out.println("personas[2] = " + personas[2]);
        System.out.println("personas[3] = " + personas[3]);

        // arreglo  notacion simplificada
        String [] nombres = {"Sara","Alejandra","Adri","Angie"};

        for (int i=0; i<nombres.length;i++){

            System.out.println("el nombre en el indice "+ i + " es: " + nombres[i]);
        }


    }
}
