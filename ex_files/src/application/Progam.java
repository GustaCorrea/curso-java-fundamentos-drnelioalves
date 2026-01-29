package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entites.Product;

public class Progam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> lista = new ArrayList<>();

		System.out.println("Digite o caminho do arquivo:");
		String caminho = sc.nextLine(); 
		File arquivo = new File(caminho);

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

		    String line = br.readLine(); 
		    
		    while (line != null) {
		        String[] fields = line.split(",");
		       
		        String name = fields[0];
		        double price = Double.parseDouble(fields[1]); 
		        int quantity = Integer.parseInt(fields[2]);

		        Product prod = new Product(name, price, quantity);

		        lista.add(prod);
		        
		        line = br.readLine();
		    }

		}catch (IOException e) {
		    System.out.println("Erro: " + e.getMessage());
		}
		
		String folderPath = arquivo.getParent();
		
		boolean success = new File(folderPath + "\\out").mkdir(); 

		String targetFileStr = folderPath + "\\out\\summary.csv";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

		    for (Product item : lista) {
		       
		        bw.write(item.getName() + "," + String.format("%.2f", item.total()));
		        
		        bw.newLine(); 
		    }

		    System.out.println(targetFileStr + " CRIADO!");

		} catch (IOException e) {
		    System.out.println("Erro ao escrever: " + e.getMessage());
		}
	}

}
