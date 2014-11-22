package com.core.page;

import com.breakfast.constants.IConstants;
import org.apache.commons.lang3.StringUtils;
import org.jooq.Record;
import org.jooq.Result;

import java.util.Collections;
import java.util.List;

/**
 * Created by qingfeilee on 2014/11/21.
 */
public class Page<T extends Record>  {
    //分页参数
    protected int pageNo = 1;//当前页数
    protected int prePage = 1;//上一页
    protected int nextPage = 1;//下一页

    protected int pageSize = IConstants.DEFAULT_PAGE_SIZE;//每页多少条

    protected int totalPages = 1;//页数
    protected String orderBy = null;
    protected String order = null;
    protected boolean autoCount = true;

    //返回结果
    protected Result<T> result = null;
    protected int totalCount = 0;


    // 构造函数

    public Page() {
        super();
    }

    public Page(final int pageSize) {
        setPageSize(pageSize);
    }
    public Page(final int pageSize, final int pageNo){
        setPageNo(pageNo);
        setPageSize(pageSize);
    }
    public Page(final int pageSize, final boolean autoCount) {
        setPageSize(pageSize);
        this.autoCount = autoCount;
    }

    //查询参数函数

    /**
     * 获得当前页的页号,序号从1开始,默认为1.
     */
    public int getPageNo() {
        return pageNo;
    }

    /**
     * 设置当前页的页号,序号从1开始,低于1时自动调整为1.
     */
    public void setPageNo(final int pageNo) {
        this.pageNo = pageNo;

        if (pageNo < 1) {
            this.pageNo = 1;
        }
    }

    /**
     * 获得每页的记录数量,默认为1.
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 设置每页的记录数量,低于1时自动调整为1.
     */
    public void setPageSize(final int pageSize) {
        this.pageSize = pageSize;

        if (pageSize < 1) {
            this.pageSize = 1;
        }
    }

    /**
     * 根据pageNo和pageSize计算当前页第一条记录在总结果集中的位置,序号从1开始.
     */
    public int getFirst() {
        return ((pageNo - 1) * pageSize) + 1;
    }

    /**
     * 获得排序字段,无默认值.多个排序字段时用','分隔.
     */
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * 设置排序字段,多个排序字段时用','分隔.
     */
    public void setOrderBy(final String orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * 是否已设置排序字段,无默认值.
     */
    public boolean isOrderBySetted() {
        return StringUtils.isNotBlank(orderBy);
    }

    /**
     * 获得排序方向.
     */
    public String getOrder() {
        return order;
    }


    /**
     * 取得页内的记录列表.
     */
    public Result<T> getResult() {
        return result;
    }

    public void setResult(final Result<T> result) {
        this.result = result;
    }

    /**
     * 取得总记录数,默认值为-1.
     */
    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(final int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * 根据pageSize与totalCount计算总页数,默认值为-1.
     */
    public int getTotalPages() {
        if (totalCount < 0)
            return -1;

        int count = totalCount / pageSize;
        if (totalCount % pageSize > 0) {
            count++;
        }
        this.totalPages = count;
        return count;
    }

    /**
     * 是否还有下一页.
     */
    public boolean isHasNext() {
        return (pageNo + 1 <= getTotalPages());
    }

    /**
     * 取得下页的页号,序号从1开始.
     * 当前页为尾页时仍返回尾页序号.
     */
    public int getNextPage() {
        if (isHasNext())
            this.nextPage = pageNo + 1;
        else
            this.nextPage = pageNo;

        return this.nextPage;
    }

    /**
     * 是否还有上一页.
     */
    public boolean isHasPre() {
        return (pageNo - 1 >= 1);
    }

    /**
     * 取得上页的页号,序号从1开始.
     * 当前页为首页时返回首页序号.
     */
    public int getPrePage() {
        if (isHasPre())
            this.prePage = pageNo - 1;
        else
            this.prePage = pageNo;

        return this.prePage;
    }
}
