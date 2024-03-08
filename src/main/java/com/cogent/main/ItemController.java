package com.cogent.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController
{
	@Autowired
	private ItemService itemService;

	@GetMapping("/read")
	public List<ItemEntity> getAll()
	{
		return itemService.getItems();
	}

	@PostMapping("/create/{name}")
	public ItemEntity addNew(@PathVariable String name)
	{
		return itemService.addItem(name);
	}

	@PutMapping("/update/{id}/{name}")
	public ItemEntity update(@PathVariable int id, @PathVariable String name)
	{
		return itemService.updateItem(id, name);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id)
	{
		itemService.delete(id);
	}
}
