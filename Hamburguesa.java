public abstract class Hamburguesa {

        //Herencia sirve para no repetir los metodos y asegurarme de que entienden el mismo mensaje
        //Protected para que puedan acceder las clases hijas
        protected int precioBase;


        public int obtenerPrecioBase() {
            return precioBase;
        }

        public void setPrecioBase(int precioBase) {
            this.precioBase = precioBase;
        }
        //Metodo abstracto, obligo que lo implementen las clases que heredan
        //No dice como calcular el precio porque es una clase abtracta, le falta el comportamiento porque cada una de las que hereda lo van a implementar como les guste. Por eso decimos que es una clase incompleta
        //Por eso no puedo hacer new hamuguesa pq no va a devolver nada pq es una clase incompleta
        public abstract int calcularPrecio();
    }


