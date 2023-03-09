public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setTernombre("Juan");
        System.out.println(persona.getTernombre());
        persona.setTertelefono(552489565);
        System.out.println(persona.getTertelefono());
        persona.setEdad(34);
        System.out.println(persona.getEdad());

    }

      static class Persona{

        private int edad;
        private int telefono;
        private String nombre;

     public int getTertelefono() {
         return this.telefono;
     }
     public void setTertelefono(int telefono) {
         this.telefono = telefono;
     }
     public int getEdad() {
         return this.edad;
     }
     public void setEdad(int edad){
        this.edad = edad;
     }
     public String getTernombre() {
         return this.nombre;
     }
     public  void setTernombre(String nombre) {
         this.nombre = nombre;
     }
    }
}
