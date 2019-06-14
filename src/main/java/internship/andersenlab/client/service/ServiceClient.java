package internship.andersenlab.client.service;

import internship.andersenlab.client.model.User;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface ServiceClient {
    public void add(User user);

    public List<User> getAll();

    public User getById(Long id);

    public void update(User employee);

    public void delete(Long id);
}
