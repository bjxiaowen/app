package com.web.test.mgdb;
import java.util.Set;

import com.mongodb.DB;
import com.mongodb.MongoClient;
/**
 * 
 * @author xiangxiaowen
 *
 */
public class MongoClientTest {

	public static void main(String[] args) {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("test");
		Set<String> collections = db.getCollectionNames();
		System.out.println(collections); // [datas, names, system.indexes, users]
	}
}
