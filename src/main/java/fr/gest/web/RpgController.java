package fr.gest.web;

import com.google.gson.Gson;
import fr.gest.domain.Rpg;
import fr.gest.service.RpgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.sql.SQLException;
import java.util.Collections;

@Controller
public class RpgController {
  private Gson gson = new Gson();
  @Autowired
  private RpgService rpgService;

  private Long id;

  @PostConstruct
  public void init() {
    Rpg rpg = new Rpg();
    rpg.setName("D&D");
    rpg.setYear(1995);
    rpg.setDescription("It's RPG !");
    id = rpgService.insertRpg(rpg).getId();
  }

  @RequestMapping("/")
  @ResponseBody
  String home() throws SQLException {
    Rpg rpg = rpgService.getRpgFromId(id);
    return gson.toJson(rpg);
  }

  @RequestMapping("/list")
  String template(Model model) {
    model.addAttribute("rpgs", rpgService.getAll());
    return "listing";
  }
}
