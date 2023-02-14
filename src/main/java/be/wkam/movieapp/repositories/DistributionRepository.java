package be.wkam.movieapp.repositories;

import be.wkam.movieapp.models.entities.Distribution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistributionRepository extends JpaRepository<Distribution,Long> {
}
