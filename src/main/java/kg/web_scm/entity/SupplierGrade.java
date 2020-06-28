package kg.web_scm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="supplier_grade")
public class SupplierGrade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="delivery_on_time",nullable = false)
    private Double deliveryOnTime;
    @Column(name = "defective_parts",nullable = false)
    private Double defectiveParts;
    @Column(name = "order_fulfil",nullable = false)
    private Double orderFulfil;
    @ManyToOne
    @JoinColumn(name="supplier_id",nullable = false)
    private Supplier supplier;

}
