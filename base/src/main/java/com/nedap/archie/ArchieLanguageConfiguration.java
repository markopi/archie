package com.nedap.archie;

/**
 * Created by pieter.bos on 21/10/15.
 */
public class ArchieLanguageConfiguration {

    private static ThreadLocal<String> currentLogicalPathLanguage = new ThreadLocal<>();
    private static ThreadLocal<String> currentMeaningAndDescriptionLanguage = new ThreadLocal<>();

    private static String DEFAULT_MEANING_DESCRIPTION_LANGUAGE = "en";
    private static String DEFAULT_LOGICAL_PATH_LANGUAGE = "en";


    /**
     * The language for use in logical paths
     * @return
     */
    public static String getLogicalPathLanguage() {
        String language = currentLogicalPathLanguage.get();
        if(language == null) {
            language = DEFAULT_LOGICAL_PATH_LANGUAGE;
        }
        return language;
    }


    /**
     * The language for use in logical paths
     * @return
     */
    public static String getMeaningAndDescriptionLanguage() {
        String language = currentMeaningAndDescriptionLanguage.get();
        if(language == null) {
            language = DEFAULT_MEANING_DESCRIPTION_LANGUAGE;
        }
        return language;
    }

    public static void setDefaultMeaningAndDescriptionLanguage(String defaultLanguage) {
        DEFAULT_MEANING_DESCRIPTION_LANGUAGE = defaultLanguage;
    }

    public static void setDefaultLogicalPathLanguage(String defaultLanguage) {
        DEFAULT_LOGICAL_PATH_LANGUAGE = defaultLanguage;
    }


    /**
     * Override the language used in logical paths, on a thread local basis
     * @param language
     */
    public static void setThreadLocalLogicalPathLanguage(String language) {
        currentLogicalPathLanguage.set(language);
    }

    /*
     *
     */
    public static void setThreadLocalDescriptiongAndMeaningLanguage(String language) {
        currentMeaningAndDescriptionLanguage.set(language);
    }

    public static String getDefaultMeaningAndDescriptionLanguage() {
        return DEFAULT_MEANING_DESCRIPTION_LANGUAGE;
    }
}
