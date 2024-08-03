package com.example.hibernet;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class controller {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StandardServiceRegistry service =new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build() ;
		
		Metadata md=new MetadataSources(service).getMetadataBuilder().build();
		
		SessionFactory sf=md.getSessionFactoryBuilder().build();
		
		Session s= sf.openSession();
		
		Transaction t=s.beginTransaction();
		
		student std=new student();
		System.out.println("enter your name");
		std.setName(sc.next());
		System.out.println("enter your email");
		std.setEmail(sc.next());
		System.out.println("enter your password");
		std.setPassword(sc.next());
		System.out.println("enter your confirmpassword");
		std.setConfirmpasword(sc.next());
		
		s.save(std);
		
		
		
		t.commit();
		
		System.out.println("successfully inserted");
		
		s.close();
		sf.close();
	}

}
