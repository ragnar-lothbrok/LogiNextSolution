package com.loginext.test.services.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.loginext.test.dao.CoordinateDAO;
import com.loginext.test.services.CoordinateService;
/**
 * 
 * @author raghunandanG
 * 
 * This class is service class and return coordinates in JSON Form.
 *
 */
public class CoordinateServiceImpl implements CoordinateService {

    private static Logger log = Logger.getLogger(CoordinateServiceImpl.class.getName());

    @Autowired
    CoordinateDAO customerDAO;

    @Override
    public Object getCoordinate(Integer id) {
        try {
            return customerDAO.getCoordinateById(id);
        } catch (Exception exception) {
            log.error("Exception occured while fetching coordinates for :" + id, exception);
        }
        Map<String, Object> resultMap = new HashMap<String, Object>(1);
        resultMap.put("success", Boolean.FALSE.toString().toLowerCase());
        return resultMap;
    }

    @Override
    public Object getAllCoordinates() {
        try {
            log.info("getAllCoordinates.........");
            return customerDAO.getAllCoordinates();
        } catch (Exception exception) {
            log.error("Exception occured while fetching coordinates.", exception);
        }
        Map<String, Object> resultMap = new HashMap<String, Object>(1);
        resultMap.put("success", Boolean.FALSE.toString().toLowerCase());
        return resultMap;
    }

}
