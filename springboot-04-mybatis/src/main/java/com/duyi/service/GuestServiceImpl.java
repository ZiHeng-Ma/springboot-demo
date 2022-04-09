package com.duyi.service;

import com.duyi.mapper.GuestMapper;
import com.duyi.mapper2.GuestMapper2;
import com.duyi.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestMapper mapper;

    @Autowired
    private GuestMapper2 mapper2;

    @Override
    public List<Guest> getGuests() {
        return mapper.getGuests();
    }
}
