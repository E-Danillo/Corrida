import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Veiculo> lista = new ArrayList<>();
        Carro carro = new Carro();
        Moto moto = new Moto();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a marca do carro 1: ");
        String marca1 = scanner.nextLine();
        System.out.print("Digite o modelo do carro 1: ");
        String modelo1 = scanner.nextLine();
        System.out.print("Digite a potência do carro 1: ");
        int potencia1 = Integer.parseInt(scanner.nextLine());

        carro.setModelo(modelo1);
        carro.setMarca(marca1);
        carro.setPotencia(potencia1);

        lista.add(carro);

        System.out.print("Digite a marca da moto 1: ");
        String marca2 = scanner.nextLine();
        System.out.print("Digite o modelo da moto 1: ");
        String modelo2 = scanner.nextLine();
        System.out.print("Digite a potência da moto 1: ");
        int potencia2 = Integer.parseInt(scanner.nextLine());

        moto.setModelo(modelo2);
        moto.setMarca(marca2);
        moto.setPotencia(potencia2);

        lista.add(moto);

        scanner.close();

        System.out.println("=== Veiculos Inscritos no racha ===");
        for (Veiculo v : lista) {
            System.out.println(v.getMarca() + " " + v.getModelo());
        }
        System.out.println();

        System.out.println("=== Ligando os veiculos, se afastem! ===");
        for (Veiculo v : lista) {
            v.ligar();
        }
        System.out.println();

        for (Veiculo v : lista) {
            if (v instanceof VeiculoAcao) {
                ((VeiculoAcao) v).andar();
            }
        }
        System.out.println();

        for (Veiculo v : lista) {
            if (v instanceof VeiculoAcao) {
                ((VeiculoAcao) v).parar();
            }
        }
        System.out.println();

        carro.compararMotor(moto);
    }
}
