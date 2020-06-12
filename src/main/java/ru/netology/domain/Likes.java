package ru.netology.domain;

import lombok.Data;

@Data
public class Likes {
    private int count;
    private int userLikes;
    private boolean canLike;
    private boolean canPublish;
}
