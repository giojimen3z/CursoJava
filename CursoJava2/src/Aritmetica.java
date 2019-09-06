public class Aritmetica {

    //atibutos de la clase
    int a;
    int b;
    //COnstructor Vacio

    Aritmetica(){


    }

    //Constructor con 2 argumentos
    Aritmetica(int a, int b){

         this.a = a;
         this.b =b;
    }

    // Este metodo sumar toma los atributos de la clase

         int sumar(){

        return a+b;

        }
        //metodo restar
        int restar (){

         return a-b;
        }

        // metodo multiplicar
        int multiplicar(){

            return a*b;

        }
        // metodo apra dividir
    int dividir(){

        return a/b;
    }
    /*

     Primer ejemplo de sumar,  se ajusta apra amnejar constructores


    public  int sumar(int a, int b){

        int resultado = a+b;

        return resultado;
    }

     */

}
