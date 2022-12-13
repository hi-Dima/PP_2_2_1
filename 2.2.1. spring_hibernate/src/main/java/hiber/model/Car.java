package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @OneToOne(mappedBy = "carDetails",cascade = CascadeType.ALL)
    @OneToOne (cascade = CascadeType.ALL)
    private User user;
    @Column
    private String model;

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    @Column
    private int series;
    public Car() {
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                '}';
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
