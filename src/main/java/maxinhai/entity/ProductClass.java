package maxinhai.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 功能描述: 产品类型
 * @Param:
 * @Return:
 * @Author: 15735400536
 * @Date: 2020/11/19 0:00
 */
@Entity
@Table(name = "PRODDUCT_CLASS")
public class ProductClass extends BaseEntity {
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
