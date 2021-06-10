package com.bear.javanewtest2.excel.bo;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Builder;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/6/10 4:07 下午
 * @Description:
 */

@Data
@Builder
public class GoodsBo {

    @ExcelProperty("烟草条码")
    private String barCode;

    @ExcelProperty("品名")
    private String goodsName;

    @ExcelProperty("品牌")
    private String brand;
}
