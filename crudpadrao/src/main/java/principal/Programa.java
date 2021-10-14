package principal;

import repositorio.CategoriaRepositorio;

import dominio.Categoria;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CategoriaRepositorio repo = new CategoriaRepositorio("exemplo-jpa");
		
		
		for (Categoria cat : repo.readAll()) {
			System.out.println(cat);
		}

	}

}
