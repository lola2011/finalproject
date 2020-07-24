package kg.web_scm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="orders")
public class OrderPurchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="quantity",nullable = false)
    private Integer quantity;
    @Column(name="total_sum")
    private Integer sum;
    @Column(name="order_date",nullable = false)
    private LocalDateTime orderDate;
    @Column(name="due_date")
    private LocalDateTime dueDate;
    @ManyToOne
    @JoinColumn(name="product_id",nullable = false)
    private Product product;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;




}
