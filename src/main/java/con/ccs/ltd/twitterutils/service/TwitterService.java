package con.ccs.ltd.twitterutils.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import con.ccs.ltd.twitterutils.repository.TwitterRepository;
import con.ccs.ltd.twitterutils.service.entity.TwitterFollower;

@Service
public class TwitterService {

    private final TwitterRepository twitterRepository;

    public TwitterService(TwitterRepository twitterRepository) {
        this.twitterRepository = twitterRepository;
    }

    public List<TwitterFollower> getFollowers() {
        return twitterRepository.findAll();
    }
}
