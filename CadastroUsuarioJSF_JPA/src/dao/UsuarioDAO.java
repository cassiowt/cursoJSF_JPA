package dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import inter.postgre.sql.GenericDAOSql;
import model.Usuario;
import util.JpaUtil;

public class UsuarioDAO implements GenericDAOSql<Usuario> {
	
	private static EntityManager em = JpaUtil.getFactory();

	@Override
	public boolean save(Usuario obj) {

		em.getTransaction().begin();
		em.persist(obj);
		em.flush();
		em.getTransaction().commit();

		return true;
	}

	@Override
	public boolean remove(Usuario obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usuario find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Usuario> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
