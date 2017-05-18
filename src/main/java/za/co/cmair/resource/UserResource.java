package za.co.cmair.resource;

import za.co.cmair.entity.UserView;

import static java.util.Collections.singletonList;

import java.sql.SQLException;
import java.util.List;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/user")
@Produces("application/json")
public class UserResource extends ResourceBase<UserView> {

  private EntityManager em;
  private List<UserView> listEvents;

  @Override
  protected List getTixQuery() throws SQLException, NamingException {
    return null;
  }

  @Override
  protected List getSingleQuery(long id) throws NamingException {
    em = getEntityManager();
    em.getTransaction().begin();
    listEvents = singletonList(em.find(UserView.class, id));
    em.getTransaction().commit();
    em.close();
    return listEvents;
  }

  @Override
  protected void createQuery(UserView userView) throws SQLException, NamingException {

  }

  @Override
  protected void deleteQuery(long id) throws SQLException, NamingException {

  }

  @Override
  protected void updateQuery(UserView userView, long id) throws SQLException, NamingException {

  }

}