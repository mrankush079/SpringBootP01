package org.cfs.BootP01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Notification {

    @Autowired
    public MessageService getMessageService() {
        return messageService;
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    private MessageService messageService;

    public Notification ()
    {

    }

    public Notification ( MessageService messageService) {

        this.messageService=messageService;
    }
    public void NotifyUser(){
        System.out.println(messageService.sendMessage());
    }

}
