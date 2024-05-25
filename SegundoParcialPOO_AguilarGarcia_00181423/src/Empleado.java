public class Empleado implements Component{
    private String nombre;
    private String content;

    public Empleado(String nombre, String content) {
        this.nombre = nombre;
        this.content = content;
    }

    @Override
    public void Execute() {

    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getContent() {

        return content;
    }

    //Component


}
