package com.example.FiveCNotesBackend.file;

import com.example.FiveCNotesBackend.user.User;

import java.util.UUID;

public class File {

    private UUID id;
    private String name;
    private User author;
    private String title;
    private String fileFormat;
    private String content;
    private User userLastModified;
    private Boolean isActive;
    private String s3Reference;

    public File() {}

    public void save() {}

    public void removeCollaborator(User collaborator) {}

    public void delete() {}

    public void addCollaborator(User collaborator, String perm) {}

    public void updateFile() {}
 }


