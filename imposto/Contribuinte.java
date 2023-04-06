package imposto;

public class Contribuinte {
    private String nome, cpf, endereco;
    private double salario, irpf;

    public double calcularSalarioLiquido(){
        return salario - irpf;
    }
    
    
    //construção dos constructor
    public Contribuinte (String n, String e, String c, double s){
        nome = n;
        salario = s;
        irpf = 0;
    }

    
    //Setada e Getada
    public void Setnome(String n){
        nome = n;
    }

    public String getNome(){
        return nome;
    }

        public String getCpf(){
            return cpf;
        }

        public String getEndereco(){
            return endereco;
        }

    public void setSalario(double s){
        s = salario;
    }

    public double getSalario(){
        return salario;
    }

    public double getIrpf(){
        return irpf;
    }

    
    // Calcular imposto
    public void calcularIrpf(){
        if (salario <= 1903.98){
            irpf = 0;
        } else {
            if (salario > 4664.68) {
                irpf = salario * 0.275;
            } else {
                if (salario >= 3751.06 & salario <= 4664.68){
                    irpf = salario * 0.225;
                } else {
                    if (salario >= 2826.66 & salario <= 3751.05){
                        irpf = salario * 0.15;
                    } else {
                        if (salario >= 1903.99 & salario <= 2826.65){
                            irpf = salario * 0.075;
                        }
                    }
                }
            }
        }
    }
}
