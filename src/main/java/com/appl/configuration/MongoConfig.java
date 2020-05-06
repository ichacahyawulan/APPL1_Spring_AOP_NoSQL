package com.appl.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.appl.aop.AlatMusikAspect;
import com.mongodb.MongoClient;
 
@Configuration
@ComponentScan(basePackages = "com.appl")
@EnableMongoRepositories({ "com.appl.repositories" })
@EnableAspectJAutoProxy
public class MongoConfig {
 
    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        return new SimpleMongoDbFactory(mongoClient, "alatMusik");
    }
 
    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());
        return mongoTemplate;
    }
    
    @Bean
	public AlatMusikAspect alatMusikAspect() {
		return new AlatMusikAspect();
	}
}