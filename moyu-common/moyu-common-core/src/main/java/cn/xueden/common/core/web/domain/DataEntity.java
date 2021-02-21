package cn.xueden.common.core.web.domain;



import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**功能描述：数据Entity类
 * @Auther:梁志杰
 * @Date:2020/9/24
 * @Description:cn.xueden.common.core.web.domain
 * @version:1.0
 */
public class DataEntity <T extends Model<T>> extends BaseEntity<T>{
    private static final long serialVersionUID = 1L;

    /**
     * 创建者
     */
    @TableField(value = "create_by",fill = FieldFill.INSERT)
    protected Long createId;

    /**
     * 创建日期
     */
    @TableField(value = "create_date",fill = FieldFill.INSERT)
    protected Date createDate;

    /**
     * 更新者
     */
    @TableField(value = "update_by",fill = FieldFill.INSERT_UPDATE)
    protected Long updateId;

    /**
     * 更新日期
     */
    @TableField(value = "update_date",fill = FieldFill.INSERT_UPDATE)
    protected Date updateDate;

    /**
     * 删除标记（Y：正常；N：删除；A：审核；）
     */
    @TableField(value = "del_flag")
    protected Boolean delFlag;

    /**
     * 备注
     */
    protected String remarks;

    /**
     * 创建着
     */
    @TableField(exist = false)
    protected SysUser createUser;

    /**
     * 修改者
     */
    @TableField(exist = false)
    protected SysUser updateUser;


    public DataEntity() {
        super();
        this.delFlag = false;
    }

    public DataEntity(Long id) {
        super(id);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public SysUser getCreateUser() {
        return createUser;
    }

    public void setCreateUser(SysUser createUser) {
        this.createUser = createUser;
    }

    public SysUser getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(SysUser updateUser) {
        this.updateUser = updateUser;
    }
}
