package pard.clback.user.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pard.clback.user.dto.UserRequestDto;
import pard.clback.user.entity.User;
import pard.clback.user.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Operation(summary = "Get Users by Part", description = "Retrieve all users filtered by a specific part parameter.")
    @GetMapping("")
    public List<User> findAllByPart(@RequestParam String part) {
        return userService.readUser(part);
    }


    @Operation(summary = "Create New User", description = "Save a new user record in the system.")
    @PostMapping("")
    public void save(@RequestBody UserRequestDto.CreateUser req) {
        userService.save(req);
    }

    @Operation(summary = "Update User", description = "Update an existing user record by ID.")
    @PatchMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody UserRequestDto.CreateUser req) {
        userService.update(id, req);
    }

    @Operation(summary = "Delete User", description = "Delete a user record from the system by ID.")
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
