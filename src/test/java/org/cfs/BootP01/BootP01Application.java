package org.cfs.BootP01;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import javax.swing.*;

@SpringBootApplication

public class BootP01Application implements CommandLineRunner {

    private final Notification notification ;

    public BootP01Application (Notification notification)
    {
        this.notification=notification;
    }

    public static void main(String[] args) {
        SpringApplication.run(BootP01Application.class,args);
    }

    public void run(Spring... args)
    {
        notification.NotifyUser();
    }

    @Override
    public void run(String... args) throws Exception {

    }
}