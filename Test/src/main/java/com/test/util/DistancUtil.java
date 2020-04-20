package com.test.util;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistancUtil {

    /**
     * 地球半径,单位 km
     */
    private static final double EARTH_RADIUS = 6378.137;

    /**
     * 根据经纬度，计算两点间的距离
     *
     * @param longitude1 第一个点的经度
     * @param latitude1  第一个点的纬度
     * @param longitude2 第二个点的经度
     * @param latitude2  第二个点的纬度
     * @return 返回距离 单位千米
     */
    //longitude1经度,latitude1纬度
    public static Map<String, Double>getDistance(double longitude1, double latitude1, double longitude2, double latitude2){
        //固定距离
        Double distance = 2.00000000000000;
        // 纬度
        double lat1 = Math.toRadians(latitude1);
        double lat2 = Math.toRadians(latitude2);
        // 经度
        double lng1 = Math.toRadians(longitude1);
        double lng2 = Math.toRadians(longitude2);
        // 纬度之差
        double a = lat1 - lat2;
        // 经度之差
        double b = lng1 - lng2;
        // 计算两点距离的公式
        double dist = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(b / 2), 2)));
        // 弧长乘地球半径, 返回单位: 千米
        dist =  dist * EARTH_RADIUS;
        Map<String, Double> map = new HashMap<String, Double>();
        if (dist<distance){
            map.put("longitude1",longitude1);
            map.put("latitude1",latitude1);
            //2为数据库的经纬度
            map.put("longitude2",longitude2);
            map.put("latitude2",latitude2);
            return map;
        }else {
            return null;
        }
    }

    @SuppressWarnings("rawtypes")
	public static List getDistance1(double longitude1, double latitude1, double longitude2, double latitude2) {
        //固定距离
        Double distance = 20.00000000000000;
        // 纬度
        double lat1 = Math.toRadians(latitude1);
        double lat2 = Math.toRadians(latitude2);
        // 经度
        double lng1 = Math.toRadians(longitude1);
        double lng2 = Math.toRadians(longitude2);
        // 纬度之差
        double a = lat1 - lat2;
        // 经度之差
        double b = lng1 - lng2;
        // 计算两点距离的公式
        double dist = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a / 2), 2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(b / 2), 2)));
        // 弧长乘地球半径, 返回单位: 千米
        dist = dist * EARTH_RADIUS;
        List<Double> list = new ArrayList<Double> ();
        if (dist < distance) {
            list.add(longitude2);
            list.add(latitude2);
            //2为数据库的经纬度
            return list;
        } else {
            return null;
        }
    }
    }

