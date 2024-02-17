package mrs.domain.repository.reservation;

import java.util.List;

import mrs.domain.model.ReservableRoom;
import mrs.domain.model.ReservableRoomId;
import mrs.domain.model.Reservation;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Integer>{
    List<Reservation> findByReservableRoom_ReservableRoomIdOrderByStartTimeAsc(ReservableRoomId reservableRoomId);

    default Reservation findOneByReservationId(Integer reservationId) {
        Reservation exampleReservation = new Reservation();
        exampleReservation.setReservationId(reservationId);

        Example<Reservation> example = Example.of(exampleReservation);

        return findOne(example).orElse(null);
    }
}