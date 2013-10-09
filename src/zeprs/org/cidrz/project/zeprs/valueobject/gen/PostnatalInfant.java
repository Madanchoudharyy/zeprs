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
 * JavaBean PostnatalInfant generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2009-08-11
 *         Time: 07:53:53
 *         Form Name: Postnatal Infant Visit
 *         Form Id: 86
 */

/**
 * @hibernate.joined-subclass table="postnatalinfant"
 * @hibernate.joined-subclass-key column="id"
 */
public class PostnatalInfant extends EncounterData {

private Integer field601;	//postnatal_visit_601
private transient String field1182;	//surname_1182
private transient String field677;	//forenames_677
private transient String field678;	//infants_zep_678
private Integer field1470;	//infant_status
private Integer field1471;	//reasons_death_infant
private String field1472;	//other_reasons_death_infant
private Float field679;	//weight_679
private Float field680;	//temperature_infant_680
private Integer field681;	//head_681
private String field682;	//head_other_682
private Integer field530;	//head_circumf_530
private Integer field523;	//eyes_523
private String field524;	//eyes_other_524
private Integer field686;	//ears_686
private String field687;	//ears_other_687
private Integer field526;	//mouth_526
private String field527;	//mouth_other_527
private Integer field690;	//neck_690
private String field691;	//neck_other_d_691
private Integer field692;	//abdomen_692
private String field693;	//abdomen_oth_693
private Integer field694;	//cord_at_followup_694
private String field695;	//cord_at_foll_desc695
private Integer field529;	//genitalia_529
private String field697;	//genitalia_other_697
private Integer field698;	//anus_698
private String field699;	//anus_other_699
private Integer field700;	//skin_700
private String field701;	//skin_other_701
private Integer field702;	//upper_limbs_702
private String field703;	//upper_limbs_other_703
private Integer field704;	//lower_limbs_704
private String field705;	//lower_limbs_other_705
private Integer field536;	//back_536
private String field537;	//back_other_537
private Integer field708;	//neurological_708
private String field709;	//neurological_other_709
private Byte field710;	//opv1_given_week_6_710
private Byte field711;	//dpt_1_given_week_6_711
private transient Byte field712;	//bcg_given_712
private Integer field1541;	//feeding
private Integer field1791;	//feeding_type
private Integer field1516;	//immunization_1
private Integer field1517;	//immunization_2
private Integer field1518;	//immunization_3
private Integer field1519;	//immunization_4
private Integer field1520;	//immunization_5
private Byte field1886;	//patient_received_arv
private Byte field2052;	//septrin_prescribed_today
private Boolean field1616;	//is_problem
private Integer field2050;	//infant_hiv_test
private Date field2051;	//hiv_test_date
private Integer field1866;	//hiv_test_result
private Boolean field1809;	//bowel_obstruction
private Boolean field1817;	//indigestion
private Boolean field1810;	//opthalmia_neonatorum
private Boolean field1811;	//dehydration
private Boolean field1812;	//umbilical_infection
private Boolean field1813;	//diarrhoea
private Integer field1816;	//disposition
private Date field1906;	//second_postnatal_visit_date


 /**
  * @return
  * @hibernate.property column="postnatal_visit_601"
  */
    public Integer getField601() {
        return this.field601;
    }

    public void setField601(Integer field601) {
        this.field601 = field601;
    }

















 /**
  * @return
  * @hibernate.property column="infant_status"
  */
    public Integer getField1470() {
        return this.field1470;
    }

    public void setField1470(Integer field1470) {
        this.field1470 = field1470;
    }





 /**
  * @return
  * @hibernate.property column="reasons_death_infant"
  */
    public Integer getField1471() {
        return this.field1471;
    }

    public void setField1471(Integer field1471) {
        this.field1471 = field1471;
    }





 /**
  * @return
  * @hibernate.property column="other_reasons_death_infant" type="text"
  */
    public String getField1472() {
        return this.field1472;
    }

    public void setField1472(String field1472) {
        this.field1472 = field1472;
    }





 /**
  * @return
  * @hibernate.property column="weight_679"
  */
    public Float getField679() {
        return this.field679;
    }

    public void setField679(Float field679) {
        this.field679 = field679;
    }





 /**
  * @return
  * @hibernate.property column="temperature_infant_680"
  */
    public Float getField680() {
        return this.field680;
    }

    public void setField680(Float field680) {
        this.field680 = field680;
    }





 /**
  * @return
  * @hibernate.property column="head_681"
  */
    public Integer getField681() {
        return this.field681;
    }

    public void setField681(Integer field681) {
        this.field681 = field681;
    }





 /**
  * @return
  * @hibernate.property column="head_other_682" type="text"
  */
    public String getField682() {
        return this.field682;
    }

    public void setField682(String field682) {
        this.field682 = field682;
    }





 /**
  * @return
  * @hibernate.property column="head_circumf_530"
  */
    public Integer getField530() {
        return this.field530;
    }

    public void setField530(Integer field530) {
        this.field530 = field530;
    }





