package mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {}

//Didn't implement "POST". For this functionality, need to add more code to solve the auto-increment issue in MongoDB.
