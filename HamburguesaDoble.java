
    public class HamburguesaDoble extends Hamburguesa {
        private Medallon medallon1;
        private Medallon medallon2;
        private Ingrediente ingrediente1;
        private Ingrediente ingrediente2;

        public void ponerMedallon1(Medallon medallon1) {
            this.medallon1 = medallon1;
        }

        public void ponerMedallon2(Medallon medallon2) {
            this.medallon2 = medallon2;
        }

        public void ponerIngrediente1(Ingrediente ingrediente1) {
            this.ingrediente1 = ingrediente1;
        }

        public void ponerIngrediente2(Ingrediente ingrediente2) {
            this.ingrediente2 = ingrediente2;
        }

        public int calcularPrecio(){
            return this.precioBase + medallon1.getPrecio() + this.medallon2.getPrecio() + this.ingrediente1.getPrecio() + this.ingrediente2.getPrecio();
        }
    }


