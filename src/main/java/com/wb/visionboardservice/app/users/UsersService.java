package com.wb.visionboardservice.app.users;

import com.wb.visionboardservice.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

@Component("usersService")
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public User add(User item) throws SQLException {
        return usersRepository.add(item);
    }

    public List<User> get() throws SQLException  {
        return usersRepository.get();
    }

    public User get(UUID id) throws SQLException  {
        return usersRepository.get(id);
    }

    public void delete(UUID id) throws SQLException  {
        usersRepository.delete(id);
    }

    public User update(User user) throws SQLException  {
        return usersRepository.update(user);
    }
}
