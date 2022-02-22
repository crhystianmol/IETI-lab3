package lab3.service;

import lab3.controller.user.UserDto;
import lab3.exception.UserNotFoundException;
import lab3.repository.document.User;

import java.util.List;

public interface UserService
{
    User create( UserDto userDto );

    User findById( String id )
            throws UserNotFoundException;

    User findByEmail( String email )
            throws UserNotFoundException;

    List<User> all();

    boolean deleteById( String id );

    User update( UserDto userDto, String id );
}