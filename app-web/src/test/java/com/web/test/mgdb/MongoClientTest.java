package com.web.test.mgdb;
import java.util.List;
import java.util.Set;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
/**
 * 
 * @author xiangxiaowen
 * @deprecated 1.启动数据库： D:\mongodb\bin>mongo 2.创建数据库：  use mymgdb 3.创建表：db.createCollection("users")
 * 
 */
public class MongoClientTest {

	public static void main(String[] args) {
		MongoClient mongo = new MongoClient("localhost", 27017);
		DB db = mongo.getDB("mymgdb");//连接数据库mymgdb
		Set<String> collections = db.getCollectionNames();//查询所有的集合也就是表
		System.out.println(collections); // [Account, Test, system.indexes]
		/**
		 * 查询数据库
		 */
		List<String> dbs = mongo.getDatabaseNames();
		System.out.println(dbs); // [local, mymgdb, test]
		
		/**
		 * 获取表
		 */
		DBCollection col = db.getCollection("users");
	}
}
class User {
	 
    private int id;
    private String name;
    private String role;
    private boolean isEmployee;
     
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public boolean isEmployee() {
        return isEmployee;
    }
    public void setEmployee(boolean isEmployee) {
        this.isEmployee = isEmployee;
    }
}
