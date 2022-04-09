package com.duyi.service;

import com.duyi.bean.Guest;

import java.util.List;

public interface GuestSevice {

    List<Guest> list();

    void add(Guest guest);

    void update(Guest guest);

    Guest get(String name);

    void delete(String name);
}
