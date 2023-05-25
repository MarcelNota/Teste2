package Teste2;

import java.io.BufferedWriter;
import java.io.FileWriter;

import java.io.IOException;
import java.util.List;

public class Mozambique {
   
		
	public static void main(String[] args) {
        try {
            List<Candidato> candidatos = Candidato.carregarCandidatos("candidatos.txt");
            List<Municipio> municipios = Municipio.carregarMunicipios("municipios.txt");

            
            for (Candidato candidato : candidatos) {
                System.out.println("Nome: " + candidato.getNome());
                System.out.println("Partido: " + candidato.getPartido()+"");
                System.out.println("Descrição: " + candidato.getDescricao()+"");
                System.out.println();
            }

            for (Municipio municipio : municipios) {
                System.out.println("Descrição: " + municipio.getDescricao());
                System.out.println("Província: " + municipio.getProvincia());
                System.out.println("Quantidade de recenseados: " + municipio.getQuantidadeRecenseados()+"");
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar os dados dos arquivos.");
        }
    }
	
	public int calcularCandidatosNaoVotaram() {
	    int count = 0;
	    Candidato[] candidatos = null;
		for (Candidato candidato : candidatos) {
	        if (candidato.getVotos().isEmpty()) {
	            count++;
	        }
	    }
	    return count;
	}

	public Candidato encontrarCandidatoComMaisVotos() {
	    Candidato candidatoComMaisVotos = null;
	    int maxVotos = 0;
	    
	    Candidato[] candidatos;
		for (Candidato candidato : candidatos) {
	        int numVotos = candidato.getVotos().lenght();
	        if (numVotos > maxVotos) {
	            maxVotos = numVotos;
	            candidatoComMaisVotos = candidato;
	        }
	    }
		
	    return candidatoComMaisVotos;
	}

	public void calcularPercentagemVotos() {
	    int totalVotos = 0;

	    Candidato[] candidatos;
	    for (Candidato candidato : candidatos) {
	        totalVotos += candidato.getVotos().size();
	    }

	
	    for (Candidato candidato : candidatos) {
	        int numVotos = candidato.getVotos().size();
	        double percentagem = (double) numVotos / totalVotos * 100;
	        System.out.println("Candidato: " + candidato.getNome());
	        System.out.println("Porcentagem de votos: " + percentagem + "%");
	        System.out.println();
	    }
	}


}