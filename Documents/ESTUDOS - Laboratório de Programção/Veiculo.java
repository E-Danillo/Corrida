// Classe abstrata representando um veículo genérico. Ao herdar desta classe, as subclasses vão precisar implementar os métodos definidos aqui

public abstract class Veiculo {
    private String modelo;
    private String marca;
    private int potencia;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public void compararMotor(Veiculo outro) {
    if (this.getPotencia() > outro.getPotencia()) {
        System.out.println(this.getMarca() + " " + this.getModelo() + " MASSACROU a/o " + outro.getMarca() + " " + outro.getModelo() + "!");
    } else if (this.getPotencia() < outro.getPotencia()) {
        System.out.println(outro.getMarca() + " " + outro.getModelo() + " GANHOU da/do " + this.getMarca() + " " + this.getModelo() + "!");
    } else {
        System.out.println(this.getMarca() + " " + this.getModelo() + " CHEGOU AO MESMO TEMPO da/do " + outro.getMarca() + " " + outro.getModelo() + "!");
    }
}

    // abstract: Método obrigatório
    public abstract void ligar();
}
