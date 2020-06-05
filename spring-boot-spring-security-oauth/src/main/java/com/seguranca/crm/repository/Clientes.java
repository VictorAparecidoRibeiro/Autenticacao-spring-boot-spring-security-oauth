package com.seguranca.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seguranca.crm.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}
