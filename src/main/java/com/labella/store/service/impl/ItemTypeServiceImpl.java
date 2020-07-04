package com.labella.store.service.impl;

import com.labella.store.service.ItemTypeService;
import com.labella.store.domain.ItemType;
import com.labella.store.repository.ItemTypeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Service Implementation for managing {@link ItemType}.
 */
@Service
@Transactional
public class ItemTypeServiceImpl implements ItemTypeService {

    private final Logger log = LoggerFactory.getLogger(ItemTypeServiceImpl.class);

    private final ItemTypeRepository itemTypeRepository;

    public ItemTypeServiceImpl(ItemTypeRepository itemTypeRepository) {
        this.itemTypeRepository = itemTypeRepository;
    }

    @Override
    public ItemType save(ItemType itemType) {
        log.debug("Request to save ItemType : {}", itemType);
        return itemTypeRepository.save(itemType);
    }

    @Override
    @Transactional(readOnly = true)
    public List<ItemType> findAll() {
        log.debug("Request to get all ItemTypes");
        return itemTypeRepository.findAll();
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<ItemType> findOne(Long id) {
        log.debug("Request to get ItemType : {}", id);
        return itemTypeRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete ItemType : {}", id);
        itemTypeRepository.deleteById(id);
    }
}
