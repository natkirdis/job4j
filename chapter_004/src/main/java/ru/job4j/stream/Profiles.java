package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public  class Profiles {
    static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .sorted(new AddressSort())
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Profile> profiles = List.of(
                new Profile(new Address("Tver", "pl. Lenina", 20, 45)),
                new Profile(new Address("Voroneg", "Krasnaya ul.", 1, 87)),
                new Profile(new Address("Voroneg", "Krasnaya ul.", 1, 87)),
                new Profile(new Address("Anapa", "Krasnaya ul.", 1, 87))
        );
        System.out.println(collect(profiles));
    }
}