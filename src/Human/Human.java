package Human;

import java.time.LocalDate;

public class Human {
    public String name;
    public LocalDate birthDay;
    public LocalDate dayOfDeath;
    public Gender gender;

    public Human(String name, LocalDate birthDay, LocalDate dayOfDeath, Gender gender) {
        this.name = name;
        this.birthDay = birthDay;
        this.dayOfDeath = dayOfDeath;
        this.gender = gender;
    }

    public Human(String name, LocalDate birthDay, Gender gender) {
        this.name = name;
        this.birthDay = birthDay;
        this.dayOfDeath = null;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }


}
