package com.cos.photogramstart.domain.subscribe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface SubscribeRepository extends JpaRepository<Subscribe,Long> {

    @Modifying
    @Query(value = "INSERT INTO subscribe(fromUserId, toUserId, createDate) VALUES(:fromUserId, :toUserId, now())",nativeQuery = true)
    void mSubscribe(Long fromUserId,Long toUserId);

    @Modifying
    @Query(value = "DELETE FROM subscribe WHERE fromUserId = :fromUserId AND toUserId = :toUserId",nativeQuery = true)
    void mUnSubscribe(Long fromUserId,Long toUserId);

    @Query(value="SELECT COUNT(*) FROM subscribe WHERE fromUserId = :principalId AND toUserId = :pageUserId",nativeQuery = true)
    int mSubscribeState(Long principalId,Long pageUserId);
    @Query(value="SELECT COUNT(*) FROM subscribe WHERE fromUserId = :pageUserId",nativeQuery = true)
    int mSubscribeCount(Long pageUserId);
}
