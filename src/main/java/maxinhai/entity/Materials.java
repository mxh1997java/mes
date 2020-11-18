package maxinhai.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 功能描述: 物料
 * @Param:
 * @Return:
 * @Author: XinHai.Ma
 * @Date: 2020/11/17 23:18
 */
@Entity
@Table(name = "MATERIALS")
public class Materials extends BaseEntity {

    private String code;

    private String name;

    /**
     * 功能描述: 外文名称
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:52
     */
    private String foreignName;

    @ManyToOne
    private MaterialsClass materialsClass;

    /**
     * 功能描述: <br>
     * @Param:
     * @Return: 
     * @Author: 15735400536
     * @Date: 2020/11/18 23:50
     */
    private String specification;
    
    /**
     * 功能描述: 型号
     * @Param:
     * @Return: 
     * @Author: 15735400536
     * @Date: 2020/11/18 23:51
     */
    private String model;
    
    /**
     * 功能描述: 品牌
     * @Param: 
     * @Return: 
     * @Author: 15735400536
     * @Date: 2020/11/18 23:51
     */
    private String brand;

    /**
     * 功能描述: 计量单位
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:52
     */
    private String unit;

    @ManyToOne
    private MeasureUnit unitGid;

    private Integer controlCode;// 控制码 1 批次件 2 序列件 4标准件 5 供应商类

    /**
     * 功能描述: 产品类型
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:54
     */
    private Integer productType;

    public String getForeignName() {
        return foreignName;
    }

    public void setForeignName(String foreignName) {
        this.foreignName = foreignName;
    }

    public MaterialsClass getMaterialsClass() {
        return materialsClass;
    }

    public void setMaterialsClass(MaterialsClass materialsClass) {
        this.materialsClass = materialsClass;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public MeasureUnit getUnitGid() {
        return unitGid;
    }

    public void setUnitGid(MeasureUnit unitGid) {
        this.unitGid = unitGid;
    }

    public Integer getControlCode() {
        return controlCode;
    }

    public void setControlCode(Integer controlCode) {
        this.controlCode = controlCode;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
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
