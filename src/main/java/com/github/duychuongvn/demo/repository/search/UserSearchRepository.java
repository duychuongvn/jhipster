package com.github.duychuongvn.demo.repository.search;

import com.github.duychuongvn.demo.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, String> {
}
