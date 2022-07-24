package com.osiris.carbackend.repositories;

import com.osiris.carbackend.domain.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
