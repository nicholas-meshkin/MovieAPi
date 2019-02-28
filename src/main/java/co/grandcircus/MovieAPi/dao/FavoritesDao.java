package co.grandcircus.MovieAPi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.MovieAPi.Model.Favorite;

@Repository
@Transactional
public class FavoritesDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public List<Favorite> findAll(){
		return em.createQuery("FROM Favorite", Favorite.class).getResultList();
	}
	
	public void create(Favorite favorite) {
		em.persist(favorite);
	}

	public void delete(Long id) {
		Favorite favorite = em.getReference(Favorite.class, id);
		em.remove(favorite);
	}
}
