/**
 * Copyright 2018-2025 CMCC.
 */
package com.cm.cmdc.common.constant;

/**
 * 错误代码类
 * 
 * @author zhuxiuhong
 * @since 2018
 */
public class ErrorCodeConst {

	private ErrorCodeConst() {
	}

	/**
	 * 用于校验字段.
	 */
	public static final String ERR_REQ_HEAD_EMPTY = "framework.request.head.null";
	public static final String ERR_REQ_DATA_EMPTY = "framework.request.data.null";
	public static final String ERR_FIELD_DATA_EMPTY = "framework.field.blank";
	public static final String ERR_FIELD_NUM_MAX = "framework.field.num.max";
	public static final String ERR_FIELD_NUM_MIN = "framework.field.num.min";
	public static final String ERR_FIELD_STRING_LENGTH = "framework.field.string.length";
	
	public static final String ERR_FIELD_DATE_FUTURE = "framework.field.date.future";
	public static final String ERR_FIELD_DATE_PAST = "framework.field.string.past";

	/**
	 * 每页显示记录数量为空
	 */
	public static final String ERR_PAGE_SIZE_NULL = "framework.page.pagesize.null";
	/**
	 * 每页显示记录数量不能小于1
	 */
	public static final String ERR_PAGE_SIZE_LESSTHANONE = "framework.page.pagesize.lessthanone";
	/**
	 * 每页显示记录数量太大
	 */
	public static final String ERR_PAGE_SIZE_BIG = "framework.page.pagesize.big";
	/**
	 * 当前页为空
	 */
	public static final String ERR_PAGE_CURRENTPAGE_NULL = "framework.page.currentpage.null";
	/**
	 * 当前页不能小于1
	 */
	public static final String ERR_PAGE_CURRENTPAGE_LESSTHANONE = "framework.page.currentpage.lessthanone";

	/**
	 * 不能所有的条件都为空, 至少需要设置一个条件
	 */
	public static final String ERR_ALL_CONDITIONS_NULL = "framework.allConditions.null";
	public static final String ERR_CLIENT_CONDITION_NULL = "framework.client.condition.null";
	public static final String ERR_CLIENT_CONDITION_PAGE_PARAM_NULL = "framework.client.condition.page.param.null";

	/**
	 * 需要再另外设置一个或多个条件.
	 */
	public static final String ERR_OTHER_CONDITIONS_NULL = "framework.otherConditions.null";

	public static final String ERR_ELEMENT_NULL = "framework.element.null";

	/**
	 * uuid 不能为空.
	 */
	public static final String ERR_UUID_NULL = "framework.uuid.null";

	/**
	 * 数据不能为空.
	 */
	public static final String ERR_MSG_DATA_NULL = "framework.data.null";

	/**
	 * 条件不能为空. 未传 data
	 */
	public static final String ERR_CONDITION_NULL = "framework.condition.null";

	/**
	 * 数据插入失败.
	 */
	public static final String MSG_INSERT_FAILED = "framework.insert.failed";
	/**
	 * 数据更新失败.
	 */
	public static final String MSG_UPDATE_FAILED = "framework.update.failed";
	/**
	 * 数据删除失败.
	 */
	public static final String MSG_DELETE_FAILED = "framework.delete.failed";

	/**
	 * @null 验证对象是否为空
	 * 
	 * @notnull 验证对象是否为非空 long 型
	 * 
	 * @NotBlank 验证对象string非空
	 * 
	 * @NotEmpty 验证List 非空
	 * 
	 * @asserttrue 验证 boolean 对象是否为 true
	 * 
	 * @assertfalse 验证 boolean 对象是否为 false
	 * 
	 * @min 验证 number 和 string 对象是否大等于指定的值
	 * 
	 * @max 验证 number 和 string 对象是否小等于指定的值
	 * 
	 * @decimalmin 验证 number 和 string 对象是否大等于指定的值，小数存在精度
	 * 
	 * @decimalmax 验证 number 和 string 对象是否小等于指定的值，小数存在精度
	 * 
	 * @size 验证对象（array,collection,map,string）长度是否在给定的范围之内
	 * 
	 * @digits 验证 number 和 string 的构成是否合法
	 * 
	 * @past 验证 date 和 calendar 对象是否在当前时间之前
	 * 
	 * @future 验证 date 和 calendar 对象是否在当前时间之后
	 * 
	 * @pattern 验证 string 对象是否符合正则表达式的规则
	 * 
	 * @Email 验证邮箱
	 * 
	 * @size (min=3, max=20, message="用户名长度只能在3-20之间")
	 * 
	 * @size (min=6, max=20, message="密码长度只能在6-20之间")
	 * 
	 * @pattern (regexp="[a-za-z0-9._%+-]+@[a-za-z0-9.-]+\\.[a-za-z]{2,4}", message="邮件格式错误")
	 * 
	 * @Length(min = 5, max = 20, message = "用户名长度必须位于5到20之间")
	 * 
	 * @Email(message = "比如输入正确的邮箱")
	 * 
	 * @NotNull(message = "用户名称不能为空")
	 * @Max(value = 100, message = "年龄不能大于100岁")
	 * 						@Min(value= 18 ,message= "必须年满18岁！" )
	 * @AssertTrue(message = "bln4 must is true")
	 * 
	 * 
	 * @AssertFalse(message = "blnf must is falase")
	 * @DecimalMax(value="100",message="decim最大值是100")
	 * 																								DecimalMin(value="100",message="decim最小值是100")
	 * 																								@NotNull(message = "身份证不能为空")
	 * @Pattern(regexp="^(\\d{18,18}|\\d{15,15}|(\\d{17,17}[x|X]))$", message="身份证格式错误")
	 */

}
