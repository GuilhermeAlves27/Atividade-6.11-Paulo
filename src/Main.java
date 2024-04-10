import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];

        for (int i = 0; i < 5; i++) {
            Funcionario funcionario = new Funcionario();
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do funcionario " + (i + 1) + ":");
            funcionario.setNome(nome);

            do {
                String departamento = JOptionPane.showInputDialog(null, "Digite o número do departamento (1 = Administrativo / 2 = Produção) de " + nome + ":");
                funcionario.setDepartamento(Integer.parseInt(departamento));
                if (funcionario.getDepartamento() != 1 && funcionario.getDepartamento() != 2) {
                    JOptionPane.showMessageDialog(null, "Erro! Escolha entre 1 ou 2!");
                }
            } while (funcionario.getDepartamento() != 1 && funcionario.getDepartamento() != 2);

            String horasTrabalhadasMes = JOptionPane.showInputDialog(null, "Digite o número de horas trabalhadas de " + nome + " no mês:");
            funcionario.setHorasTrabalhadasNoMes(Integer.parseInt(horasTrabalhadasMes));

            funcionario.calcularSalarioBase();
            funcionario.calcularHoraExtra();
            funcionario.calcularInsalubridade();
            funcionario.calcularBonificacao();
            funcionario.calcularSalarioBruto();
            funcionario.calcularINSS();
            funcionario.calcularImpostoDeRenda();
            funcionario.calcularPlanoDeSaude();
            funcionario.calcularSalarioLiquido();

            funcionarios[i] = funcionario;
        }

        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, "Folha de Pagamento\n\n" +
                    "Nome: " + funcionarios[i].getNome() + "\n" +
                    "Departamento: " + funcionarios[i].getDepartamento() + "\n" +
                    "Horas Trabalhadas: " + funcionarios[i].getHorasTrabalhadasNoMes() + "\n" +
                    "Salário Base: " + funcionarios[i].getSalarioBase() + "\n" +
                    "Hora Extra: " + funcionarios[i].getHoraExtra() + "\n" +
                    "Insalubridade: " + funcionarios[i].getInsalubridade() + "\n" +
                    "Bonificação: " + funcionarios[i].getBonificacao() + "\n" +
                    "Salário Bruto: " + funcionarios[i].getSalarioBruto() + "\n" +
                    "INSS: " + funcionarios[i].getINSS() + "\n" +
                    "Imposto de Renda: " + funcionarios[i].getImpostoDeRenda() + "\n" +
                    "Plano de Saúde: " + funcionarios[i].getPlanoDeSaude() + "\n" +
                    "Salário Líquido: " + funcionarios[i].getSalarioLiquido() + "\n");
        }
    }
}