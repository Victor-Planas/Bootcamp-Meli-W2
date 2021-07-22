package br.com.meli.odontology.odontology.services;

import br.com.meli.odontology.odontology.entities.User;
import br.com.meli.odontology.odontology.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User addUser(User User) {
        return userRepository.save(User);
    }

    public List<User> listAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(User User) {
        return userRepository.save(User);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
