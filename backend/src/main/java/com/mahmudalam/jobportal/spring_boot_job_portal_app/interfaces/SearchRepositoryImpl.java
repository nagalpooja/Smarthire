// package com.mahmudalam.jobportal.spring_boot_job_portal_app.interfaces;

// import com.mahmudalam.jobportal.spring_boot_job_portal_app.model.JobPostModel;
// import com.mongodb.client.MongoClient;
// import com.mongodb.client.MongoCollection;
// import com.mongodb.client.MongoCursor;
// import com.mongodb.client.MongoDatabase;
// import org.bson.Document;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.mongodb.core.convert.MongoConverter;
// import org.springframework.stereotype.Component;

// import java.util.ArrayList;
// import java.util.List;

// @Component
// public class SearchRepositoryImpl implements SearchRepository {

//     @Autowired
//     MongoClient client;

//     @Autowired
//     MongoConverter converter;

//     @Override
//     public List<JobPostModel> findByText(String text) {
//         final List<JobPostModel> jobPosts = new ArrayList<>();

//         MongoDatabase database = client.getDatabase("job_portal_db");
//         MongoCollection<Document> collection = database.getCollection("job_posts");

//         Document searchQuery = new Document("$text", new Document("$search", text));
//         Document sortQuery = new Document("exp", -1);

//         try (MongoCursor<Document> cursor = collection.find(searchQuery).sort(sortQuery).iterator()) {
//             while (cursor.hasNext()) {
//                 jobPosts.add(converter.read(JobPostModel.class, cursor.next()));
//             }
//         }

//         return jobPosts;
//     }
// }


package com.mahmudalam.jobportal.spring_boot_job_portal_app.interfaces;

import com.mahmudalam.jobportal.spring_boot_job_portal_app.model.JobPostModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SearchRepositoryImpl implements SearchRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<JobPostModel> findByText(String text) {
        Query query = new Query();
        query.addCriteria(new Criteria().orOperator(
                Criteria.where("profile").regex(text, "i"),
                Criteria.where("desc").regex(text, "i"),
                Criteria.where("techs").regex(text, "i")  // Optional: enables searching techs too
        ));

        return mongoTemplate.find(query, JobPostModel.class);
    }
}
