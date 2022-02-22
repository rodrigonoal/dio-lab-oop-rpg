package com.dio.base;

import lombok.Getter;
import lombok.Setter;

public abstract class Item {
    @Getter
    @Setter
    String name;
    @Getter
    @Setter
    int power;

    public String usePhrase(Char person){
        return String.format("%s uses %s", person.getName(), this.name);
    };

}
