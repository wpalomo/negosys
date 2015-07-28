package ec.com.redepronik.negosys.invfac.dao;

import org.springframework.stereotype.Repository;

import ec.com.redepronik.negosys.invfac.entity.PagoCredito;
import ec.com.redepronik.negosys.utils.dao.GenericDaoImpl;

@Repository
public class PagoCreditoDaoImpl extends GenericDaoImpl<PagoCredito, Integer>
		implements PagoCreditoDao {

}