package PracticoEntregable01Ejercicio2;

abstract class Personaje {
    private int salud;

    public Personaje(int salud) {
        this.salud = salud;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    // Método abstracto entrenar()
    public abstract void entrenar();
}
