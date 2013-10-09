package org.cidrz.project.zeprs.valueobject.gen;

import org.cidrz.project.zeprs.valueobject.gen.*;
import org.cidrz.project.zeprs.valueobject.EncounterData;
import org.cidrz.webapp.dynasite.valueobject.Patient;
import java.sql.Date;
import java.util.Set;
import java.sql.Time;
import org.cidrz.webapp.dynasite.valueobject.AuditInfo;
import java.util.TreeSet;

/**
 * JavaBean Rpr generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2007-08-14
 *         Time: 18:08:14
 *         Form Name: RPR
 *         Form Id: 90
 */

/**
 * @hibernate.joined-subclass table="rpr"
 * @hibernate.joined-subclass-key column="id"
 */
public class Rpr extends EncounterData {

private Date field2006;	//dateRprRequest
private Integer field1563;	//rpr_result
private Date field1562;	//rpr_date
private Integer field1565;	//rpr_drug
private Float field1570;	//rpr_dosage
private Date field1564;	//rpr_treatment_date
private Integer field2007;	//partner_treatment
private String field1764;	//rpr_comments


 /**
  * @return
  * @hibernate.property column="dateRprRequest"
  */
    public Date getField2006() {
        return this.field2006;
    }

    public void setField2006(Date field2006) {
        this.field2006 = field2006;
    }





 /**
  * @return
  * @hibernate.property column="rpr_result"
  */
    public Integer getField1563() {
        return this.field1563;
    }

    public void setField1563(Integer field1563) {
        this.field1563 = field1563;
    }





 /**
  * @return
  * @hibernate.property column="rpr_date"
  */
    public Date getField1562() {
        return this.field1562;
    }

    public void setField1562(Date field1562) {
        this.field1562 = field1562;
    }





 /**
  * @return
  * @hibernate.property column="rpr_drug"
  */
    public Integer getField1565() {
        return this.field1565;
    }

    public void setField1565(Integer field1565) {
        this.field1565 = field1565;
    }





 /**
  * @return
  * @hibernate.property column="rpr_dosage"
  */
    public Float getField1570() {
        return this.field1570;
    }

    public void setField1570(Float field1570) {
        this.field1570 = field1570;
    }





 /**
  * @return
  * @hibernate.property column="rpr_treatment_date"
  */
    public Date getField1564() {
        return this.field1564;
    }

    public void setField1564(Date field1564) {
        this.field1564 = field1564;
    }





 /**
  * @return
  * @hibernate.property column="partner_treatment"
  */
    public Integer getField2007() {
        return this.field2007;
    }

    public void setField2007(Integer field2007) {
        this.field2007 = field2007;
    }





 /**
  * @return
  * @hibernate.property column="rpr_comments" type="text"
  */
    public String getField1764() {
        return this.field1764;
    }

    public void setField1764(String field1764) {
        this.field1764 = field1764;
    }





}