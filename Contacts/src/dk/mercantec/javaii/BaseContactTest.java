package dk.mercantec.javaii;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BaseContactTest {
    BaseContact testContact;
    public BaseContactTest(){
        testContact = new BaseContact("derp", "12341234", "derpmail@derp.derp");
    }

    @Test
    public void testGetPhone() throws Exception {
        assertThat(testContact.getPhone(), is("12341234"));
    }
    @Test
    public void testGetEmail() throws Exception {
        assertThat(testContact.getEmail(), is("derpmail@derp.derp"));
    }
    @Test
    public void testGetName() throws Exception {
        assertThat(testContact.getName(), is("derp"));
    }

    @Test
    public void testSetPhone() throws Exception {
        String phone = "12345678";
        testContact.setPhone(phone);
        assertThat(testContact.getPhone(), is(phone));
    }


    @Test
    public void testSetEmail() throws Exception {
        String mail = "ma@il.com";
        testContact.setEmail(mail);
        assertThat(testContact.getEmail(), is(mail));
    }


    @Test
    public void testSetName() throws Exception {
        String name = "testname";
        testContact.setName(name);
        assertThat(testContact.getName(), is(name));
    }
}