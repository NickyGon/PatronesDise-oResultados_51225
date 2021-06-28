package ejercicios3parcial.warcraft.solucionC;

enum Armas {

        HACHA("Hacha Stormbreaker"),ESCOPETA("Escopeta Skull Piercer"),ESPADA("Espada Excalibur Última");

        private String name;

        Armas(String s) {
            this.name=s;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
}
