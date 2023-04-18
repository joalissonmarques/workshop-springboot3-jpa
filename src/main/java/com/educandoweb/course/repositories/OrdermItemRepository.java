package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;
//Aqui é opcional colocar o anotation @reposity, pois ele ta herdando do jpa
public interface OrdermItemRepository  extends JpaRepository<OrderItem, Long>{

}
