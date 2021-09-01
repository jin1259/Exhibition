package bookingexhibition;

//import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import org.springframework.data.repository.CrudRepository;  //jym

//@RepositoryRestResource(collectionResourceRel="exhibitions", path="exhibitions")
//public interface ExhibitionRepository extends PagingAndSortingRepository<Exhibition, Long>{
public interface ExhibitionRepository extends CrudRepository<Exhibition, Long> {
    

}
