package Teste2;


import java.util.Date;

public class Voto {
    private boolean branco;
    private boolean valido;
    private boolean invalido;
    private Date data;

    public Voto(boolean branco, boolean valido, boolean invalido, Date data) {
        this.branco = branco;
        this.valido = valido;
        this.invalido = invalido;
        this.data = data;
    }

    public boolean isBranco() {
        return branco;
    }

    public boolean isValido() {
        return valido;
    }

    public boolean isInvalido() {
        return invalido;
    }

    public Date getData() {
        return data;
    }

   
 
 
}
