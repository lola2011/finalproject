package kg.web_scm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierModel {
    private String supplierName;
    private Integer leadTime;
    private Long productId;
}
