package dk.mercantec.javaii;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

public class InternalTest {
    Internal internal;
    public InternalTest(){
        internal = new Internal("name", "phone", "email", "department");
    }

    @org.junit.Test
    public void testGetDepartment() throws Exception {
        assertThat(internal.getDepartment(), is("department"));
    }

    @org.junit.Test
    public void testSetDepartment() throws Exception {
        String newDepartment = "testDepartment";
        internal.setDepartment(newDepartment);
        assertThat(internal.getDepartment(), is(newDepartment));
    }

    @org.junit.Test
    public void testToString() throws Exception {
        assertThat(internal.toString(), notNullValue());
    }
}