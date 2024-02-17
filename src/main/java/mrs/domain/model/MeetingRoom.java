package mrs.domain.model;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class MeetingRoom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roomId;
    private String roomName;

    // Copyコンストラクタ
    public MeetingRoom(){
    }

    public MeetingRoom(MeetingRoom obj){
        this.roomId = obj.roomId;
        this.roomName = obj.roomName;
    }

    public Integer getRoomId(){
        return roomId;
    }

    public String getRoomName(){
        return roomName;
    }

    public void setRoomId(Integer roomId){
        this.roomId=roomId;
    }

    public void setRoomName(String roomName){
        this.roomName =roomName;
    }
}
