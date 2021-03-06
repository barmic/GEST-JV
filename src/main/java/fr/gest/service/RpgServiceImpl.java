package fr.gest.service;

import fr.gest.domain.Rpg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class RpgServiceImpl implements RpgService {
  @Autowired
  private RpgRepository rpgRepository;

  @Override
  public Rpg getRpgFromId(Long id) {
    return rpgRepository.findOne(id);
  }

  @Override
  public Rpg insertRpg(Rpg rpg) {
    return rpgRepository.save(rpg);
  }

  @Override
  public Collection<Rpg> getAll() {
    return rpgRepository.findAll();
  }
}
