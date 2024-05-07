public class Main {
    public static void main(String[] args) {
//Crear medallones
        Medallon vegetariano = new Medallon(1500);
        Medallon pollo = new Medallon(1200);
        Medallon carne = new Medallon(2000);

        //crear ingredientes
        Ingrediente lechuga = new Ingrediente(300);
        Ingrediente tomate = new Ingrediente(350);
        Ingrediente huevo = new Ingrediente(400);


        //Crear hamburguesa 1
        HamburguesaSimple hm = new HamburguesaSimple();
        hm.setPrecioBase(1000);
        hm.ponerMedallon(vegetariano);
        hm.ponerIngrediente(lechuga);

        //Calcular precio total de hamburguesa 1
        int precio1 = hm.calcularPrecio();
        System.out.println("El precio de la hamburguesa 1 es: "+ precio1);

        //Crear hamburguesa 2
        HamburguesaDoble hm2 = new HamburguesaDoble();
        hm2.setPrecioBase(2500);
        hm2.ponerMedallon1(carne);
        hm2.ponerMedallon2(carne);
        hm2.ponerIngrediente1(lechuga);
        hm2.ponerIngrediente2(tomate);

        int precio2 = hm2.calcularPrecio();
        System.out.println("El precio de la hamburguesa 2 es: " + precio2);



        //Crear hamburguesa 3
        HamburguesaPlus hm3 = new HamburguesaPlus();
        hm3.setPrecioBase(3000);
        hm3.ponerMedallon1(carne);
        hm3.ponerMedallon2(carne);
        hm3.ponerMedallon3(pollo);
        hm3.ponerIngrediente1(lechuga);
        hm3.ponerIngrediente2(tomate);
        hm3.ponerIngrediente3(huevo);

        int precio3 = hm3.calcularPrecio();
        System.out.println("El precio de la hamburguesa 3 es: " + precio3);



        //Crear hamburguesa 4
        HamburguesaAEleccion hm4 = new HamburguesaAEleccion();
        hm4.setPrecioBase(4000);
        hm4.ponerMedallones(carne);
        hm4.ponerMedallones(carne);
        hm4.ponerMedallones(carne);
        hm4.ponerIngredientes(huevo);
        int precio4 = hm4.calcularPrecio();
        System.out.println("El precio de la hamburguesa 4 es :"+precio4);






    }









}