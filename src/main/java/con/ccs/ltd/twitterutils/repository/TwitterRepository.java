package con.ccs.ltd.twitterutils.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import con.ccs.ltd.twitterutils.service.entity.TwitterFollower;

@Repository
public interface TwitterRepository extends JpaRepository<TwitterFollower, Long> {
}
