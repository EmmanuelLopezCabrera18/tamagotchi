public class TamaGotchi {
    private String nombre;
    private int hambre = 0;
    private int energia = 100;

    public void asignarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void jugar() {
        this.energia -= 20;
        this.hambre += 10;
        System.out.println("¡" + this.nombre + " está jugando y saltando!");
    }

    public void alimentar() {
        this.energia += 40;
        this.hambre -= 20;
        System.out.println("¡" + this.nombre + " está comiendo su alimento favorito!");
    }

    public void mostrarEstado() {
        System.out.println("=== ESTADO DE TU TAMAGOTCHI ===");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Energia: " + this.energia);
        System.out.println("Hambre: " + this.hambre);
        System.out.println("--------------------------------");
    }

}
