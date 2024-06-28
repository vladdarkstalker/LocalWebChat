package repository;

import dbmodels.PrivateChat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrivateChatRepository extends JpaRepository<PrivateChat, Integer> {
    List<PrivateChat> findBySenderId(Integer senderId);
    List<PrivateChat> findByReceiverId(Integer receiverId);
}
