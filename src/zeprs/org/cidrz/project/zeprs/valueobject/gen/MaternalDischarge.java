package org.cidrz.project.zeprs.valueobject.gen;

import org.cidrz.project.zeprs.valueobject.gen.*;
import org.cidrz.project.zeprs.valueobject.EncounterData;
import org.cidrz.webapp.dynasite.valueobject.Patient;
import java.sql.Date;
import java.util.Set;
import java.sql.Time;
import java.sql.Timestamp;
import org.cidrz.webapp.dynasite.valueobject.AuditInfo;
import java.util.TreeSet;

/**
 * JavaBean MaternalDischarge generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-06-17
 *         Time: 15:29:14
 *         Form Name: Maternal Discharge Summary
 *         Form Id: 68
 */

/**
 * @hibernate.joined-subclass table="maternaldischarge"
 * @hibernate.joined-subclass-key column="id"
 */
public class MaternalDischarge extends EncounterData {

private transient Byte field576;	//breast_feedi_576
private Integer field1791;	//feeding_type
private Byte field577;	//bonding_well_577
private Boolean field1650;	//cs
private Integer field578;	//involution_uterus_578
private transient Integer field582;	//outcome_of_mother_582
private Integer field66;	//postpartum_i_66
private Integer field584;	//postpartum_complications_584
private Byte field585;	//mother_receive_vit_a_585
private Byte field1886;	//patient_received_arv
private Integer field586;	//medication_586
private String field587;	//medication_other_587
private transient Byte field588;	//unplanned_pregnancy_588
private transient Integer field1205;	//if_cs_cond_wound_1205
private transient String field1206;	//if_cs_cond_other_1206
private Byte field594;	//family_planning_discussed_594
private String field595;	//treatment_on_discharge_595
private Integer field260;	//general_condition_260
private String field597;	//comments_maternal_discharge_597
private Integer field1654;	//maternal_summary_discharge
private Integer field1349;	//priority_of_referral
private Integer field1620;	//transport
private Integer field592;	//reason_for_referral_592
private String field1202;	//reason_for_referral_1202
private Date field1825;	//date_followup_visit
private Integer field1826;	//place_followup_visit
private Byte field598;	//autopsy_requested_598
private Integer field599;	//autopsy_consent_599






 /**
  * @return
  * @hibernate.property column="feeding_type"
  */
    public Integer getField1791() {
        return this.field1791;
    }

    public void setField1791(Integer field1791) {
        this.field1791 = field1791;
    }





 /**
  * @return
  * @hibernate.property column="bonding_well_577"
  */
    public Byte getField577() {
        return this.field577;
    }

    public void setField577(Byte field577) {
        this.field577 = field577;
    }





 /**
  * @return
  * @hibernate.property column="cs"
  */
    public Boolean getField1650() {
        return this.field1650;
    }

    public void setField1650(Boolean field1650) {
        this.field1650 = field1650;
    }





 /**
  * @return
  * @hibernate.property column="involution_uterus_578"
  */
    public Integer getField578() {
        return this.field578;
    }

    public void setField578(Integer field578) {
        this.field578 = field578;
    }









 /**
  * @return
  * @hibernate.property column="postpartum_i_66"
  */
    public Integer getField66() {
        return this.field66;
    }

    public void setField66(Integer field66) {
        this.field66 = field66;
    }





 /**
  * @return
  * @hibernate.property column="postpartum_complications_584"
  */
    public Integer getField584() {
        return this.field584;
    }

    public void setField584(Integer field584) {
        this.field584 = field584;
    }





 /**
  * @return
  * @hibernate.property column="mother_receive_vit_a_585"
  */
    public Byte getField585() {
        return this.field585;
    }

    public void setField585(Byte field585) {
        this.field585 = field585;
    }





 /**
  * @return
  * @hibernate.property column="patient_received_arv"
  */
    public Byte getField1886() {
        return this.field1886;
    }

    public void setField1886(Byte field1886) {
        this.field1886 = field1886;
    }





 /**
  * @return
  * @hibernate.property column="medication_586"
  */
    public Integer getField586() {
        return this.field586;
    }

    public void setField586(Integer field586) {
        this.field586 = field586;
    }





 /**
  * @return
  * @hibernate.property column="medication_other_587" type="text"
  */
    public String getField587() {
        return this.field587;
    }

    public void setField587(String field587) {
        this.field587 = field587;
    }

















 /**
  * @return
  * @hibernate.property column="family_planning_discussed_594"
  */
    public Byte getField594() {
        return this.field594;
    }

    public void setField594(Byte field594) {
        this.field594 = field594;
    }





 /**
  * @return
  * @hibernate.property column="treatment_on_discharge_595" type="text"
  */
    public String getField595() {
        return this.field595;
    }

    public void setField595(String field595) {
        this.field595 = field595;
    }





 /**
  * @return
  * @hibernate.property column="general_condition_260"
  */
    public Integer getField260() {
        return this.field260;
    }

    public void setField260(Integer field260) {
        this.field260 = field260;
    }





 /**
  * @return
  * @hibernate.property column="comments_maternal_discharge_597" type="text"
  */
    public String getField597() {
        return this.field597;
    }

    public void setField597(String field597) {
        this.field597 = field597;
    }





 /**
  * @return
  * @hibernate.property column="maternal_summary_discharge"
  */
    public Integer getField1654() {
        return this.field1654;
    }

    public void setField1654(Integer field1654) {
        this.field1654 = field1654;
    }





 /**
  * @return
  * @hibernate.property column="priority_of_referral"
  */
    public Integer getField1349() {
        return this.field1349;
    }

    public void setField1349(Integer field1349) {
        this.field1349 = field1349;
    }





 /**
  * @return
  * @hibernate.property column="transport"
  */
    public Integer getField1620() {
        return this.field1620;
    }

    public void setField1620(Integer field1620) {
        this.field1620 = field1620;
    }





 /**
  * @return
  * @hibernate.property column="reason_for_referral_592"
  */
    public Integer getField592() {
        return this.field592;
    }

    public void setField592(Integer field592) {
        this.field592 = field592;
    }





 /**
  * @return
  * @hibernate.property column="reason_for_referral_1202" type="text"
  */
    public String getField1202() {
        return this.field1202;
    }

    public void setField1202(String field1202) {
        this.field1202 = field1202;
    }





 /**
  * @return
  * @hibernate.property column="date_followup_visit"
  */
    public Date getField1825() {
        return this.field1825;
    }

    public void setField1825(Date field1825) {
        this.field1825 = field1825;
    }





 /**
  * @return
  * @hibernate.property column="place_followup_visit"
  */
    public Integer getField1826() {
        return this.field1826;
    }

    public void setField1826(Integer field1826) {
        this.field1826 = field1826;
    }





 /**
  * @return
  * @hibernate.property column="autopsy_requested_598"
  */
    public Byte getField598() {
        return this.field598;
    }

    public void setField598(Byte field598) {
        this.field598 = field598;
    }





 /**
  * @return
  * @hibernate.property column="autopsy_consent_599"
  */
    public Integer getField599() {
        return this.field599;
    }

    public void setField599(Integer field599) {
        this.field599 = field599;
    }





}
