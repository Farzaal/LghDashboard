package utilities;

public class Database {
	
	public static String emrArchive = "EMR";

    public static final class DCMS {

        public static final String tempConOdi = " EMR.TEMP_CON_ODI ";
        public static final String smsWiseEmail = emrArchive + "." + "SMS_WISE_EMAIL";
 
        public static final String hrEmployee = " EMR.HR_EMPLOYEE ";
        public static final String attendanceServer = " EMR.HR_ATTENDANCE_SERVER ";
        public static final String thumbscan = " EMR.HR_THUMBSCAN ";
        public static final String pacsStudy = " EMR.PACS_STUDY ";
        
        
        
        
        //DATA BASE UTILITY
        public static String locWiseCashSummary = emrArchive + "." + "LOC_WISE_CASH_SUMMARY";
        public static String locWiseCashDetail = emrArchive + "." + "LOC_WISE_CASH_DETAIL";
        public static String attendanceSummary = emrArchive + "." + "HR_ATTENDANCE_SUMMARY ";

        public static final String transactionTypeHistory = emrArchive + ".TRANSACTION_CHANGE_HISTORY";
        public static final String addSlotRights = emrArchive + ".CLINIC_ADD_SLOT_RIGHTS";
        public static final String cancelAppointment = emrArchive + ".CANCELLED_APPOINTMENT";
        //new ot
        public static final String patientQuestionaireDetail = emrArchive + ".PATIENT_QUESTIONAIRE_DETAIL";
        public static final String patientQuestionaire = emrArchive + ".PATIENT_QUESTIONAIRE";
        public static final String orderReviewHistory = emrArchive + ".ORDER_REVIEW_HISTORY";
        public static final String yearlyCalender = emrArchive + ".YEARLY_CALENDER  ";
        public static final String empMonthShift = emrArchive + ".HR_EMP_MONTH_SHIFT  ";
        public static final String hrThumbAttendance = emrArchive + ".HR_THUMB_ATTENDANCE  ";

        public static final String monthWiseDutyDays = emrArchive + ".MONTH_WISE_DUTY_DAYS  ";
        
        //
        public static final String sendTemplate = emrArchive + ".SMS_TEMPLATE ";
        public static final String userCloud = emrArchive + ".SMS_TEMPLATE ";
        public static final String studyTransferRequest = emrArchive + ".SMS_TEMPLATE ";
        public static final String cloudStudyDetails = emrArchive + ".SMS_TEMPLATE ";
        public static final String refinedAttendanceData = emrArchive + ".REFINED_ATTENDANCE_DATA ";
        public static final String actionWiseEmail = emrArchive + ".ACTION_WISE_EMAIL  ";

        public static final String clinicalProcedureTeam = emrArchive + ".CLINICAL_PROCEDURE_TEAM";
        public static final String logSnowMedCode = emrArchive + ".HISTORY_SNOW_MED_CODE";

        public static final String otPendingProcedure = emrArchive + ".OT_PENDING_PROCEDURE";
        public static final String otPerformedProcedure = emrArchive + ".OT_PERFORMED_PROCEDURE";
        public static final String generalAnaesthesiaFitness = emrArchive + ".GENERAL_ANAESTHESIA_FITNESS";
        public static final String otPendingOrders = emrArchive + ".ORDER_PENDING_HISTORY";
        public static final String patientHealthsDocs = emrArchive + ".PATIENT_HEALTH_DOC";
        public static final String mdtTeam = emrArchive + ".MDT_TEAM";
        public static final String mdtTeamMember = emrArchive + ".MDT_TEAM_DETAIL";
        public static final String otProcedureTeam = emrArchive + ".OT_PROCEDURE_TEAM";
        public static final String DianosticOrderHistory = emrArchive + ".DIAGNOSTIC_ORDER_HISTORY";
        public static final String dianosticHistoryDetail = emrArchive + ".DIAGNOSTIC_HISTORY_DETAIL";
        public static final String stoolDr = emrArchive + ".PATH_STOOL_DR";
        public static final String urineDr = emrArchive + ".PATH_URINE_DR";

        public static final String cptWiseQuestionaire = emrArchive + ".CPT_WISE_QUESTIONAIRE";
        //new 
        public static final String bedTransferRequest = emrArchive + ".BED_TRANSFER_REQUEST";
        public static final String patientCreditApproval = emrArchive + ".PATIENT_CREDIT_APPROVAL";
        public static final String patientCreditLimit = emrArchive + ".PATIENT_CREDIT_LIMIT";
        public static final String blbTransfusionReporting = emrArchive + ".BLB_TRANSFUSION_REPORTING";

        public static final String financialSupportInternalMember = emrArchive + ".INTERNAL_COMMITTEE_MEMBER ";
        public static final String financialSupportApproval = emrArchive + ".FINANCIAL_SUPPORT_APPROVAL ";

