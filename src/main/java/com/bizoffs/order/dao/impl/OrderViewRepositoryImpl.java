package com.bizoffs.order.dao.impl;

import com.bizoffs.order.dao.OrderViewRepository;
import com.bizoffs.order.entities.OrderPaymentPreference;
import com.bizoffs.order.utils.UtilProperties;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class OrderViewRepositoryImpl implements OrderViewRepository {

    @PersistenceContext
    private EntityManager em;

    private UtilProperties configSqlProperty ;


    @Override
    public  List<OrderPaymentPreference>  OrderPurchasePaymentSummary(String billingAccountId, String paymentMethodType,List<String> orderStatus, List<String> paymentStatus) {
       List<OrderPaymentPreference>  orderPaymentPreference= new ArrayList<>();
        try {
          //  String sql=buildSql(configSqlProperty.getSql("OrderPurchasePaymentSummary"));
            TypedQuery<OrderPaymentPreference> query =em.createQuery(UtilProperties.getPropertyValue("order_view_sql","OrderPurchasePaymentSummary"),OrderPaymentPreference.class);
            query.setParameter(1,billingAccountId);
            query.setParameter(2,paymentMethodType);
            query.setParameter(3,orderStatus);
            query.setParameter(4,paymentStatus);
            orderPaymentPreference= query.getResultList();
        }catch (Exception e){

        }

        return orderPaymentPreference;
    }


}
