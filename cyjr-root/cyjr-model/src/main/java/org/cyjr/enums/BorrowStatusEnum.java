package org.cyjr.enums;

import java.util.HashMap;
import java.util.Map;

/** 
* @ClassName: BorrowTypeEnum 
* @Description: 标状态枚举
* @author liyongfu@tomcat360.com
* @date 2016年10月10日 下午7:47:14 
* @copyright 浙江雄猫软件开发有限公司 
*/
public enum BorrowStatusEnum {
	/**
	 * 标状态：0（等待初审）
	 */
	BORROW_STATUS_DDCS(0,"等待初审"),
	
	/**
	 * 标状态：1（初审通过）
	 */
	BORROW_STATUS_CSTG(1,"初审通过，可投标"),
	
	/**
	 * 标状态：2（满标待复审）
	 */
	BORROW_STATUS_MBDFS(2,"满标待复审"),
	
	/**
	 * 标状态：3（复审通过）
	 */
	BORROW_STATUS_FSTG(3,"复审通过"),
	
	/**
	 * 标状态：5（还款中）
	 */
	BORROW_STATUS_HKZ(5,"还款中"),
	
	/**
	 * 标状态：6（已还款）
	 */
	BORROW_STATUS_YHK(6,"已还款"),
	
	/**
	 * 标状态：7（已经过期）
	 */
	BORROW_STATUS_YGQ(7,"已经过期"),
	
	/**
	 * 标状态：11（成功完成）
	 */
	BORROW_STATUS_CGWC(11,"成功完成"),
	
	/**
	 * 标状态：41（初审不通过）
	 */
	BORROW_STATUS_CSSB(41,"初审不通过"),
	
	/**
	 * 标状态：42（初审不通过）
	 */
	BORROW_STATUS_FSSB(42,"复审不通过");
	
	private Integer value;

    private String message;

    private BorrowStatusEnum(Integer value, String message) {
        this.value = value;
        this.message = message;
    }

    public Integer getValue() {
        return value;
    }

    public String getMessage() {
        return message;
    }

    public static BorrowStatusEnum getByValue(Integer value) {
        if (value != null) {
            for (BorrowStatusEnum enu : values()) {
                if (enu.value.equals(value)) {
                    return enu;
                }
            }
        }
        return null;
    }
    
    public static Map<String, String> enumToMap() {
        Map<String, String> map = new HashMap<String, String>();
        for (BorrowStatusEnum enu : values()) {
            map.put(enu.value + "", enu.message);
        }
        return map;
    }
}
