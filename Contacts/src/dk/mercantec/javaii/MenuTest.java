package dk.mercantec.javaii;

import org.junit.Assert;

import static org.hamcrest.core.Is.is;

public class MenuTest {
    Menu menu;
    public MenuTest(){
        menu = new Menu();
    }
    @org.junit.Test
    public void testAdd() throws Exception {
        Assert.assertThat(menu.Add("test", new MenuCallback() {
            @Override
            public void Invoke() {
                System.out.print("");
            }
        }), is(true));

    }
}