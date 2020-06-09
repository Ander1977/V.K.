package ru.netology.domain;

import lombok.Data;

@Data
public class Place {
    private int id;
    private String title;
    private int latitude;
    private int longitude;
    private int created;
    private String icon;
    private int checking;
    private int updated;
    private int type;
    private int country;
    private int city;
    private String address;
}
