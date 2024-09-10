package com.bankmanagement.Configuration;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.dialect.MySQL8Dialect;

import com.bankmanagement.Impl.sbiimpl;
import com.bankmanagement.Model.sbi;

public class config
{
	
		static SessionFactory sf=null;
		static StandardServiceRegistry registry=null;
		
		public static SessionFactory getSession()
		{
			Map<String, Object> setting =new HashMap<String, Object>();
			setting.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			setting.put(Environment.URL,"jdbc:mysql://localhost:3306/Bankmanagement");
			setting.put(Environment.USER, "root");
			setting.put(Environment. PASS,"root123");
			setting.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
			setting.put(Environment.HBM2DDL_AUTO,"update");
			setting.put(Environment.SHOW_SQL,"ture");
			
			registry=new StandardServiceRegistryBuilder().applySettings(setting).build();
			MetadataSources mds=new MetadataSources(registry);
			mds.addAnnotatedClass(sbi.class);
			Metadata md=mds.getMetadataBuilder().build();
			sf=md.getSessionFactoryBuilder().build();
			
			return sf;
		}
	}




