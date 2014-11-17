/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain;

/**
 * This class is generated by jOOQ.
 *
 * A class modelling foreign key relationships between tables of the <code>breakfast</code> 
 * schema
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfAddressRecord> KEY_T_BF_ADDRESS_PRIMARY = UniqueKeys0.KEY_T_BF_ADDRESS_PRIMARY;
	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfCouponRecord> KEY_T_BF_COUPON_PRIMARY = UniqueKeys0.KEY_T_BF_COUPON_PRIMARY;
	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfCustomerServiceRecord> KEY_T_BF_CUSTOMER_SERVICE_PRIMARY = UniqueKeys0.KEY_T_BF_CUSTOMER_SERVICE_PRIMARY;
	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfCustomOrderDetailRecord> KEY_T_BF_CUSTOM_ORDER_DETAIL_PRIMARY = UniqueKeys0.KEY_T_BF_CUSTOM_ORDER_DETAIL_PRIMARY;
	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfExpressRecord> KEY_T_BF_EXPRESS_PRIMARY = UniqueKeys0.KEY_T_BF_EXPRESS_PRIMARY;
	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfFeedbackRecord> KEY_T_BF_FEEDBACK_PRIMARY = UniqueKeys0.KEY_T_BF_FEEDBACK_PRIMARY;
	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfFileRecord> KEY_T_BF_FILE_PRIMARY = UniqueKeys0.KEY_T_BF_FILE_PRIMARY;
	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfFoodRecord> KEY_T_BF_FOOD_PRIMARY = UniqueKeys0.KEY_T_BF_FOOD_PRIMARY;
	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfFoodCustomRecord> KEY_T_BF_FOOD_CUSTOM_PRIMARY = UniqueKeys0.KEY_T_BF_FOOD_CUSTOM_PRIMARY;
	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfFoodDetailRecord> KEY_T_BF_FOOD_DETAIL_PRIMARY = UniqueKeys0.KEY_T_BF_FOOD_DETAIL_PRIMARY;
	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfGradeRecord> KEY_T_BF_GRADE_PRIMARY = UniqueKeys0.KEY_T_BF_GRADE_PRIMARY;
	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfOrderRecord> KEY_T_BF_ORDER_PRIMARY = UniqueKeys0.KEY_T_BF_ORDER_PRIMARY;
	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfOrderDetailRecord> KEY_T_BF_ORDER_DETAIL_PRIMARY = UniqueKeys0.KEY_T_BF_ORDER_DETAIL_PRIMARY;
	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfPhotoShowRecord> KEY_T_BF_PHOTO_SHOW_PRIMARY = UniqueKeys0.KEY_T_BF_PHOTO_SHOW_PRIMARY;
	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfRawMaterialRecord> KEY_T_BF_RAW_MATERIAL_PRIMARY = UniqueKeys0.KEY_T_BF_RAW_MATERIAL_PRIMARY;
	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfSetFoodsRecord> KEY_T_BF_SET_FOODS_PRIMARY = UniqueKeys0.KEY_T_BF_SET_FOODS_PRIMARY;
	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfSetMealRecord> KEY_T_BF_SET_MEAL_PRIMARY = UniqueKeys0.KEY_T_BF_SET_MEAL_PRIMARY;
	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfUserRecord> KEY_T_BF_USER_PRIMARY = UniqueKeys0.KEY_T_BF_USER_PRIMARY;
	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfUserCustomerRecord> KEY_T_BF_USER_CUSTOMER_PRIMARY = UniqueKeys0.KEY_T_BF_USER_CUSTOMER_PRIMARY;
	public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBrUserCourierRecord> KEY_T_BR_USER_COURIER_PRIMARY = UniqueKeys0.KEY_T_BR_USER_COURIER_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfAddressRecord> KEY_T_BF_ADDRESS_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBfAddress.tBfAddress, com.breakfast.domain.tables.TBfAddress.tBfAddress.ADDDRESS_ID);
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfCouponRecord> KEY_T_BF_COUPON_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBfCoupon.tBfCoupon, com.breakfast.domain.tables.TBfCoupon.tBfCoupon.COUPON_ID);
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfCustomerServiceRecord> KEY_T_BF_CUSTOMER_SERVICE_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBfCustomerService.tBfCustomerService, com.breakfast.domain.tables.TBfCustomerService.tBfCustomerService.USER_ID);
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfCustomOrderDetailRecord> KEY_T_BF_CUSTOM_ORDER_DETAIL_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBfCustomOrderDetail.tBfCustomOrderDetail, com.breakfast.domain.tables.TBfCustomOrderDetail.tBfCustomOrderDetail.DETAIL_ID);
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfExpressRecord> KEY_T_BF_EXPRESS_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBfExpress.tBfExpress, com.breakfast.domain.tables.TBfExpress.tBfExpress.EXPRESS_ID);
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfFeedbackRecord> KEY_T_BF_FEEDBACK_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBfFeedback.tBfFeedback, com.breakfast.domain.tables.TBfFeedback.tBfFeedback.FEEDBACK_ID);
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfFileRecord> KEY_T_BF_FILE_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBfFile.tBfFile, com.breakfast.domain.tables.TBfFile.tBfFile.FILE_ID);
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfFoodRecord> KEY_T_BF_FOOD_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBfFood.tBfFood, com.breakfast.domain.tables.TBfFood.tBfFood.FOOD_ID);
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfFoodCustomRecord> KEY_T_BF_FOOD_CUSTOM_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBfFoodCustom.tBfFoodCustom, com.breakfast.domain.tables.TBfFoodCustom.tBfFoodCustom.FOOD_CUSTOM_ID);
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfFoodDetailRecord> KEY_T_BF_FOOD_DETAIL_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBfFoodDetail.tBfFoodDetail, com.breakfast.domain.tables.TBfFoodDetail.tBfFoodDetail.DETAIL_ID);
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfGradeRecord> KEY_T_BF_GRADE_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBfGrade.tBfGrade, com.breakfast.domain.tables.TBfGrade.tBfGrade.GRADE_ID);
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfOrderRecord> KEY_T_BF_ORDER_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBfOrder.tBfOrder, com.breakfast.domain.tables.TBfOrder.tBfOrder.ORDER_ID);
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfOrderDetailRecord> KEY_T_BF_ORDER_DETAIL_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBfOrderDetail.tBfOrderDetail, com.breakfast.domain.tables.TBfOrderDetail.tBfOrderDetail.DETAIL_ID);
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfPhotoShowRecord> KEY_T_BF_PHOTO_SHOW_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBfPhotoShow.tBfPhotoShow, com.breakfast.domain.tables.TBfPhotoShow.tBfPhotoShow.PHOTO_ID);
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfRawMaterialRecord> KEY_T_BF_RAW_MATERIAL_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBfRawMaterial.tBfRawMaterial, com.breakfast.domain.tables.TBfRawMaterial.tBfRawMaterial.RAW_MATERIAL_ID);
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfSetFoodsRecord> KEY_T_BF_SET_FOODS_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBfSetFoods.tBfSetFoods, com.breakfast.domain.tables.TBfSetFoods.tBfSetFoods.SET_FOODS_ID);
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfSetMealRecord> KEY_T_BF_SET_MEAL_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBfSetMeal.tBfSetMeal, com.breakfast.domain.tables.TBfSetMeal.tBfSetMeal.SET_MEAL_ID);
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfUserRecord> KEY_T_BF_USER_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBfUser.tBfUser, com.breakfast.domain.tables.TBfUser.tBfUser.USER_ID);
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBfUserCustomerRecord> KEY_T_BF_USER_CUSTOMER_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBfUserCustomer.tBfUserCustomer, com.breakfast.domain.tables.TBfUserCustomer.tBfUserCustomer.USER_ID);
		public static final org.jooq.UniqueKey<com.breakfast.domain.tables.records.TBrUserCourierRecord> KEY_T_BR_USER_COURIER_PRIMARY = createUniqueKey(com.breakfast.domain.tables.TBrUserCourier.tBrUserCourier, com.breakfast.domain.tables.TBrUserCourier.tBrUserCourier.USER_ID);
	}
}
