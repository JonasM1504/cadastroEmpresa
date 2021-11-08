package Conta;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class App_cadastro_empresa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List <codigo_empresa> list = new ArrayList<>();
		
		System.out.println("Quantos perfis serão registrados? ");
		int n = ler.nextInt();

		for(int i = 0; i < n; i++ ) {
		
			System.out.println();
			System.out.println("Perfil #" + (i + 1) + ":");	
			
			System.out.print("Name: ");
		    ler.nextLine();
			String name = ler.nextLine();
			
			System.out.print("ID: ");
			Integer id = ler.nextInt();
		
			System.out.print("Salary: ");
			Double salary = ler.nextDouble();
		
			codigo_empresa cde = new codigo_empresa(name, id, salary);
		
			list.add(cde);
		}
		
		System.out.println("Entre com a ID será atualizada: " );
		int idSalary = ler.nextInt();
		
		Integer pos = position(list, idSalary);
		if (pos == null) {
			System.out.println("Esse Id não existe.");
			}
			else {
				System.out.println("Qual a porcentagem de atualização? ");
				double percent = ler.nextDouble();
				list.get(pos).increaseSalary(percent);
			}
		
		System.out.println();
		System.out.println("Lista de perfis: ");
		for (codigo_empresa cde : list) {
			System.out.println(cde);
		}
		
	}
	
	public static Integer position(List<codigo_empresa> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getID()==id) {
				return i;
			}
		}
		return null;
	}
	
	}

