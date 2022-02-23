package edu.esoft.sdp.pickAndGoBackend.service.impl;

import edu.esoft.sdp.pickAndGoBackend.model.Item;
import edu.esoft.sdp.pickAndGoBackend.repository.ItemRepository;
import edu.esoft.sdp.pickAndGoBackend.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item createIem(Item item) {
        return this.itemRepository.save(item);
    }
}
