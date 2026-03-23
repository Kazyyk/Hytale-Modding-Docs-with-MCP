# DeathSystems.CorpseRemoval

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: EntityTickingSystem<EntityStore>

public static class DeathSystems.CorpseRemoval extends EntityTickingSystem<EntityStore>

Removes dead non-player entities from the store. If the entity has a `DeferredCorpseRemoval` component and its timer has expired, removes it and optionally spawns death particles. If no deferred removal, removes immediately after death interactions complete.

## Relationships

- Inner class of DeathSystems
