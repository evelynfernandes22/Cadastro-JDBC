package com.ads.ava3.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ads.ava3.factory.ConnectionFactory;
import com.ads.ava3.model.Cliente;

public class ClienteDAO {

	/*
	 * CRUD
	 */

	public void save(Cliente cliente) {

		String sql = "INSERT INTO cliente(nome, cpf, telefone, email, endereco,"
				+ " cidade, estado, data_do_cadastro) VALUES (?,?,?,?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// criando conexao com bd
			conn = ConnectionFactory.createConnectionToMySQL();

			// criando uma PreparedStatement para executar uma query
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getCpf());
			pstm.setString(3, cliente.getTelefone());
			pstm.setString(4, cliente.getEmail());
			pstm.setString(5, cliente.getEndereco());
			pstm.setString(6, cliente.getCidade());
			pstm.setString(7, cliente.getEstado());
			pstm.setDate(8, new Date(cliente.getDataDoCadastro().getTime()));

			pstm.execute();
			System.out.println("Cliente salvo com sucesso!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	public List<Cliente> listar() {

		String sql = "SELECT * FROM cliente";

		List<Cliente> clientes = new ArrayList<>();

		Connection conn = null;
		PreparedStatement pstm = null;

		// recuraperando os dados do bd
		ResultSet rset = null;

		try {

			conn = ConnectionFactory.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery(); // traz como array

			while (rset.next()) {
				Cliente cliente = new Cliente();
				cliente.setId(rset.getLong("id"));
				cliente.setNome(rset.getString("nome"));
				cliente.setCpf(rset.getString("cpf"));
				cliente.setTelefone(rset.getString("telefone"));
				cliente.setEmail(rset.getString("email"));
				cliente.setEndereco(rset.getString("endereco"));
				cliente.setCidade(rset.getString("cidade"));
				cliente.setEstado(rset.getString("estado"));
				cliente.setDataDoCadastro(rset.getDate("data_do_cadastro"));

				clientes.add(cliente);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return clientes;

	}

	public void editar(Cliente cliente) {
		String sql = "UPDATE cliente SET nome = ?, cpf = ?, telefone = ?, email = ?, endereco = ?,"
				+ "cidade = ?, estado = ?, data_do_cadastro = ? WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getCpf());
			pstm.setString(3, cliente.getTelefone());
			pstm.setString(4, cliente.getEmail());
			pstm.setString(5, cliente.getEndereco());
			pstm.setString(6, cliente.getCidade());
			pstm.setString(7, cliente.getEstado());
			pstm.setDate(8, new Date(cliente.getDataDoCadastro().getTime()));

			pstm.setLong(9, cliente.getId());

			pstm.execute();
			System.out.println("Cliente editado com sucesso.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void deleteById(Long id) {

		String sql = "DELETE FROM cliente WHERE id = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setLong(1, id);

			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
