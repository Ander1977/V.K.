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
    private boolean friendsOnly;
    private Comment comment;
    private String copyright;
    private Likes like;
    private Repost repost;
    private View view;
    private String postType;
    private PostSource postSource;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int postponedId;

}
