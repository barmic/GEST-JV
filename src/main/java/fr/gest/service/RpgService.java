package fr.gest.service;

import fr.gest.domain.Rpg;

import java.util.Collection;

public interface RpgService {
  Rpg getRpgFromId(Long id);
  Rpg insertRpg(Rpg rpg);
  Collection<Rpg> getAll();
}
