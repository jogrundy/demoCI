

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.Test;



public class HelloWorldTest {

    @Test
    public void setLanguageSetsLangInDict() {
        HelloWorld test1 = new HelloWorld();
        try{
            test1.setLanguage("Chinese");
            assertThat(test1.getLanguage(), is("Chinese"));
        } catch (LanguageNotFoundException e){
            fail("Test fails, LanguageNotFoundException should not be thrown for Chinese");
        }
    }
    @Test(expected = LanguageNotFoundException.class)
    public void setLanguageSetsLangNotInDict() throws LanguageNotFoundException{
        HelloWorld test1 = new HelloWorld();
        test1.setLanguage("German");
        fail("expected a LanguageNotFoundException to be thrown");
    }

    @Test
    public void setRepeatsSetsNumberRepeats() {
        HelloWorld test1 = new HelloWorld();
        test1.setRepeats(3);
        assertThat(test1.getRepeats(), is(3));
    }

    @Test
    public void findHelloReturnsCorrectString() {
        try {
            HelloWorld test1 = new HelloWorld();
            assertThat(test1.findHello(), is("Hello World"));
            HelloWorld test2 = new HelloWorld("Chinese");
            assertThat(test2.findHello(), is("Ni Hao Shijie"));
            HelloWorld test3 = new HelloWorld("Romanian");
            assertThat(test3.findHello(), is("Salut Lume"));
            HelloWorld test4 = new HelloWorld("French");
            assertThat(test4.findHello(), is("Bonjour Monde"));
            HelloWorld test5 = new HelloWorld("Dutch");
            assertThat(test5.findHello(), is("Hallo Wereld"));
        }  catch (LanguageNotFoundException e) {
            fail("Setting with a known language should not cause LanguageNotFoundException to be thrown");
        }
    }

    @Test(expected= LanguageNotFoundException.class)
    public void constructorWithUnknownLangThrowsException () throws LanguageNotFoundException{
        HelloWorld test1 = new HelloWorld("German");
        fail("constructing HelloWorld object with unknown language (Dutch) should have thrown Exception");
    }

    @Test
    public void testSayHello() {
        HelloWorld test1 = new HelloWorld();
        assertThat(test1.sayHello(), is("Hello World/n"));
        HelloWorld test2 = new HelloWorld();
        test2.setRepeats(2);
        assertThat(test2.sayHello(), is("Hello World/nHello World/n"));
    }
}