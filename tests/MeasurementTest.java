import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class MeasurementTest {

    @Test
    public void testThatOneFootIsTwelveInches() throws Exception {
        assertThat(new Measurement(1, Unit.FOOT), is(new Measurement(12, Unit.INCH)));
    }

    @Test
    public void testThatOneFootIsOneFoot() throws Exception {
        assertThat(new Measurement(1, Unit.FOOT), is(new Measurement(1, Unit.FOOT)));
    }

    @Test
    public void testThatTwentyFiveFeetAreNotTwentyFourInches() throws Exception {
        assertThat(new Measurement(25, Unit.FOOT), is(not(new Measurement(24, Unit.INCH))));
    }

    @Test
    public void testThatOneYardIsThreeFeet() throws Exception {
        assertThat(new Measurement(1, Unit.YARD), is(new Measurement(3, Unit.FOOT)));
    }

    @Test
    public void testThatOneMileIs1760Yards() throws Exception {
        assertThat(new Measurement(1, Unit.MILE), is(new Measurement(1760, Unit.YARD)));
    }

    @Test
    public void testThatTwoMilesIsNot1760Yards() throws Exception {
        assertThat(new Measurement(2, Unit.MILE), is(not(new Measurement(1760, Unit.YARD))));
    }

    @Test
    public void testLengthShouldNotBeEqualToNull() throws Exception {
        assertFalse(new Measurement(1, Unit.FOOT).equals(null));
    }

    @Test
    public void testShouldNotBeEqualToObjectOfADifferentType() throws Exception {
        assertFalse(new Measurement(1, Unit.FOOT).equals(new Object()));
    }

    @Test
    public void testShouldKnowThatOneTableSpoonIsThreeTeaspoons() throws Exception {
        assertThat(new Measurement(1, Unit.TABLESPOON), is(new Measurement(3, Unit.TEASPOON)));
    }

    @Test
    public void testShouldKnowThatOneOunceIsTwoTableSpoons() throws Exception {
        assertThat(new Measurement(1, Unit.OUNCE), is(new Measurement(2, Unit.TABLESPOON)));
    }

    @Test
    public void testShouldKnowThatOneCupIsEightyOunces() throws Exception {
        assertThat(new Measurement(1, Unit.CUP), is(new Measurement(8, Unit.OUNCE)));
    }

    @Test
    public void testShouldKnowThatOneTeaSpoonIsNotOneInch() throws Exception {
        assertThat(new Measurement(1, Unit.TEASPOON), is(not(new Measurement(1, Unit.INCH))));
    }

    @Test
    public void testShouldKnowThatEqualMeasurementsHaveTheSameHashCode() throws Exception {
        assertThat(new Measurement(1, Unit.INCH).hashCode(), is(new Measurement(1, Unit.INCH).hashCode()));

    }

    @Test
    public void testShouldKnowThatTwoInchesPlusThreeInchesIsFiveInches() throws Exception {
        assertThat(new Measurement(2, Unit.INCH).plus(new Measurement(3, Unit.INCH)), is(new Measurement(5, Unit.INCH)));
    }
    @Test
    public void testShouldKnowThatTwoInchesPlusFourInchesIsSixInches() throws Exception {
        assertThat(new Measurement(2, Unit.INCH).plus(new Measurement(4, Unit.INCH)), is(new Measurement(6, Unit.INCH)));
    }

    @Test
    public void testShouldKnowThatFiveTeaSpoonsPlusTwoTeaSpoonsIsSevenTeaSpoons() throws Exception {
        assertThat(new Measurement(5, Unit.TEASPOON).plus(new Measurement(2, Unit.TEASPOON)), is(new Measurement(7, Unit.TEASPOON)));
    }

    @Test
    public void testShouldKnowThatFiveTeaSpoonsPlusTwoTableSpoonsIsElevenTeaSpoons() throws Exception {
        assertThat(new Measurement(5, Unit.TEASPOON).plus(new Measurement(2, Unit.TABLESPOON)), is(new Measurement(11, Unit.TEASPOON)));
    }

    @Test (expected = RuntimeException.class)
    public void testShouldKnowThatTwoDifferentUnitTypesCannotBeAdded() throws Exception {
        new Measurement(5, Unit.INCH).plus(new Measurement(2, Unit.TEASPOON));
    }
}