        public static final String userWiseLocation = emrArchive + "." + "USER_WISE_LOCATIONS ";
        public static final String cptWiseCancelCpt = emrArchive + "." + "CPT_WISE_CANCEL_CPT ";
        public static final String passwordChangeHistory = emrArchive + "." + "PASSWORD_CHANGE_HISTORY";
        public static final String clientWiseBlockedItems = emrArchive + "." + "CLIENT_WISE_BLOCKED_ITEMS";
        public static final String inpatientInvoices = emrArchive + "." + "INPATIENT_INVOICES";
        public static final String cptWisePerformingRights = emrArchive + ".CPT_WISE_PERFORMING_RIGHTS ";
        public static final String pathologyBatch = emrArchive + ".PATHOLOGY_BATCH";
        public static final String appointment = emrArchive + ".APPOINTMENT ";
        public static final String role = emrArchive + ".ROLE  ";
        public static final String bloodGroup = emrArchive + ".DEFINITION_TYPE_DETAIL ";
        public static final String city = emrArchive + ".CITY ";
        public static final String company = emrArchive + ".DEFINITION_TYPE_DETAIL ";
        public static final String gender = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String title = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String country = emrArchive + ".COUNTRY ";
        public static final String location = emrArchive + ".LOCATION ";
        public static final String locationWiseLocation = emrArchive + ".LOCATION_WISE_LOCATION ";
        public static final String patientAdmission = emrArchive + ".PATIENT_ADMISSION ";
        public static final String patientDischarge = emrArchive + ".PATIENT_DISCHARGE";
        public static final String dischargeDetail = emrArchive + ".DISCHARGE_DETAIL";
        public static final String patientAdmissionHistory = emrArchive + ".PATIENT_ADMISSION_HISTORY ";
        public static final String userWiseCpt = emrArchive + ".USER_WISE_CPT ";
        public static final String consultantChangeHistory = emrArchive + ".CONSULTANT_SHARE_HISTORY ";
        public static final String blbProductOrderDelivered = emrArchive + ".BLB_PRODUCT_ORDER_DELIVERED ";
        public static final String clinicalTeam = emrArchive + ".CLINICAL_TEAM ";
        public static final String clinicalTeamMember = emrArchive + ".CLINICAL_MEMBER ";
        public static final String blbOutsideProductProduct = emrArchive + ".BLB_OUTSIDE_PRODUCTS ";

        public static final String caseStudyHistory = emrArchive + ".CASE_STUDY_HISTORY ";
        public static final String enableRefundRequest = emrArchive + ".ENABLE_REFUND_REQUEST ";

        public static final String caseTransferHistory = emrArchive + ".CASE_TRANSFER_HISTORY ";
        public static final String blbPerformedQueue = emrArchive + ".BLB_DONOR_PERFORMED ";
        public static final String lisParameter = emrArchive + ".PATH_ANALYZER_WISE_PARAMETER ";
        public static final String CPTWisePerformingRights = emrArchive + ".CPT_WISE_PERFORMING_RIGHTS ";
        public static final String locationWiseDepartment = emrArchive + ".LOCATION_WISE_DEPARTMENT ";
        public static final String patientExaminationsDetailItem = emrArchive + ".EXAMINATION_DETAIL_OPTION  ";
        public static final String specialityExamDetailItem = emrArchive + ".SPECIALITY_EXAM_DETAIL_ITEM  ";
        public static final String room = emrArchive + ".ROOM ";
        public static final String rack = emrArchive + ".RACK ";
        public static final String customer = emrArchive + ".CUSTOMER ";
        public static final String locationWiseCPT = emrArchive + ".LOCATION_WISE_CPT ";
        public static final String shelf = emrArchive + ".SHELF ";
        public static final String patientFileMovement = emrArchive + ".PATIENT_FILE_MOVEMENT ";
        public static final String FileMovementHistory = emrArchive + ".FILE_MOVEMENT_HISTORY ";
        public static final String FileRecord = emrArchive + ".PATIENT_FILE_RECORD ";
        public static final String sampleStatus = emrArchive + ".DEFINITION_TYPE_DETAIL ";
        public static final String designation = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String type = emrArchive + ".DEFINITION_TYPE_DETAIL ";
        public static final String CPT = emrArchive + ".CPT ";
        public static final String CPTCodes = emrArchive + ".CPT_WISE_CODES ";
        public static final String CPTWiseCPT = emrArchive + ".CPT_WISE_CPT ";
        public static final String item = emrArchive + ".ITEM ";
        public static final String itemHistory = emrArchive + ".ITEM_HISTORY ";
        public static final String pathFarwordHistory = emrArchive + ".PATH_FARWORD_HISTORY ";
        public static final String pathTubeScanning = emrArchive + ".PATH_TUBE_SCANNING ";
        public static final String pathHistoReport = "DUHS.PATH_HISTO_REPORT ";
        public static final String pathHistoWorkflow = emrArchive + ".PATH_HISTO_WORKFLOW ";
        public static final String pathSnowMedCode = emrArchive + ".SNOW_MED_CODE ";
        public static final String userUpdateHistory = emrArchive + ".USER_UPDATE_HISTORY ";
        public static final String userWiseDepartment = emrArchive + ".USER_WISE_DEPARTMENT ";
        public static final String labNoChangeHistory = emrArchive + ".LABNO_CHANGE_HISTORY ";

        public static final String selectedTCode = emrArchive + ".SELECTED_TCODE ";

