package maxinhai.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "PRODUCT_ORDER_BOM")
public class ProductOrderBom extends BaseEntity {

    /**
     * 功能描述: bom编码
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:43
     */
    private String code;

    /**
     * 功能描述: bom名称
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:43
     */
    private String name;

    /**
     * 功能描述: 物料
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:42
     */
    @ManyToOne
    private Materials materials;

    /**
     * 功能描述: 计量单位
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:42
     */
    @ManyToOne
    private MeasureUnit unit;

    private BigDecimal qty;

    private Integer isCritical;// 是否关重件 0:否 1:是

    /**
     * 功能描述: 产品编码
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:42
     */
    private String productCode;

    private String productName;

    private Integer state;

    /**
     * 功能描述: 工序
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:42
     */
    @ManyToOne
    private RouteOperation operation;

    /**
     * 功能描述: 父物料
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:39
     */
    @ManyToOne
    private OrderBom parent;


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

    public Materials getMaterials() {
        return materials;
    }

    public void setMaterials(Materials materials) {
        this.materials = materials;
    }

    public MeasureUnit getUnit() {
        return unit;
    }

    public void setUnit(MeasureUnit unit) {
        this.unit = unit;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public Integer getIsCritical() {
        return isCritical;
    }

    public void setIsCritical(Integer isCritical) {
        this.isCritical = isCritical;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public RouteOperation getOperation() {
        return operation;
    }

    public void setOperation(RouteOperation operation) {
        this.operation = operation;
    }

    public OrderBom getParent() {
        return parent;
    }

    public void setParent(OrderBom parent) {
        this.parent = parent;
    }

}
