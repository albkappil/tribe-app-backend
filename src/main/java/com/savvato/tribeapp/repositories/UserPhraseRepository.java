package com.savvato.tribeapp.repositories;

import com.savvato.tribeapp.entities.UserPhrase;
import com.savvato.tribeapp.entities.UserPhraseId;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserPhraseRepository extends CrudRepository<UserPhrase, UserPhraseId> {
    @Query(nativeQuery = true, value = "select phrase_id from user_phrase where user_id = ?")
    Optional<List<Long>> findPhraseIdsByUserId(Long Id);

}
