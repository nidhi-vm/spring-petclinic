@Test
void shouldThrowParseException() {
    given(this.pets.findPetTypes()).willReturn(makePetTypes());
    Assertions.assertThrows(ParseException.class, () -> 
        petTypeFormatter.parse("Fish", Locale.ENGLISH)
    );
}

private List<PetType> makePetTypes() {
    List<PetType> petTypes = new ArrayList<>();
    petTypes.add(createPetType("Dog"));
    petTypes.add(createPetType("Bird"));
    return petTypes;
}

private PetType createPetType(String name) {
    PetType petType = new PetType();
    petType.setName(name);
    return petType;
}