package joke.spring.learning.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;
//make this a service by adding the service annotation
@Service
public class JokeServiceImpl implements JokeService {
    //cannot be change
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    //constructor to initialize variable
    //when this runs in spring spring will use it once then we will reuse this class so it wont get rerun with every request
    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
