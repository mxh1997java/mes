package maxinhai.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 功能描述: 设备
 * @Param:
 * @Return:
 * @Author: XinHai.Ma
 * @Date: 2020/11/17 23:13
 */
@Entity
@Table(name = "EQUIPMENT")
public class Equipment extends BaseEntity {

    private String code;

    private String name;

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
