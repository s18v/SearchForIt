package com.searchforit.utils;

import java.net.UnknownHostException;
import java.util.Set;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;

public class DbUtil {
	public static void setUp() throws UnknownHostException {
	   
		MongoClient mongoClient = new MongoClient("localhost", 27017);
		DB books = mongoClient.getDB("books");

		DBCollection catalog = books.getCollection("catalog");

		DBObject book = new BasicDBObject();

		book.put("author", "Gambardella, Matthew");
		book.put("title", "XML Developer's Guide");
		book.put("genre", "Computer");
		book.put("price", "44.95");
		book.put("publish_date", "2000-10-01");
		book.put("description",
				"An in-depth look at creating applications with XML.");
		
		catalog.insert(book);
		
		Set<String> catalogTables = books.getCollectionNames();

		for (String coll : catalogTables) {
			System.out.println(coll);
		}
	}

	public static void main(String[] args) throws UnknownHostException {
		System.out.println("hello");
		setUp();
	}

}
