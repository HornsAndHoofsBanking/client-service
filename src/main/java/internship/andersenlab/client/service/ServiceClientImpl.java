package internship.andersenlab.client.service;

import internship.andersenlab.client.model.User;
import internship.andersenlab.client.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClientImpl implements ServiceClient {

    @Autowired
    private UserRepository clientRepository;

    public void add(User user) {
        clientRepository.save(user);
    }

    public List<User> getAll() {
        return clientRepository.findAll();
    }

    public User getById(Long id) {
        return clientRepository.getOne(id);
    }

    public void update(User employee) {
        clientRepository.save(employee);
    }

    public void delete(Long id) {
        clientRepository.delete(getById(id));
    }
}
