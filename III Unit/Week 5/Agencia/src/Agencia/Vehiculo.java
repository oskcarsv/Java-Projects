package Agencia;

public class Vehiculo {
    String marca;
    String linea;
    int modelo;

    public Vehiculo(String marca, String linea, int modelo) {
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
  
}
