package repositorio;

import java.util.List;

import javax.persistence.Query;

import dominio.Categoria;

public class CategoriaRepositorio extends BaseRepositorio {

	public CategoriaRepositorio(String nomeUnidade) {
		super(nomeUnidade);
		this.em = this.emf.createEntityManager();
	}
	
	public void create() {
		
	}
	
	public List<Categoria> readAll() {
		
		Query qry = this.em.createQuery("from Categoria");		
		List<Categoria> lista = qry.getResultList();
		this.em.clear();
		this.emf.close();
		return lista;
		
		
				
	}
	
	public void read(int id) {
		
	}
	
	public void update() {
		
	}
	
	public void delete() {
		
	}
	

}
