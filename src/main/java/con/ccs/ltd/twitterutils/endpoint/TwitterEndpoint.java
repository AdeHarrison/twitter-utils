package con.ccs.ltd.twitterutils.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import con.ccs.ltd.twitterutils.service.TwitterService;
import con.ccs.ltd.twitterutils.service.entity.TwitterFollower;

@RestController
@RequestMapping("/")
public class TwitterEndpoint {

    @Autowired
    TwitterService twitterService;

//    @GetMapping
//    public String get1(){
//        return "hello";
//    }

    @GetMapping("/followers")
    public List<TwitterFollower> getFollowers(){
        return twitterService.getFollowers();
    }

//    @GetMapping("/following")
//    public String getFollowing(){
//        return "getFollowing";
//    }
}
