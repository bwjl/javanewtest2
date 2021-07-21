package com.bear.javanewtest2.plugin;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: bear
 * @Date: 2021/7/21 11:52 下午
 * @Description: Gsonformat 插件生成实体类
 */

@NoArgsConstructor
@Data
public class GsonFormatDemo {
    @JsonProperty("designWidth")
    private Integer designWidth;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("width")
    private String width;
    @JsonProperty("height")
    private String height;
    @JsonProperty("upDownSpace")
    private Integer upDownSpace;
    @JsonProperty("leftRightSpace")
    private Integer leftRightSpace;
    @JsonProperty("backgroundImage")
    private String backgroundImage;
    @JsonProperty("backgroundColor")
    private String backgroundColor;
    @JsonProperty("machine_name")
    private String machineName;
    @JsonProperty("industry")
    private List<Integer> industry;
    @JsonProperty("texture")
    private List<Integer> texture;
    @JsonProperty("per_roll_num")
    private Integer perRollNum;
    @JsonProperty("borderRadius")
    private Integer borderRadius;
    @JsonProperty("els")
    private List<ElsDTO> els;
    @JsonProperty("price_ids")
    private List<Integer> priceIds;
    @JsonProperty("template_name")
    private String templateName;
    @JsonProperty("template_code")
    private String templateCode;
    @JsonProperty("goods_spu")
    private String goodsSpu;
    @JsonProperty("mininum_purchase")
    private String mininumPurchase;
    @JsonProperty("mininum_variable")
    private String mininumVariable;
    @JsonProperty("goods_name")
    private String goodsName;
    @JsonProperty("status")
    private String status;
    @JsonProperty("ColorList")
    private List<?> colorList;
    @JsonProperty("template_id")
    private Integer templateId;
    @JsonProperty("machine_id")
    private Integer machineId;
    @JsonProperty("craft_id")
    private Integer craftId;
    @JsonProperty("sale_name")
    private String saleName;

    @NoArgsConstructor
    @Data
    public static class ElsDTO {
        @JsonProperty("type")
        private Integer type;
        @JsonProperty("width")
        private String width;
        @JsonProperty("height")
        private String height;
        @JsonProperty("x")
        private Integer x;
        @JsonProperty("y")
        private Integer y;
        @JsonProperty("src")
        private String src;
        @JsonProperty("objectFit")
        private String objectFit;
        @JsonProperty("originWidth")
        private Integer originWidth;
        @JsonProperty("originHeight")
        private Integer originHeight;
        @JsonProperty("checkColorList")
        private List<?> checkColorList;
        @JsonProperty("zIndex")
        private String zIndex;
        @JsonProperty("borderColor")
        private String borderColor;
        @JsonProperty("borderStyle")
        private String borderStyle;
        @JsonProperty("borderWidth")
        private Integer borderWidth;
        @JsonProperty("borderRadius")
        private Integer borderRadius;
        @JsonProperty("backgroundColor")
        private String backgroundColor;
        @JsonProperty("backgroundImage")
        private String backgroundImage;
        @JsonProperty("backgroundSize")
        private String backgroundSize;
        @JsonProperty("backgorundRepeat")
        private String backgorundRepeat;
        @JsonProperty("backgroundPositon")
        private String backgroundPositon;
    }

    @Override
    public String toString() {
        return "GsonFormatDemo{" +
                "designWidth=" + designWidth +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", upDownSpace=" + upDownSpace +
                ", leftRightSpace=" + leftRightSpace +
                ", backgroundImage='" + backgroundImage + '\'' +
                ", backgroundColor='" + backgroundColor + '\'' +
                ", machineName='" + machineName + '\'' +
                ", industry=" + industry +
                ", texture=" + texture +
                ", perRollNum=" + perRollNum +
                ", borderRadius=" + borderRadius +
                ", els=" + els +
                ", priceIds=" + priceIds +
                ", templateName='" + templateName + '\'' +
                ", templateCode='" + templateCode + '\'' +
                ", goodsSpu='" + goodsSpu + '\'' +
                ", mininumPurchase='" + mininumPurchase + '\'' +
                ", mininumVariable='" + mininumVariable + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", status='" + status + '\'' +
                ", colorList=" + colorList +
                ", templateId=" + templateId +
                ", machineId=" + machineId +
                ", craftId=" + craftId +
                ", saleName='" + saleName + '\'' +
                '}';
    }
}
