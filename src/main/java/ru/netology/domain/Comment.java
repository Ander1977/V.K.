package ru.netology.domain;

import lombok.Data;

@Data
public class Comment {
    private int count;
    private int canPost;
    private int groupsCanPost;
    private boolean canClose;
    private boolean canOpen;
}
