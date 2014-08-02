package com.searchforit.utils;

import java.net.UnknownHostException;
import java.util.Set;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class DbUtil {
	public static void setUp() throws UnknownHostException{
		MongoClient mongoClient = new MongoClient("localhost", 27017);
//		DB db = mongoClient.getDB("inventory");
//		db.getCollection("author");
//		db.getCollection("bookName");
		

		List<String> dbList = mongoClient.getDatabaseNames();
		
		for(String dbName: dbList) {
			System.out.println(dbName);
		}
		
		
		
		DB db = mongoClient.getDB("testdb");
		DBCollection table = db.getCollection("user");
		
		Set<String> tables = db.getCollectionNames();
	 
		for(String coll : tables){
			System.out.println(coll);
		}
	}
	
	
	public static void main(String [] args) throws UnknownHostException {
		System.out.println("hello");
		setUp();
	}
	
}

