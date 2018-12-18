package com.heally.springmvclabs;

import org.springframework.data.repository.CrudRepository;

/**
 * A spring repository for Album.
 */
public interface AlbumRepository extends CrudRepository<Album, Long> {
}
