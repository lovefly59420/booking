package com.joy.bookingManagement.service.interfac;

import com.joy.bookingManagement.dto.Response;
import com.joy.bookingManagement.entity.Booking;

public interface IBookingService {
    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
