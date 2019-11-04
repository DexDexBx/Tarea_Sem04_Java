import java.util.*;
import java.util.Scanner;
import mapas.coordenadas;

class Main {

  public static void mapas() {
    ArrayList<coordenadas> lista = new ArrayList<coordenadas>();

    double Lat, Lonj;
    int numeroDeLados;
    Scanner input = new Scanner(System.in);

    
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    System.out.println("Ingrese la cantidad de lados de poligono");
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    numeroDeLados = input.nextInt();
        
    for (int x = 0; x < numeroDeLados; x++) {
      System.out.println("Ingrese la latitud → N ["+ (x + 1) +"]" );
      Lat = input.nextDouble();
      System.out.println("Ingrese la longitud → N ["+ (x + 1) +"]");
      Lonj = input.nextDouble();

      coordenadas o = new coordenadas();
      o.lat = Lat;
      o.lonj = Lonj;

      lista.add(x, o);

    }
    System.out.println("Listo la URL esta lista");
    System.out.println("Ingresa este link en tu navegador");
    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
    System.out.println("");

    System.out.println("https://www.keene.edu/campus/maps/tool/?coordinates=");
    for (int x = 0; x <= numeroDeLados; x++) {
      if (x != numeroDeLados) {
        System.out.print(lista.get(x).lat);
        System.out.print("%2C%20");
        System.out.print(lista.get(x).lonj);
        System.out.print("%0A");
      } else {
        System.out.print(lista.get(0).lat);
        System.out.print("%2C%20");
        System.out.print(lista.get(0).lonj);
      }
    }
  }
  
  public static void main(String[] args) {
    int tiempo = 800;
    System.out.println("");
    System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    System.out.println("Generador de URL para Poligonos");
    System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
    System.out.println("Cargando...");
    System.out.print("█");
    try {
    Thread.sleep(tiempo);
    } catch (InterruptedException ie) {
    Thread.currentThread().interrupt();
    }
    System.out.print("█");
    try {
    Thread.sleep(tiempo);
    } catch (InterruptedException ie) {
    Thread.currentThread().interrupt();
    }
    System.out.print("█");
    try {
    Thread.sleep(tiempo);
    } catch (InterruptedException ie) {
    Thread.currentThread().interrupt();
    }
    System.out.print("█");
    try {
    Thread.sleep(tiempo);
    } catch (InterruptedException ie) {
    Thread.currentThread().interrupt();
    }
    System.out.print("█");
    try {
    Thread.sleep(tiempo);
    } catch (InterruptedException ie) {
    Thread.currentThread().interrupt();
    }
    System.out.print("█");
    try {
    Thread.sleep(tiempo);
    } catch (InterruptedException ie) {
    Thread.currentThread().interrupt();
    }
    System.out.print("█");
    try {
    Thread.sleep(tiempo);
    } catch (InterruptedException ie) {
    Thread.currentThread().interrupt();
    }
    System.out.print("█");
    try {
    Thread.sleep(tiempo);
    } catch (InterruptedException ie) {
    Thread.currentThread().interrupt();
    }
    System.out.print("█");
    try {
    Thread.sleep(tiempo);
    } catch (InterruptedException ie) {
    Thread.currentThread().interrupt();
    }
    System.out.print("█ 100%");
    try {
    Thread.sleep(tiempo);
    } catch (InterruptedException ie) {
    Thread.currentThread().interrupt();
    }
    System.out.println("");
    mapas();

  }
}