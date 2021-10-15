package principal;
import java.util.Date;
import dominio.Categoria;
import repositorio.CategoriaRepositorio;
import servico.CategoriaServico;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CategoriaRepositorio repo = new CategoriaRepositorio("exemplo-jpa");
		CategoriaServico servico = new CategoriaServico(repo);
		for (Categoria item : servico.listar()) {
			System.out.println(item);			
		}
		
//		categoriaServicoListar(repo);
//		categoriaServicoInserir(repo);
//		CategoriaServicoExcluir(repo,19);
//		categoriaServicoListar(repo);
//		categoriaServicoObter(repo);
		repo.dispose();

	}
//
//	private static void categoriaServicoListar(CategoriaRepositorio repo) {
//		for (Categoria cat : repo.readAll()) {
//			System.out.println(cat);
//		}
//
//	}
//	
//	private static void categoriaServicoObter(CategoriaRepositorio repo) {
//		Categoria c =  repo.read(2);
//		System.out.println(c);
//	}
//
//	private static void categoriaServicoInserir(CategoriaRepositorio repo) {
//		Categoria c = new Categoria(null, "teste", new Date());
//		repo.create(c);
//		System.out.println(c);
//	}
//	
//	private static void CategoriaServicoExcluir(CategoriaRepositorio repo, int id) {
//		repo.delete(id);		
//	}
//	
//	private static void categoriaServicoAlterar(CategoriaRepositorio repo, int id) {
//		Categoria c = new Categoria(id, "outro teste", new Date());
//		repo.update(c);
//	}	

}
