package con.ccs.ltd.twitterutils;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import con.ccs.ltd.twitterutils.service.TwitterService;
import con.ccs.ltd.twitterutils.service.entity.TwitterFollower;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class TwitterEndpointTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    TwitterService twitterService;

    @Test
    void shouldRetrieveFollowers() throws Exception {
        List<TwitterFollower> expected = new ArrayList<>();
        expected.add(new TwitterFollower("name1"));
        expected.add(new TwitterFollower("name2"));

        when(twitterService.getFollowers()).thenReturn(expected);

        // @formatter:off
        mockMvc.perform(MockMvcRequestBuilders.get("/followers"))
                .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(jsonPath("$", hasSize(2)));
        // @formatter:on
    }
}
