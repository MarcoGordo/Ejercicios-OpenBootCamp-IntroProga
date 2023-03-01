public class Main {
    public static void main(String[] args) {

        float numeroIf = -0.45f;

        if (numeroIf != 0) {
            if (numeroIf > 0) {
                System.out.println("positivo");
            }
            if (numeroIf < 0) {
                System.out.println("negativo");
            }
        }else {
            System.out.println("cero");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println("ejecucion número");
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do{
            System.out.println("ejecucion  de doWhile");
            numeroWhile++;
        }while (numeroWhile == 3);

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        var estacion = "OpenBoot-camp";

        switch (estacion){
            case "invierno":
                System.out.println("invierno");
                break;
            case "primavera":
                System.out.println("primavera");
                break;
            case "verano":
                System.out.println("verano");
                break;
            case "otoño":
                System.out.println("otoño");
                break;
            default:
                System.out.println("no es una estacion");
        }
    }
}