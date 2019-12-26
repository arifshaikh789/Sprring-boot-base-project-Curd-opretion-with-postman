package springbootPackage.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springbootPackage.model.UserModel;


@Repository
public interface UserRepository extends JpaRepository<UserModel,Integer>
{
	// List<UserModel> findAll();
}
