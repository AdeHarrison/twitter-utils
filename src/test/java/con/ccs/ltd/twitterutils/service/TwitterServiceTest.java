package con.ccs.ltd.twitterutils.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import con.ccs.ltd.twitterutils.repository.TwitterRepository;
import con.ccs.ltd.twitterutils.service.entity.TwitterFollower;

@ExtendWith(MockitoExtension.class)
class TwitterServiceTest {

    @Mock
    TwitterRepository twitterRepository;

    @InjectMocks
    TwitterService underTest;

    @Test
    void getFollowers() {
        List<TwitterFollower> expected = new ArrayList<>();
        expected.add(new TwitterFollower("name1"));
        expected.add(new TwitterFollower("name2"));

        when(twitterRepository.findAll()).thenReturn(expected);

        List<TwitterFollower> actual = underTest.getFollowers();

        assertThat(actual.size(), equalTo(2));
    }


}