package maxinhai.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 功能描述: 人员
 * @Param:
 * @Return:
 * @Author: XinHai.Ma
 * @Date: 2020/11/17 23:19
 */
@Entity
@Table(name = "PERSONNEL_CLASS")
public class PersonnelClass extends BaseEntity {
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
