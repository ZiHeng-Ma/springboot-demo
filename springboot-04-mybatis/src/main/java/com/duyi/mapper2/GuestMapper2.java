package com.duyi.mapper2;

import com.duyi.model.Guest;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GuestMapper2 {

    @Select("select name,role from guest")
    List<Guest> getGuests();
}
