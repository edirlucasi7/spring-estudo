package com.example.demo.domain;

import java.lang.reflect.Field;

import org.springframework.util.ReflectionUtils;

public class Teste {

	public static void main(String[] args) {
		
		try {
			
			Produto produto = new Produto();
			produto.setNome("Lucas");
			produto.setSexo("Masculino");
			
			Field field1 = Produto.class.getDeclaredField("nome");
			field1.setAccessible(true);
			
			Field field2 = Produto.class.getDeclaredField("sexo");
			field2.setAccessible(true);
			
			System.out.println(field1.get(produto));
			System.out.println(field2.get(produto));
			
			Field field3 = ReflectionUtils.findField(Produto.class, "nome");
			field3.setAccessible(true);
			System.out.println(field3.get(produto));
			
			Field field4 = ReflectionUtils.findField(Produto.class, "nome");
			
			System.out.println(field4.get(produto));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
