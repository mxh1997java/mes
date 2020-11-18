package maxinhai.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT_ROUTE_LINE")
public class ProductRouteLine extends BaseEntity {

    private String code;

    private String name;

    /**
     * 功能描述: 工艺路线
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:30
     */
    private String routeLineId;

    /**
     * 功能描述: 工艺路线版本
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:32
     */
    private String routeLineVersion;

    /**
     * 功能描述: 产品名称
     * @Param:
     * @Return:
     * @Author: 15735400536
     * @Date: 2020/11/18 23:31
     */
    private String productName;

    private String productCode;

    @ManyToOne
    private Materials materials;

    @ManyToOne
    private WorkCenter workCenter;

    @ManyToOne
    private Factory factory;

    public WorkCenter getWorkCenter() {
        return workCenter;
    }

    public void setWorkCenter(WorkCenter workCenter) {
        this.workCenter = workCenter;
    }

    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
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

    public String getRouteLineId() {
        return routeLineId;
    }

    public void setRouteLineId(String routeLineId) {
        this.routeLineId = routeLineId;
    }

    public String getRouteLineVersion() {
        return routeLineVersion;
    }

    public void setRouteLineVersion(String routeLineVersion) {
        this.routeLineVersion = routeLineVersion;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Materials getMaterials() {
        return materials;
    }

    public void setMaterials(Materials materials) {
        this.materials = materials;
    }

}
