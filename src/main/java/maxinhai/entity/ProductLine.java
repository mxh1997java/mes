package maxinhai.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 功能描述: 产线
 * @Param:
 * @Return:
 * @Author: 15735400536
 * @Date: 2020/11/19 0:00
 */
@Entity
@Table(name = "PRODDUCT_LINE")
public class ProductLine extends BaseEntity {

    private String code;

    private String name;

    @ManyToOne
    private ProductLineClass productLineClass;

    @ManyToOne
    private WorkCenter workCenter;

    public ProductLineClass getProductLineClass() {
        return productLineClass;
    }

    public void setProductLineClass(ProductLineClass productLineClass) {
        this.productLineClass = productLineClass;
    }

    public WorkCenter getWorkCenter() {
        return workCenter;
    }

    public void setWorkCenter(WorkCenter workCenter) {
        this.workCenter = workCenter;
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
