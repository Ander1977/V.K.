package ru.netology.domain;

import lombok.Data;

@Data
public class Repost {
    private int count;
    private boolean userReposted;
}
