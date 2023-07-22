package paquetePruebas;


public class Usuarios {
        public String nombre;
        String apellidos;
        String direccion;
        String telefono;
        public int edad;

        String tipoUsuario = "Sin especificar";

        /* this hacer referencia al lugar donde se esta intanciando
        al campo y se le estan asignando las variables de arriba */
        public Usuarios(String nombre, String apellidos, String direccion, String telefono, int edad){
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.direccion = direccion;
            this.telefono = telefono;
            this.edad = edad;
        }

    public Usuarios(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
        //metodo para mostrar la informacion del objeto
        public void mostrarDatos(boolean completo){
            System.out.println("nombre : " + nombre);
            System.out.println("apellidos : " + apellidos );
            System.out.println("direccion : " + direccion);
            System.out.println("telefono : " + telefono);
            System.out.println("edad : " + edad);
            System.out.println("Tipo de Usuario: "+ tipoUsuario);
        }
        public void mostrarDatos(){
            System.out.println("nombre : " + nombre);
            System.out.println("apellidos : " + apellidos );
            System.out.println("Tipo de Usuario: "+ tipoUsuario);
        }
}
class Empleado extends Usuarios {

    public Empleado(String nombre, String apellidos, String direccion, String telefono, int edad) {
        super(nombre, apellidos, direccion, telefono, edad);
        this.tipoUsuario = "Empleado/a";
    }

    public Empleado(String nombre, String apellidos) {
        super(nombre, apellidos);
        this.tipoUsuario = "Empleado/a";
    }
}




