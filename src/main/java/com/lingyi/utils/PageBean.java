package com.lingyi.utils;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter@Getter@ToString
public class PageBean<T> {
    /*当前页*/
    private Integer currentPage;
    /*一页多少条数据*/
    private Integer pageSize;
    /*计算要从第几条数据开始查*/
    private Integer index;
    /*总记录数*/
    private Integer totalCount;
    /*总页数*/
    private Integer totalPage;
    /*当前页的数据*/
    private List<T> list;

    /*如果当前页没有设置,默认设置为第1页*/
    public void setCurrentPage(Integer currentPage) {
        if (currentPage == null) {
            currentPage = 1;
        }
        this.currentPage = currentPage;
    }
    /*如果没有设置当前页总记录数据,设置默认记录数为一页5条*/
    public void setPageSize(Integer pageSize) {
        if (pageSize == null) {
            pageSize = 10;
        }
        this.pageSize = pageSize;
    }
    /*计算要从第几条数据开始查*/
    public Integer getIndex() {
        return (currentPage-1)*pageSize;
    }
    /*计算总页数*/
    public Integer getTotalPage() {
        double ceil = Math.ceil(totalCount * 1.0 / pageSize);
        return (int)ceil;
    }
}
