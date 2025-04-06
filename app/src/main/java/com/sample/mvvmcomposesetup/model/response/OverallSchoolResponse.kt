package com.sample.mvvmcomposesetup.model.response

import com.google.gson.annotations.SerializedName

data class OverallSchoolResponse(

	@field:SerializedName("OverallSchoolResponse")
	val overallSchoolResponse: List<OverallSchoolResponseItem?>? = null
)

data class OverallSchoolResponseItem(

	@field:SerializedName("bus")
	val bus: String? = null,

	@field:SerializedName("grade9gefilledflag1")
	val grade9gefilledflag1: String? = null,

	@field:SerializedName("method1")
	val method1: String? = null,

	@field:SerializedName("method2")
	val method2: String? = null,

	@field:SerializedName("grade9gefilledflag2")
	val grade9gefilledflag2: String? = null,

	@field:SerializedName("bin")
	val bin: String? = null,

	@field:SerializedName("borough")
	val borough: String? = null,

	@field:SerializedName("grade9geapplicantsperseat1")
	val grade9geapplicantsperseat1: String? = null,

	@field:SerializedName("grade9geapplicantsperseat2")
	val grade9geapplicantsperseat2: String? = null,

	@field:SerializedName("ell_programs")
	val ellPrograms: String? = null,

	@field:SerializedName("diplomaendorsements")
	val diplomaendorsements: String? = null,

	@field:SerializedName("psal_sports_girls")
	val psalSportsGirls: String? = null,

	@field:SerializedName("academicopportunities1")
	val academicopportunities1: String? = null,

	@field:SerializedName("academicopportunities2")
	val academicopportunities2: String? = null,

	@field:SerializedName("academicopportunities3")
	val academicopportunities3: String? = null,

	@field:SerializedName("academicopportunities4")
	val academicopportunities4: String? = null,

	@field:SerializedName("academicopportunities5")
	val academicopportunities5: String? = null,

	@field:SerializedName("total_students")
	val totalStudents: String? = null,

	@field:SerializedName("psal_sports_coed")
	val psalSportsCoed: String? = null,

	@field:SerializedName("longitude")
	val longitude: String? = null,

	@field:SerializedName("zip")
	val zip: String? = null,

	@field:SerializedName("finalgrades")
	val finalgrades: String? = null,

	@field:SerializedName("seats9swd2")
	val seats9swd2: String? = null,

	@field:SerializedName("admissionspriority11")
	val admissionspriority11: String? = null,

	@field:SerializedName("seats9swd1")
	val seats9swd1: String? = null,

	@field:SerializedName("admissionspriority12")
	val admissionspriority12: String? = null,

	@field:SerializedName("fax_number")
	val faxNumber: String? = null,

	@field:SerializedName("bbl")
	val bbl: String? = null,

	@field:SerializedName("dbn")
	val dbn: String? = null,

	@field:SerializedName("start_time")
	val startTime: String? = null,

	@field:SerializedName("pct_stu_safe")
	val pctStuSafe: String? = null,

	@field:SerializedName("pct_stu_enough_variety")
	val pctStuEnoughVariety: String? = null,

	@field:SerializedName("interest1")
	val interest1: String? = null,

	@field:SerializedName("overview_paragraph")
	val overviewParagraph: String? = null,

	@field:SerializedName("school_accessibility_description")
	val schoolAccessibilityDescription: String? = null,

	@field:SerializedName("community_board")
	val communityBoard: String? = null,

	@field:SerializedName("language_classes")
	val languageClasses: String? = null,

	@field:SerializedName("phone_number")
	val phoneNumber: String? = null,

	@field:SerializedName("neighborhood")
	val neighborhood: String? = null,

	@field:SerializedName("campus_name")
	val campusName: String? = null,

	@field:SerializedName("grade9geapplicants2")
	val grade9geapplicants2: String? = null,

	@field:SerializedName("grade9swdfilledflag1")
	val grade9swdfilledflag1: String? = null,

	@field:SerializedName("state_code")
	val stateCode: String? = null,

	@field:SerializedName("council_district")
	val councilDistrict: String? = null,

	@field:SerializedName("interest2")
	val interest2: String? = null,

	@field:SerializedName("grade9geapplicants1")
	val grade9geapplicants1: String? = null,

	@field:SerializedName("seats101")
	val seats101: String? = null,

	@field:SerializedName("grade9swdapplicantsperseat1")
	val grade9swdapplicantsperseat1: String? = null,

	@field:SerializedName("grade9swdfilledflag2")
	val grade9swdfilledflag2: String? = null,

	@field:SerializedName("seats102")
	val seats102: String? = null,

	@field:SerializedName("grade9swdapplicantsperseat2")
	val grade9swdapplicantsperseat2: String? = null,

	@field:SerializedName("shared_space")
	val sharedSpace: String? = null,

	@field:SerializedName("prgdesc2")
	val prgdesc2: String? = null,

	@field:SerializedName("code2")
	val code2: String? = null,

	@field:SerializedName("code1")
	val code1: String? = null,

	@field:SerializedName("prgdesc1")
	val prgdesc1: String? = null,

	@field:SerializedName("city")
	val city: String? = null,

	@field:SerializedName("latitude")
	val latitude: String? = null,

	@field:SerializedName("building_code")
	val buildingCode: String? = null,

	@field:SerializedName("graduation_rate")
	val graduationRate: String? = null,

	@field:SerializedName("nta")
	val nta: String? = null,

	@field:SerializedName("extracurricular_activities")
	val extracurricularActivities: String? = null,

	@field:SerializedName("census_tract")
	val censusTract: String? = null,

	@field:SerializedName("website")
	val website: String? = null,

	@field:SerializedName("boro")
	val boro: String? = null,

	@field:SerializedName("end_time")
	val endTime: String? = null,

	@field:SerializedName("school_name")
	val schoolName: String? = null,

	@field:SerializedName("grades2018")
	val grades2018: String? = null,

	@field:SerializedName("primary_address_line_1")
	val primaryAddressLine1: String? = null,

	@field:SerializedName("psal_sports_boys")
	val psalSportsBoys: String? = null,

	@field:SerializedName("school_email")
	val schoolEmail: String? = null,

	@field:SerializedName("subway")
	val subway: String? = null,

	@field:SerializedName("school_10th_seats")
	val school10thSeats: String? = null,

	@field:SerializedName("grade9swdapplicants2")
	val grade9swdapplicants2: String? = null,

	@field:SerializedName("grade9swdapplicants1")
	val grade9swdapplicants1: String? = null,

	@field:SerializedName("attendance_rate")
	val attendanceRate: String? = null,

	@field:SerializedName("program1")
	val program1: String? = null,

	@field:SerializedName("location")
	val location: String? = null,

	@field:SerializedName("program2")
	val program2: String? = null,

	@field:SerializedName("seats9ge2")
	val seats9ge2: String? = null,

	@field:SerializedName("seats9ge1")
	val seats9ge1: String? = null,

	@field:SerializedName("advancedplacement_courses")
	val advancedplacementCourses: String? = null,

	@field:SerializedName("college_career_rate")
	val collegeCareerRate: String? = null,

	@field:SerializedName("admissionspriority21")
	val admissionspriority21: String? = null,

	@field:SerializedName("addtl_info1")
	val addtlInfo1: String? = null,

	@field:SerializedName("admissionspriority51")
	val admissionspriority51: String? = null,

	@field:SerializedName("school_sports")
	val schoolSports: String? = null,

	@field:SerializedName("offer_rate1")
	val offerRate1: String? = null,

	@field:SerializedName("admissionspriority41")
	val admissionspriority41: String? = null,

	@field:SerializedName("admissionspriority31")
	val admissionspriority31: String? = null,

	@field:SerializedName("pbat")
	val pbat: String? = null,

	@field:SerializedName("international")
	val international: String? = null,

	@field:SerializedName("eligibility1")
	val eligibility1: String? = null,

	@field:SerializedName("eligibility2")
	val eligibility2: String? = null,

	@field:SerializedName("requirement2_1")
	val requirement21: String? = null,

	@field:SerializedName("requirement4_1")
	val requirement41: String? = null,

	@field:SerializedName("requirement6_1")
	val requirement61: String? = null,

	@field:SerializedName("directions1")
	val directions1: String? = null,

	@field:SerializedName("requirement1_1")
	val requirement11: String? = null,

	@field:SerializedName("requirement3_1")
	val requirement31: String? = null,

	@field:SerializedName("requirement5_1")
	val requirement51: String? = null,

	@field:SerializedName("boys")
	val boys: String? = null,

	@field:SerializedName("admissionspriority23")
	val admissionspriority23: String? = null,

	@field:SerializedName("seats9swd6")
	val seats9swd6: String? = null,

	@field:SerializedName("seats9swd5")
	val seats9swd5: String? = null,

	@field:SerializedName("seats9swd4")
	val seats9swd4: String? = null,

	@field:SerializedName("seats9swd3")
	val seats9swd3: String? = null,

	@field:SerializedName("offer_rate3")
	val offerRate3: String? = null,

	@field:SerializedName("grade9swdfilledflag5")
	val grade9swdfilledflag5: String? = null,

	@field:SerializedName("grade9swdfilledflag4")
	val grade9swdfilledflag4: String? = null,

	@field:SerializedName("seats105")
	val seats105: String? = null,

	@field:SerializedName("grade9swdfilledflag6")
	val grade9swdfilledflag6: String? = null,

	@field:SerializedName("seats106")
	val seats106: String? = null,

	@field:SerializedName("grade9geapplicants6")
	val grade9geapplicants6: String? = null,

	@field:SerializedName("grade9geapplicants5")
	val grade9geapplicants5: String? = null,

	@field:SerializedName("admissionspriority16")
	val admissionspriority16: String? = null,

	@field:SerializedName("admissionspriority13")
	val admissionspriority13: String? = null,

	@field:SerializedName("seats103")
	val seats103: String? = null,

	@field:SerializedName("seats104")
	val seats104: String? = null,

	@field:SerializedName("prgdesc6")
	val prgdesc6: String? = null,

	@field:SerializedName("grade9geapplicants4")
	val grade9geapplicants4: String? = null,

	@field:SerializedName("grade9swdfilledflag3")
	val grade9swdfilledflag3: String? = null,

	@field:SerializedName("grade9geapplicants3")
	val grade9geapplicants3: String? = null,

	@field:SerializedName("prgdesc4")
	val prgdesc4: String? = null,

	@field:SerializedName("code4")
	val code4: String? = null,

	@field:SerializedName("eligibility5")
	val eligibility5: String? = null,

	@field:SerializedName("prgdesc5")
	val prgdesc5: String? = null,

	@field:SerializedName("code3")
	val code3: String? = null,

	@field:SerializedName("prgdesc3")
	val prgdesc3: String? = null,

	@field:SerializedName("code6")
	val code6: String? = null,

	@field:SerializedName("eligibility3")
	val eligibility3: String? = null,

	@field:SerializedName("code5")
	val code5: String? = null,

	@field:SerializedName("eligibility4")
	val eligibility4: String? = null,

	@field:SerializedName("program4")
	val program4: String? = null,

	@field:SerializedName("program5")
	val program5: String? = null,

	@field:SerializedName("program6")
	val program6: String? = null,

	@field:SerializedName("grade9swdapplicants4")
	val grade9swdapplicants4: String? = null,

	@field:SerializedName("grade9swdapplicants3")
	val grade9swdapplicants3: String? = null,

	@field:SerializedName("grade9swdapplicants6")
	val grade9swdapplicants6: String? = null,

	@field:SerializedName("grade9swdapplicants5")
	val grade9swdapplicants5: String? = null,

	@field:SerializedName("seats9ge4")
	val seats9ge4: String? = null,

	@field:SerializedName("seats9ge3")
	val seats9ge3: String? = null,

	@field:SerializedName("program3")
	val program3: String? = null,

	@field:SerializedName("seats9ge6")
	val seats9ge6: String? = null,

	@field:SerializedName("seats9ge5")
	val seats9ge5: String? = null,

	@field:SerializedName("method5")
	val method5: String? = null,

	@field:SerializedName("method6")
	val method6: String? = null,

	@field:SerializedName("grade9gefilledflag4")
	val grade9gefilledflag4: String? = null,

	@field:SerializedName("grade9gefilledflag5")
	val grade9gefilledflag5: String? = null,

	@field:SerializedName("method3")
	val method3: String? = null,

	@field:SerializedName("method4")
	val method4: String? = null,

	@field:SerializedName("grade9gefilledflag3")
	val grade9gefilledflag3: String? = null,

	@field:SerializedName("grade9geapplicantsperseat5")
	val grade9geapplicantsperseat5: String? = null,

	@field:SerializedName("grade9geapplicantsperseat6")
	val grade9geapplicantsperseat6: String? = null,

	@field:SerializedName("grade9gefilledflag6")
	val grade9gefilledflag6: String? = null,

	@field:SerializedName("grade9geapplicantsperseat3")
	val grade9geapplicantsperseat3: String? = null,

	@field:SerializedName("grade9geapplicantsperseat4")
	val grade9geapplicantsperseat4: String? = null,

	@field:SerializedName("interest6")
	val interest6: String? = null,

	@field:SerializedName("interest3")
	val interest3: String? = null,

	@field:SerializedName("interest5")
	val interest5: String? = null,

	@field:SerializedName("interest4")
	val interest4: String? = null,

	@field:SerializedName("grade9swdapplicantsperseat3")
	val grade9swdapplicantsperseat3: String? = null,

	@field:SerializedName("grade9swdapplicantsperseat4")
	val grade9swdapplicantsperseat4: String? = null,

	@field:SerializedName("grade9swdapplicantsperseat5")
	val grade9swdapplicantsperseat5: String? = null,

	@field:SerializedName("grade9swdapplicantsperseat6")
	val grade9swdapplicantsperseat6: String? = null,

	@field:SerializedName("geoeligibility")
	val geoeligibility: String? = null,

	@field:SerializedName("admissionspriority22")
	val admissionspriority22: String? = null,

	@field:SerializedName("offer_rate2")
	val offerRate2: String? = null,

	@field:SerializedName("admissionspriority42")
	val admissionspriority42: String? = null,

	@field:SerializedName("admissionspriority32")
	val admissionspriority32: String? = null,

	@field:SerializedName("earlycollege")
	val earlycollege: String? = null,

	@field:SerializedName("ptech")
	val ptech: String? = null,

	@field:SerializedName("transfer")
	val transfer: String? = null,

	@field:SerializedName("requirement2_3")
	val requirement23: String? = null,

	@field:SerializedName("requirement2_4")
	val requirement24: String? = null,

	@field:SerializedName("requirement2_5")
	val requirement25: String? = null,

	@field:SerializedName("requirement3_3")
	val requirement33: String? = null,

	@field:SerializedName("requirement3_4")
	val requirement34: String? = null,

	@field:SerializedName("requirement3_5")
	val requirement35: String? = null,

	@field:SerializedName("auditioninformation4")
	val auditioninformation4: String? = null,

	@field:SerializedName("requirement4_4")
	val requirement44: String? = null,

	@field:SerializedName("requirement4_5")
	val requirement45: String? = null,

	@field:SerializedName("requirement1_2")
	val requirement12: String? = null,

	@field:SerializedName("requirement1_3")
	val requirement13: String? = null,

	@field:SerializedName("requirement1_4")
	val requirement14: String? = null,

	@field:SerializedName("requirement1_5")
	val requirement15: String? = null,

	@field:SerializedName("requirement5_4")
	val requirement54: String? = null,

	@field:SerializedName("requirement2_2")
	val requirement22: String? = null,

	@field:SerializedName("requirement3_2")
	val requirement32: String? = null,

	@field:SerializedName("seats9swd7")
	val seats9swd7: String? = null,

	@field:SerializedName("seats107")
	val seats107: String? = null,

	@field:SerializedName("grade9swdfilledflag7")
	val grade9swdfilledflag7: String? = null,

	@field:SerializedName("admissionspriority15")
	val admissionspriority15: String? = null,

	@field:SerializedName("grade9geapplicants7")
	val grade9geapplicants7: String? = null,

	@field:SerializedName("admissionspriority14")
	val admissionspriority14: String? = null,

	@field:SerializedName("requirement2_6")
	val requirement26: String? = null,

	@field:SerializedName("admissionspriority17")
	val admissionspriority17: String? = null,

	@field:SerializedName("prgdesc7")
	val prgdesc7: String? = null,

	@field:SerializedName("requirement2_7")
	val requirement27: String? = null,

	@field:SerializedName("code7")
	val code7: String? = null,

	@field:SerializedName("program7")
	val program7: String? = null,

	@field:SerializedName("requirement3_7")
	val requirement37: String? = null,

	@field:SerializedName("seats9ge7")
	val seats9ge7: String? = null,

	@field:SerializedName("grade9swdapplicants7")
	val grade9swdapplicants7: String? = null,

	@field:SerializedName("requirement3_6")
	val requirement36: String? = null,

	@field:SerializedName("method7")
	val method7: String? = null,

	@field:SerializedName("grade9geapplicantsperseat7")
	val grade9geapplicantsperseat7: String? = null,

	@field:SerializedName("grade9gefilledflag7")
	val grade9gefilledflag7: String? = null,

	@field:SerializedName("interest7")
	val interest7: String? = null,

	@field:SerializedName("grade9swdapplicantsperseat7")
	val grade9swdapplicantsperseat7: String? = null,

	@field:SerializedName("requirement1_6")
	val requirement16: String? = null,

	@field:SerializedName("requirement1_7")
	val requirement17: String? = null,

	@field:SerializedName("grade9swdfilledflag9")
	val grade9swdfilledflag9: String? = null,

	@field:SerializedName("grade9swdfilledflag8")
	val grade9swdfilledflag8: String? = null,

	@field:SerializedName("prgdesc8")
	val prgdesc8: String? = null,

	@field:SerializedName("prgdesc9")
	val prgdesc9: String? = null,

	@field:SerializedName("code9")
	val code9: String? = null,

	@field:SerializedName("code8")
	val code8: String? = null,

	@field:SerializedName("program8")
	val program8: String? = null,

	@field:SerializedName("program9")
	val program9: String? = null,

	@field:SerializedName("seats9ge9")
	val seats9ge9: String? = null,

	@field:SerializedName("seats9ge8")
	val seats9ge8: String? = null,

	@field:SerializedName("grade9swdapplicants8")
	val grade9swdapplicants8: String? = null,

	@field:SerializedName("grade9swdapplicants9")
	val grade9swdapplicants9: String? = null,

	@field:SerializedName("grade9geapplicantsperseat9")
	val grade9geapplicantsperseat9: String? = null,

	@field:SerializedName("grade9gefilledflag8")
	val grade9gefilledflag8: String? = null,

	@field:SerializedName("grade9gefilledflag9")
	val grade9gefilledflag9: String? = null,

	@field:SerializedName("grade9geapplicantsperseat8")
	val grade9geapplicantsperseat8: String? = null,

	@field:SerializedName("grade9swdapplicantsperseat8")
	val grade9swdapplicantsperseat8: String? = null,

	@field:SerializedName("grade9swdapplicantsperseat9")
	val grade9swdapplicantsperseat9: String? = null,

	@field:SerializedName("admissionspriority26")
	val admissionspriority26: String? = null,

	@field:SerializedName("admissionspriority27")
	val admissionspriority27: String? = null,

	@field:SerializedName("seats9swd8")
	val seats9swd8: String? = null,

	@field:SerializedName("admissionspriority24")
	val admissionspriority24: String? = null,

	@field:SerializedName("admissionspriority25")
	val admissionspriority25: String? = null,

	@field:SerializedName("seats9swd9")
	val seats9swd9: String? = null,

	@field:SerializedName("admissionspriority28")
	val admissionspriority28: String? = null,

	@field:SerializedName("offer_rate7")
	val offerRate7: String? = null,

	@field:SerializedName("offer_rate8")
	val offerRate8: String? = null,

	@field:SerializedName("offer_rate5")
	val offerRate5: String? = null,

	@field:SerializedName("offer_rate6")
	val offerRate6: String? = null,

	@field:SerializedName("offer_rate4")
	val offerRate4: String? = null,

	@field:SerializedName("seats108")
	val seats108: String? = null,

	@field:SerializedName("grade9geapplicants9")
	val grade9geapplicants9: String? = null,

	@field:SerializedName("seats109")
	val seats109: String? = null,

	@field:SerializedName("grade9geapplicants8")
	val grade9geapplicants8: String? = null,

	@field:SerializedName("admissionspriority19")
	val admissionspriority19: String? = null,

	@field:SerializedName("admissionspriority18")
	val admissionspriority18: String? = null,

	@field:SerializedName("method8")
	val method8: String? = null,

	@field:SerializedName("method9")
	val method9: String? = null,

	@field:SerializedName("interest9")
	val interest9: String? = null,

	@field:SerializedName("interest8")
	val interest8: String? = null,

	@field:SerializedName("requirement1_8")
	val requirement18: String? = null,

	@field:SerializedName("requirement6_7")
	val requirement67: String? = null,

	@field:SerializedName("requirement4_7")
	val requirement47: String? = null,

	@field:SerializedName("requirement5_7")
	val requirement57: String? = null,

	@field:SerializedName("auditioninformation7")
	val auditioninformation7: String? = null,

	@field:SerializedName("auditioninformation6")
	val auditioninformation6: String? = null,

	@field:SerializedName("auditioninformation5")
	val auditioninformation5: String? = null,

	@field:SerializedName("requirement4_3")
	val requirement43: String? = null,

	@field:SerializedName("girls")
	val girls: String? = null,

	@field:SerializedName("admissionspriority62")
	val admissionspriority62: String? = null,

	@field:SerializedName("admissionspriority63")
	val admissionspriority63: String? = null,

	@field:SerializedName("admissionspriority61")
	val admissionspriority61: String? = null,

	@field:SerializedName("admissionspriority52")
	val admissionspriority52: String? = null,

	@field:SerializedName("admissionspriority53")
	val admissionspriority53: String? = null,

	@field:SerializedName("admissionspriority43")
	val admissionspriority43: String? = null,

	@field:SerializedName("admissionspriority33")
	val admissionspriority33: String? = null,

	@field:SerializedName("applicants1specialized")
	val applicants1specialized: String? = null,

	@field:SerializedName("specialized")
	val specialized: String? = null,

	@field:SerializedName("seats1specialized")
	val seats1specialized: String? = null,

	@field:SerializedName("appperseat1specialized")
	val appperseat1specialized: String? = null,

	@field:SerializedName("auditioninformation3")
	val auditioninformation3: String? = null,

	@field:SerializedName("auditioninformation2")
	val auditioninformation2: String? = null,

	@field:SerializedName("auditioninformation1")
	val auditioninformation1: String? = null,

	@field:SerializedName("requirement4_2")
	val requirement42: String? = null,

	@field:SerializedName("admissionspriority34")
	val admissionspriority34: String? = null,

	@field:SerializedName("requirement5_5")
	val requirement55: String? = null,

	@field:SerializedName("admissionspriority35")
	val admissionspriority35: String? = null,

	@field:SerializedName("requirement5_2")
	val requirement52: String? = null,

	@field:SerializedName("requirement5_3")
	val requirement53: String? = null,

	@field:SerializedName("admissionspriority71")
	val admissionspriority71: String? = null,

	@field:SerializedName("common_audition1")
	val commonAudition1: String? = null,

	@field:SerializedName("common_audition2")
	val commonAudition2: String? = null,

	@field:SerializedName("common_audition3")
	val commonAudition3: String? = null,

	@field:SerializedName("common_audition4")
	val commonAudition4: String? = null,

	@field:SerializedName("common_audition5")
	val commonAudition5: String? = null,

	@field:SerializedName("directions2")
	val directions2: String? = null,

	@field:SerializedName("seats3specialized")
	val seats3specialized: String? = null,

	@field:SerializedName("applicants5specialized")
	val applicants5specialized: String? = null,

	@field:SerializedName("appperseat5specialized")
	val appperseat5specialized: String? = null,

	@field:SerializedName("applicants6specialized")
	val applicants6specialized: String? = null,

	@field:SerializedName("appperseat4specialized")
	val appperseat4specialized: String? = null,

	@field:SerializedName("seats6specialized")
	val seats6specialized: String? = null,

	@field:SerializedName("seats4specialized")
	val seats4specialized: String? = null,

	@field:SerializedName("directions4")
	val directions4: String? = null,

	@field:SerializedName("directions5")
	val directions5: String? = null,

	@field:SerializedName("directions6")
	val directions6: String? = null,

	@field:SerializedName("directions3")
	val directions3: String? = null,

	@field:SerializedName("appperseat2specialized")
	val appperseat2specialized: String? = null,

	@field:SerializedName("seats2specialized")
	val seats2specialized: String? = null,

	@field:SerializedName("appperseat3specialized")
	val appperseat3specialized: String? = null,

	@field:SerializedName("appperseat6specialized")
	val appperseat6specialized: String? = null,

	@field:SerializedName("applicants4specialized")
	val applicants4specialized: String? = null,

	@field:SerializedName("seats5specialized")
	val seats5specialized: String? = null,

	@field:SerializedName("requirement4_6")
	val requirement46: String? = null,

	@field:SerializedName("applicants3specialized")
	val applicants3specialized: String? = null,

	@field:SerializedName("common_audition6")
	val commonAudition6: String? = null,

	@field:SerializedName("requirement5_6")
	val requirement56: String? = null,

	@field:SerializedName("applicants2specialized")
	val applicants2specialized: String? = null,

	@field:SerializedName("admissionspriority44")
	val admissionspriority44: String? = null,

	@field:SerializedName("eligibility6")
	val eligibility6: String? = null,

	@field:SerializedName("prgdesc10")
	val prgdesc10: String? = null,

	@field:SerializedName("admissionspriority110")
	val admissionspriority110: String? = null,

	@field:SerializedName("grade9gefilledflag10")
	val grade9gefilledflag10: String? = null,

	@field:SerializedName("interest10")
	val interest10: String? = null,

	@field:SerializedName("seats9swd10")
	val seats9swd10: String? = null,

	@field:SerializedName("grade9swdfilledflag10")
	val grade9swdfilledflag10: String? = null,

	@field:SerializedName("seats1010")
	val seats1010: String? = null,

	@field:SerializedName("grade9swdapplicantsperseat10")
	val grade9swdapplicantsperseat10: String? = null,

	@field:SerializedName("grade9geapplicants10")
	val grade9geapplicants10: String? = null,

	@field:SerializedName("seats9ge10")
	val seats9ge10: String? = null,

	@field:SerializedName("grade9geapplicantsperseat10")
	val grade9geapplicantsperseat10: String? = null,

	@field:SerializedName("admissionspriority29")
	val admissionspriority29: String? = null,

	@field:SerializedName("offer_rate9")
	val offerRate9: String? = null,

	@field:SerializedName("requirement2_8")
	val requirement28: String? = null,

	@field:SerializedName("method10")
	val method10: String? = null,

	@field:SerializedName("requirement3_8")
	val requirement38: String? = null,

	@field:SerializedName("grade9swdapplicants10")
	val grade9swdapplicants10: String? = null,

	@field:SerializedName("program10")
	val program10: String? = null,

	@field:SerializedName("code10")
	val code10: String? = null,

	@field:SerializedName("eligibility7")
	val eligibility7: String? = null,

	@field:SerializedName("common_audition7")
	val commonAudition7: String? = null,

	@field:SerializedName("requirement6_2")
	val requirement62: String? = null,

	@field:SerializedName("admissionspriority74")
	val admissionspriority74: String? = null,

	@field:SerializedName("admissionspriority64")
	val admissionspriority64: String? = null,

	@field:SerializedName("admissionspriority54")
	val admissionspriority54: String? = null,

	@field:SerializedName("admissionspriority37")
	val admissionspriority37: String? = null,

	@field:SerializedName("admissionspriority56")
	val admissionspriority56: String? = null,

	@field:SerializedName("admissionspriority46")
	val admissionspriority46: String? = null,

	@field:SerializedName("admissionspriority36")
	val admissionspriority36: String? = null,

	@field:SerializedName("requirement6_3")
	val requirement63: String? = null,

	@field:SerializedName("directions7")
	val directions7: String? = null
)
