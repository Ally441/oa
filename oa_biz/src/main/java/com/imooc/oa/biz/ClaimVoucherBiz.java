package com.imooc.oa.biz;

import com.imooc.oa.entity.ClaimVoucher;
import com.imooc.oa.entity.ClaimVoucherItem;
import com.imooc.oa.entity.DealRecord;

import java.util.List;

public interface ClaimVoucherBiz {
    void save(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);//填写报销单

    ClaimVoucher get(int id);//查询报销单
    List<ClaimVoucherItem> getItems(int cvid);//查询报销单明细
    List<DealRecord> getRecords(int cvid);//查询处理记录

    List<ClaimVoucher> getForSelf(String sn);//个人报销单
    List<ClaimVoucher> getForDeal(String sn);//待处理的报销单

    void update(ClaimVoucher claimVoucher,List<ClaimVoucherItem> list);//修改报销单

    void submit(int id);
    void deal(DealRecord dealRecord);
}
