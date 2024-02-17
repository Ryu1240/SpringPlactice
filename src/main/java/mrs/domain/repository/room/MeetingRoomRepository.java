package mrs.domain.repository.room;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import mrs.domain.model.MeetingRoom;

public interface MeetingRoomRepository extends JpaRepository<MeetingRoom, Integer> {
    
    default MeetingRoom findOneByRoomId(Integer roomId) {
        MeetingRoom exampleMeetingRoom = new MeetingRoom();
        exampleMeetingRoom.setRoomId(roomId);

        Example<MeetingRoom> example = Example.of(exampleMeetingRoom);

        return findOne(example).orElse(null);
    }
}
