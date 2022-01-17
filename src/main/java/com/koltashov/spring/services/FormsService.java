package com.koltashov.spring.services;

import com.koltashov.spring.model.Address;
import com.koltashov.spring.model.Area;
import com.koltashov.spring.model.Education;
import com.koltashov.spring.repositories.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class FormsService {
    private final AddressRepository addressRepository;
    private final AreaRepository areaRepository;
    private final ChildRepository childRepository;
    private final EducationRepository educationRepository;
    private final ParentsRepository parentsRepository;

    // Делаем 3 района, в каждом районе по 2 учебных учреждения.
    public void mockData() {
        Area[] areas = new Area[]{
                new Area(),
                new Area(),
                new Area(),
        };
        for (Area area : areas) {
            this.areaRepository.save(area);
        }

        int i = 0;
        List<Address> addresses = new ArrayList<>(25);
        for (String addressName : new String[]{
                "76209 Blue Bill Park Center",
                "113 Lakewood Road",
                "164 Bunker Hill Hill",
                "36 Rutledge Circle",
                "15895 Summit Center",
                "414 Warrior Park",
                "155 Bartelt Crossing",
                "04 Sheridan Street",
                "43701 2nd Terrace",
                "3999 Fremont Parkway",
                "59571 Fordem Drive",
                "3576 Spohn Road",
                "16 Lotheville Plaza",
                "2642 Delaware Street",
                "28 Sage Plaza",
                "94 Moulton Parkway",
                "38 Johnson Drive",
                "548 Scott Drive",
                "4829 Bay Center",
                "83 Pepper Wood Junction",
                "8 Anthes Crossing",
                "826 Fairfield Park",
                "44 Dottie Terrace",
                "09502 Oakridge Court",
                "55 Armistice Center",
        }) {
            Address address = new Address(addressName, areas[i % 3]);
            addresses.add(address);
            this.addressRepository.save(address);
            i++;
        }

        for (i = 0; i < 6; i++) {
            Education education = new Education(i, addresses.get(i));
            this.educationRepository.save(education);
        }
    }
}
