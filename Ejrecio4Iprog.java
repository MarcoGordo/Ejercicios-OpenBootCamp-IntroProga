public class Main {
    public  static void main(String[] args) {

        Cliente cliente = new Cliente();
        System.out.println(cliente.edad = 34);
        System.out.println(cliente.telefono = 5547895);
        System.out.println(cliente.nombre = "Marquiux");
        cliente.setCredito(34000);
        System.out.println(cliente.getCredito());


        Trabajador trabajador = new Trabajador();
        System.out.println(cliente.edad = 34);
        System.out.println(cliente.telefono = 5547895);
        System.out.println(cliente.nombre = "Marquiux");
        trabajador.setSalario(34000);
        System.out.println(trabajador.getSalario());
    }

 static class Persona {

        int edad;
        int telefono;
        String nombre;
}
static class Cliente extends Persona{
        private int credito;

        public int getCredito() {
            return  this.credito;
        }

        public void setCredito(int credito) {
            this.credito = credito;
        }
}

    static class Trabajador extends Persona{
        private int salario;

        public int getSalario() {
            return  this.salario;
        }

        public void setSalario(int salario) {
            this.salario = salario;
        }
    }


}
