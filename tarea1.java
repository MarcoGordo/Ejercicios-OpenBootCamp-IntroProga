public class Main {
    public static void main(String[] args) {

        int resultado = suma(1 ,2 ,3);
        System.out.println(resultado);

        Coche MiCoche = new Coche();
        MiCoche.AddDoor();
        System.out.println(MiCoche.numberOfDoors);
    }

    public static int suma(int a , int b , int c){
        return a+b+c;
    }
}
class Coche{
    public int numberOfDoors = 2;
    public  void AddDoor(){
        this.numberOfDoors++;

    }
}