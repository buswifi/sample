package com.linkedroad.util.constants;

/**
 * 
 * @author Zhiting Yang
 * 
 */
public class Constants {

  public static final String LINKEDROAD_OK = "0";

  /**
   * Pipeline 9000 - 9999
   */
  public static final String PIPELINE_CREATE_PAYLOAD_EXCEPTION = "9000";
  public static final String PIPELINE_EXECUTE_SYNCHRONOUS_STAGES_EXCEPTION = "9001";
  public static final String PIPELINE_EXECUTE_ASYNCHRONOUS_STAGES_EXCEPTION = "9002";
  public static final String PIPELINE_ABANDON_PAYLOAD_EXCEPTION = "9003";


  /**
   * User 1000 - 1999
   */
  public static final String USER_EMAIL_MISSING = "1000";

  public static final String USER_EMAIL_INVALID = "1001";

  public static final String USER_PASSWORD_MISSING = "1002";

  public static final String USER_PASSWORD_INVALID = "1003";

  public static final String USER_ALREADY_REGISTERED = "1004";

  public static final String USER_SESSIONKEY_MISSING = "1005";

  public static final String USER_SESSIONKEY_INVALID = "1006";

  public static final String USER_NOT_EXIST = "1007";

  public static final String USER_EMAIL_NOT_EXIST_IN_SYSTEM = "1008";

  public static final String USER_NEWPASSWORD_SHOULD_BE_DIFFERENT_FROM_OLDPASSWORD = "1009";

  public static final String USER_VERIFYCODE_EXPIRED = "1010";

  public static final String USER_VERIFYCODE_INVALID = "1011";

  public static final String USER_NEW_PASSWORD_MISSING = "1012";

  public static final String USER_CONFIRM_NEW_PASSWORD_MISSING = "1013";

  public static final String USER_CONFIRM_NEW_PASSWORD_INCORRECT = "1014";

  public static final String USER_FIRSTNAME_LASTNAME_NOT_MATCH_WITH_CREDIT_CARD = "1015";

  public static final String USER_DRIVER_SCHEDULEID_MISSING = "1016";

  public static final String USER_DRIVER_SCHEDULEID_INVALID = "1017";

  public static final String USER_DRIVER_ALREADY_REGISTERED = "1018";

  public static final String USER_DRIVER_SESSIONKEY_MISSING = "1019";

  public static final String USER_DRIVER_SESSIONKEY_INVALID = "1020";

  public static final String USER_DRIVER_PASSWORD_MISSING = "1021";

  public static final String USER_DRIVER_PASSWORD_INVALID = "1022";

  public static final String USER_OLD_PASSWORD_MISSING = "1023";

  public static final String USER_OLD_PASSWORD_INVALID = "1024";

  public static final String USER_DRIVER_BUSOPERATOR_ID_MISSING = "1025";

  public static final String USER_DRIVER_BUSOPERATOR_ID_INVALID = "1026";

  public static final String USER_DRIVER_PHONE_NUMBER_MISSING = "1027";

  public static final String USER_DRIVER_PHONE_NUMBER_INVALID = "1028";

  public static final String USER_PHONE_NUMBER_MISSING = "1029";

  public static final String USER_PHONE_NUMBER_INVALID = "1030";

  /**
   * Takebus 2000 - 2999
   */
  public static final String TAKEBUS_CITIES_EMPTY = "2000";

  public static final String TAKEBUS_BUSOPERATORS_EMPTY = "2001";

  public static final String TAKEBUS_STATIONS_EMPTY = "2002";

  public static final String TAKEBUS_SCHEDULE_ID_INVALID = "2003";

  public static final String TAKEBUS_SCHEDULE_INFO_ID_INVALID = "2004";

  public static final String TAKEBUS_NO_SCHEDULE_INFO_BETWEEN_THESE_CITIES = "2005";

  public static final String TAKEBUS_TIKCKET_NOT_FOUND = "2006";

  public static final String TAKEBUS_TIKCKET_NOT_MATCH_SCHEDULE_ID_DEPARTURE_DATE = "2007";

  public static final String TAKEBUS_ONEWAY_TIKCKET_NOT_ENOUGH = "2008";

  public static final String TAKEBUS_ROUNDTRIP_GO_TIKCKET_NOT_ENOUGH = "2009";

  public static final String TAKEBUS_ROUNDTRIP_RETURN_TIKCKET_NOT_ENOUGH = "2010";

  public static final String TAKEBUS_ONEWAY_NO_TIKCKET_AVAILABLE = "2011";

  public static final String TAKEBUS_ROUNDTRIP_NO_GO_TIKCKET_AVAILABLE = "2012";

  public static final String TAKEBUS_ROUNDTRIP_NO_RETURN_TIKCKET_AVAILABLE = "2013";

  public static final String TAKEBUS_NO_TICKET_PURCHASED_BY_THIS_USER = "2014";

  public static final String TAKEBUS_TICKET_HAS_BEEN_CHECKED = "2015";

  public static final String TAKEBUS_NO_SUCH_SCHEDULE_IN_THIS_DAY = "2016";

  public static final String TAKEBUS_NO_TICKET_PURCHASED_FOR_SUCH_SCHEDULE_IN_THIS_DAY = "2017";

  public static final String TAKEBUS_PAYPAL_TOKEN_INVALID = "2100";

  public static final String TAKEBUS_PAYPAL_PAY_NO_SUCC = "2101";

  public static final String TAKEBUS_PAYPAL_PAYERID_EMPTY = "2102";

  public static final String TAKEBUS_PAYPAL_PAYERID_NO_MATCH = "2103";

  public static final String TAKEBUS_PAYPAL_TOKEN_NO_MATCH = "2104";

  public static final String TAKEBUS_PAYPAL_ClaimMoney_NO_SUCC = "2105";

  public static final String TAKEBUS_PAYPAL_TRANSACTION_SESSION_EXPIRED = "2110";

  public static final String TAKEBUS_LACK_OF_FROMCITY_OR_TOCITY = "2106";

  public static final String TAKEBUS_LACK_OF_DEPARTURE_DATE = "2107";

  public static final String TAKEBUS_LACK_OF_RETURN_DATE = "2108";

  public static final String TAKEBUS_ONEWAY_STATISTIC_NO_DATA = "2019";

  public static final String TAKEBUS_ROUTES_EMPTY = "2020";

  public enum AccountType {
    USER, GUEST
  }

  public enum Role {
    CHILD, ADULT
  }

  public enum TicketType {
    ROUND_TRIP, ONE_WAY
  }

  public enum OrderStatus {
    CHARGED, PENDING, REFUND, CHARGEBACK
  }

}
