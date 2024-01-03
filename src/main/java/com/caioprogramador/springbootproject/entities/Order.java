package com.caioprogramador.springbootproject.entities;

import com.caioprogramador.springbootproject.entities.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_orders")
@NoArgsConstructor
public class Order implements Serializable {
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    @Setter
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;

    private Integer orderStatus;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    @Setter
    @Getter
    @OneToMany(mappedBy = "id.order")
    private Set<OrderItem> items = new HashSet<>();

    @Setter
    @Getter
    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;

    public Order(Long id, Instant moment, OrderStatus orderStatus, User client) {
        this.id = id;
        this.moment = moment;
        setOrderStatus(orderStatus);
        this.client = client;
    }

    public OrderStatus getOrderStatus() {
        return OrderStatus.valueOf(orderStatus);
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus.getCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Double getTotal(){
        double sum = 0.0;
        for (OrderItem x : items){
            sum += x.getSubTotal();
        }
        return sum;
    }
}
