package org.yeachan.chapter2.item3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * package :  org.yeachan.chapter2.item3
 * fileName : UserService
 * author :  ShinYeaChan
 * date : 2023-07-29
 */
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
}
