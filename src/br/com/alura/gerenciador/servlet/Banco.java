package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

public class Banco {
    
	private static List<Empresa> Lista = new ArrayList<>(); 
	private static Integer chaveSequencial = 1;
	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
	 	empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		Lista.add(empresa);
		Lista.add(empresa2);
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.Lista.add(empresa);
		
	}
    
	public List<Empresa> getEmpresas(){
		return Banco.Lista;
	}

	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = Lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
		}
		
		
		
	}

	public Empresa buscaEmpresaPeloId(Integer id) {
		for (Empresa empresa : Lista) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
	return null;
	}
}