        public static final String selectedTWiseMCode = emrArchive + ".SELECTED_TWISE_MICDO_CODE ";
        public static final String clientChangeHistory = emrArchive + ".CLIENT_CHANGE_HISTORY ";
        public static final String echoReporting = emrArchive + ".ECHO_REPORTING ";
        public static final String equipmentStatus = emrArchive + ".EQUIPMENT_STATUS ";
        public static final String specialityWiseItem = emrArchive + ".SPECIALITY_WISE_ITEM ";
        public static final String generic = emrArchive + ".GENERIC ";
        public static final String advanceReceiveHistory = emrArchive + ".ADVANCE_RECEIVED_HISTORY ";
        public static final String bed = emrArchive + ".BED ";
        public static final String ward = emrArchive + ".WARD ";
        public static final String cptWisePerformingShare = emrArchive + ".CPT_WISE_PERFORMING_SHARE ";
        public static final String locWiseCPTReportTiming = emrArchive + ".LOC_WISE_CPT_REPORT_TIMING ";
        public static final String onlineReports = emrArchive + ".ONLINE_REPORTS ";
        public static final String cptReportingDays = emrArchive + ".CPT_PERFORM_DAY  ";
        public static final String orderLocation = emrArchive + ".DEFINITION_TYPE_DETAIL   ";
        public static final String filmSize = emrArchive + ".DEFINITION_TYPE_DETAIL ";
        public static final String contrastType = emrArchive + ".DEFINITION_TYPE_DETAIL ";
        public static final String contrastQty = emrArchive + ".DEFINITION_TYPE_DETAIL ";
        public static final String imagingReportingTemplate = emrArchive + ".IMAGING_REPORTING_TEMPLATE  ";
        public static final String teleReportingTemplate = emrArchive + ".PACS_REPORTING_TEMPLATE  ";
        public static final String applicationReports = emrArchive + ".APP_REPORTS  ";
        public static final String reportAccessHistory = emrArchive + ".REPORT_VIEW_HISTORY  ";
        public static final String reportDeliveryInfo = emrArchive + ".REPORT_DELIVERY_HISTORY  ";
        public static final String filmReceivedInfo = emrArchive + ".FILMS_RECEIVED_HISTORY  ";
        public static final String applicationComments = emrArchive + ".APPLICATION_COMMENTS  ";
        public static final String wordShortcuts = emrArchive + ".WORD_SHORTCUT ";
        public static final String primaryKey = emrArchive + ".DEFINITION_KEYS ";
        public static final String imagingResultHistory = emrArchive + ".IMAGING_RESULT_HISTORY ";
        public static final String imagingRota = emrArchive + ".IMAGING_ROTA ";
        public static final String opdCptMedOrders = emrArchive + ".OPD_CPT_MED_ORDERS ";
        public static final String definitionType = emrArchive + ".DEFINITION_TYPE  ";
        public static final String definitionTypeDetail = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String organismWiseMedicine = emrArchive + ".ORGANISM_WISE_MEDICINE  ";
        public static final String ItemWiseBrand = emrArchive + ".ITEM_WISE_BRAND  ";
        public static final String storeWiseItems = emrArchive + ".STORE_WISE_ITEMS  ";
        public static final String storeWiseUser = emrArchive + ".STORE_WISE_USERS  ";
        public static final String store = emrArchive + ".STORE  ";
        public static final String storeWiseIndentStore = emrArchive + ".STORE_WISE_INDENT  ";

        //ETT
        public static final String indication = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String riskFactor = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String medication = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String reasonForTermination = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String exercisePhase = emrArchive + ".ETT_EXERCISE_PHASE  ";
        public static final String ettReport = emrArchive + ".ETT_REPORT  ";
        public static final String ettReportDetail = emrArchive + ".ETT_REPORT_DETAIL  ";
        public static final String recoveryPhase = emrArchive + ".ETT_RECOVERY_PHASE  ";
        public static final String restingPhase = emrArchive + ".ETT_RESTING_PHASE  ";
        public static final String CPTParameter = emrArchive + ".CPT_PARAMETER  ";
        public static final String CPTTextReporting = emrArchive + ".CPT_TEXT_REPORTING  ";
        public static final String organization = emrArchive + ".ORGANIZATION  ";
        public static final String sectionWisePerformDay = emrArchive + ".GROUP_WISE_PERFORM_DAY  ";
        public static final String client = emrArchive + ".CLIENT  ";

        public static final String pathReportTime = emrArchive + ".PATH_REPORTING_TIME ";
        public static final String clientWiseCPT = emrArchive + ".CLIENT_WISE_CPT ";
        public static final String clientCreditReceive = emrArchive + ".CLIENT_CREDIT_RECIEVE ";
        public static final String clientAmounDetail = emrArchive + ".CLIENT_AMOUNT_DETAIL  ";
        public static final String balanceRefundApproval = emrArchive + ".BALANCE_REFUND_APPROVAL  ";

        public static final String maritalStatus = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String patient = emrArchive + ".PATIENT  ";
        public static final String patientCardHistory = emrArchive + ".PATIENT_CARD_HISTORY  ";
        public static final String oldMRNO = "DUHS.UPATIENT_REGISTRATION  ";

        public static final String blbProductOrderPending = emrArchive + ".BLB_PRODUCT_ORDER_PENDING  ";

        public static final String audioReporting = emrArchive + ".CPT_AUDIO_REPORTING ";

        public static final String icd10Chapter = emrArchive + ".ICD10_CHAPTER ";
        public static final String icd10Block = emrArchive + ".ICD10_BLOCK ";

        public static final String patientPicture = emrArchive + ".PATIENT_PICTURE  ";
        public static final String patientUpdateHistory = emrArchive + ".PATIENT_UPDATE_HISTORY  ";
        public static final String mergePatient = emrArchive + ".MERGE_PATIENT  ";
        public static final String patientOldMRNO = emrArchive + ".PATIENT_OLD_MRNO  ";
        public static final String pharmacyGuide = emrArchive + ".PHARMACY_GUIDE ";
        public static final String ventricular = emrArchive + ".HOLTER_WISE_VENTRICULAR  ";
        public static final String supraventricular = emrArchive + ".HOLTER_WISE_SUPRAVENTRICULAR  ";
        public static final String rtdependentevents = emrArchive + ".RATE_DEPENDENT_EVENTS  ";
        public static final String stanalysis = emrArchive + ".ST_EPISODE_ANALYSIS  ";
        public static final String holter = emrArchive + ".HOLTER  ";

