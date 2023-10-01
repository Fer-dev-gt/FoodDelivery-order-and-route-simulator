package clases;
import java.io.Serializable;

public class Pedido implements Serializable{
  private int numeroDeOrden;
  private String vehiculo;
  private double distancia;
  private double monto;
  private String fechaHoraCreacion; 
  private String fechaHoraEntrega; 

  public Pedido(String vehiculo, double distancia, double monto) {
    this.vehiculo = vehiculo;
    this.distancia = distancia;
    this.monto = monto;
  }

  public Pedido(String vehiculo, double distancia, double monto, String fechaHoraCreacion, String fechaHoraEntrega) {
    this.vehiculo = vehiculo;
    this.distancia = distancia;
    this.monto = monto;
    this.fechaHoraCreacion = fechaHoraCreacion;
    this.fechaHoraEntrega = fechaHoraEntrega;
  }
  
  public String getVehiculo() {
    return vehiculo;
  }

  public void setVehiculo(String vehiculo) {
    this.vehiculo = vehiculo;
  }

  public double getDistancia() {
    return distancia;
  }

  public void setDistancia(double distancia) {
    this.distancia = distancia;
  }

  public double getMonto() {
    return monto;
  }

  public int getNumeroDeOrden() {
    return numeroDeOrden;
  }

  public void setNumeroDeOrden(int numeroDeOrden) {
    this.numeroDeOrden = numeroDeOrden;
  }

  public void setMonto(double monto) {
    this.monto = monto;
  }

  public String getFechaHoraCreacion() {
    return fechaHoraCreacion;
  }

  public void setFechaHoraCreacion(String fechaHoraCreacion) {
    this.fechaHoraCreacion = fechaHoraCreacion;
  }

  public String getFechaHoraEntrega() {
    return fechaHoraEntrega;
  }

  public void setFechaHoraEntrega(String fechaHoraEntrega) {
    this.fechaHoraEntrega = fechaHoraEntrega;
  }
  
}
