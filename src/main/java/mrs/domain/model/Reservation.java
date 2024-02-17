package mrs.domain.model;

import java.io.Serializable;
import java.time.LocalTime;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Reservation implements Serializable{
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reservationId;

    private LocalTime startTime;

    private LocalTime endTime;

    @ManyToOne
    @JoinColumns({@JoinColumn(name = "reserved_date"),
            @JoinColumn(name = "room_id")})
    private ReservableRoom reservableRoom;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public boolean overlap(Reservation target){
        if(!Objects.equals(reservableRoom.getReservableRoomId(), target.reservableRoom.getReservableRoomId())){
            return false;
        }
        if (startTime.equals(target.startTime) && endTime.equals(target.endTime)){
            return true;
        }
        return target.endTime.isAfter(startTime) && endTime.isAfter(target.startTime);
    }

    public Integer getReservationId(){
        return reservationId;
    }
    public LocalTime getStartTime(){
        return startTime;
    }

    public LocalTime getEndTime(){
        return endTime;
    }

    public ReservableRoom getReservableRoom(){
        return reservableRoom;//本当は複製しなきゃ
    }

    public User getUser(){
        return user;//本当は複製しなきゃ
    }

    public void setReservationId(Integer reservationId){
        this.reservationId =reservationId;
    }
}
