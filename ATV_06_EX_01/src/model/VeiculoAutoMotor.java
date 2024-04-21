package model;

public abstract class VeiculoAutoMotor {

        private String placa;
        private String marca;
        private String modelo;
        private String cor;
        private float velocidadeMax;
        private int qtdRodas;
        Motor motor;

        public VeiculoAutoMotor() {
            super();
        }

        public String getPlaca() {
            return this.placa;
        }
        public final void setPlaca(String placa) {
            this.placa = placa;
        }

        public String getMarca() {
            return this.marca;
        }
        public final void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }
        public final void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getCor() {
            return cor;
        }
        public final void setCor(String cor) {
            this.cor = cor;
        }

        public float getVelocidadeMax() {
            return velocidadeMax;
        }
        public final void setVelocidadeMax(float velocidadeMax) {
            this.velocidadeMax = velocidadeMax;
        }

        public int getQtdRodas() {
            return qtdRodas;
        }
        public final void setQtdRodas(int qtdRodas) {
            this.qtdRodas = qtdRodas;
        }

        public Motor getMotor() {
            return motor;
        }
        public final void setMotor(Motor motor) {
            this.motor = motor;
        }



        @Override
        public String toString() {
            return "Veiculo AutoMotor [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", velocidade máxima atingida ="
                    + velocidadeMax + "km/h , quantidade de eixos =" + qtdRodas + ", motor=" + motor + "]";
        }

        public abstract float calcVel(float velocMax);
}
