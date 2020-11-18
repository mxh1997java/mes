package maxinhai.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 功能描述: 工厂
 * @Param:
 * @Return:
 * @Author: XinHai.Ma
 * @Date: 2020/11/17 23:09
 */
@Entity
@Table(name = "FACTORY")
public class Factory extends BaseEntity {

    /**
     * 功能描述: 工厂编码
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 21:55
     */
    private String code;
    /**
     * 功能描述: 工厂名称
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 21:55
     */
    private String name;

    /**
     * 功能描述: 地址
     * @Param:
     * @Return:
     * @Author: XinHai.Ma
     * @Date: 2020/11/18 21:56
     */
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
