package jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

//@RepositoryRestResource(exported= false) ## For hiding the API
@CrossOrigin
@RepositoryRestResource(path="customizedbooks",collectionResourceRel="customizedbooks",itemResourceRel="customizedbook")
public interface BookRepository extends JpaRepository<Book, Integer> {
    @RestResource(path="author",rel="author")
    List<Book> findByAuthorContains(@Param("author") String author);
    @RestResource(path="name",rel="name")
    Book findByNameEquals(@Param("name") String name);

    /*
    For hiding the specific method
     */
    @Override
    @RestResource(exported=false)
    void deleteById(Integer integer);
}
