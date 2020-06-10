package cn.chinau8.util;

import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Multimap;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * 
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public final class DateHelper {
	private static String year;

	private static String month;

	private static String day;

	private static String hour;

	private static String minute;

	private static String second;

	private static String millisecond;

	private static String weekday;

	/** 日期 */
	public final static String DEFAILT_DATE_PATTERN = "yyyy-MM-dd";

	/** 日期时间 */
	public final static String DEFAILT_DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

	/** 时间 */
	public final static String DEFAULT_TIME_PATTERN = "HH:mm:ss";
	
	/**当天的起始时间时分秒*/
	public final static String DAY_START_TIME = " 00:00:00";
	
	/**当天的结束时间时分秒*/
	public final static String DAY_END_TIME = " 23:59:59";
	
	
	/**
	 * 把日期转化成指定的日期格式 返回String
	 * 
	 * @param date
	 * @return
	 */
	public static String dateToString(Date date, String format) {
		if (date == null) {
			return " ";
		}
		SimpleDateFormat df = new SimpleDateFormat(format);
		return df.format(date);
	}

	/**
	 * 把日期转化成指定的日期格式 返回String
	 * 
	 * @param date
	 * @return
	 * @throws
	 */
	public static Date stringToDate(String date, String format) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		try {
			return df.parse(date);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	public static Date stringToDateCommon(String date) {
		return stringToDate(date, DEFAILT_DATE_TIME_PATTERN);
	}

	public static String dateToStringCommon(Date date) {
		return dateToString(date, DEFAILT_DATE_TIME_PATTERN);
	}

	private static String[] weekday_gb = { "星期日", "星期一", "星期二", "星期三", "星期四",
			"星期五", "星期六" };

	private final static void setCurrentDate() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		year = String.valueOf(cal.get(Calendar.YEAR));
		month = String.valueOf(cal.get(Calendar.MONTH) + 1);
		if (month.length() == 1) {
			month = "0" + month;
		}
		day = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
		if (day.length() == 1) {
			day = "0" + day;
		}
		hour = String.valueOf(cal.get(Calendar.HOUR_OF_DAY));
		if (hour.length() == 1) {
			hour = "0" + hour;
		}
		minute = String.valueOf(cal.get(Calendar.MINUTE));
		if (minute.length() == 1) {
			minute = "0" + minute;
		}
		second = String.valueOf(cal.get(Calendar.SECOND));
		if (second.length() == 1) {
			second = "0" + second;
		}
		weekday = weekday_gb[cal.get(Calendar.DAY_OF_WEEK) - 1];
		millisecond = String.valueOf(cal.get(Calendar.MILLISECOND));

	}

	public final static String getCurrentWeekDay() {
		setCurrentDate();
		return weekday;
	}

	public final static String getCurrentYear() {
		setCurrentDate();
		return year;
	}

	public final static String getCurrentMonDay() {
		setCurrentDate();
		return month + day;
	}

	public final static String getCurrentYearMonDay() {
		setCurrentDate();
		return year.substring(2) + month + day;
	}

	public final static String getCurrentFullYearMonDay() {
		setCurrentDate();
		return year + month + day;
	}

	public final static String getCurrentTime() {
		setCurrentDate();
		return year + "-" + month + "-" + day + " " + hour + ":" + minute + ":"
				+ second;
	}

	public final static String getLastYearMon() {
		setCurrentDate();
		if (Integer.parseInt(month) == 1) {
			return getLastYear() + "12";
		} else {
			String lastMonth = String.valueOf(Integer.parseInt(month) - 1);
			if (lastMonth.length() == 1) {
				lastMonth = "0" + lastMonth;
			}
			return year + lastMonth;
		}
	}

	public final static String getNextYearMon() {
		setCurrentDate();
		if (Integer.parseInt(month) == 12) {
			return getNextYear() + "1";
		} else {
			String nextMonth = String.valueOf(Integer.parseInt(month) + 1);
			if (nextMonth.length() == 1) {
				nextMonth = "0" + nextMonth;
			}
			return year + "-" + nextMonth;
		}
	}

	public final static String getLastYear() {
		setCurrentDate();
		int lastYear = Integer.parseInt(year) - 1;
		return String.valueOf(lastYear);
	}

	public final static String getNextYear() {
		setCurrentDate();
		int nextYear = Integer.parseInt(year) + 1;
		return String.valueOf(nextYear);
	}

	public final static String getCurrentMonth() {
		setCurrentDate();
		return month;
	}
	
	public final static String getCurrentDay() {
		setCurrentDate();
		return day;
	}
	
	public final static String getCurrentHour() {
		setCurrentDate();
		return hour;
	}

	public final static String getCurrentYearMon() {
		setCurrentDate();
		return year + "-" + month;
	}

	public final static String getCurrentDate() {
		setCurrentDate();
		return year + "-" + month + "-" + day;
	}
	
	public final static String getCurrentDateGBK() {
		setCurrentDate();
		return year + "年" + month + "月" + day + "日";
	}

	public static Date parseDate(String datestr) {
		if (datestr != null && datestr.length() >= 19) {
			// datestr = datestr.substring(0,19);
			SimpleDateFormat df = new SimpleDateFormat(
					"yyyy-MM-dd'T'HH:mm:ss.SSS");
			try {
				//与国际化时区冲突，默认时区为系统自带的时区
				//df.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
				return df.parse(datestr);
			} catch (ParseException e) {
				e.printStackTrace();
				throw new RuntimeException(e.getMessage());
			}
		}
		throw new RuntimeException(
				"日期格式不规范，必须为类似[2007-06-16T11:03:09.000+08:00]的格式");
	}
	
	public static Date getStartTimeOfYear() {
		setCurrentDate();
		return parseDate(year + "-01-01T00:00:00.000");
	}
	
	public static Date getEndTimeOfYear() {
		setCurrentDate();
		return parseDate(year + "-12-31T23:59:59.000");
	}
	
	public static Date getStartTimeOfMonth() {
		setCurrentDate();
		return parseDate(year + "-" + month + "-01T00:00:00.000");
	}
	
	public static Date getStartTimeOfMonth(int month) {
		setCurrentDate();
		return parseDate(year + "-" + (month > 9 ? month : "0" + month) + "-01T00:00:00.000");
	}
	
	public static Date getEndTimeOfMonth() {
		setCurrentDate();
		Calendar currCal = Calendar.getInstance();    
        int days = currCal.getActualMaximum(Calendar.DAY_OF_MONTH);  
		return parseDate(year + "-" + month + "-" + days + "T23:59:59.000");
	}
	
	public static Date getEndTimeOfMonth(int month) {
		setCurrentDate();
		Calendar currCal = Calendar.getInstance();
        int days = currCal.getActualMaximum(Calendar.DAY_OF_MONTH);  
		return parseDate(year + "-" + (month > 9 ? month : "0" + month) + "-" + days + "T23:59:59.000");
	}
	
	public static Date getStartTimeOfDay() {
		setCurrentDate();
		return parseDate(year + "-" + month + "-" + day + "T00:00:00.000");
	}
	
	public static Date getStartTimeOfDay(int day) {
		setCurrentDate();
		return parseDate(year + "-" + month + "-" + (day > 9 ? day : "0" + day) + "T00:00:00.000");
	}
	
	public static Date getEndTimeOfDay() {
		setCurrentDate();
		return parseDate(year + "-" + month + "-" + day + "T23:59:59.000");
	}
	
	public static Date getEndTimeOfDay(int day) {
		setCurrentDate();
		return parseDate(year + "-" + month + "-" + (day > 9 ? day : "0" + day) + "T23:59:59.000");
	}
	
	public static Date getStartTimeOfHour(int hour) {
		setCurrentDate();
		return parseDate(year + "-" + month + "-" + day + "T" + (hour > 9 ? hour : "0" + hour) + ":00:00.000");
	}
	
	public static Date getEndTimeOfHour(int hour) {
		setCurrentDate();
		return parseDate(year + "-" + month + "-" + day + "T" + (hour > 9 ? hour : "0" + hour) + ":59:59.000");
	}
	
	public static int getTotalDaysOfCurrentMonth() {
		Calendar currCal = Calendar.getInstance();
		return currCal.getActualMaximum(Calendar.DAY_OF_MONTH);
	}
	
	/**
	 * 把日期转化成指定的日期格式 返回String
	 * @description 将yyyy/MM/dd 转换为yyyy-MM-dd 
	 * @param date
	 * @return
	 * @throws
	 */
	public static Date stringToDateNoFormat(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd ");
		DateFormat  formatterdate = new SimpleDateFormat("yyyy-MM-dd ");
		try {
			 Date oldDate = sdf.parse(date);			 
			 String stringdate = format.format(oldDate);			 
			 Date newDate = formatterdate.parse(stringdate); 			 			 
			return newDate;
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
	

	/**
	 * 取得今天占当月天数的比例
	 * */
	public static BigDecimal getCurrentDayOfMonth()
	{
		Calendar a = Calendar.getInstance();
        int dayOfMonth = a.get(Calendar.DAY_OF_MONTH);
		//把日期设置为当月第一天
		a.set(Calendar.DATE, 1);
		//日期回滚一天，也就是最后一天
		a.roll(Calendar.DATE, -1);
		int maxDate = a.get(Calendar.DATE);
		double b = dayOfMonth/(double)maxDate;
		BigDecimal rate = new BigDecimal(b);
		return rate;
	}

	//根据起始时间求月份列表
	public static List<String> getMonthList(String start, String end) {
		List<String> dlist=new ArrayList<String>();
		int num = 0;
		// 把开始时间加入集合
		dlist.add(start);
		//开始时间和结束时间一致
		if(start.equals(end)){
			return dlist;
		}
		boolean bContinue = true;
		String begin=start;
		while (bContinue) {
			//获得一个月后日期
			String after = getSpecifiedDayMonth(begin);
			begin=after;
			if (!after.equals(end)) {
				dlist.add(after);
			} else {
				break;
			}
			if (num > 15){
				break;
			}
		}
		// 把结束时间加入集合
		dlist.add(end);
		return dlist;
	}

	//根据起始时间求日期列表
	public static List<String> getDateList(String start, String end) {
		List<String> dList=new ArrayList<String>();
		int num = 0;
		// 把开始时间加入集合
		dList.add(start);
		//开始时间和结束时间一致
		if(start.equals(end)){
			return dList;
		}
		boolean bContinue = true;
		String begin=start;
		while (bContinue) {
			//获得一天后日期
			String after = getSpecifiedDayAfter(begin);
			begin=after;
			if (!after.equals(end)) {
				dList.add(after);
			} else {
				break;
			}
			num++;
			if (num > 50){
				break;
			}
		}
		// 把结束时间加入集合
		dList.add(end);
		return dList;
	}

    //根据起始时间求日期列表
    public static List<String> getDateIntList(String start, String end){
        List<String> dList=new ArrayList<String>();
        // 把开始时间加入集合
        dList.add(stringToDate(start, "yy-MM-dd").getDate() + "");
        //开始时间和结束时间一致
        if(start.equals(end)){
            return dList;
        }
        boolean bContinue = true;
        String begin=start;
        while (bContinue) {
            //获得一天后日期
            String after = getSpecifiedDayAfter(begin);
            begin=after;
            if (!after.equals(end)) {
                dList.add(stringToDate(after, "yy-MM-dd").getDate() + "");
            } else {
                break;
            }
        }
        // 把结束时间加入集合
        dList.add(stringToDate(end, "yy-MM-dd").getDate() + "");
        return dList;
    }

	//根据起始时间求日期列表
	public static List<String> getDate(String start, String end, String fmt){
		List<String> dList=new ArrayList<String>();
		int num = 0;
		// 把开始时间加入集合
		dList.add(dateToString(stringToDate(start, "yy-MM-dd"), fmt));
		//开始时间和结束时间一致
		if(start.equals(end)){
			return dList;
		}
		boolean bContinue = true;
		String begin=start;
		while (bContinue) {
			//获得一天后日期
			Calendar c = Calendar.getInstance();
			Date date=null;
			try {
				date = new SimpleDateFormat("yyyy-MM-dd").parse(begin);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			c.setTime(date);
			int day=c.get(Calendar.DATE);
			c.set(Calendar.DATE,day+1);
			String dayAfter=new SimpleDateFormat(fmt).format(c.getTime());
			String after=new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
			begin=after;
			if (!after.equals(end)) {
				dList.add(dayAfter);
			} else {
				break;
			}
			num++;
			if (num > 50){
				break;
			}
		}
		// 把结束时间加入集合
		dList.add(dateToString(stringToDate(end, "yy-MM-dd"), fmt));
		return dList;
	}
	/**
	 * 获得指定日期的后一天
	 * @param specifiedDay
	 * @return
	 */
	public static String getSpecifiedDayAfter(String specifiedDay){
		Calendar c = Calendar.getInstance();
		Date date=null;
		try {
			date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		c.setTime(date);
		int day=c.get(Calendar.DATE);
		c.set(Calendar.DATE,day+1);
		String dayAfter=new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
		return dayAfter;
	}
	/**
	 * 获得指定日期一个月后的时间
	 * @param specifiedDay
	 * @return
	 */
	public static String getSpecifiedDayMonth(String specifiedDay){
		Calendar c = Calendar.getInstance();
		Date date=null;
		try {
			date = new SimpleDateFormat("yy-MM").parse(specifiedDay);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		c.setTime(date);
		int month=c.get(Calendar.MONTH);
		c.set(Calendar.MONTH,month+1);
		String dayAfter=new SimpleDateFormat("yyyy-MM").format(c.getTime());
		return dayAfter;
	}

	/**
	 * 获得指定日期一个月后的时间
	 * @param specifiedDay
	 * @return
	 */
	public static Date getSpecifiedDayMonth(Date specifiedDay){
		Calendar c = Calendar.getInstance();
		c.setTime(specifiedDay);
		int month=c.get(Calendar.MONTH);
		c.set(Calendar.MONTH,month+1);
		Date monthAfter =  c.getTime();
		return monthAfter;
	}


	/**
	 * @Author zxf
	 * @Description // 根据周期获取每月的执行次数
	 * @Date 2019/10/21 9:13
	 * @Param [planStartDate - 计划开始时间, inspectionDate- 巡检开始时间, executecyclevalue-数量, executecycletype 3-天;4-周;5-月]
	 * @return com.google.common.collect.Multimap<java.lang.String,java.lang.Object>
	 */
	public static Multimap<String, Object> getMonthNum(Date planStartDate, Date inspectionDate, Integer executecyclevalue, Integer executecycletype){
		Calendar c = Calendar.getInstance();
		c.setTime(inspectionDate);
		Date endDate = DateHelper.getDayAferYear(planStartDate, 1);
		String endDateStr = DateHelper.dateToString(endDate, "yyyy-M");
		String startDateStr = DateHelper.dateToString(inspectionDate, "yyyy-M");
		String yearMonth = "";
		Date afterDate = planStartDate;
        int day = 0;
        int month = 0;
		List<Integer> monthNum = new ArrayList<>();
		Multimap<String, Object> myMultimap = LinkedListMultimap.create();
        myMultimap.put(startDateStr, inspectionDate.getDate());
		while (afterDate.compareTo(endDate) < 0) {
            day = c.get(Calendar.DATE);
            month = c.get(Calendar.MONTH);
			switch (executecycletype) {
				//天
				case 3:
					c.set(Calendar.DATE, day + executecyclevalue);
					break;
				//周
				case 4:
					c.set(Calendar.DATE, day + executecyclevalue * 7);
					break;
				//月
				case 5:
					c.set(Calendar.MONTH, month + executecyclevalue);
					break;
				default:
					break;
			}
			afterDate = c.getTime();
			yearMonth = c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1);
			myMultimap.put(yearMonth, c.get(Calendar.DATE));
		}
        myMultimap.removeAll(yearMonth);
		return myMultimap;
	}

	public static void main(String[] args) {
		try {
			MyDefaultHandler defaultHandler = new MyDefaultHandler();
			SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
			parser.parse(new File("D:\\WorkSpace//unicare0911//unicareback//src//main//resources//persion.xml"),
					defaultHandler);
			System.out.println(defaultHandler.toString());
			List<BooksBean> list = defaultHandler.getBooks();
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static Integer test(Integer num){
		Integer c = null;
		try {
			c = 10/num;
		}catch (Exception e){
			System.out.println("error");
		}
		return c;
	}

	/**
	 * 获取 当前年、半年、季度、月、日、小时 开始结束时间
	 */
	private final static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
	private final static SimpleDateFormat shortSdf = new SimpleDateFormat("yyyy-MM-dd");
	private final static SimpleDateFormat longHourSdf = new SimpleDateFormat("yyyy-MM-dd HH");;
	private final static SimpleDateFormat longSdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");;

	/**
	 * 获得本天的开始时间
	 *return String类型 "yyyy-MM-dd"
	 * @return
	 */
	public static String getCurrentDayStartDate() {
		Date now = new Date();
		String date = "";
		try {
			date = shortSdf.format(now);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 获得本月的开始时间
	 *
	 * @return
	 */
	public static String getCurrentMonthStartDate() {
		Calendar c = Calendar.getInstance();
		Date now = null;
		String date = "";
		try {
			c.set(Calendar.DATE, 1);
			date = shortSdf.format(c.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 本月的结束时间
	 *
	 * @return
	 */
	public static String getCurrentMonthEndDate() {
		Calendar c = Calendar.getInstance();
		Date now = null;
		String date = "";
		try {
			c.set(Calendar.DATE, 1);
			c.add(Calendar.MONTH, 1);
			c.add(Calendar.DATE, -1);
			date = shortSdf.format(c.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 获得本天的结束时间
	 *
	 * @return
	 */
	public static String getCurrentDayEndDate() {
		Date now = new Date();
		String date = "";
		try {
			date = shortSdf.format(now) + " 23:59:59";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * @Author zxf
	 * @Description // 获取num年前到今年的年份列表
	 * @Date 2019/03/25 11:03
	 * @Param [num]
	 * @return java.util.List<java.lang.String>
	 */
	public static List<String> getYearListBefore(Integer num) {
		List<String> dList=new ArrayList<String>();
		Integer year = Integer.parseInt(getCurrentYear());
		Integer startYear = year - num;
		for (int i =0 ; i <= num; i++){
			dList.add(String.valueOf(startYear + i));
		}
		return dList;
	}

	/**
	 * 获得本周的第一天
	 *return String类型 "yyyy-MM-dd"
	 * @return
	 */
	public static String getCurrentWeekDayStartDate() {
		Calendar c = Calendar.getInstance();
		String date = "";
		try {
			int dayofweek = c.get(Calendar.DAY_OF_WEEK);
			if (dayofweek == 1) {
				dayofweek += 7;
			}
			c.add(Calendar.DATE, 2 - dayofweek);
			date = shortSdf.format(c.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}
	/**
	 * 获得本周的最后一天，周日
	 *return String类型 "yyyy-MM-dd"
	 * @return
	 */
	public static String getCurrentWeekDayEndDate() {
		String date = "";
		Calendar calendar = Calendar.getInstance();
		calendar.setFirstDayOfWeek(Calendar.MONDAY);
		calendar.setTime(new Date());
		calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek());
		date = shortSdf.format(calendar.getTime());
		return date;
	}

	/**
	 * 获得下周的第一天
	 *return String类型 "yyyy-MM-dd"
	 * @return
	 */
	public static String getNextWeekDayStartDate() {
		String date = "";
		Calendar calendar = Calendar.getInstance();
		calendar.setFirstDayOfWeek(Calendar.MONDAY);
		calendar.setTime(new Date());
		calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek());
		calendar.add(Calendar.DATE, 7);
		date = shortSdf.format(calendar.getTime());
		return date;
	}

	/**
	 * 获得当天n天后的日期
	 *return String类型 "yyyy-MM-dd"
	 * @return
	 */
	public static String getDayAferOneDay(String specifiedDay, int num) {
		Calendar c = Calendar.getInstance();
		Date date=null;
		try {
			date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		c.setTime(date);
		int day=c.get(Calendar.DATE);
		c.set(Calendar.DATE,day + num);
		String dayAfter=new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
		return dayAfter;
	}

	/**
	 * 获得当天n年后后的日期
	 * date
	 * @return
	 */
	public static Date getDayAferYear(Date date, int num) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		int year = c.get(Calendar.YEAR);
		c.set(Calendar.YEAR, year + num);
		return c.getTime();
	}

    /**
     * 获得n月后的日期
     * date
     * @return
     */
    public static Date getDayAferMonth(Date date, int num) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MONTH, num);
        return c.getTime();
    }

	/**
	 * 获得季度的开始时间
	 * return String类型 "yyyy-MM-dd"
	 * @return
	 */
	public static String getQuarterStart(Integer quarter){
		String startDate = getCurrentYear() + "-" + ((quarter - 1) * 3 + 1) + "-01";
		return startDate;
	}
	/**
	 * 获得季度的结束时间
	 * return String类型 "yyyy-MM-dd"
	 * @return
	 */
	public static String getQuarterEnd(Integer quarter){
        String endDate;
	    if(quarter < 4){
	        endDate = getCurrentYear() + "-" + (quarter * 3 + 1) + "-01";
        }else{
            endDate = (Integer.valueOf(getCurrentYear())+1) + "-01-01";
        }

		return endDate;
	}

    /**
     * 通过当前日期  获取结束时间
     * return String类型 "yyyy-MM-dd"
     * @return
     */
    public static String getQuarterEndByNow(Integer quarter){
        String endDate;

        //获取当前月份
        int month = Integer.valueOf(getCurrentMonth());

        //获取当前季度
        int curQuarter = getQuarterByDate(new Date());

        if(quarter != curQuarter){
            endDate = getQuarterEnd(quarter);
        }else{
            //如果是本季度第一个月  结束时间是第一个月
            if(month == (quarter * 3-2)){
                endDate = getCurrentYear() + "-" + (month+1) + "-01";
            }else if(month == (quarter * 3-1)){
                //如果是本季度第二个月  结束时间取1到2月
                endDate = getCurrentYear() + "-" + (month+1) + "-01";
            }else{
                endDate = getQuarterEnd(quarter);
            }
        }

        return endDate;
    }

	/**
	 * @Author zxf
	 * @Description // 获取某年某个季度的开始时间
	 * @Date 2019/07/09 16:38
	 * @Param [quarter, year]
	 * @return java.lang.String
	 */
	public static String getQuarterStart(Integer quarter, Integer year){
		String startDate = year + "-" + ((quarter - 1) * 3 + 1) + "-01";
		return startDate;
	}
	/**
	 * @Author zxf
	 * @Description // 获取某年某个季度的结束时间
	 * @Date 2019/07/09 16:38
	 * @Param [quarter, year]
	 * @return java.lang.String
	 */
	public static String getQuarterEnd(Integer quarter, Integer year){
		String endDate = year + "-" + (quarter * 3 + 1) + "-01";
		return endDate;
	}

	/**
	 * 获得某天的结束时间
	 * return String类型 "yyyy-MM-dd"
	 * @return
	 */
	public static Date getEndTimeOfDay(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY,23);
		calendar.set(Calendar.MINUTE,59);
		calendar.set(Calendar.SECOND,59);
		calendar.set(Calendar.MILLISECOND,999);
		Date endDate = calendar.getTime();
		return endDate;
	}

    /**
     * 根据日期  获取当前季度
     * @param date
     * @return
     */
    public static int getQuarterByDate(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int month = calendar.get(calendar.MONTH) + 1;
        int quarter = 0;
        //判断季度
        if (month >= 1 && month <= 3) {
            quarter = 1;
        } else if (month >= 4 && month <= 6) {
            quarter = 2;
        } else if (month >= 7 && month <= 9) {
            quarter = 3;
        } else {
            quarter = 4;
        }
        return quarter;
    }

	/**
	 * 获得日期的年替换过期的getYear
	 * return int
	 * @return
	 */
	public static int getYear(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR);
	}

	/**
	 * 获得日期的年替换过期的获取月
	 * return int
	 * @return
	 */
	public static int getMonth(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH);
	}

	/**
	 * 获得日期的年替换过期的getYears
	 * return int
	 * @return
	 */
	public static int getDay(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DATE);
	}

	/**
	 * 获得日期的年替换过期的获取时
	 * return int
	 * @return
	 */
	public static int getHour(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.HOUR);
	}


	/**
	 * 获得日期的年替换过期的获取分
	 * return int
	 * @return
	 */
	public static int getMinute(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MINUTE);
	}


	/**
	 * 获得日期的年替换过期的获取秒
	 * return int
	 * @return
	 */
	public static int getSecond(Date date){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.SECOND);
	}

	/**
	 *
	 * 描述两个时间相隔的年丰
	 *
	 * @return
	 */
	public static Integer getYears(Date maxDate, Date minDate) {
		Calendar bef = Calendar.getInstance();
		bef.setTime(minDate);
		Calendar aft = Calendar.getInstance();
		aft.setTime(maxDate);
		int year = aft.get(Calendar.YEAR) - bef.get(Calendar.YEAR);
		return year;
	}
}
