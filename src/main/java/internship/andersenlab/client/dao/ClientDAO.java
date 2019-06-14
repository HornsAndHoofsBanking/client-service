package internship.andersenlab.client.dao;

import internship.andersenlab.client.model.User;

import java.util.List;

public interface ClientDAO {
    public void add(User user);

    public List<User> getAll();

    public User getById(Long id);

    public void update(User employee);

    public void delete(Long id);
}
