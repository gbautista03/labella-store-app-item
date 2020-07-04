package com.labella.store.repository;

import com.labella.store.domain.ItemType;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the ItemType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ItemTypeRepository extends JpaRepository<ItemType, Long> {
}
