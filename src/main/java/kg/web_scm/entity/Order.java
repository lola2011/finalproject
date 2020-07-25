package kg.web_scm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column Long id;
    @OneToOne
    @JoinColumn(name="supplier_id",nullable = false)
    private Supplier supplier;
    @OneToOne
    @JoinColumn(name="product_id",nullable=false)
    private Product product;
    @Column(name="orderDate")
    private LocalDateTime orderDateTime;
    @Column(name="deliveryDate",nullable = false)
    private DateFormat deliveryDate;
}
