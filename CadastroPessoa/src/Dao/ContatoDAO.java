package Dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import Entidade.Contato;

public class ContatoDAO {
	
	
	public String salvar(Contato contato)  
    {
    	try {
	    	FileWriter fw = new FileWriter("pessoas.txt", true);
	    	PrintWriter pw = new PrintWriter(fw);
	    	pw.println("Nome: "+ contato.getNome());
	    	pw.println("Telefone: "+ contato.getTelefone());
	    	pw.flush();
	    	pw.close();
	    	fw.close();
    	} catch (IOException ex) {
    		
    	}
    		
    	return null;
    }

}
