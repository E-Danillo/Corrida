public class Moto extends Veiculo implements VeiculoAcao {

     // Métodos Obrigatórios da interface VeiculoAcao
    public void andar() {
        System.out.println(getMarca() + " " + getModelo() + " PARTIU!");
    }

    public void parar() {
        System.out.println(getMarca() + " " + getModelo() + " Parou. . .");
    }

    // Métodos obrigatórios da classe abstrata Veiculo 
    @Override
    public void ligar() {
    System.out.println("RRRROOOOOAARRRR! A moto " + getMarca() + " " + getModelo() + " está ligada!");
    }
}