package com.cogent.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService
{

	@Autowired
	private ItemRepository itemRepository;

	public void delete(int id)
	{
		itemRepository.deleteById(id);
	}

	public ItemEntity updateItem(int id, String name)
	{
		return itemRepository.save(ItemEntity.builder()
				.id(id)
				.name(name)
				.build());
	}

	public ItemEntity addItem(String name)
	{
		return itemRepository.save(ItemEntity.builder()
				.name(name)
				.build());
	}

	public List<ItemEntity> getItems()
	{
		return itemRepository.findAll();
	}

}
