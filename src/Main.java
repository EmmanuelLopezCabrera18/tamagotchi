public class Main {
    public static void main(String[] args) {
        TamaGotchi miMascota = new TamaGotchi();
        miMascota.asignarNombre("Peresonsin");

        System.out.println("¡Una nueva mascota ha nacido!");
        miMascota.mostrarEstado();

        miMascota.jugar();
        miMascota.jugar();
        miMascota.mostrarEstado();

        miMascota.alimentar();
        miMascota.mostrarEstado();
    }
}