package com.ads.ava3.aplicacao;

import java.util.Date;

import com.ads.ava3.DAO.ClienteDAO;
import com.ads.ava3.model.Cliente;

public class Principal {
	public static void main(String[] args) {

		ClienteDAO clienteDao = new ClienteDAO();

		/*
		 * Adicionar
		 */
		Cliente c1 = new Cliente();
		c1.setNome("Roseli Souza");
		c1.setCpf("000.000.000-11");
		c1.setTelefone("43 99999-8888");
		c1.setEmail("roseli@email.com");
		c1.setEndereco("Rua Tals, 1000");
		c1.setCidade("Londrina");
		c1.setEstado("PR");
		c1.setDataDoCadastro(new Date());
		
		clienteDao.save(c1);
		
		/*
		 * Listar
		 */
		for (Cliente c : clienteDao.listar()) {
			System.out.println("Cliente: " + c.getNome());
		}
		
		/*
		 * Atualizar
		 */
		Cliente c2 = new Cliente();
		c2.setNome("Marilia Pinheiro");
		c2.setCpf("000.000.000-11");
		c2.setTelefone("43 99999-8888");
		c2.setEmail("marilia@email.com");
		c2.setEndereco("Rua Tals, 1000");
		c2.setCidade("Londrina");
		c2.setEstado("PR");
		c2.setDataDoCadastro(new Date());
		c2.setId(4L);
		
		clienteDao.editar(c2);
		
		/*
		 * Deletar por ID
		 */
		
		clienteDao.deleteById(4L);
		
	}
}
