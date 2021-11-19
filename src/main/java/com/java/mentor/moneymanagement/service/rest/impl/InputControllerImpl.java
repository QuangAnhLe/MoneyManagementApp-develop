package com.java.mentor.moneymanagement.service.rest.impl;

import com.java.mentor.moneymanagement.dataaccess.InputRepository;
import com.java.mentor.moneymanagement.dataaccess.entity.Input;
import com.java.mentor.moneymanagement.logic.InputService;
import com.java.mentor.moneymanagement.logic.mapper.InputMapper;
import com.java.mentor.moneymanagement.logic.to.InputTO;
import com.java.mentor.moneymanagement.service.rest.InputController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class InputControllerImpl implements InputController {

    private InputService inputService;

    public InputControllerImpl(InputService inputService) {
        this.inputService = inputService;
    }

    @GetMapping( "/input")
    public List<InputTO> getInput() {
        return inputService.getInputs();
    }

    @PostMapping( "/input")
    public InputTO createInput(@RequestBody InputTO inputTO) {
        return inputService.createInput(inputTO);
    }

    @PutMapping("/input/{id}")
    public InputTO updateInput(@RequestBody InputTO inputTO, @PathVariable Long id){
        try {
            return inputService.updateInput(inputTO, id);
        }catch (IllegalStateException illegalStateException ){
            return new InputTO();
        }
    }

    @DeleteMapping("/input/{id}")
    public void deleteInput(@PathVariable Long id) {
        inputService.deleteInput(id);
    }
}
//@PutMapping("/{userId}")
//    public User issueBookByName(@PathVariable int userId,@RequestBody String bookName){
//        Optional<User> optionalUser=userRepository.findById(userId);
//        User user=optionalUser.get();
//        if(user==null) {
//            throw new RuntimeException("USer Not Found: "+user);
//        }
//        System.out.println(user.getUsername());
//        System.out.println(bookName+" "+bookName.getClass());
//        Book theBook=bookRepository.findByBookName(bookName);
//        System.out.println(theBook.getbName());
//
//        user.addBook(theBook);
//
//        return userRepository.save(user);
//    }