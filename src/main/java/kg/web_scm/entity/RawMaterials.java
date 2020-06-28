package kg.web_scm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="raw_materials")
public class RawMaterials {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="material_name",nullable = false)
    private  String material;
    @Column(name="cost",nullable = false)
    private Integer cost;
    @Column(name="description",nullable = false)
    private String description;
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;
    @ManyToOne
    @JoinColumn(name="supplier_id",nullable = false)
    private Supplier supplier;

}
