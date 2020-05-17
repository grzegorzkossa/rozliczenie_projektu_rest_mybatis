package pl.lomza.programowanie.rozliczenie_projektu_rest_mybatis.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.web.bind.annotation.PathVariable;
import pl.lomza.programowanie.rozliczenie_projektu_rest_mybatis.common.Ride;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.lomza.programowanie.rozliczenie_projektu_rest_mybatis.mappers.TransportDAO;

import java.util.List;

@RestController
public class TransportController {
    private final static Logger log = LoggerFactory.getLogger(TransportController.class);

    @Autowired
    private TransportDAO transportDAO;

    @GetMapping("/")
    public String getTest() {
        return "Działa";
    }

    @GetMapping("vehicle/{vehicleId}/rides")
    public List<Ride> getRides(@PathVariable("vehicleId") long vehicleId) {
        log.info("Wyświetlamy listę przejazdów");
        return transportDAO.getRides(vehicleId);
    }
    @GetMapping("vehicle/{vehicleId}/ride/{rideId}")
    public Ride getRide(@PathVariable("vehicleId") long vehicleId, @PathVariable("rideId") long rideId) {
        log.info("Wyświetlamy przejazd");
        return transportDAO.getRide(vehicleId, rideId);
    }
}
