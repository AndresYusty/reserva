package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.vuelo;

@Repository
public interface VueloRepository extends JpaRepository<vuelo, Long> {

}
