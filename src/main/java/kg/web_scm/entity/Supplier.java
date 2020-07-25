package kg.web_scm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name="supplier")
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="supplier_name",nullable = false)
    private String supplierName;
    @Column(name="leadTime",nullable = false)
    private Integer leadTime;
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;




    }
