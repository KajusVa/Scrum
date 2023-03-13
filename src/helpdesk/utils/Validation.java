package helpdesk.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    //Apsirasomi validacijos sablonai pagal kuriuos tikrinsime vartotojo ivestus duomenis
    public static final String USERNAME_REGEX_PATTERN = "^[A-Za-z0-9]{5,13}$";
    public static final String PASSWORD_REGEX_PATTERN = "^[A-Za-z0-9!@#$%]{5,13}$";

    /**
     * Funkcija tikrinanti ar vartotojo ivesti duomenys prisijungimo vardui atitinkima validacijos sablona
     * @param username vartotojo ivestas prisijungimo vardas
     * @return true - jeigu vartotojo ivestas vardas atitinka sablona, false - prieisingu atveju
     */
    public static boolean isValidUsername(String username)
    {
        // Pagal 7 eiluteje apsirasyta sablona sukuriamos taisykkles (naudojant biblioteka)
        Pattern pattern = Pattern.compile(USERNAME_REGEX_PATTERN);
        // Vartotojo ivestas prisijungimo vardas palyginamas su auksciau sukurtom taisyklem
        Matcher matcher = pattern.matcher(username);
        // true - jeigu vartotojo ivestas vardas atitinka sablona, false - prieisingu atveju
        return matcher.find();
    }

    public static boolean isValidPassword(String password)
    {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX_PATTERN);
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

}

