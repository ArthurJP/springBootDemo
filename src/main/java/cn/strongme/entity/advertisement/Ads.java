package cn.strongme.entity.advertisement;

import cn.strongme.entity.common.BaseEntity;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class Ads extends BaseEntity<Ads> {



    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ads.type
     *
     * @mbg.generated
     */
    private String type;


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ads.alt
     *
     * @mbg.generated
     */
    private String alt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ads.url
     *
     * @mbg.generated
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ads.img_src
     *
     * @mbg.generated
     */
    private String imgSrc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ads.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ads.sort
     *
     * @mbg.generated
     */
    private int sort;


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ads.operator_id
     *
     * @mbg.generated
     */
    private String operatorID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ads.status
     *
     * @mbg.generated
     */
    private int status;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ads
     *
     * @mbg.generated
     */
    public Ads() {
        super();
    }

    public Ads(String id){
        this.id=id;
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ads.type
     *
     * @return the value of ads.type
     *
     * @mbg.generated
     */
    @NotNull
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ads.type
     *
     * @param type the value for ads.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ads.alt
     *
     * @return the value of ads.alt
     *
     * @mbg.generated
     */
    @NotNull
    public String getAlt() {
        return alt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ads.alt
     *
     * @param alt the value for ads.alt
     *
     * @mbg.generated
     */
    public void setAlt(String alt) {
        this.alt = alt == null ? null : alt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ads.url
     *
     * @return the value of ads.url
     *
     * @mbg.generated
     */
    @NotNull
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ads.url
     *
     * @param url the value for ads.url
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ads.img_src
     *
     * @return the value of ads.img_src
     *
     * @mbg.generated
     */
    @NotNull
    public String getImgSrc() {
        return imgSrc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ads.img_src
     *
     * @param imgSrc the value for ads.img_src
     *
     * @mbg.generated
     */
    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc == null ? null : imgSrc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ads.remark
     *
     * @return the value of ads.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ads.remark
     *
     * @param remark the value for ads.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ads.sort
     *
     * @return the value of ads.sort
     *
     * @mbg.generated
     */
    @NotNull
    public int getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ads.sort
     *
     * @param sort the value for ads.sort
     *
     * @mbg.generated
     */
    public void setSort(int sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ads.create_date
     *
     * @return the value of ads.create_date
     *
     * @mbg.generated
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ads.create_date
     *
     * @param createDate the value for ads.create_date
     *
     * @mbg.generated
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }


    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ads.operator_id
     *
     * @return the value of ads.operator_id
     *
     * @mbg.generated
     */
    public String getOperatorId() {
        return operatorID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ads.operator_id
     *
     * @param operatorId the value for ads.operator_id
     *
     * @mbg.generated
     */
    public void setOperatorId(String operatorId) {
        this.operatorID = operatorId == null ? null : operatorId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ads.status
     *
     * @return the value of ads.status
     *
     * @mbg.generated
     */
    public int getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ads.status
     *
     * @param status the value for ads.status
     *
     * @mbg.generated
     */
    public void setStatus(int status) {
        this.status = status;
    }
}