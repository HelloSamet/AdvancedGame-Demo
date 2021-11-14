package Database.Abstracts.MonsterService;

import Entity.Base.BaseMonster;

public interface IMonsterDatabaseService {
    BaseMonster BearMonsterCreate();
    BaseMonster VampireMonsterCreate();
    BaseMonster ZombieMonsterCreate();
}
