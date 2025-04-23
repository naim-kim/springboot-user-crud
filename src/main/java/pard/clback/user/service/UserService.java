package pard.clback.user.service;

import io.swagger.v3.core.util.ReflectionUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pard.clback.user.dto.UserRequestDto;
import pard.clback.user.dto.UserResponseDto;
import pard.clback.user.entity.User;
import pard.clback.user.repo.UserRepo;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public void save(UserRequestDto.CreateUser req){
        User user = User.builder()
                .name(req.getName())
                .part(req.getPart())
                .age(req.getAge())
                .build();
        userRepo.save(user);
    }

    public List<User> readUser(String part){
        if(Objects.equals(part, "all")){
            return userRepo.findAll();
        }
        else {
            return userRepo.findByPart(part);
        }
    }

    public void update(Long id, UserRequestDto.CreateUser req){
        User user = userRepo.findById(id).orElseThrow(RuntimeException::new);
        user.update(req.getName(),req.getAge(), req.getPart());
        userRepo.save(user);
    }

    public void deleteUser(Long id){
        userRepo.deleteById(id);
    }

}
