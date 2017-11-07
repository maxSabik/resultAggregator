package com.ra.results;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.ra.model.Point;
import com.ra.model.Result;
import com.ra.model.User;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
public class ResultDTO {
    String id;
    int number;
    String position;
    List<Map.Entry<User, Point>> points;
    String description;
    Map<String, String> additionalFields;
    String eventId;

    public Result toDomain() {
        return new Result(this.id, this.number, this.position, this.points, this.description, this.additionalFields, this.eventId);
    }
}