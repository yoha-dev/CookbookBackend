package de.cookerybookbackend.cookerybookbackend.repositories;

import de.cookerybookbackend.cookerybookbackend.identities.Chef;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ChefRepository extends MongoRepository<Chef, String> {

    public Chef findByEmail(String email);
    public List<Chef> findByUsername(String userName);
    public List<Chef> findAllBy();

}