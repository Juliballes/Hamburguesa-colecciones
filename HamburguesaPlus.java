public class HamburguesaPlus extends Hamburguesa{
    private Medallon medallon1;
    private Medallon medallon2;
    private Medallon medallon3;
    private Ingrediente ingrediente1;
    private Ingrediente ingrediente2;
    private Ingrediente ingrediente3;




    public void ponerMedallon1(Medallon medallon1) {
        this.medallon1 = medallon1;
    }

    public void ponerMedallon2(Medallon medallon2) {
        this.medallon2 = medallon2;
    }

    public void ponerMedallon3(Medallon medallon3) {
        this.medallon3 = medallon3;
    }

    public void ponerIngrediente1(Ingrediente ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }

    public void ponerIngrediente2(Ingrediente ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }

    public void ponerIngrediente3(Ingrediente ingrediente3) {
        this.ingrediente3 = ingrediente3;
    }
    public int calcularPrecio() {
        return medallon1.getPrecio() + medallon2.getPrecio() + medallon3.getPrecio() + ingrediente1.getPrecio() + ingrediente2.getPrecio() + ingrediente3.getPrecio();
    }
}

