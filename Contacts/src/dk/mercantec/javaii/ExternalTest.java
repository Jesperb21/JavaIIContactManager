package dk.mercantec.javaii;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

public class ExternalTest {
    External external;
    public ExternalTest(){
        external = new External("name", "phone", "email", "company");
    }
    @Test
    public void testGetCompany() {
        assertThat(external.getCompany(), is("company"));
    }

    @Test
    public void testSetCompany() {
        String newName = "comp";
        external.setCompany(newName);
        assertThat(external.getCompany(), is(newName));
    }

    @Test
    public void testToString() throws Exception {
        assertThat(external.toString(), notNullValue());
    }
}