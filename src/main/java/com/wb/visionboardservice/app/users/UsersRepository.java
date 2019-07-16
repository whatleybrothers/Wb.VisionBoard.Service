package com.wb.visionboardservice.app.users;

import com.wb.visionboardservice.models.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component("usersRepository")
public class UsersRepository {

    static Logger log = LogManager.getLogger(UsersRepository.class);


    public User add(User user) throws SQLException  {
        log.info("FW - add users");
        return new User("fredy", "Whatley", "sample@email.com");
    }

    public List<User> get()  throws SQLException {
        log.info("FW - get users");
        var users = new ArrayList<User>();
        User user = new User("fredy", "Whatley", "sample@email.com");
        User user2 = new User("cesar", "Whatley", "sample@email.com");
        users.add(user);
        users.add(user2);

        return users;
    }

    public User get(UUID id) throws SQLException  {
        log.info("FW - get user by id");
        return new User("fredy", "Whatley", "sample@email.com");
    }

    public void delete(UUID id) throws SQLException  {
        log.info("FW - get user by id");
    }

    public User update(User user) throws SQLException {
        log.info("FW - update user");
        return new User();
    }
}
