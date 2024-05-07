import java.util.ArrayList;
import java.util.List;

public class HamburguesaAEleccion extends Hamburguesa{
    //Esto es para poder agregar la cantidad que queramos de ambas cosas

    private List<Medallon> medallones;
    private List<Ingrediente> ingredientes;
    public HamburguesaAEleccion(){
        medallones = new ArrayList<>();
        ingredientes = new ArrayList<>();
    }

    public void ponerMedallones(Medallon medallon) {
        medallones.add(medallon);
    }

    public void ponerIngredientes(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    //calculamos el precio total de la hamburguesa sumando el precio base con el precio de todos los medallones e ingredientes agregados. Utilizamos bucles for-each para iterar sobre las listas de medallones e ingredientes,
    // y sumamos los precios de cada uno al precio total.
    public int calcularPrecio() {
        int precioE=precioBase;
        for (Medallon medallon : medallones){
            precioE += medallon.getPrecio();
        }
        for (Ingrediente ingrediente : ingredientes){
            precioE += ingrediente.getPrecio();
        }
        return precioE;
    }
}
