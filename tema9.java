# ejerccio-tema-9
public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.setEdad(27);
        cliente.setNombre("Robert Lewa");
        cliente.setTelefono(555734);
        cliente.isCredito();
        trabajador.setSalario(1800);
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.isCredito());
        System.out.println(trabajador.getSalario());
    }

}

class Persona{
    private int edad;
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    private String nombre;
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    private int telefono;
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return telefono;
    }
}
class Cliente extends Persona{
        private boolean credito;

    public boolean isCredito() {
        return credito;
    }
}
final class Trabajador extends Persona{
    private int salario;

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}
