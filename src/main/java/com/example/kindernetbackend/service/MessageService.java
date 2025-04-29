package com.example.kindernetbackend.service;

import com.example.kindernetbackend.entity.Message;
import java.util.List;

public interface MessageService {
    List<Message> getAllMessages();
    Message saveMessage(Message message);
    void deleteMessage(Long id);
}

