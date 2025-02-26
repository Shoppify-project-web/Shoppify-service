package com.shopee.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ORDER_LINE")
public class OrderLine {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "ID")
   private long id;

   @Column(name = "QUANTITY")
   private int quantity;

   @Column(name = "PRICE")
   private double price;

   @Column(name = "SUBTOTAL")
   private double subtotal;

   @ManyToOne
   @JoinColumn(name = "PRODUCT_ID")
   private Product product;

   @ManyToOne
   @JoinColumn(name = "VARIANT_ID")
   private Variant variant;

   @ManyToOne
   @JoinColumn(name = "ORDER_ID")
   private Order order;

}
