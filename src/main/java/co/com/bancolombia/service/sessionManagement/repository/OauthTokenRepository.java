package co.com.bancolombia.service.sessionManagement.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.bancolombia.service.sessionManagement.model.jpa.OauthToken;

@Repository
public interface OauthTokenRepository extends JpaRepository<OauthToken, String> {
	 List<OauthToken> findByAuthenticatedUserid(String authenticatedUserid);
}
