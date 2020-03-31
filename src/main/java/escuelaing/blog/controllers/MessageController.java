package escuelaing.blog.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import escuelaing.blog.entities.Message;

/**
 * MessageController
 */
@Controller
public class MessageController {

  @MessageMapping("/message")
  @SendTo("/topics/message")
  public Message message(String message) {
    return new Message(HtmlUtils.htmlEscape(message));
  }
}