        public static final String clientWisePackage = emrArchive + ".CLIENT_WISE_PACKAGE  ";
        public static final String cptPackageDetail = emrArchive + ".CPT_PACKAGE_DETAIL  ";
        public static final String clientWiseLocation = emrArchive + ".CLIENT_WISE_LOCATION  ";

        public static final String billingLedger = emrArchive + ".BILLING_LEDGER  ";
        public static final String cancelReturnMaster = emrArchive + ".CANCEL_RETURN_MASTER  ";
        public static final String cancelReturnDetail = emrArchive + ".CANCEL_RETURN_DETAIL  ";

        public static final String specimen = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String cathProcData = emrArchive + ".CATH_PROC_DATA  ";
        public static final String speciality = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String patientType = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String patientStatus = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String province = emrArchive + ".PROVINCE  ";
        public static final String religion = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String department = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String active = emrArchive + ".ACTIVE  ";

        public static final String section = emrArchive + ".SECTION  ";
        public static final String users = emrArchive + ".USERS  ";
        public static final String doctor = emrArchive + ".DOCTOR  ";
        public static final String appointmentTime = emrArchive + ".APPOINTMENT_TIME  ";
        public static final String nutritionistConsultancy = emrArchive + ".NUTRITIONIST_CONSULTANCY ";
        public static final String donorCPTOrders = emrArchive + ".DONOR_ORDERS  ";
        public static final String procedureInvoices = emrArchive + ".PROCEDURE_INVOICE  ";

        public static final String icdOCodes = emrArchive + ".ICD10_CODES  ";
        public static final String icd10Code = emrArchive + ".ICD10_CODE  ";

        public static final String Keys = emrArchive + ".KEYS  ";
        public static final String imagingVerifyRights = emrArchive + ".PERFORMING_VERIFY_RIGHTS  ";
        public static final String diagnosticOrderHistory = emrArchive + ".DIAGNOSTIC_ORDER_HISTORY  ";
        public static final String procedureOrderHistory = emrArchive + ".PROCEDURE_ORDER_HISTORY  ";
        public static final String imagingHistoryChangeTrack = emrArchive + ".IMAGING_HISTORY_CHANGE_TRACK  ";
        public static final String orderMaster = emrArchive + ".ORDER_MASTER  ";
        public static final String prescription = emrArchive + ".PRESCRIPTION  ";
        public static final String practiceIncome = emrArchive + ".PRACTICE_INCOME  ";
        public static final String orderDetail = emrArchive + ".ORDER_DETAIL ";
        public static final String invoiceMaster = emrArchive + ".INVOICE_MASTER  ";
        public static final String patFinancialSupport = emrArchive + ".PAT_FINANCIAL_SUPPORT  ";

        public static final String invoiceDetail = emrArchive + ".INVOICE_DETAIL  ";
        public static final String expenseType = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String expenseDailyDetail = emrArchive + ".DAILY_EXPENSE_DETAIL  ";
        public static final String imagingResult = emrArchive + ".IMAGING_RESULTS  ";
        public static final String imagingPendingQueue = emrArchive + ".IMAGING_PENDING_QUEUE  ";
        public static final String imagingAddendum = emrArchive + ".IMAGING_ADDENDUM  ";
        public static final String modalityAnalyzer = emrArchive + ".MODALITY_ANALYZER  ";
        public static final String sectionMachine = emrArchive + ".SECTION_MACHINE  ";
        public static final String emailQueue = emrArchive + ".EMAIL_QUEUE  ";
        public static final String appStatus = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String mobilityStatus = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String pathDefParams = emrArchive + ".DEF_PATH_PARAMS  ";
        public static final String sendSMS = emrArchive + ".SEND_SMS  ";
        public static final String setupColumnDetail = emrArchive + ".SETUP_COLUMN_DETAIL  ";

        public static final String clientBillReceive = emrArchive + ".CLIENT_BILL_RECEIVE ";
        public static final String clientBillTransferDetail = emrArchive + ".CLIENT_BILL_TRANSFER_DETAIL ";

        public static final String clientBillMaster = emrArchive + ".CLIENT_BILL_MASTER ";
        public static final String clientBillDetail = emrArchive + ".CLIENT_BILL_DETAIL ";
        public static final String clientAmountReceiveWiseBill = emrArchive + ".CLIENT_RECEIVE_BILLS_NO ";

        public static final String clientCptUpdateHistory = emrArchive + ".CLIENT_CPT_UPDATE_HIST ";

        public static final String outsideInvestigations = emrArchive + ".OUTSIDE_INVESTIGATIONS ";

        public static final String pathSeriologyResultDetail = emrArchive + ".PATH_SERIOLOGY_RESULT_DETAIL ";
        public static final String userWiseLocations = emrArchive + ".USER_WISE_LOCATIONS ";
        public static final String pathOrganismGrowth = emrArchive + ".PATH_ORGANISM_GROWTH ";
        public static final String pathGrowthSensitivity = emrArchive + ".PATH_GROWTH_SENSITIVITY ";
        public static final String pathOrganismQuantity = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String cptHoldResults = emrArchive + ".CPT_HOLD_RESULTS  ";//

