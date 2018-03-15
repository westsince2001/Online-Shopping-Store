package me.zhulin.onlineshopping.repository;

import me.zhulin.onlineshopping.entity.OrderMain;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By Zhu Lin on 3/14/2018.
 */
public interface OrderRepository extends JpaRepository<OrderMain, Integer>{
    OrderMain findByOrderId(Long orderId);

    Page<OrderMain> findAllByOrderStatus(Integer orderStatus, Pageable pageable);

    Page<OrderMain> findAllByBuyerEmail(String buyerEmail, Pageable pageable);

    Page<OrderMain> findAllByBuyerPhone(String buyerPhone, Pageable pageable);
}
