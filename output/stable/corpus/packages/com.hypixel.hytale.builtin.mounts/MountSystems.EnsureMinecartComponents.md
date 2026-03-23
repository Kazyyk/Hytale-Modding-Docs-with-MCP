# MountSystems.EnsureMinecartComponents

Type: class | Package: com.hypixel.hytale.builtin.mounts | Extends: HolderSystem<EntityStore>

public static class EnsureMinecartComponents extends HolderSystem<EntityStore>

Ensures that minecart entities have the required supporting components when added to the store. On entity add, ensures `Interactable` and `PrefabCopyableComponent` exist, and adds a `NetworkId` with a fresh network ID from the entity store.

## Query

Matches entities with MinecartComponent.

## Dependencies

Root dependency (runs first).

## Behavior

- **onEntityAdd:** Ensures `Interactable`, adds `NetworkId`, ensures `PrefabCopyableComponent`.
- **onEntityRemoved:** No-op.

## Related Types

- MountSystems -- enclosing class
- MinecartComponent -- the query component
- MountSystems.OnMinecartHit -- handles minecart damage
