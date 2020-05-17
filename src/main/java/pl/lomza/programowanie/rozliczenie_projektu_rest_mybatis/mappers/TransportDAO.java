package pl.lomza.programowanie.rozliczenie_projektu_rest_mybatis.mappers;

import org.apache.ibatis.annotations.Param;
import pl.lomza.programowanie.rozliczenie_projektu_rest_mybatis.common.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TransportDAO {
    List<Ride> getRides(@Param("vehicleId") long vehicleId);
    Ride getRide(@Param("vehicleId") long vehicleId, @Param("rideId") long rideId);
}
