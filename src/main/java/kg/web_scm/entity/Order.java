package kg.web_scm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Time;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    @JoinColumn(name="product_id",nullable = false)
    private Product product;
    @Column(name="quantity",nullable = false)
    private Integer quantity;
    @Column(name="total_sum",nullable = false)
    private Integer sum;
    @Column(name="order_date",nullable = false)
    private Timestamp orderDate;
    @Column(name="due_date",nullable = false)
    private Date dueDate;
    @ManyToMany
    @JoinColumn(name="user_id",nullable = false)
    private User user;




}
