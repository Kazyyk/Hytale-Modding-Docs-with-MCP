# CachedStatsComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component<EntityStore>

public class CachedStatsComponent implements Component<EntityStore>

Component caching computed entity stat values to avoid repeated lookups. Currently caches whether the entity can breathe.

## Methods

- public static ComponentType<EntityStore, CachedStatsComponent> getComponentType()
- public boolean isCanBreathe()
- public void setCanBreathe(boolean canBreathe)
- public Component<EntityStore> clone()

## Relationships

- Implements `Component<EntityStore>`
- Registered by EntityModule
