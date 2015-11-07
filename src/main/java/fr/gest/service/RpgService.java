package fr.gest.service;

import fr.gest.domain.Rpg;

public interface RpgService {
  Rpg getRpgFromId(Long id);
  Rpg insertRpg(Rpg id);
}
