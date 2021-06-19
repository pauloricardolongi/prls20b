package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.Produto;

public class App02 {
	public static int compareProdutos(Produto p1, Produto p2) {
		return p1.getPreco().compareTo(p2.getPreco());
	}

	public static void main(String[] args) {
	List<Produto>list = new ArrayList<>();
		
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Tablet", 450.00));
		
		list.sort(App02::compareProdutos);
		list.forEach(System.out::println);
		

	}

}
