package com.bear.javanewtest2.excel;

import com.alibaba.excel.EasyExcel;
import com.bear.javanewtest2.excel.bo.GoodsBo;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/6/10 4:07 下午
 * @Description:
 */

public class EasyExcelDemo {

    public final static Integer NUM = 100;

    public static void main(String[] args) {
        String fileName = "/Users/bear/Desktop/" + UUID.randomUUID().toString().replace("-", "") + ".xlsx";
        EasyExcel.write(fileName, GoodsBo.class).sheet("烟草商品").doWrite(getGoodsList());
    }

    public static List<GoodsBo> getGoodsList() {

        List<GoodsBo> list = new ArrayList<>();

        for (int i = 0; i < (NUM - 1); i++) {
            list.add(GoodsBo.builder().
                    goodsName("商品名称" + i).
                    barCode("123456789" + i).
                    brand("品牌" + i).
                    build());
        }
        return list;
    }
}
