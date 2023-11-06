package no.hvl.dat108.webshop.util;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface DeltagerRepository extends JpaRepository<Deltager, String> {
}
