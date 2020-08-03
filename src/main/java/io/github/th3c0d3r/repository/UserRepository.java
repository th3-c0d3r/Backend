package io.github.th3c0d3r.repository;

import io.github.th3c0d3r.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User,Integer>, UserRepositoryCustom {
}
