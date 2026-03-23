# BuilderToolsSystems.EnsureBuilderTools

Type: class | Package: com.hypixel.hytale.builtin.buildertools | Extends: HolderSystem<EntityStore>

public static class EnsureBuilderTools extends HolderSystem<EntityStore>

An `EntityStore` holder system that populates each player's tools inventory with all registered builder tool items when the player entity is added to the store. Registered during BuilderToolsPlugin setup.

## Query


@Nonnull
@Override
public Query<EntityStore> getQuery()

Returns `Player.getComponentType()`, matching all entities with a `Player` component.

## Lifecycle Callbacks

### onEntityAdd


@Override
public void onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)

When a player entity is added, clears the player's tools inventory and repopulates it from all registered `BuilderToolItemReferenceAsset` entries. Iterates each asset's `getItems()` array, creating `ItemStack` instances and adding them to the tools container. Throws `IllegalArgumentException` if the items cannot be added to the container.

### onEntityRemoved


@Override
public void onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)

No-op implementation. No cleanup is performed on entity removal.

## Related Types

- BuilderToolsSystems -- enclosing class
- BuilderToolsPlugin -- registers this system during setup
- BuilderToolsUserDataSystem -- companion system that ensures per-player data component
