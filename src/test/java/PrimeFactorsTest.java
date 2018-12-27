import com.google.common.collect.ImmutableList;
import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertThat;


public class PrimeFactorsTest {

    @Test
    public void of_1isNone(){
        assertThat(PrimeFactors.of(1), Is.<List<Integer>>is(ImmutableList.<Integer>of()));
    }

    @Test
    public void of_2is2(){
        assertThat(PrimeFactors.of(2), Is.<List<Integer>>is(ImmutableList.of(2)));
    }

    @Test
    public void of_3is3(){
        assertThat(PrimeFactors.of(3), Is.<List<Integer>>is(ImmutableList.of(3)));
    }

    @Test
    public void of_4is2_2(){
        assertThat(PrimeFactors.of(4), Is.<List<Integer>>is(ImmutableList.of(2,2)));
    }

    @Test
    public void of_5is5(){
        assertThat(PrimeFactors.of(5), Is.<List<Integer>>is(ImmutableList.of(5)));
    }

    @Test
    public void of_6is2_3(){
        assertThat(PrimeFactors.of(6), Is.<List<Integer>>is(ImmutableList.of(2,3)));
    }

    @Test
    public void of_7is7(){
        assertThat(PrimeFactors.of(7), Is.<List<Integer>>is(ImmutableList.of(7)));
    }

    @Test
    public void of_8is2_2_2(){
        assertThat(PrimeFactors.of(8), Is.<List<Integer>>is(ImmutableList.of(2,2,2)));
    }

    @Test
    public void of_9is3_3(){
        assertThat(PrimeFactors.of(9), Is.<List<Integer>>is(ImmutableList.of(3,3)));
    }

    @Test
    public void of_acceptanceTest(){
        assertThat(PrimeFactors.of(2*2*2*3*3*5*7*11), Is.<List<Integer>>is(ImmutableList.of(2,2,2,3,3,5,7,11)));
    }

}