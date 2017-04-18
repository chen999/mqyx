package com.psc.pt.dao.pacs;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.psc.pt.model.pacs.CaseListInfo;

public class CaseListInfoSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_list_info
     * @param record  Model for table case_list_info
     * @return   The combine SQL for table case_list_info
     *
     * @mbggenerated
     */
    public String insertSelective(CaseListInfo record) {
        BEGIN();
        INSERT_INTO("case_list_info");
        
        if (record.getStatus() != null) {
            VALUES("status", "#{status,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientName() != null) {
            VALUES("patient_name", "#{patientName,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientSex() != null) {
            VALUES("patient_sex", "#{patientSex,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientAge() != null) {
            VALUES("patient_age", "#{patientAge,jdbcType=INTEGER}");
        }
        
        if (record.getVisitType() != null) {
            VALUES("visit_type", "#{visitType,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientPhone() != null) {
            VALUES("patient_phone", "#{patientPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientNo() != null) {
            VALUES("patient_no", "#{patientNo,jdbcType=VARCHAR}");
        }
        
        if (record.getCheckNo() != null) {
            VALUES("check_no", "#{checkNo,jdbcType=VARCHAR}");
        }
        
        if (record.getCaseNo() != null) {
            VALUES("case_no", "#{caseNo,jdbcType=VARCHAR}");
        }
        
        if (record.getItem() != null) {
            VALUES("item", "#{item,jdbcType=VARCHAR}");
        }
        
        if (record.getModality() != null) {
            VALUES("modality", "#{modality,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorId() != null) {
            VALUES("doctor_id", "#{doctorId,jdbcType=BIGINT}");
        }
        
        if (record.getSendDoctorId() != null) {
            VALUES("send_doctor_id", "#{sendDoctorId,jdbcType=BIGINT}");
        }
        
        if (record.getSendDoctorName() != null) {
            VALUES("send_doctor_name", "#{sendDoctorName,jdbcType=VARCHAR}");
        }
        
        if (record.getSendHospitalId() != null) {
            VALUES("send_hospital_id", "#{sendHospitalId,jdbcType=BIGINT}");
        }
        
        if (record.getSendHospitalName() != null) {
            VALUES("send_hospital_name", "#{sendHospitalName,jdbcType=VARCHAR}");
        }
        
        if (record.getSendDate() != null) {
            VALUES("send_date", "#{sendDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGetDate() != null) {
            VALUES("get_date", "#{getDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDigDate() != null) {
            VALUES("dig_date", "#{digDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBackDate() != null) {
            VALUES("back_date", "#{backDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMissingTime() != null) {
            VALUES("missing_time", "#{missingTime,jdbcType=BIGINT}");
        }
        
        if (record.getInid() != null) {
            VALUES("inId", "#{inid,jdbcType=BIGINT}");
        }
        
        if (record.getIsDelete() != null) {
            VALUES("is_delete", "#{isDelete,jdbcType=CHAR}");
        }
        
        if (record.getIsAppoint() != null) {
            VALUES("is_appoint", "#{isAppoint,jdbcType=CHAR}");
        }
        
        if (record.getTemp1() != null) {
            VALUES("temp1", "#{temp1,jdbcType=VARCHAR}");
        }
        
        if (record.getTemp2() != null) {
            VALUES("temp2", "#{temp2,jdbcType=VARCHAR}");
        }
        
        if (record.getTemp3() != null) {
            VALUES("temp3", "#{temp3,jdbcType=VARCHAR}");
        }
        
        if (record.getTemp4() != null) {
            VALUES("temp4", "#{temp4,jdbcType=VARCHAR}");
        }
        
        if (record.getTemp5() != null) {
            VALUES("temp5", "#{temp5,jdbcType=VARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_list_info
     * @param record  Model for table case_list_info
     * @return   The combine SQL for table case_list_info
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(CaseListInfo record) {
        BEGIN();
        UPDATE("case_list_info");
        
        if (record.getStatus() != null) {
            SET("status = #{status,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientName() != null) {
            SET("patient_name = #{patientName,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientSex() != null) {
            SET("patient_sex = #{patientSex,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientAge() != null) {
            SET("patient_age = #{patientAge,jdbcType=INTEGER}");
        }
        
        if (record.getVisitType() != null) {
            SET("visit_type = #{visitType,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientPhone() != null) {
            SET("patient_phone = #{patientPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getPatientNo() != null) {
            SET("patient_no = #{patientNo,jdbcType=VARCHAR}");
        }
        
        if (record.getCheckNo() != null) {
            SET("check_no = #{checkNo,jdbcType=VARCHAR}");
        }
        
        if (record.getCaseNo() != null) {
            SET("case_no = #{caseNo,jdbcType=VARCHAR}");
        }
        
        if (record.getItem() != null) {
            SET("item = #{item,jdbcType=VARCHAR}");
        }
        
        if (record.getModality() != null) {
            SET("modality = #{modality,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctorId() != null) {
            SET("doctor_id = #{doctorId,jdbcType=BIGINT}");
        }
        
        if (record.getSendDoctorId() != null) {
            SET("send_doctor_id = #{sendDoctorId,jdbcType=BIGINT}");
        }
        
        if (record.getSendDoctorName() != null) {
            SET("send_doctor_name = #{sendDoctorName,jdbcType=VARCHAR}");
        }
        
        if (record.getSendHospitalId() != null) {
            SET("send_hospital_id = #{sendHospitalId,jdbcType=BIGINT}");
        }
        
        if (record.getSendHospitalName() != null) {
            SET("send_hospital_name = #{sendHospitalName,jdbcType=VARCHAR}");
        }
        
        if (record.getSendDate() != null) {
            SET("send_date = #{sendDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGetDate() != null) {
            SET("get_date = #{getDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDigDate() != null) {
            SET("dig_date = #{digDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getBackDate() != null) {
            SET("back_date = #{backDate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getMissingTime() != null) {
            SET("missing_time = #{missingTime,jdbcType=BIGINT}");
        }
        
        if (record.getInid() != null) {
            SET("inId = #{inid,jdbcType=BIGINT}");
        }
        
        if (record.getIsDelete() != null) {
            SET("is_delete = #{isDelete,jdbcType=CHAR}");
        }
        
        if (record.getIsAppoint() != null) {
            SET("is_appoint = #{isAppoint,jdbcType=CHAR}");
        }
        
        if (record.getTemp1() != null) {
            SET("temp1 = #{temp1,jdbcType=VARCHAR}");
        }
        
        if (record.getTemp2() != null) {
            SET("temp2 = #{temp2,jdbcType=VARCHAR}");
        }
        
        if (record.getTemp3() != null) {
            SET("temp3 = #{temp3,jdbcType=VARCHAR}");
        }
        
        if (record.getTemp4() != null) {
            SET("temp4 = #{temp4,jdbcType=VARCHAR}");
        }
        
        if (record.getTemp5() != null) {
            SET("temp5 = #{temp5,jdbcType=VARCHAR}");
        }
        
        WHERE("id = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }
    /**
     * 个人列表总数
     * @param paramsMap
     * @return
     */
    public String selectListCount(Map<String, Object> paramsMap){
    	StringBuilder sb = new StringBuilder();
    	sb.append("SELECT COUNT(id) ");
    	sb.append("FROM case_list_info WHERE is_delete = 1 ");
    	if(StringUtils.isNotBlank(paramsMap.get("doctorId").toString())){
    		sb.append("AND doctor_id = #{doctorId, jdbcType=BIGINT} ");
    	}
    	if(StringUtils.isNotBlank((String)paramsMap.get("status"))){
        	sb.append("AND status = #{status, jdbcType=VARCHAR}");
    	}
    	return sb.toString();
    }
    
    public String selectList(Map<String, Object> paramsMap){
    	StringBuilder sb = new StringBuilder();
    	sb.append("SELECT TOP (#{limitE,jdbcType=BIGINT}) * ");
    	sb.append("FROM case_list_info WHERE is_delete = 1 ");
    	sb.append("AND id NOT IN(SELECT TOP (#{limitS,jdbcType=BIGINT}) id FROM case_list_info WHERE is_delete = 1 ");
    	if(StringUtils.isNotBlank(paramsMap.get("doctorId").toString())){
    		sb.append("AND doctor_id = #{doctorId, jdbcType=BIGINT} ");
    	}
    	if(StringUtils.isNotBlank((String)paramsMap.get("status"))){
        	sb.append("AND status = #{status, jdbcType=VARCHAR} ");
        	switch ((String)paramsMap.get("status")) {
    		case "1":
    			sb.append("ORDER BY get_date ");
    			break;
    		case "3":
    			sb.append("ORDER BY get_date ");
    			break;
    		case "4":
    			sb.append("ORDER BY back_date ");
    			break;
    		case "5":
    			sb.append("ORDER BY dig_date ");
    			break;
    		default:
    			break;
    		}
    	}
    	sb.append(")");
    	if(StringUtils.isNotBlank(paramsMap.get("doctorId").toString())){
    		sb.append("AND doctor_id = #{doctorId, jdbcType=BIGINT} ");
    	}
    	if(StringUtils.isNotBlank((String)paramsMap.get("status"))){
        	sb.append("AND status = #{status, jdbcType=VARCHAR} ");
        	switch ((String)paramsMap.get("status")) {
    		case "1":
    			sb.append("ORDER BY get_date ");
    			break;
    		case "3":
    			sb.append("ORDER BY get_date ");
    			break;
    		case "4":
    			sb.append("ORDER BY back_date ");
    			break;
    		case "5":
    			sb.append("ORDER BY dig_date ");
    			break;
    		default:
    			break;
    		}
    	}
    	return sb.toString();
    }
    /**
     * 获取统计信息
     * @param paramsMap
     * @return
     */
    public String selectAllCount(Map<String, Object> paramsMap){
    	StringBuilder sb = new StringBuilder();
    	sb.append("SELECT COUNT(id) AS temp1, ");
    	sb.append("COUNT(CASE status WHEN '1' THEN 1 ELSE NULL END) AS temp2, ");
    	sb.append("COUNT(CASE status WHEN '3' THEN 1 ELSE NULL END) AS temp3, ");
    	sb.append("COUNT(CASE status WHEN '5' THEN 1 ELSE NULL END) AS temp4 ");
    	sb.append("FROM case_list_info WHERE is_delete = 1 ");
    	if(StringUtils.isNotBlank(paramsMap.get("doctorId").toString())){
    		sb.append("AND doctor_id = #{doctorId, jdbcType=BIGINT} ");
    	}
		return sb.toString();
    }
}