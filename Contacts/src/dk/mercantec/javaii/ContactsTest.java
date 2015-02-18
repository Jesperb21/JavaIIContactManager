package dk.mercantec.javaii;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;

public class ContactsTest {
    Contacts contacts;
    public ContactsTest(){
        contacts = new Contacts();
    }

    @Test
    public void testAddInternalContact() throws Exception {
        int oldAmountOfContacts = contacts.getContacts().size();
        contacts.AddInternalContact("name", "12345678","mail", "department");
        assertThat(contacts.getContacts().size(), not(oldAmountOfContacts));
    }

    @Test
    public void testAddExternalContact() throws Exception {
        int oldAmountOfContacts = contacts.getContacts().size();
        contacts.AddInternalContact("name", "12345678","mail", "company");
        assertThat(contacts.getContacts().size(), not(oldAmountOfContacts));
    }

}