        /**
         * cardiology setup tables
         */
        public static final String wire = emrArchive + ".DEFINITION_TYPE_DETAIL ";
        public static final String stent = emrArchive + ".DEFINITION_TYPE_DETAIL ";
        public static final String stentType = emrArchive + ".DEFINITION_TYPE_DETAIL ";
        public static final String chether = emrArchive + ".DEFINITION_TYPE_DETAIL ";
        public static final String chetherCurve = emrArchive + ".DEFINITION_TYPE_DETAIL ";
        public static final String chetherDiameter = emrArchive + ".DEFINITION_TYPE_DETAIL ";
        public static final String balloonLength = emrArchive + ".DEFINITION_TYPE_DETAIL ";
        public static final String balloonType = emrArchive + ".DEFINITION_TYPE_DETAIL ";
        //END CATH SETUP TABLES
        public static final String radiologyData = " radiology.dbo.RadIntegration  ";
        //Tables for Security Implmentation
        public static final String rightsAssignHistory = emrArchive + ".RIGHTS_ASSIGN_HISTORY  ";
        public static final String roleWiseForm = emrArchive + ".ROLE_WISE_FORM ";
        public static final String userWiseRole = emrArchive + ".USER_WISE_ROLE ";
        public static final String formWiseAction = emrArchive + ".FORM_ACTION ";

        public static final String form = emrArchive + ".FORM ";
        public static final String terminal = emrArchive + ".TERMINALS ";
        public static final String terminalMacAddress = emrArchive + ".TERMINAL_MAC_ADDRESSES  ";
        public static final String menu = emrArchive + ".MENU ";
        public static final String modality = emrArchive + ".MODALITY ";
        public static final String symbols = emrArchive + ".DEFINITION_TYPE_DETAIL ";
        public static final String appGroupComponent = emrArchive + ".APP_GROUP_COMPONENT ";
        public static final String refundMaster = emrArchive + ".REFUND_MASTER ";
        public static final String refundDetail = emrArchive + ".REFUND_DETAIL ";
        public static final String modalityWiseCPT = emrArchive + ".MODALITY_WISE_CPT ";
        public static final String receivedBalanceHistory = emrArchive + ".BALANCE_RECEIVED_HISTORY ";
        public static final String reportPrintHistory = emrArchive + ".REPORT_PRINT_HISTORY ";
        public static final String reportingFormat = emrArchive + ".REPORTING_FORMAT  ";
        public static final String reportingDay = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String reports = emrArchive + ".APP_REPORTS  ";
        public static final String userWiseReports = emrArchive + ".USER_WISE_REPORTS  ";
        public static final String reportWiseParameter = emrArchive + ". REPORT_WISE_PARAMETER  ";
        public static final String reportParameter = emrArchive + ". REPORT_PARAMETER  ";
        public static final String dailyCashSummary = emrArchive + ".DAILY_CASH_SUMMARY  ";
        public static final String invoicePrintHistory = emrArchive + ".INVOICE_PRINT_HISTORY  ";
        public static final String unverifyReportHistory = emrArchive + ".UNVERIFY_REPORT_HISTORY  ";
        public static final String orderAction = emrArchive + ".ORDER_ACTIONS  ";
        public static final String partiallyVerifyHistory = emrArchive + ".PARTIAL_VERIFICATION_HISTORY  ";
        public static final String conference = emrArchive + ".CONFERENCE ";
        public static final String conferenceStudy = emrArchive + ".CONFERENCE_STUDY  ";
        public static final String venue = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String clinic = emrArchive + ".CLINIC  ";
        public static final String clinicDetail = emrArchive + ".CLINIC_DETAIL  ";
        public static final String clinicTime = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String imagingOldStudies = "DUHS.PREVIOUS_REPORTS_INVESTIGATION  ";
        public static final String radLexCode = emrArchive + ".RADLEX_CODE  ";
        public static final String MHRADPOC = emrArchive + ".MH_RAD_POC  ";

        //PATHOLOGY TABLES
        public static final String pathologyAnalyzerWiseParameter = emrArchive + ".PATH_ANALYZER_WISE_PARAMETER  ";
        public static final String CPTWiseParameter = emrArchive + ".CPT_WISE_PARAMETER  ";
        public static final String pathologysSerologyDetail = emrArchive + ".PATH_SERIOLOGY_RESULT_DETAIL  ";
        public static final String pathologyAnalyzerRanges = emrArchive + ".PATH_ANALYZER_RANGES  ";
        public static final String pathologySpecimen = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String pathologyPendingQueue = emrArchive + ".PATHOLOGY_PENDING_QUEUE  ";
        public static final String pathologyResultMaster = emrArchive + ".PATHOLOGY_RESULT_MASTER  ";
        public static final String pathologyResultDetail = emrArchive + ".PATHOLOGY_RESULT_DETAIL  ";
        public static final String workFlowComments = emrArchive + ".WORKFLOW_COMMENTS  ";

