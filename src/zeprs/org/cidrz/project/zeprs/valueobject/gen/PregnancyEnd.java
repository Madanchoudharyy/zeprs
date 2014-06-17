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
 * JavaBean PregnancyEnd generated from database;
 * generated by DynasiteSourceGenerator, inspired by XslBeanGenerator by Klaus Berg.
 *
 * @author Chris Kelley
 *         Date: 2014-06-17
 *         Time: 15:29:14
 *         Form Name: Pregnancy Conclusion
 *         Form Id: 71
 */

/**
 * @hibernate.joined-subclass table="pregnancyend"
 * @hibernate.joined-subclass-key column="id"
 */
public class PregnancyEnd extends EncounterData {

private Boolean field1367;	//is_terminated_pregnancy
private Date field1369;	//date_pregnancy_ended
private String field1368;	//comments_preg_conclusion_1368


 /**
  * @return
  * @hibernate.property column="is_terminated_pregnancy"
  */
    public Boolean getField1367() {
        return this.field1367;
    }

    public void setField1367(Boolean field1367) {
        this.field1367 = field1367;
    }





 /**
  * @return
  * @hibernate.property column="date_pregnancy_ended"
  */
    public Date getField1369() {
        return this.field1369;
    }

    public void setField1369(Date field1369) {
        this.field1369 = field1369;
    }





 /**
  * @return
  * @hibernate.property column="comments_preg_conclusion_1368" type="text"
  */
    public String getField1368() {
        return this.field1368;
    }

    public void setField1368(String field1368) {
        this.field1368 = field1368;
    }





}
