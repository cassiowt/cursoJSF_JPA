package dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import inter.postgre.sql.GenericDAOSql;
import model.Animal;
import util.JpaUtil;

public class AnimalDAO implements GenericDAOSql<Animal> {

	private static EntityManager em = JpaUtil.getFactory();

	@Override
	public boolean save(Animal obj) {
		
		em.getTransaction().begin();
		em.persist(obj);
		em.flush();
		em.getTransaction().commit();

		return true;
	}

	@Override
	public boolean remove(Animal obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Animal find(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Animal find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Animal> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
