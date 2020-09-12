package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    
	private static List<Empresa> Lista = new ArrayList<>(); 
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		Lista.add(empresa);
		Lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		Banco.Lista.add(empresa);
		System.out.println("Cadastrei nova empresa");
	}
    
	public List<Empresa> getEmpresas(){
		return Banco.Lista;
	}
}
