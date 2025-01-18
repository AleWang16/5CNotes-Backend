package com.example.FiveCNotesBackend.course;
import java.util.ArrayList;
import java.util.UUID;
import java.time.Instant;
import java.time.OffsetDateTime;
public class Course {
    private UUID id;
    private String name;
    private ArrayList<Instant> meetingTimes;

    public Course(UUID id, String name, ArrayList<Instant> meetingTimes) {
        this.id = id;
        this.name = name;
        this.meetingTimes = meetingTimes;
    }

}
