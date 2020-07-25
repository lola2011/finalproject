package kg.web_scm.service;

import kg.web_scm.entity.Sales;
import kg.web_scm.model.SaleModel;

import java.util.List;

public interface SalesService {
    List<Sales> getAll();

    Sales getById(Long id);

    Sales create(SaleModel saleModel);

   Sales update(Sales sales);

    Sales deleteById(Long id);
}

