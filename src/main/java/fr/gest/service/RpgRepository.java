package fr.gest.service;

import fr.gest.domain.Rpg;
import org.springframework.data.repository.Repository;

import java.util.Collection;

public interface RpgRepository extends Repository<Rpg, Long> {
  <S extends Rpg> S save(S entity);

  Rpg findOne(Long primaryKey);
  Collection<Rpg> findAll();
}
