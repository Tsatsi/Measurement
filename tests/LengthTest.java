import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class LengthTest {

    @Test
    public void testThatOneFootIsTwelveInches() throws Exception {
        assertThat(new Length(1,Unit.FEET), is(new Length(12,Unit.INCHES)));
    }

    @Test
    public void testThatOneFootIsOneFoot() throws Exception {
        assertThat(new Length(1, Unit.FEET), is(new Length(1,Unit.FEET)));
    }

    @Test
    public void testThatTwentyFiveFeetAreNotTwentyFourInches() throws Exception {
        assertThat(new Length(25,Unit.FEET), is(not(new Length(24, Unit.INCHES))));
    }

    @Test
    public void testThatOneYardIsThreeFeet() throws Exception {
        assertThat(new Length(1,Unit.YARDS), is(new Length(3, Unit.FEET)));
    }

    @Test
    public void testThatOneMileIs1760Yards() throws Exception {
        assertThat(new Length(1,Unit.MILES), is(new Length(1760, Unit.YARDS)));

    }

    @Test
    public void testThatTwoMilesIsNot1760Yards() throws Exception {
        assertThat(new Length(2,Unit.MILES), is(not(new Length(1760, Unit.YARDS))));
    }

    @Test
    public void testLengthShouldNotBeEqualToNull() throws Exception {
        assertFalse(new Length(1,Unit.FEET).equals(null));
    }

    @Test
    public void testShouldNotBeEqualToObjectOfADifferentType() throws Exception {
        assertFalse(new Length(1,Unit.FEET).equals(new Object()));
    }

    @Test
    public void test() throws Exception {
        System.out.println(new Length(2,Unit.FEET).toString());

    }

}
