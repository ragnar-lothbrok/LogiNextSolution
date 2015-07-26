package com.loginext.test.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.loginext.test.model.Coordinate;

/**
 * 
 * @author raghunandanG
 * 
 *         Class which will interact with database.
 *
 */
public interface CoordinateDAO {

    String GET_COORDINATES = "SELECT id as id, latitude  as latitude,  longitude   as longitude FROM coordinates";

    @Select(GET_COORDINATES)
    public List<Coordinate> getAllCoordinates();

    String GET_COORDINATES_BY_ID = "SELECT id as id, latitude  as latitude,  longitude   as longitude FROM coordinates c WHERE c.id=#{id}";

    @Select(GET_COORDINATES_BY_ID)
    public Coordinate getCoordinateById(@Param("id") int id);
}