 /**
  * @return
  * @hibernate.property column="eyes_523"
  */
    public Integer getField523() {
        return this.field523;
    }

    public void setField523(Integer field523) {
        this.field523 = field523;
    }





 /**
  * @return
  * @hibernate.property column="eyes_other_524" type="text"
  */
    public String getField524() {
        return this.field524;
    }

    public void setField524(String field524) {
        this.field524 = field524;
    }





 /**
  * @return
  * @hibernate.property column="ears_686"
  */
    public Integer getField686() {
        return this.field686;
    }

    public void setField686(Integer field686) {
        this.field686 = field686;
    }





 /**
  * @return
  * @hibernate.property column="ears_other_687" type="text"
  */
    public String getField687() {
        return this.field687;
    }

    public void setField687(String field687) {
        this.field687 = field687;
    }





 /**
  * @return
  * @hibernate.property column="mouth_526"
  */
    public Integer getField526() {
        return this.field526;
    }

    public void setField526(Integer field526) {
        this.field526 = field526;
    }





 /**
  * @return
  * @hibernate.property column="mouth_other_527" type="text"
  */
    public String getField527() {
        return this.field527;
    }

    public void setField527(String field527) {
        this.field527 = field527;
    }





 /**
  * @return
  * @hibernate.property column="neck_690"
  */
    public Integer getField690() {
        return this.field690;
    }

    public void setField690(Integer field690) {
        this.field690 = field690;
    }





 /**
  * @return
  * @hibernate.property column="neck_other_d_691" type="text"
  */
    public String getField691() {
        return this.field691;
    }

    public void setField691(String field691) {
        this.field691 = field691;
    }





 /**
  * @return
  * @hibernate.property column="abdomen_692"
  */
    public Integer getField692() {
        return this.field692;
    }

    public void setField692(Integer field692) {
        this.field692 = field692;
    }





 /**
  * @return
  * @hibernate.property column="abdomen_oth_693" type="text"
  */
    public String getField693() {
        return this.field693;
    }

    public void setField693(String field693) {
        this.field693 = field693;
    }





 /**
  * @return
  * @hibernate.property column="cord_at_followup_694"
  */
    public Integer getField694() {
        return this.field694;
    }

    public void setField694(Integer field694) {
        this.field694 = field694;
    }





 /**
  * @return
  * @hibernate.property column="cord_at_foll_desc695" type="text"
  */
    public String getField695() {
        return this.field695;
    }

    public void setField695(String field695) {
        this.field695 = field695;
    }





 /**
  * @return
  * @hibernate.property column="genitalia_529"
  */
    public Integer getField529() {
        return this.field529;
    }

    public void setField529(Integer field529) {
        this.field529 = field529;
    }





 /**
  * @return
  * @hibernate.property column="genitalia_other_697" type="text"
  */
    public String getField697() {
        return this.field697;
    }

    public void setField697(String field697) {
        this.field697 = field697;
    }





 /**
  * @return
  * @hibernate.property column="anus_698"
  */
    public Integer getField698() {
        return this.field698;
    }

    public void setField698(Integer field698) {
        this.field698 = field698;
    }





 /**
  * @return
  * @hibernate.property column="anus_other_699" type="text"
  */
    public String getField699() {
        return this.field699;
    }

    public void setField699(String field699) {
        this.field699 = field699;
    }





 /**
  * @return
  * @hibernate.property column="skin_700"
  */
    public Integer getField700() {
        return this.field700;
    }

    public void setField700(Integer field700) {
        this.field700 = field700;
    }





 /**
  * @return
  * @hibernate.property column="skin_other_701" type="text"
  */
    public String getField701() {
        return this.field701;
    }

    public void setField701(String field701) {
        this.field701 = field701;
    }





 /**
  * @return
  * @hibernate.property column="upper_limbs_702"
  */
    public Integer getField702() {
        return this.field702;
    }

    public void setField702(Integer field702) {
        this.field702 = field702;
    }





 /**
  * @return
  * @hibernate.property column="upper_limbs_other_703" type="text"
  */
    public String getField703() {
        return this.field703;
    }

    public void setField703(String field703) {
        this.field703 = field703;
    }





 /**
  * @return
  * @hibernate.property column="lower_limbs_704"
  */
    public Integer getField704() {
        return this.field704;
    }

    public void setField704(Integer field704) {
        this.field704 = field704;
    }





 /**
  * @return
  * @hibernate.property column="lower_limbs_other_705" type="text"
  */
    public String getField705() {
        return this.field705;
    }

    public void setField705(String field705) {
        this.field705 = field705;
    }





 /**
  * @return
  * @hibernate.property column="back_536"
  */
    public Integer getField536() {
        return this.field536;
    }

    public void setField536(Integer field536) {
        this.field536 = field536;
    }





 /**
  * @return
  * @hibernate.property column="back_other_537" type="text"
  */
    public String getField537() {
        return this.field537;
    }

    public void setField537(String field537) {
        this.field537 = field537;
    }





