package ru.gb.spring.example4Sem2CRUD.services;

import org.springframework.stereotype.Service;
import ru.gb.spring.example4Sem2CRUD.models.User;
import ru.gb.spring.example4Sem2CRUD.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User saveUser(User user){
        return userRepository.save(user);
    }
    public void deleteById(int id){
        userRepository.delete(id);
    }
}
