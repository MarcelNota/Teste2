package TESTE;

public class Voto {
	private int codigo;
	private String candidato,municipio, voto, data;
	
	public Voto(int codigo, String cadidato,String municipio, String voto, String data) {
		this.codigo = codigo;
		this.candidato=cadidato;
		this.municipio = municipio;
		this.voto=voto;
		this.data = data;
	}

	public Voto(String municipio, String branco, String valido, String data) {
		this.codigo= this.setCodigo();
		this.candidato=candidato;
		this.municipio = municipio;
		this.voto=voto;
		this.data = data;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public int setCodigo() {
		
		return this.codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}


	public String getCandidato() {
		return candidato;
	}

	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}

	public String getVoto() {
		return voto;
	}

	public void setVoto(String voto) {
		this.voto = voto;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String toString1() {
		return codigo+";"+candidato+";"+municipio+";"+voto+";"+data;
	}
	
	public String toString2() {
		return candidato+";"+municipio+";"+voto+";"+data;
	}
	
	
	
	
}
