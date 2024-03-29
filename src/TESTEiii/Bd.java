package TESTE;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import classesDeObjecto.Candidato;
import classesDeObjecto.Municipio;

public class Bd {
	
	public static ArrayList<Candidato> lerCandidato(){
		ArrayList<Candidato> listacandidato= new ArrayList<>();
		try {
			FileReader file= new FileReader("candidatos.txt");
			BufferedReader read= new BufferedReader(file);
			
			String []elem;
			String linha=read.readLine();
			while(linha!=null) {
				elem= linha.split(";");
				int  codigo= Integer.parseInt(elem[0]);
				String nome=elem[1];
				String bi=elem[2];
				String historico=elem[3];
				String municipio= elem[4];
				int qtdVotos= Integer.parseInt(elem[5]);
				
				listacandidato.add(new Candidato(codigo, nome, bi, historico,municipio, qtdVotos));
				linha= read.readLine();
			}
		} catch (FileNotFoundException e) {
			
		}catch (IndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Erro na Indexacao");
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO");
		}
		
		return listacandidato;
	}
	
	public static ArrayList<Municipio> lerMunicipios(){
		ArrayList<Municipio> listaMunicipios= new ArrayList<>();
		try {
			FileReader file= new FileReader("municipios.txt");
			BufferedReader read= new BufferedReader(file);
			
			String []elem;
			String linha=read.readLine();
			while(linha!=null) {
				elem= linha.split(";");
				int  codigo= Integer.parseInt(elem[0]);
				String nome=elem[1];
				String descrica=elem[2];
				String provincia=elem[3];
				int qtdR= Integer.parseInt(elem[4]);
				int qtdV= Integer.parseInt(elem[5]);
				
				listaMunicipios.add(new Municipio(codigo, nome, descrica, provincia, qtdR, qtdV));
				linha= read.readLine();
			}
		} catch (FileNotFoundException e) {

		}catch (IndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Erro na Indexacao");
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "ERRO");
		}
		
		return listaMunicipios;
	}
	
	public static String[] listarCandidatos() {
		ArrayList<Candidato> listaCandidatos= Bd.lerCandidato();
		String [] lista= new String[listaCandidatos.size()];
		for(int i=0;i<lista.length;i++) {
			lista[i]=listaCandidatos.get(i).toString3();
		}	
		return lista;
	}
	
	public static String[] listarCandidatosFiltro(String municipio) {
		ArrayList<Candidato> listaCandidatos= Bd.lerCandidato();
		String [] lista= new String[listaCandidatos.size()];
		for(int i=0;i<lista.length;i++) {
			if(municipio.equals(listaCandidatos.get(i).getMunicipio())) {
				lista[i]=listaCandidatos.get(i).toString3();
			}
		}	
		return lista;
	}
	
	public static String[] listarMunicipio() {
		ArrayList<Municipio> listaMunicipios= Bd.lerMunicipios();
		String [] lista= new String[listaMunicipios.size()];
		for(int i=0;i<lista.length;i++) {
			lista[i]=listaMunicipios.get(i).toString2();
		}	
		return lista;
	}
}
