# UniqueItemUsagesComponent

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player.data | Implements: Component<EntityStore>

public class UniqueItemUsagesComponent implements Component<EntityStore>

An `EntityStore` component storing UniqueItemUsagesComponent-related data on entities.

## Fields

- private final Set<String> usedUniqueItems

## Methods

- public static ComponentType<EntityStore, UniqueItemUsagesComponent> getComponentType()
- @Nullable @Override public Component<EntityStore> clone()
- public boolean hasUsedUniqueItem(String itemId)
- public void recordUniqueItemUsage(String itemId)
