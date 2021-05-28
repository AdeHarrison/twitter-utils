package con.ccs.ltd.twitterutils.service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Entity(name = "follower")
public class TwitterFollower {

    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    private long id;

    @Column(name = "name")
    private final String name;
}
