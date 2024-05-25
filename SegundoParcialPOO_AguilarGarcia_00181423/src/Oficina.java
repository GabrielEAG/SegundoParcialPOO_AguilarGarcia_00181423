import java.util.ArrayList;
import java.util.Iterator;

public class Oficina implements Component{
    private String nombre;
    private final ArrayList<Component> contents;

    public Oficina(String nombre){
        this.nombre = nombre;
        contents = new ArrayList<Component>();
    }

    public void addComponent(Component com){
        if(!searchComponent(com.getNombre())){
            contents.add(com);
        }
    }

    public void deleteComponent(String nombre){
        if(searchComponent(nombre)){
            contents.remove(getComponent(nombre));
        }
    }

    public boolean searchComponent(String nombre){
        Iterator<Component> iter = contents.iterator();
        boolean comprobation = false;
        while(iter.hasNext()){
            if(iter.next().getNombre().equals(nombre)){
                comprobation = true;
                break;
            }
        }
        return comprobation;
    }

    private Component getComponent(String nombre){
        Iterator<Component> iter = contents.iterator();
        Component ans = null;
        while(iter.hasNext()){
            ans = iter.next();
            if(ans.getNombre().equals(nombre)){
                break;
            }
        }
        return ans;
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

        return null;
    }
}
