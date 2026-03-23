# DeferredCorpseRemoval

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Implements: Component<EntityStore>

public class DeferredCorpseRemoval implements Component<EntityStore>

Component that defers corpse removal by a configurable time. Attached to dead entities to keep the corpse visible for a duration. Optionally specifies a death particle effect ID to spawn when the corpse is finally removed.

## Constructors

- public DeferredCorpseRemoval(double timeUntilCorpseRemoval, String deathParticles)

## Methods

- public static ComponentType<EntityStore, DeferredCorpseRemoval> getComponentType()
- public void tick(float dt)
- public boolean shouldRemove()
- public String getDeathParticles()
- public Component<EntityStore> clone()

## Relationships

- Implements `Component<EntityStore>`
- Used by `DeathSystems.CorpseRemoval` and `DeathSystems.TickCorpseRemoval`
