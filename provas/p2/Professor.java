import java.util.Date;

public class Professor extends Pessoa  implements Senioridade{
    String NumeroFuncional;
    Date DataContrato;

    public boolean ehSenior(Senioridade obj) {
        Professor compara = (Professor) obj;
        if (this.DataContrato.compareTo(compara.DataContrato) < 0) {
            return true;
        } else {
            return false;
        }
    }

    public Professor(String NumeroFuncional, String Nome, String CPF, Date dataContrato) {
        super(CPF, Nome);
        this.DataContrato = dataContrato;
        this.NumeroFuncional = NumeroFuncional;
    }

    public String getNumeroFuncional() {
        return NumeroFuncional;
    }

    public Date getDataContrato() {
        return DataContrato;
    }

    public void setNumeroFuncional(String numeroFuncional) {
        NumeroFuncional = numeroFuncional;
    }

    public void setDataContrato(Date dataContrato) {
        DataContrato = dataContrato;
    }

    @Override 
    public void gerarCertificado(){
     System.out.println("Certifico que o" + getNome() + "é orientador de estudantes");   
    }
}
