/**
 * This class is generated by jOOQ
 */
package com.breakfast.domain;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.4" },
                            comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Breakfast extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 1689013898;

	/**
	 * The singleton instance of <code>breakfast</code>
	 */
	public static final Breakfast breakfast = new Breakfast();

	/**
	 * No further instances allowed
	 */
	private Breakfast() {
		super("breakfast_test");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			com.breakfast.domain.tables.TAddress.Address,
			com.breakfast.domain.tables.TCoupon.Coupon,
			com.breakfast.domain.tables.TCustomerService.CustomerService,
			com.breakfast.domain.tables.TCustomOrderDetail.CustomOrderDetail,
			com.breakfast.domain.tables.TElement.Element,
			com.breakfast.domain.tables.TElementContent.ElementContent,
			com.breakfast.domain.tables.TExpress.Express,
			com.breakfast.domain.tables.TFeedback.Feedback,
			com.breakfast.domain.tables.TFile.File,
			com.breakfast.domain.tables.TFood.Food,
			com.breakfast.domain.tables.TFoodCustom.FoodCustom,
			com.breakfast.domain.tables.TFoodDetail.FoodDetail,
			com.breakfast.domain.tables.TGrade.Grade,
			com.breakfast.domain.tables.TInformation.Information,
			com.breakfast.domain.tables.TMessage.Message,
			com.breakfast.domain.tables.TOrder.Order,
			com.breakfast.domain.tables.TOrderDetail.OrderDetail,
			com.breakfast.domain.tables.TPhotoShow.PhotoShow,
			com.breakfast.domain.tables.TProvider.Provider,
			com.breakfast.domain.tables.TRawMaterial.RawMaterial,
			com.breakfast.domain.tables.TSendCoupon.SendCoupon,
			com.breakfast.domain.tables.TSetFoods.SetFoods,
			com.breakfast.domain.tables.TSetMeal.SetMeal,
			com.breakfast.domain.tables.TShare.Share,
			com.breakfast.domain.tables.TUser.User,
			com.breakfast.domain.tables.TUserCourier.UserCourier,
			com.breakfast.domain.tables.TUserCustomer.UserCustomer,
			com.breakfast.domain.tables.TUserElementStatistics.UserElementStatistics);
	}
}
