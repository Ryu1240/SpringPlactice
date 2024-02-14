package mrs.domain.model.repository.room;

import java.time.LocalDate;
import java.util.List;

import mrs.domain.model.ReservableRoom;
import mrs.domain.model.ReservableRoomId;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservableRoomRepository extends JpaRepository<ReservableRoom,ReservableRoomId>{
    List<ReservableRoom>findByReservableRoomId_reservedDateOrderByReservableRoomId_roomIdAsc(LocalDate reservedDate);

    
}
