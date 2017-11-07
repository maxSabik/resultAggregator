package com.ra.model;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class Event {
    @Id
    String id;
    String name;
    Date date;
    String description;
    List<User> organizers;
    List<User> participants;
}
