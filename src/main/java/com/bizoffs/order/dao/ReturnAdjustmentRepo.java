package com.bizoffs.order.dao;

import com.bizoffs.order.entities.ReturnAdjustment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReturnAdjustmentRepo extends JpaRepository<ReturnAdjustment,String> {
    @Query("From ReturnAdjustment  r where r.orderAdjustment.orderAdjustmentId=:orderAdjustmentId")
    List<ReturnAdjustment> findByOrderAdjustmentId(@Param("orderAdjustmentId") String orderAdjustmentId);

    @Query("From ReturnAdjustment  r where r.returnHeader.returnId =:returnId and  r.returnType.returnTypeId =:returnTypeId")
    List<ReturnAdjustment> findByReturnIdAndReturnTypeId(@Param("returnId")  String returnId,@Param("returnTypeId") String returnTypeId);
}
