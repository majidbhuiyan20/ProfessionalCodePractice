public class Constants {

    public static final String ARG_LIST_DATA = "a";
    public static final String ARG_SHOW_RANDOM_DATA = "r";
    public static final String ARG_ADD_DATA = "+";
    public static final String ARG_FIND_DATA = "?";
    public static final String ARG_COUNT_WORDS = "c";

    public static final String MSG_INVALID_ARGUMENTS = "Invalid arguments.";
    public static final String MSG_LOADING_DATA = "Loading data ...";
    public static final String MSG_LOADED_DATA = "Data Loaded.";
    public static final String MSG_DATA_UPDATED = "\nList last updated on";
    public static final String MSG_WORDS_FOUND = " word(s) found";
    public static final String MSG_DATA_FOUND = "We found it!";
    public static final String MSG_DATA_NOT_FOUND = "We could not find it!";
    public static final String MSG_INVALID_NUMBER_OF_ARGUMENTS = "Invalid number of arguments";
    public static final String MSG_USAGE = "Usage:" +
            "\njava StudentList a" +
            "\njava StudentList r" +
            "\njava StudentList c" +
            "\netc";
    public static final String MSG_EXITING_PROGRAM = "Exiting program.";


    public static final String STUDENTS_FILE_NAME = "students.txt";
    public static final String WORDS_SPLIT_REGEX = ", ";
    public static final String DATE_FORMAT_PATTERN = "dd-mm-yyyy hh:mm:ss a";
    public static final int INVALID_ARGUMENT_EXIT_STATUS = 1;
    public static final int INVALID_NUMBER_OF_ARGUMENTS_EXIT_STATUS = 2;
}