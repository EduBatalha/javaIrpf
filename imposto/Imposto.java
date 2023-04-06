package imposto;

public class Imposto {
    public static void main(String[] args) {
        Contribuinte cl;
        cl = new Contribuinte ("Jose", "111111111-11", "Rua Avenida, 1", 1903);
        cl.calcularIrpf();

        System.out.println("Nome:" + cl.getNome());
        System.out.println("Salário:" + cl.getSalario());
        System.out.println("IRPF:" + cl.getIrpf());
        System.out.println("Salário Liquido:" + cl.calcularSalarioLiquido());
    }
}
