package Database.Abstracts.CharacterService;

import Entity.Base.BaseCharacter;

public interface ICharacterDatabaseService {
    BaseCharacter ArcherCharacterCreate();
    BaseCharacter KnightCharacterCreate();
    BaseCharacter SamuraiCharacterCreate();
    void idControl(int _id);
}
