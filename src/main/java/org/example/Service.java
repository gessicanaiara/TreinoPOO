package org.example;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<Livro> lista =new ArrayList<>();



    public void addLivros(String nome,String autor){

        lista.add(new Livro(nome,autor));
    }
    public void listarLivros(){
        int cont=0;
        for (Livro l:lista) {
            System.out.println(cont+" "+l.getNome()+" "+l.getNomeAutor());
            cont++;
        }
    }
    public void atualizarLivro(int numero, String atualizacao){
        lista.get(numero).setNome(atualizacao);

    }
   public void excluirLivro(int numero){
        lista.remove(numero);
   }
}
