package Teste2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Municipio {
    private String descricao;
    private String provincia;
    private int quantidadeRecenseados;

    public Municipio(String descricao, String provincia, int quantidadeRecenseados) {
        this.descricao = descricao;
        this.provincia = provincia;
        this.quantidadeRecenseados = quantidadeRecenseados;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getProvincia() {
        return provincia;
    }

    public int getQuantidadeRecenseados() {
        return quantidadeRecenseados;
    }

    public static List<Municipio> carregarMunicipios(String arquivo) throws IOException {
        List<Municipio> municipios = new ArrayList<>();

        BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = leitor.readLine()) != null) {
            String[] partes = linha.split(";");
            String descricao = partes[0];
            String provincia = partes[1];
            int quantidadeRecenseados = Integer.parseInt(partes[2]);
            Municipio municipio = new Municipio(descricao, provincia, quantidadeRecenseados);
            municipios.add(municipio);
        }
        leitor.close();

        return municipios;
    }

 

}