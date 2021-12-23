package com.item.repo;

import org.springframework.data.couchbase.repository.CouchbaseRepository;

import com.item.model.Item;

public interface ItemRepo extends CouchbaseRepository<Item, Integer> {

}
