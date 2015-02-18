package dk.mercantec.javaii;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

//nåede ikke ordentlige tests her

public class UITest {
    UI ui;
    public UITest(){
        ui = new UI(new Contacts());
    }
    @org.junit.Test
    public void testMainMenu() throws Exception {
        assertThat(ui.MainMenu(), notNullValue());
    }

    @org.junit.Test
    public void testListContactsMenu() throws Exception {
        assertThat(ui.ListContactsMenu(), notNullValue());
    }

    @org.junit.Test
    public void testAddContactsMenu() throws Exception {
        assertThat(ui.AddContactsMenu(), notNullValue());
    }
}