class Funcionario {
    private String nome;
    private int departamento;
    private int horasTrabalhadasNoMes;
    private float salarioBase;
    private float horaExtra;
    private float horaAdicionais;
    private float insalubridade;
    private float INSS;
    private float bonificacao;
    private float salarioBruto;
    private float impostoDeRenda;
    private float salarioLiquido;
    private final int planoDeSaude = 20;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public int getDepartamento() {
        return departamento;
    }

    public int getHorasTrabalhadasNoMes() {
        return horasTrabalhadasNoMes;
    }

    public void setHorasTrabalhadasNoMes(int horasTrabalhadasNoMes) {
        this.horasTrabalhadasNoMes = horasTrabalhadasNoMes;
    }
    public float getHoraExtra() {

        return horaExtra;
    }
    public float getSalarioBase() {
        return salarioBase;

    }
    public float getInsalubridade() {

        return insalubridade;
    }
    public float getBonificacao() {

        return bonificacao;
    }
    public float getSalarioBruto() {

        return salarioBruto;
    }

    public float getINSS() {

        return INSS;
    }

    public float getImpostoDeRenda() {

        return impostoDeRenda;
    }
    public float getSalarioLiquido() {

        return salarioLiquido;
    }
    public int getPlanoDeSaude() {

        return planoDeSaude;
    }

    public void calcularSalarioBase() {
        if (departamento == 1) {
            salarioBase = horasTrabalhadasNoMes * 22;
        } else {
            salarioBase = horasTrabalhadasNoMes * 12;
        }
    }

    public void calcularHoraExtra() {
        if (horasTrabalhadasNoMes > 40) {
            horaAdicionais = horasTrabalhadasNoMes - 40;
            if (departamento == 1) {
                horaExtra = 22 * 2 * horaAdicionais;
            } else if (departamento == 2) {
                horaExtra = 12 * 2 * horaAdicionais;
            }
        }
    }

    public void calcularInsalubridade() {
        if (departamento == 2) {
            insalubridade = salarioBase + (salarioBase * 0.15f);
        }
    }

    public void calcularBonificacao() {
        if (departamento == 1) {
            if (horasTrabalhadasNoMes >= 40)
                bonificacao = salarioBase * 0.10f;
            else if (horasTrabalhadasNoMes >= 30)
                bonificacao = salarioBase * 0.05f;
            else if (horasTrabalhadasNoMes >= 20)
                bonificacao = salarioBase * 0.03f;
        }
    }

    public void calcularSalarioBruto() {
        salarioBruto = salarioBase + horaExtra + insalubridade + bonificacao;
    }

    public void calcularINSS() {
        INSS = salarioBruto * 0.07f;
    }

    public void calcularImpostoDeRenda() {
        impostoDeRenda = salarioBruto * 0.12f;
    }

    public void calcularSalarioLiquido() {
        salarioLiquido = salarioBruto - INSS - impostoDeRenda - planoDeSaude;
    }

    public int calcularPlanoDeSaude() {
        return planoDeSaude;
    }
}