        public static final String caseAssignHistory = emrArchive + ".CASE_ASSIGN_HISTORY  ";
        public static final String pathologyResultDetailHistory = emrArchive + ".PATHOLOGY_RESULT_HISTORY  ";
        public static final String pathologyUrineResult = emrArchive + ".PATH_URINE_RESULT  ";
        public static final String pathologyStoolResult = emrArchive + ".PATH_STOOL_RESULT  ";
        public static final String pathologyBoneMarrow = emrArchive + ".PATH_BONE_MARROW_REPORT  ";
        public static final String pathologyCultureReport = emrArchive + ".PATH_CULTURE_REPORT  ";
        public static final String pathologyCultureGrowth = emrArchive + ".PATH_CULTURE_GROWTH  ";
        public static final String pathologyCultureMedicine = emrArchive + ".PATH_CULTURE_MEDICINE  ";
        public static final String pathologyCSFCytology = emrArchive + ".PATH_CSF_CYTOLOGY  ";
        public static final String pathologyCYTBiochemistry = emrArchive + ".PATH_CYT_BIOCHEMISTRY  ";
        public static final String pathologyTextReporting = emrArchive + ".PATH_TEXT_REPORTING  ";
        public static final String pathologySemenAnalysis = emrArchive + ".PATH_SEMEN_ANALYSIS  ";
        public static final String pathologySemenIntervals = emrArchive + ".PATH_SEMEN_INTERVALS  ";
        public static final String blbProductDeliveryHistory = emrArchive + ".BLB_PRODUCT_DELIVERY_HISTORY  ";

        //OPD
        public static final String ICD = emrArchive + ".ICD  ";
        public static final String ICDChapter = emrArchive + ".ICD_CHAPTER  ";
        public static final String ICDGroup = emrArchive + ".ICD_GROUP   ";
        public static final String opdPendingConsultancy = emrArchive + ".OPD_PENDING_CONSULTANCY  ";
        public static final String opdPerformedConsultancy = emrArchive + ".OPD_PERFORMED_CONSULTANCY  ";
        public static final String pregnancyHistory = emrArchive + ".PATIENT_PREGNANCY_HISTORY  ";

        public static final String medicineType = emrArchive + ".DEFINITION_TYPE_DETAIL   ";
        public static final String medicineOrderDetail = emrArchive + ".ORDER_DETAIL_MEDICINE  ";
        public static final String medicinePackageDetail = emrArchive + ".MEDICINE_PACKAGE_DETAIL  ";
        public static final String patientVitalSigns = emrArchive + ".PATIENT_VITAL_SIGNS  ";
        public static final String medicinePackage = emrArchive + ".MEDICINE_PACKAGE  ";
        public static final String patientExam = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String specialitySpecificData = emrArchive + ".SPECIALITY_DATA  ";
        public static final String specialityWiseExam = emrArchive + ".SPECIALITY_WISE_EXAM  ";
        public static final String specialityExamDetail = emrArchive + ".SPECIALITY_EXAM_DETAIL  ";
        public static final String opdExaminations = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String patientExaminationsDetail = emrArchive + ".PATIENT_EXAMINATION_DETAIL  ";
        public static final String terminalWiseEmp = emrArchive + ".TERMINAL_WISE_EMP ";
        public static final String CPTWiseItem = emrArchive + ".CPT_WISE_ITEM  ";
        public static final String userActionWiseParameter = emrArchive + ".USER_ACTION_WISE_PARAMETER  ";
        public static final String userActionPerformed = emrArchive + ".USER_ACTION_PERFORMED  ";

        public static final String waiveOff = emrArchive + ".WAIVE_OFF ";
        public static final String locationWiseSetup = emrArchive + ".LOCATION_WISE_SETUP ";

        public static final String CPTBreakupItems = emrArchive + ".CPT_BREAKUP_ITEMS ";
        public static final String ActionWiseSMSEmailInfo = emrArchive + ".ACTION_WISE_EMAILS ";

        public static final String transplantReviews = emrArchive + ".TRANSPLANT_REVIEWS ";

        public static final String CPTHistory = emrArchive + ".CPT_HISTORY ";
        public static final String locationHistory = emrArchive + ".LOCATION_HISTORY ";
        public static final String userSession = emrArchive + ".USER_SESSION ";

        public static final String setupTableColums = emrArchive + ".SETUP_TABLE_COLUMNS ";
        public static final String setupColumnDetailHistory = emrArchive + ".COLUMN_DETAIL_HISTORY ";
        public static final String propertyEditHistory = emrArchive + ".PROPERTY_EDIT_HISTORY ";

        public static final String teethExamination = emrArchive + ".TEETH_EXAMINATION ";
        public static final String teethExaminationDetail = emrArchive + ".TEETH_EXAMINATION_DETAIL ";
        public static final String uploadStudyRequest = emrArchive + ".STUDY_TRANSFER_REQUEST ";

        //HR
        public static final String employeeExperience = emrArchive + ".EMPLOYEE_EXPERIENCE  ";
        public static final String employeeDependents = emrArchive + ".EMPLOYEE_DEPENDENTS  ";
        public static final String employeeQualification = emrArchive + ".EMPLOYEE_QUALIFICATION  ";
        public static final String employeePublications = emrArchive + ".EMPLOYEE_PUBLICATIONS  ";
        public static final String employeeOtherInfo = emrArchive + ".EMPLOYEE_OTHER_INFORMATION  ";
        public static final String employeeMembership = emrArchive + ".EMPLOYEE_MEMBERSHIPS  ";
        public static final String employeeLanguages = emrArchive + ".EMPLOYEE_LANGUAGES  ";
        public static final String employeeTrainings = emrArchive + ".HR_EMPLOYEE_TRAININGS  ";
        public static final String employeePromotions = emrArchive + ".HR_PROMOTION_INCREMENT  ";
        public static final String employeeAttachment = emrArchive + ".HR_EMPLOYEE_ATTACHMENTS  ";
        public static final String leaveAttachment = emrArchive + ".HR_LEAVE_ATTACHMENTS  ";
        public static final String employeeThumbScan = emrArchive + ".HR_THUMBSCAN ";

