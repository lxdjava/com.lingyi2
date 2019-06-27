package com.lingyi.utils;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter@Getter@ToString
public class PageBean<T> {
    /*��ǰҳ*/
    private Integer currentPage;
    /*һҳ����������*/
    private Integer pageSize;
    /*����Ҫ�ӵڼ������ݿ�ʼ��*/
    private Integer index;
    /*�ܼ�¼��*/
    private Integer totalCount;
    /*��ҳ��*/
    private Integer totalPage;
    /*��ǰҳ������*/
    private List<T> list;

    /*�����ǰҳû������,Ĭ������Ϊ��1ҳ*/
    public void setCurrentPage(Integer currentPage) {
        if (currentPage == null) {
            currentPage = 1;
        }
        this.currentPage = currentPage;
    }
    /*���û�����õ�ǰҳ�ܼ�¼����,����Ĭ�ϼ�¼��Ϊһҳ5��*/
    public void setPageSize(Integer pageSize) {
        if (pageSize == null) {
            pageSize = 10;
        }
        this.pageSize = pageSize;
    }
    /*����Ҫ�ӵڼ������ݿ�ʼ��*/
    public Integer getIndex() {
        return (currentPage-1)*pageSize;
    }
    /*������ҳ��*/
    public Integer getTotalPage() {
        double ceil = Math.ceil(totalCount * 1.0 / pageSize);
        return (int)ceil;
    }
}
