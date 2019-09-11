public class EjemploMatrices {
    public static void main(String[] args) {

        //1. Declarar la matriz int
        int [] [] edades;
        //2. se instancia la  matriz

        edades = new int [3][2];
        //3. se instancia la matriz con los valores

        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;
        //4. impresion

        System.out.println("Matriz Enteros indice 0 0: "+edades[0][0] );
        System.out.println("Matriz Enteros indice 0 1: "+edades[0][1] );
        System.out.println("Matriz Enteros indice 1 0: "+edades[1][0] );
        System.out.println("Matriz Enteros indice 1 1: "+edades[1][1] );
        System.out.println("Matriz Enteros indice 2 0: "+edades[2][0] );
        System.out.println("Matriz Enteros indice 2 1: "+edades[2][1] );



    }
}
