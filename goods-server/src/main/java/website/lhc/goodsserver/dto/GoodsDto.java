package website.lhc.goodsserver.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @ProjectName: coding
 * @Package: website.lhc.goodsserver
 * @ClassName: GoodsVo
 * @Author: lhc
 * @Description: TODO
 * @Date: 2020/5/17 上午 12:56
 */
public class GoodsDto {

    @NotBlank()
    private String name;
    @NotNull
    private Integer count;
    @NotNull
    private Integer type;
    @NotNull
    private Boolean imported;
    @NotNull
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Boolean getImported() {
        return imported;
    }

    public void setImported(Boolean imported) {
        this.imported = imported;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
