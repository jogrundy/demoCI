

import java.util.HashMap;

public class HelloWorld {
    // properties
    String language;
    int repeats;
    private static HashMap<String, String> helloDictionary;

    // constructor
    HelloWorld(){
        makeDict();
        language = "English";
        repeats = 1;
    }
    HelloWorld(String lang) throws LanguageNotFoundException {
        makeDict();

        if (helloDictionary.containsKey(lang)) {
            language = lang;
        } else {
            throw new LanguageNotFoundException("Language is not in dictionary");

        }
        repeats = 1;
    }
    //setters
    void setLanguage(String lang) throws LanguageNotFoundException{
        if (helloDictionary.containsKey(lang)) {
            language = lang;
        } else {
            throw new LanguageNotFoundException("Language is not in dictionary");

        }
    }
    void setRepeats(int numRepeats){
        repeats = numRepeats;
    }
    //getters
    int getRepeats(){
        return repeats;
    }
    String getLanguage(){
        return language;
    }
    // methods
    private static void makeDict() {
        helloDictionary = new HashMap<>();
        helloDictionary.put("English", "Hello World");
        helloDictionary.put("French", "Bonjour Monde");
        helloDictionary.put("Chinese", "Ni Hao Shijie");
        helloDictionary.put("Romanian", "Salut Lume");
        helloDictionary.put("Dutch", "Hallo Wereld");
    }

    String findHello(){
        return helloDictionary.get(language);
    }

    String sayHello(){
        String hello = findHello();
        String result;
        result = "";
        for(int i=0;i<repeats;i++) {
            result = result + hello + "/n";
        }
        return result;
    }


}
