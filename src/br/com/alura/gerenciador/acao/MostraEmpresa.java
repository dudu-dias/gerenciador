package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class MostraEmpresa {
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("mostrando dados da empresa");
		String ParamId = request.getParameter("id");
		System.out.println("Mostrando variável 1" );
		System.out.println(ParamId);
		Integer id = Integer.valueOf(ParamId);
		System.out.println("Mostrando variável 2" );
		System.out.println(id);		
		Banco banco = new Banco();
		
		Empresa empresa = banco.buscaEmpresaPeloId(id);
		
		request.setAttribute("empresa", empresa);
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraEmpresa.jsp");
		rd.forward(request, response);
		
	}
}