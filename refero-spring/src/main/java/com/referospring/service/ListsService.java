package com.referospring.service;

import java.util.List;

import com.referospring.model.Lists;

public interface ListsService {

    public List<Lists> getAllLists();
    public void postNewList(Lists list);

}