package io.github.th3c0d3r.repository.impl;

import io.github.th3c0d3r.dto.UserDto;
import io.github.th3c0d3r.entity.User;
import io.github.th3c0d3r.repository.UserRepositoryCustom;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class UserRepositoryCustomImpl implements UserRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<User> findUserByFilter(UserDto userDto) {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);

        Root<User> userRoot = criteriaQuery.from(User.class);

        List<Predicate> predicates = new ArrayList<>();

        if (userDto.getId() != null)
            predicates.add(criteriaBuilder.equal(userRoot.get("id"),userDto.getId()));

        if (userDto.getEmail() != null)
            predicates.add(criteriaBuilder.equal(userRoot.get("email"),userDto.getEmail()));

        criteriaQuery.select(userRoot).where(criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()])));

        TypedQuery<User> query = entityManager.createQuery(criteriaQuery);
        return query.getResultList();

    }
}
