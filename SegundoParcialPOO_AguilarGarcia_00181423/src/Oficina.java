import java.util.ArrayList;
import java.util.Iterator;

public class Oficina implements Component{
    private String nombre;
    private ArrayList<Component> contents;

    public void Empleado(String name){
        this.nombre = name;
        contents = new ArrayList<Component>();
    }

    public void addComponent(Component com){
        if(!searchComponent(com.getNombre())){
            contents.add(com);
        }
    }

    public void deleteComponent(String name){
        if(searchComponent(name)){
            contents.remove(getComponent(name));
        }
    }

    public boolean searchComponent(String name){
        Iterator<Component> iter = contents.iterator();
        boolean comprobation = false;
        while(iter.hasNext()){
            if(iter.next().getNombre().equals(name)){
                comprobation = true;
                break;
            }
        }
        return comprobation;
    }

    private Component getComponent(String name){
        Iterator<Component> iter = contents.iterator();
        Component ans = null;
        while(iter.hasNext()){
            ans = iter.next();
            if(ans.getNombre().equals(name)){
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
        return null;
    }

    @Override
    public void getContent() {

    }
}
