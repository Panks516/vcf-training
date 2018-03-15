package org.apbg.cf.models;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "people_status", path = "people_status")
public interface PersonStatusRepository extends PagingAndSortingRepository<PersonStatus, UUID> {

}
