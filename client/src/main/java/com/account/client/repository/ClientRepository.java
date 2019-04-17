/**
* Dev space by Mayu... 
**/
package com.account.client.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.account.client.bean.Client;

/**
 * Client repository, this will interact with H2 DB
 * @author mayu
 *
 */
public interface ClientRepository extends CrudRepository<Client, Long>{

	
	public List<Client> findByClientType(String clientType);
}
