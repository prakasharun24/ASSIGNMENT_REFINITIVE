package com.example.coupon.coupon.repository;

import com.example.coupon.coupon.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon,String> {
}
