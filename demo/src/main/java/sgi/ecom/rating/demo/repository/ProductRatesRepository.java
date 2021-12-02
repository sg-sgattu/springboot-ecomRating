package sgi.ecom.rating.demo.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import sgi.ecom.rating.demo.model.ProdRates;

import java.util.List;

@Repository
public interface ProductRatesRepository extends ReactiveMongoRepository<ProdRates,String> {

    @Query("{ 'productCode' : :#{#productCode}}")
    Flux<ProdRates> findProdRates(String productCode);

    @Query("{'$or': :#{#doc}}")
    Flux<ProdRates> findRates(List<Object> doc);


}
