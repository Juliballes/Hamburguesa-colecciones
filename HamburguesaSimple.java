//extends, esta clase esta heredando los atributos y metodos de la clase hamburguesa
//Clase abstracta obliga a usar sus metodos
//La herencia implica polimorfismo, pero no al reves. Pueden haber 2 clases polimorficas pero no tiene que ver una con la otra, solo entienden los mismos mensajes.

public class HamburguesaSimple extends Hamburguesa{
    private Medallon medallon;
    private Ingrediente ingrediente;


    public void ponerMedallon(Medallon medallon) {
        this.medallon = medallon;
    }

    public void ponerIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }
    //Cada hamburguesa va a tener distinta forma de calcular el precio
    //Dos clases/objetos son polimorficos pq entienden los mismos mensajes. O sea, si hay 2 clases que heredan de lo mismo, van a ser polimorficas
    public int calcularPrecio(){
        //Aca esta devolviendo el precio base de esta hamburguesa (1000)+ el precio del medallon (ej vegetariano 1500) + el precio del ingrediente que le haya puesto (ej lechuga 300 y tomate 350)
        return this.precioBase + this.medallon.getPrecio() + ingrediente.getPrecio();

    }
}

