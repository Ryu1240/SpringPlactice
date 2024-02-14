package mrs.domain.service.room;

import java.time.LocalDate;
import java.util.List;

import mrs.domain.model.ReservableRoom;
import mrs.domain.model.repository.room.ReservableRoomRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoomService {
    
    @Autowired
    ReservableRoomRepository reservableRoomRepository;

    public List<ReservableRoom>findReservableRooms(LocalDate date){
        return reservableRoomRepository.findByReservableRoomId_reservedDateOrderByReservableRoomId_roomIdAsc(date);
    }
}
