package fr.gest.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;
import java.util.Properties;

@Component
public class ServiceVideoGameImpl implements ServiceVideoGame {
  @Autowired
  private DataSource dataSource;

  @Override
  public void foo() throws SQLException {
    Properties clientInfo = dataSource.getConnection().getClientInfo();
    StringWriter out = new StringWriter();
    clientInfo.list(new PrintWriter(out));
    JdbcTemplate template = new JdbcTemplate(dataSource);
  }
}
