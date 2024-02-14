package mrs.domain.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class ReservableRoom implements Serializable {
    @EmbeddedId
    private ReservableRoomId reservableRoomId;

    @ManyToOne
    @JoinColumn(name = "room_id" , insertable = false, updatable = false)
    @MapsId("roomId")
    private MeetingRoom meetingRoom;

    public ReservableRoom(ReservableRoomId reservableRoomId){
        this.reservableRoomId = reservableRoomId;
    }

    public ReservableRoom(){
        
    }

    public MeetingRoom getMeetingRoom(){
        return new MeetingRoom(this.meetingRoom);
    }

    public ReservableRoomId getReservableRoomId(){
        return new ReservableRoomId(this.reservableRoomId);
    }
}
