package org.example.DTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User creatUser(User user)
    {
        User user1 = this.userRepository.save(user);
        return user1;
    }

    public User getUSer(Long id)
    {
        User user = this.userRepository.getReferenceById(id);
        return user;
    }

}
