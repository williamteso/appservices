package co.com.claro.appservices.app.models.repository;

import co.com.claro.appservices.app.models.entity.auth.OauthClientDetail;
import org.springframework.data.repository.CrudRepository;

public interface OauthClientDetailRepository extends CrudRepository<OauthClientDetail, String>{

	public OauthClientDetail findOauthClientDetailByClientId(String clientId);
	
}
