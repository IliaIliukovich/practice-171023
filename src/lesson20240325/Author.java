package lesson20240325;

import java.io.Serializable;
import java.util.Objects;

public class Author implements Serializable {

    private String name;
    private String additionalInfo;

    public Author(String name, String additionalInfo) {
        this.name = name;
        this.additionalInfo = additionalInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(additionalInfo, author.additionalInfo);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                '}';
    }
}
