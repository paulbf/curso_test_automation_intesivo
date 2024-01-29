package PracticoEntregable01Ejercicio2;

class Espadachin extends Personaje {
    private int ataque;

    public Espadachin(int salud, int ataque) {
        super(salud);
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    // Implementación del método entrenar() para Espadachín
    @Override
    public void entrenar() {
        // Incrementa el ataque en 10 cuando entrena
        setAtaque(getAtaque() + 10);
    }
}
