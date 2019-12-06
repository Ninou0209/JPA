/* IST & CC CLOSSET Marine LENOIR Guillaume */ 
package com.example.JPATest;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {
	Optional<Vehicule> findById(Long plateNumber);

}

