package com.dylan.sageBE.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPredictionRepo extends CrudRepository<UserPredictionRepo, Integer> {
}
