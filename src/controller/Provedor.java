package controller;

public class Provedor {
    int ci;
    String Name;
    String Marca;
    public int getCi() {
        return ci;
    }
    public String getName() {
        return Name;
    }
    public String getMarca() {
        return Marca;
    }
    public Provedor(int ci, String name, String marca) {
        this.ci = ci;
        Name = name;
        Marca = marca;
    }
    @Override
    public String toString() {
        return getCi() + "" + getName();
    }
    
}
