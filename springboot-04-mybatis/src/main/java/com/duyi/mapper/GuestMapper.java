package com.duyi.mapper;

import com.duyi.model.Guest;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GuestMapper {

    @Select("select name,role from guest")
    List<Guest> getGuests();
}
