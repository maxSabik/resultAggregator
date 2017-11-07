package com.ra.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "results")
public class Result {
    @Id
    String id;
    int number;
    String position;
    List<Map.Entry<User, Point>> points;
    String description;
    Map<String, String> additionalFields;
    String eventId;

//    public Result(String id, int number, String position, List<Map.Entry<User, Point>> points, String description, Map<String, String> additionalFields) {
//        this.id = id;
//        this.number  = number;
//        this.position = position;
//        this.points = points;
//        this.description = description;
//        this.additionalFields = additionalFields;
//    }
}