 /**
  * @return
  * @hibernate.property column="neurological_708"
  */
    public Integer getField708() {
        return this.field708;
    }

    public void setField708(Integer field708) {
        this.field708 = field708;
    }





 /**
  * @return
  * @hibernate.property column="neurological_other_709" type="text"
  */
    public String getField709() {
        return this.field709;
    }

    public void setField709(String field709) {
        this.field709 = field709;
    }





 /**
  * @return
  * @hibernate.property column="opv1_given_week_6_710"
  */
    public Byte getField710() {
        return this.field710;
    }

    public void setField710(Byte field710) {
        this.field710 = field710;
    }





 /**
  * @return
  * @hibernate.property column="dpt_1_given_week_6_711"
  */
    public Byte getField711() {
        return this.field711;
    }

    public void setField711(Byte field711) {
        this.field711 = field711;
    }









 /**
  * @return
  * @hibernate.property column="feeding"
  */
    public Integer getField1541() {
        return this.field1541;
    }

    public void setField1541(Integer field1541) {
        this.field1541 = field1541;
    }





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
  * @hibernate.property column="immunization_1"
  */
    public Integer getField1516() {
        return this.field1516;
    }

    public void setField1516(Integer field1516) {
        this.field1516 = field1516;
    }





 /**
  * @return
  * @hibernate.property column="immunization_2"
  */
    public Integer getField1517() {
        return this.field1517;
    }

    public void setField1517(Integer field1517) {
        this.field1517 = field1517;
    }





 /**
  * @return
  * @hibernate.property column="immunization_3"
  */
    public Integer getField1518() {
        return this.field1518;
    }

    public void setField1518(Integer field1518) {
        this.field1518 = field1518;
    }





 /**
  * @return
  * @hibernate.property column="immunization_4"
  */
    public Integer getField1519() {
        return this.field1519;
    }

    public void setField1519(Integer field1519) {
        this.field1519 = field1519;
    }





 /**
  * @return
  * @hibernate.property column="immunization_5"
  */
    public Integer getField1520() {
        return this.field1520;
    }

    public void setField1520(Integer field1520) {
        this.field1520 = field1520;
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
  * @hibernate.property column="septrin_prescribed_today"
  */
    public Byte getField2052() {
        return this.field2052;
    }

    public void setField2052(Byte field2052) {
        this.field2052 = field2052;
    }





 /**
  * @return
  * @hibernate.property column="is_problem"
  */
    public Boolean getField1616() {
        return this.field1616;
    }

    public void setField1616(Boolean field1616) {
        this.field1616 = field1616;
    }





 /**
  * @return
  * @hibernate.property column="infant_hiv_test"
  */
    public Integer getField2050() {
        return this.field2050;
    }

    public void setField2050(Integer field2050) {
        this.field2050 = field2050;
    }





 /**
  * @return
  * @hibernate.property column="hiv_test_date"
  */
    public Date getField2051() {
        return this.field2051;
    }

    public void setField2051(Date field2051) {
        this.field2051 = field2051;
    }





 /**
  * @return
  * @hibernate.property column="hiv_test_result"
  */
    public Integer getField1866() {
        return this.field1866;
    }

    public void setField1866(Integer field1866) {
        this.field1866 = field1866;
    }





 /**
  * @return
  * @hibernate.property column="bowel_obstruction"
  */
    public Boolean getField1809() {
        return this.field1809;
    }

    public void setField1809(Boolean field1809) {
        this.field1809 = field1809;
    }





 /**
  * @return
  * @hibernate.property column="indigestion"
  */
    public Boolean getField1817() {
        return this.field1817;
    }

    public void setField1817(Boolean field1817) {
        this.field1817 = field1817;
    }





 /**
  * @return
  * @hibernate.property column="opthalmia_neonatorum"
  */
    public Boolean getField1810() {
        return this.field1810;
    }

    public void setField1810(Boolean field1810) {
        this.field1810 = field1810;
    }





 /**
  * @return
  * @hibernate.property column="dehydration"
  */
    public Boolean getField1811() {
        return this.field1811;
    }

    public void setField1811(Boolean field1811) {
        this.field1811 = field1811;
    }





 /**
  * @return
  * @hibernate.property column="umbilical_infection"
  */
    public Boolean getField1812() {
        return this.field1812;
    }

    public void setField1812(Boolean field1812) {
        this.field1812 = field1812;
    }





 /**
  * @return
  * @hibernate.property column="diarrhoea"
  */
    public Boolean getField1813() {
        return this.field1813;
    }

    public void setField1813(Boolean field1813) {
        this.field1813 = field1813;
    }





 /**
  * @return
  * @hibernate.property column="disposition"
  */
    public Integer getField1816() {
        return this.field1816;
    }

    public void setField1816(Integer field1816) {
        this.field1816 = field1816;
    }





 /**
  * @return
  * @hibernate.property column="second_postnatal_visit_date"
  */
    public Date getField1906() {
        return this.field1906;
    }

    public void setField1906(Date field1906) {
        this.field1906 = field1906;
    }





}