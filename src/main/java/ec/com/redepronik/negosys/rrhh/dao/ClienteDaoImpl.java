package ec.com.redepronik.negosys.rrhh.dao;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import ec.com.redepronik.negosys.rrhh.entity.Cliente;
import ec.com.redepronik.negosys.utils.dao.GenericDaoImpl;

@Repository
public class ClienteDaoImpl extends GenericDaoImpl<Cliente, Integer> implements
		ClienteDao, Serializable {

	private static final long serialVersionUID = 1L;

}