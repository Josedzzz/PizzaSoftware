import java.util.List;


public abstract class Pizza {
     protected String nombre;
     protected String masa;
     protected String salsa;
     protected List<String> ingredientes;

     abstract public void preparar();
     abstract public void cocinar();
     abstract public void cortar();
     abstract public void empaquetar();
}

