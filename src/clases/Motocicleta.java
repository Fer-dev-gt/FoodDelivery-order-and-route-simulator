package clases;


public class Motocicleta {
  private String nombre;
  private double velocidad;
  private double distanciaRecorido;
  private boolean estaDisponible;

  public Motocicleta(String nombre, double velocidad) {
    this.nombre = nombre;
    this.velocidad = velocidad;
    this.estaDisponible = true;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public boolean isEstaDisponible() {
    return estaDisponible;
  }

  public void setEstaDisponible(boolean estaDisponible) {
    this.estaDisponible = estaDisponible;
  }

  public double getVelocidad() {
    return velocidad;
  }

  public void setVelocidad(double velocidad) {
    this.velocidad = velocidad;
  }

  public double getDistanciaRecorido() {
    return distanciaRecorido;
  }

  public void setDistanciaRecorido(double distanciaRecoriido) {
    this.distanciaRecorido = distanciaRecoriido;
  }
  
  
}
