package kg.web_scm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="product_quantity",nullable = false)
    private Integer productQuantity;
    @Column(name="cost")
    private Integer cost;
    @OneToOne
    @JoinColumn(name="product_id",nullable = false)
    private Product product;
}
