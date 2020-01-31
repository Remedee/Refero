package com.referospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.referospring.model.Invitations;
import com.referospring.model.Users;

import java.util.List;

@Repository
public interface InvitationsRepository extends JpaRepository < Invitations, Integer >{
	
	@Query(value="SELECT * FROM Invitations WHERE username_to = ?1 and status =?2", nativeQuery = true)
	public List < Invitations > getPendingInvitations( Users user, String status );	
}
