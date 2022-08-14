package com.wonit.cqrs.read;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConferenceController {

    private final ConferenceRepository repository;

    @GetMapping("/apis/conferences/{code}")
    public ResponseEntity<ConferenceModel> getConference(@PathVariable(value = "code") String conferenceCode) {
        Conference conference = repository.findByCode(conferenceCode);
        ConferenceModel model = ConferenceModel.from(conference);
        return ResponseEntity.ok(model);
    }
}
