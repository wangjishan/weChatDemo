package com.emmanuel.wechatdemo.bean;

import java.util.List;

/**
 * Created by user on 2016/8/16.
 */
public class ShuoShuo {

    public String content;
    public String time;
    public String address;
    public User user;
    public List<String>zanList; //点赞的人的列表
    public List<String>picList; //照片
    public List<Comment>commentList; //评论

}