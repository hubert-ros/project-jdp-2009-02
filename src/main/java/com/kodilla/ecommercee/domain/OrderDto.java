package com.kodilla.ecommercee.domain;

import java.time.LocalDate;

public class OrderDto {
    private Long orderId;
    private User userId;
    private LocalDate creationDate;
    private boolean hasNotSent;

  //  public OrderDto(Long orderId, int userId, int yearOfOrder, int monthOfOrder, int dayOfOrder, boolean b) {
  //      this.orderId = orderId;
  //      this.userId = userId;
  //      this.creationDate = LocalDate.of(yearOfOrder, monthOfOrder, dayOfOrder);
  //      this.hasNotSent = true;
  //  }

    public OrderDto(Long orderId, LocalDate creationDate, boolean hasNotSent, User userId) {
        this.orderId = orderId;
        this.userId = userId;
        this.creationDate = creationDate;
        this.hasNotSent = true;
    }

    public Long getOrderId() {
        return orderId;
    }

    public User getUserId() {
        return userId;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public boolean isHasNotSent() {
        return hasNotSent;
    }
}
