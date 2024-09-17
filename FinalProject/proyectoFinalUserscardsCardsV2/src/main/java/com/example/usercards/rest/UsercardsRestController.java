package com.example.usercards.rest;
import com.example.usercards.entity.Userscards;
import com.example.usercards.service.UsercardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usercardsdata") // Prefix for route
public class UsercardsRestController {

    private final UsercardsService usercardsService;

    // Inject the service using autowired
    @Autowired
    public UsercardsRestController(UsercardsService usercardsService) {
        this.usercardsService = usercardsService;
    }

    // Endpoint to get all user
    //Authorize the role of "USER and ADMIN" to access this endpoint
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    @GetMapping("/all")
    public List<Userscards> findAll() {
        return usercardsService.findAll();
    }

    // Endpoint to get user by id
    //Authorize the role of "USER and ADMIN" to access this endpoint
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    @GetMapping("/{id}")
    public Optional<Userscards> findById(@PathVariable int id) {
        return usercardsService.findById(id);
    }

    // Endpoint to get save an user or update an existing one
    //Authorize the role of "ADMIN" to access this endpoint
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/save")
    public Userscards save(@RequestBody Userscards usercards) {
        return usercardsService.save(usercards);
    }

    // Endpoint to eliminate an existing user by id
    //Authorize the role of "ADMIN" to access this endpoint
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable int id) {
        usercardsService.deleteById(id);
        return "Deleted user card id - " + id;
    }

    // Endpoint to search usercards by their amount of normal cards
    //Authorize the role of "USER and ADMIN" to access this endpoint
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    @GetMapping("/findByNormalCards/{normalCards}")
    public List<Userscards> findByNormalCards(@PathVariable int normalCards) {
        return usercardsService.findByNormalCards(normalCards);
    }

    // Endpoint to search usercards by their amount of rare cards
    //Authorize the role of "USER and ADMIN" to access this endpoint
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    @GetMapping("/findByRareCards/{rareCards}")
    public List<Userscards> findByRareCards(@PathVariable int rareCards) {
        return usercardsService.findByRareCards(rareCards);
    }

    // Endpoint to search usercards by their amount of rare cards
    //Authorize the role of "USER and ADMIN" to access this endpoint
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    @GetMapping("/findBySuperRareCards/{superRareCards}")
    public List<Userscards> findBySuperRareCards(@PathVariable int superRareCards) {
        return usercardsService.findBySuperRareCards(superRareCards);
    }
}
