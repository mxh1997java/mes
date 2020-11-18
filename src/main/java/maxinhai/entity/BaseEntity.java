package maxinhai.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 功能描述: 基础类
 * @Param:
 * @Return:
 * @Author: XinHai.Ma
 * @Date: 2020/11/16 23:07
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 8530202658667667146L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GID", length = 11)
    protected Long gid;

    @Column(name = "DESCRIPTION", length = 50)
    protected String description;

    @Column(name = "IS_DELETE", length = 1)
    protected Integer isDelete;

    @Column(name = "IS_ACTIVE", length = 1)
    protected Integer isActive;

    @Column(name = "CREATE_TIME")
    protected Date createTime;

    @Column(name = "EDIT_TIME")
    protected Date editTime;

    @Column(name = "CREATOR", length = 20)
    protected String creator;

    @Column(name = "EDITOR", length = 20)
    protected String editor;

    @Column(name = "uda1", length = 20)
    protected String uda1;

    @Column(name = "uda2", length = 20)
    protected String uda2;

    @Column(name = "uda3", length = 20)
    protected String uda3;

    @Column(name = "uda4", length = 20)
    protected String uda4;

    @Column(name = "uda5", length = 20)
    protected String uda5;

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getEditTime() {
        return editTime;
    }

    public void setEditTime(Date editTime) {
        this.editTime = editTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getUda1() {
        return uda1;
    }

    public void setUda1(String uda1) {
        this.uda1 = uda1;
    }

    public String getUda2() {
        return uda2;
    }

    public void setUda2(String uda2) {
        this.uda2 = uda2;
    }

    public String getUda3() {
        return uda3;
    }

    public void setUda3(String uda3) {
        this.uda3 = uda3;
    }

    public String getUda4() {
        return uda4;
    }

    public void setUda4(String uda4) {
        this.uda4 = uda4;
    }

    public String getUda5() {
        return uda5;
    }

    public void setUda5(String uda5) {
        this.uda5 = uda5;
    }
}
