package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;

public class RemoveEmpresa {
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("removendo empresa");
		
		String ParamId = request.getParameter("id");
		Integer id = Integer.valueOf(ParamId);
				
		Banco banco = new Banco();
		banco.removeEmpresa(id);
		response.sendRedirect("entrada?acao=ListaEmpresas");
	}
}