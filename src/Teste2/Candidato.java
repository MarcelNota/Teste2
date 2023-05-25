package Teste2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Candidato {
    private String nome;
    private String partido;
    private String descricao;

    public Candidato(String nome, String partido, String descricao) {
        this.nome = nome;
        this.partido = partido;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getPartido() {
        return partido;
    }

    public String getDescricao() {
        return descricao;
    }

    public static List<Candidato> carregarCandidatos(String arquivo) throws IOException {
        List<Candidato> candidatos = new ArrayList<>();

        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = leitor.readLine()) != null) {
            String[] partes = linha.split(";");
            String nome = partes[0];
            String partido = partes[1];
            String descricao = partes[2];
            Candidato candidato = new Candidato(nome, partido, descricao);
            candidatos.add(candidato);
        }
        leitor.close();

        return candidatos;
    }

	public String getVotos() {
		// TODO Auto-generated method stub
		return null;
	}
}










	
	

