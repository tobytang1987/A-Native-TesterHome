package com.testerhome.nativeandroid.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by vclub on 15/9/17.
 */
public class StringUtils {


    public static String formatPublishDateTime(String begin) {

        SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault());
        SimpleDateFormat outDate = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

        String time = "";
        try {
            Date date = sDate.parse(begin);
            Date currentdate = new Date(System.currentTimeMillis());

            long diff = currentdate.getTime() - date.getTime();
            if (diff < 1000 * 60 * 60) {
                // 一个小时内
                time = "刚刚";
            } else if (diff < 1000 * 60 * 60 * 24) {
                // 一天内
                // 1h
                long hours = diff / (1000 * 60 * 60);
                time = hours + " 小时 前";
            } else if (diff < 1000 * 60 * 60 * 24 * 7) {
                // 7天内
                // 1d
                long days = diff / (1000 * 60 * 60 * 24);
                time = days + " 天 前";
            } else {
                time = outDate.format(date);
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return time;
    }

    /**
     * 将标准时间转换成时间戳的形式
     * @param times
     * @return
     */
    public static long timeToTimeStamp(String times){
        if (times==null){
            return -1;
        }else{
            SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault());
            Date date ;
            try {
                date = sDate.parse(times);
                return date.getTime();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return -1;
    }


    /***
     * 时间戳转标准时间
     * @param times
     * @return
     */
    public static String timeStampToTime(long times){
        if (times==-1){
            return null;
        }else{
            return  new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).format(new Date(times * 1000));
        }
    }
}