        public static final String dutyShift = emrArchive + ".DEFINITION_TYPE_DETAIL  ";
        public static final String dutyShiftDetail = emrArchive + ".HR_DUTY_SHIFT_DETAIL  ";
        public static final String dutyRoster = emrArchive + ".HR_DUTY_ROSTER  ";
        public static final String employee = emrArchive + ".HR_EMPLOYEE  ";
        public static final String employeeHistory = emrArchive + ".HR_EMPLOYEE_HISTORY  ";
        public static final String employeePayroll = emrArchive + ".HR_PAYROLL  ";
        public static final String employeePicture = emrArchive + ".HR_EMPLOYEE_PICTURE  ";
        public static final String employeeAttendance = emrArchive + ".HR_EMPLOYEE_ATTENDANCE  ";

        public static final String leaveEntry = emrArchive + ".HR_LEAVE_ENTRY  ";
        public static final String leaveContract = emrArchive + ".HR_LEAVE_CONTRACT  ";
        public static final String employeeLeaves = emrArchive + ".HR_EMPLOYEE_LEAVES  ";
        public static final String leaveHierarchy = emrArchive + ".HR_EMP_LEAVE_HIERARCHY  ";
        //for Member Registration
        public static final String memberRegistration = emrArchive + ".MEMBER_REGISTRATION ";
        public static final String memberInfoRegistration = emrArchive + ".MEMBER_INFO_REGISTRATION ";
        public static final String memberType = emrArchive + ".DEFINITION_TYPE_DETAIL ";
        public static final String memberCity = emrArchive + ".DEFINITION_TYPE_DETAIL ";
        public static final String memberInfo = emrArchive + ".MEMBER_INFO_REGISTRATION ";
        public static final String pendingTeachingFile = emrArchive + ".PENDING_CASE_STUDY ";
        public static final String humanSystemType = emrArchive + ".DEFINITION_TYPE_DETAIL ";

        public static final String finalCaseStudy = emrArchive + ".FINAL_CASE_STUDY ";
        public static final String caseReporting = emrArchive + ".CASE_REPORTING ";
        public static final String memberPicture = emrArchive + ".MEMBER_PICTURE ";

        //new added table for hospital
        public static final String admissionUpdateHistory = emrArchive + ".ADMISSION_UPDATE_HISTORY ";
        public static final String bedTransferHistory = emrArchive + ".BED_TRANSFER_HISTORY ";
        public static final String inpatientStatusHistory = emrArchive + ".INPATIENT_STATUS_HISTORY ";

        //Missing tables 
        public static final String CPTImageReporting = emrArchive + ".CPTREPORTING  ";
        public static final String fixedAssets = emrArchive + ".FIXED_ASSETS  ";
        public static final String fixedAssetsHistory = emrArchive + ".FIXED_ASSETS_HISTORY  ";
        public static final String patientNotes = emrArchive + ".TEMP_NEW_PATIENT_NOTES ";

        public static final String patientFluidOutputMaster = emrArchive + ".PATIENT_FLUID_OUTPUT_MASTER";
        public static final String patientFluidOutputDetail = emrArchive + ".PATIENT_FLUID_OUTPUT_DETAIL";
        public static final String patientFluidInputMaster = emrArchive + ".PATIENT_FLUID_INPUT_MASTER";
        public static final String patientFluidInputDetail = emrArchive + ".PATIENT_FLUID_INPUT_DETAIL";
        public static final String medicationDispenseMaster = emrArchive + ".MEDICATION_DISPENSE_MASTER";
        public static final String medicationDispenseDetail = emrArchive + ".MEDICATION_DISPENSE_DETAIL";

        public static final String quoReceiveMaster = emrArchive + ".QUOTATION_RECEIVE_MASTER ";
        public static final String quoRequestMaster = emrArchive + ".QUOTATION_REQUEST_MASTER ";
        public static final String quoReceiveDetail = emrArchive + ".QUOTATION_RECEIVE_DETAIL ";
        public static final String quoRequestDetail = emrArchive + ".QUOTATION_REQUEST_DETAIL ";

        //Blood Bank
        //New Table For Blood Bank
        public static final String blbPendingQueue = emrArchive + ".BLB_PENDING_QUEUE";
        public static final String blbDonorPerformed = emrArchive + ".BLB_DONOR_PERFORMED";
        public static final String blbDonorQuestions = emrArchive + ".BLB_DONOR_QUESTIONS";
        public static final String blbProductOrder = emrArchive + ".BLB_PRODUCT_ORDER";
        public static final String blbAvailableProducts = emrArchive + ".BLB_AVAILABLE_PRODUCTS";
        public static final String blbDiscardedProducts = emrArchive + ".BLB_DISCARDED_PRODUCTS";
        public static final String blbBloodGrouping = emrArchive + ".BLB_BLOOD_GROUPING";
        public static String blbTempProductData = emrArchive + "." + "BLB_TEMP_PRODUCTS_DATA";

        public static String blbCrossMatchHistory = emrArchive + "." + "BLB_CROSS_MATCH_HISTORY";

