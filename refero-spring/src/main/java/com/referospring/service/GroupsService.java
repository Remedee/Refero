package com.referospring.service;

import java.util.List;

import com.referospring.model.Groups;;

public interface GroupsService {
    
    public List<Groups> getAllGroups();
    public void postNewGroup(Groups group);
    public Groups getGroupsById(Integer groupId);

}