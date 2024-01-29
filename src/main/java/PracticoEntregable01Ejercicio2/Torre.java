package PracticoEntregable01Ejercicio2;

class Torre extends Personaje {
    private int nivel;

    public Torre(int salud, int nivel) {
        super(salud);
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    // Implementación del método entrenar() para Torre
    @Override
    public void entrenar() {
        // Aumenta el nivel en 1 cuando entrena
        setNivel(getNivel() + 1);
    }
}