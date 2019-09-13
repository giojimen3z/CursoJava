package ejemploenumeraciones;

public class EjemploEnumeraciones {

    public static void main(String[] args) {

        //valores de la numeracion
        System.out.println("valor1:" + Dias.LUNES);
        //Hacemos un test del dia  utilizado

        indicarDia(Dias.VIERNES);

        // se utiliza la enumeracion de paises
        System.out.println("Continente #4:" + Continentes.AMERICA);
        System.out.println("Paises en America" + Continentes.AMERICA.getPaises());
        // se realiza el test de numero de paises por continente

        System.out.println("");

        // Se hace el test de numero de paises por continente

        indicarPaises(Continentes.AFRICA);
        indicarPaises(Continentes.AMERICA);

        //imprimimos los continentes
        System.out.println("  ");
        imprimirPaises();

    }

    public static void indicarDia(Dias dias){

        switch(dias){

            case LUNES:
                System.out.println("Primer Dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo Dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer Dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto Dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto Dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto Dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Ultimo Dia de la semana");
                break;

        }



    }

    public static void indicarPaises(Continentes continente){

        switch (continente){

            case AFRICA:

                System.out.println("Catidad de paises en " + continente +":" + continente.getPaises() );
                break;
            case EUROPA:
                System.out.println("Catidad de paises en " + continente +":" + continente.getPaises() );
                break;
            case ASIA:
                System.out.println("Catidad de paises en " + continente +":" + continente.getPaises() );
                break;
            case AMERICA:
                System.out.println("Catidad de paises en " + continente +":" + continente.getPaises() );
                break;
            case OCEANIA:
                System.out.println("Catidad de paises en " + continente +":" + continente.getPaises() );
                break;
        }

    }

    public static void imprimirPaises(){

        for (Continentes c : Continentes.values()) {
            System.out.println("Continente: " + c + " contiene "+ c.getPaises() + "Paises");
        }
    }
}
