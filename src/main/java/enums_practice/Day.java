package enums_practice;

public class Day {
    //Setting an enum as a field
    Days days;

    //Using the Day constructor to initialize the enum
    public Day(Days days) {
        this.days = days;
    }

    //Days Getter
    public Days getCurrentDay() {
        return this.days;
    }

    //Method to get current weather
    //State Tax Rate Example State is enum and tax rate is number
    public String currentDaysWeather(Days day) {
        switch (day) {
            case MONDAY -> {
                return """
                        Today is Monday!
                        Today's temperature is 35 degrees!
                        """
                        + goodByMessage();
            }
            case TUESDAY -> {
                return """
                        Today is Tuesday!
                        Today's temperature is 100 degrees!
                        """
                        + goodByMessage();
            }
            case WEDNESDAY -> {
                return """
                        Today is Wednesday!
                        Today's temperature is 150 degrees!
                        """
                        + goodByMessage();
            }
            case THURSDAY -> {
                return """
                        Today is Thursday!
                        Today's temperature is 10 degrees!
                        """
                        + goodByMessage();
            }
            case FRIDAY -> {
                return """
                        Today is Friday!
                        Today's temperature is 5 degrees!
                        """
                        + goodByMessage();
            }
            case SATURDAY -> {
                return """
                        Today is Saturday!
                        Today's temperature is 35 degrees!
                        """
                        + goodByMessage();
            }
            case SUNDAY -> {
                return """
                        Today is Sunday!
                        Today's temperature is 75 degrees!
                        """
                        + goodByMessage();
            }
            default -> {
                return "You picked a not normal day of the week. Please try again.";
            }
        }
    }

    //Good by message
    public String goodByMessage() {
        return "Thank you for using the weather service!";
    }
}

