package com.example.demo;
import com.mongodb.client.*;
import org.bson.Document;
public class mongoconnector {
        public static void  init(){
            MongoClient mongoClient = MongoClients.create( "mongodb://localhost:27017" );
            MongoDatabase database = mongoClient.getDatabase("sports");
            MongoCollection<Document> collection = database.getCollection("login");
            Document mongodocument = new Document ("email","shibi@156").append("password","26453");
            collection.insertOne(mongodocument);
            Document query = new Document(
                    "email", "swetha@gmail.com");
            Document query1 = new Document(
                    "email", "prathi@156");
            MongoCursor<Document> cursor = collection.find(query).iterator();
            while (cursor.hasNext()) {
                Document document = cursor.next();
                System.out.println(document.toJson());
            }
            collection.deleteOne(query1);
            cursor.close();
            mongoClient.close();
        }
}
