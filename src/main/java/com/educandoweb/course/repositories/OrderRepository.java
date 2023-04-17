package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Order;
//Aqui é opcional colocar o anotation @reposity, pois ele ta herdando do jpa
public interface OrderRepository  extends JpaRepository<Order, Long>{

}
