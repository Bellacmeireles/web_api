package com.dio.web.api.repository;

import com.dio.web.api.handler.BusinessException;
import com.dio.web.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(User user) {
        if(user.getLogin()==null){
            throw new BusinessException("O campo login é obrigatório");
        }
        if(user.getId() == null) {
            System.out.println("SAVE - Recebendo o user na camada de repositório");
            System.out.println(user);
        } else {
            System.out.println("UPDATE - Recebendo o user na camada de repositório");
        }
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }

    public List<User> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<User> users = new ArrayList<>();
        users.add(new User("Bella", "password"));
        users.add(new User("testenome", "passwordtwo"));
        return users;
    }

    public User findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("Bella", "password");
    }

    public User findByUserName(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username: %s para localizar um usuário", username));
        return new User("Bella", "password");
    }
}
