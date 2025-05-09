
package com.sbs.RahipWebApp.repository;

import com.sbs.RahipWebApp.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,String>  {
    
}
