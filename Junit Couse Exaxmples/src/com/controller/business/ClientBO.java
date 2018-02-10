package com.controller.business;
import java.util.List;

import com.controller.business.exception.DifferentCurrenciesException;
import com.controller.model.Amount;
import com.controller.model.Product;
public interface ClientBO {

	Amount getClientProductsSum(List<Product> products)
			throws DifferentCurrenciesException;

}