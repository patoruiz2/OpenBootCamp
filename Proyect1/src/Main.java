public class Main {
    public static void main(String[] args) {
        int result = suma(10, 20, 30);
        System.out.println(result);
        Coche miCoche = new Coche();
        miCoche.sumarPuertas();
        System.out.println(miCoche.puertas);
    }
    public static int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
class Coche {
    public int puertas = 4;

    public void sumarPuertas(){
        this.puertas++;
    }
}