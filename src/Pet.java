public class Pet {

        private String nome;
        private int fome;
        private int energia;

        public Pet(String nome) {
            this.nome = nome;
            fome = 50;
            energia = 50;
        }

        public String getNome() {
            return nome;
        }

        public int getFome() {
            return fome;
        }

        public int getEnergia() {
            return energia;
        }

        public String getHumor() {
            if (fome > 70 && energia < 30) {
                return "Triste";
            } else if (fome > 70) {
                return "Com fome";
            } else if (energia < 30) {
                return "Cansado";
            } else if (fome < 30 && energia > 70) {
                return "Feliz";
            } else {
                return "Normal";
            }
        }

        public void alimentar(int quantidade) {
            fome -= quantidade;

            if (fome < 0) {
                fome = 0;
            }
        }

        public void brincar(int quantidade) {
            if (energia >= quantidade) {
                energia -= quantidade;
                fome += quantidade;

                if (fome > 100) {
                    fome = 100;
                }
            } else {
                System.out.println("O pet está sem energia.");
            }
        }

        public void dormir(int quantidade) {
            energia += quantidade;

            if (energia > 100) {
                energia = 100;
            }
        }
        }
