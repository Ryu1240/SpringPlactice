package mrs.domain.repository.room;

import java.time.LocalDate;
import java.util.List;

import mrs.domain.model.ReservableRoom;
import mrs.domain.model.ReservableRoomId;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservableRoomRepository extends JpaRepository<ReservableRoom,ReservableRoomId>{
    List<ReservableRoom>findByReservableRoomId_reservedDateOrderByReservableRoomId_roomIdAsc(LocalDate reservedDate);

    default ReservableRoom findOneByRoomId(ReservableRoomId roomId) {
        ReservableRoom exampleRoom = new ReservableRoom();
        exampleRoom.setReservableRoomId(roomId);

        Example<ReservableRoom> example = Example.of(exampleRoom);

        return findOne(example).orElse(null);
    }
}
