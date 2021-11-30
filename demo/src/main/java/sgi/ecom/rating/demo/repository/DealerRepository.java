package sgi.ecom.rating.demo.repository;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import sgi.ecom.rating.demo.model.Dealer;

import java.util.List;

@Repository
public interface DealerRepository extends ReactiveMongoRepository<Dealer,String> {
    Mono<Dealer> findByDealerCode(String dealerCode);

}