        public static final String blbIssueProduct = emrArchive + ".BLB_ISSUE_PRODUCT";
        public static final String blbHoldProduct = emrArchive + ".BLB_HOLD_PRODUCT";
        public static final String blbSpecialApprovalHistory = emrArchive + ".BLB_SPECIAL_APPROVAL_HISTORY";
        public static final String blbForwardCaseHistory = emrArchive + ".BLB_FORWARD_CASE_HISTORY";
        public static final String blbProductsHistory = emrArchive + ".BLB_PRODUCT_HISTORY";
        public static final String blbDonorStatus = emrArchive + ".DEFINITION_TYPE_DETAIL";
        public static final String blbProductType = emrArchive + ".BLB_PRODUCTS_TYPE";
        public static final String blbProductStatus = emrArchive + ".DEFINITION_TYPE_DETAIL";
        public static final String blbDonorDeferralType = emrArchive + ".DEFINITION_TYPE_DETAIL";
        public static final String blbFridgeType = emrArchive + ".DEFINITION_TYPE_DETAIL";
        public static final String blbSourceType = emrArchive + ".DEFINITION_TYPE_DETAIL";
        public static final String blbDefineFridge = emrArchive + ".FRIDGE";
        public static final String blbDefineShelve = emrArchive + ".SHELVE";
        public static final String blbDefineCell = emrArchive + ".CELL";
        public static final String hospital = emrArchive + ".HOSPITAL ";
        public static final String rejectBlood = emrArchive + ".DEFINITION_TYPE_DETAIL";
        public static final String blbProductRejection = emrArchive + ".DEFINITION_TYPE_DETAIL";
        public static final String userWiseAccessQueue = emrArchive + ".USER_WISE_ACCESS_QUEUE ";

    }

    public static final class PACS {

        public static final String PACSStudies = emrArchive + ".PACS_STUDY  ";
        public static final String PACSStudyDetail = emrArchive + ".PACS_STUDY_DETAIL  ";

        public static final String PACSCPT = emrArchive + ".PACS_CPT  ";
        public static final String PACSServerPaths = emrArchive + ".PACS_SERVERS_PATH  ";
        public static final String PACSPaths = emrArchive + ".PACS_PROCESS_PATH  ";
        public static final String PACSModality = emrArchive + ".PACS_MODALITY  ";
        public static final String CDFolder = emrArchive + ".PACS_CD_FOLDER ";

    }

    public static class Inventory {

        public static final String purchaseOrderDetail = emrArchive + ".PURCHASE_ORDER_DETAIL ";
        public static final String purchaseOrderMaster = emrArchive + ".PURCHASE_ORDER_MASTER ";
        public static final String issueRequestDetailHistory = emrArchive + ".ISSUE_REQUEST_DETAIL_HISTORY ";
        public static final String storeWiseIndent = emrArchive + ".STORE_WISE_INDENT ";
        public static final String issueRequestDetail = emrArchive + ".ISSUE_REQUEST_DETAIL ";
        public static final String issueRequestMaster = emrArchive + ".ISSUE_REQUEST_MASTER ";
        public static final String issueNoteDetail = emrArchive + ".ISSUE_NOTE_DETAIL ";
        public static final String issueNoteMaster = emrArchive + ".ISSUE_NOTE_MASTER ";
        public static final String receiveDetail = emrArchive + ".RECEIVE_DETAIL ";
        public static final String receiveMaster = emrArchive + ".RECEIVE_MASTER ";
        public static final String itemLedger = emrArchive + ".ITEM_LEDGER ";
        public static final String storeWiseItems = emrArchive + ".STORE_WISE_ITEMS ";
        public static final String storeWiseItemsHistory = emrArchive + ".STORE_WISE_ITEMS_HISTORY ";
        public static final String party = emrArchive + ".PARTY ";
        public static final String store = emrArchive + ".STORE ";
        public static String itemReturnHistory = emrArchive + "." + "ITEM_RETURN_HISTORY";
        public static final String toDateValidity = emrArchive + ".DEFINITION_TYPE_DETAIL ";
        public static final String quoReceiveMaster = emrArchive + ".QUOTATION_RECEIVE_MASTER ";
        public static final String quoRequestMaster = emrArchive + ".QUOTATION_REQUEST_MASTER ";
        public static final String quoReceiveDetail = emrArchive + ".QUOTATION_RECEIVE_DETAIL ";
        public static final String quoRequestDetail = emrArchive + ".QUOTATION_REQUEST_DETAIL ";
        public static final String itemWorkFlowEvent = emrArchive + ".ITEM_WORKFLOW_EVENT ";
        public static final String itemActionEvents = emrArchive + ".ITEM_ACTION_EVENTS ";
        public static final String forwardQueue = emrArchive + ".FORWARD_QUEUE ";
        public static final String hierarchyQueue = emrArchive + ".HIERARCHY_RIGHTS ";

        public static final String itemDispenseMaster = emrArchive + ".ITEM_DISPENSE_MASTER";
        public static final String itemReturnMaster = emrArchive + ".ITEM_RETURN_MASTER";
        public static final String itemDispenseDetail = emrArchive + ".ITEM_DISPENSE_DETAIL";
        public static final String itemReturnDetail = emrArchive + ".ITEM_RETURN_DETAIL";
        public static final String toStore = emrArchive + ".STORE";
        public static final String fromStore = emrArchive + ".STORE";

        public static final String storeWiseUser = emrArchive + ".STORE_WISE_USERS";
        public static final String patientDischarge = emrArchive + ".PATIENT_DISCHARGE";
        public static final String dischargeDetail = emrArchive + ".DISCHARGE_DETAIL";
        public static final String indentTemplateMaster = emrArchive + ".INDENT_TEMPLATE_MASTER";
        public static final String indentTemplateDetail = emrArchive + ".INDENT_TEMPLATE_DETAIL";

    }

}
