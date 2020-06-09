package ru.netology.domain;

import lombok.Data;

@Data
public class PostInfo {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private Comment comment;
    private String copyright;
    private Likes like;
    private Repost repost;
    private View view;
    private String postType;
    private PostSource postSource;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;

}
