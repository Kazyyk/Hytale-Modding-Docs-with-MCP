# BuilderToolsUserDataSystem

Type: class | Package: com.hypixel.hytale.builtin.buildertools | Extends: HolderSystem<EntityStore>

public class BuilderToolsUserDataSystem extends HolderSystem<EntityStore>

An `EntityStore` holder system that ensures every player entity has a BuilderToolsUserData component. Registered during BuilderToolsPlugin setup.

## Query


@Nonnull
@Override
public Query<EntityStore> getQuery()

Returns a compound query matching entities that have a `Player` component but do **not** have a `BuilderToolsUserData` component: `Query.and(Player.getComponentType(), Query.not(BuilderToolsUserData.getComponentType()))`.

## Lifecycle Callbacks

### onEntityAdd


@Override
public void onEntityAdd(@Nonnull Holder<EntityStore> holder, @Nonnull AddReason reason, @Nonnull Store<EntityStore> store)

Ensures the `BuilderToolsUserData` component exists on the entity by calling `holder.ensureComponent(BuilderToolsUserData.getComponentType())`.

### onEntityRemoved


@Override
public void onEntityRemoved(@Nonnull Holder<EntityStore> holder, @Nonnull RemoveReason reason, @Nonnull Store<EntityStore> store)

No-op implementation. The component is not removed on entity removal.

## Related Types

- BuilderToolsUserData -- the component this system ensures
- BuilderToolsSystems.EnsureBuilderTools -- companion system that ensures builder tool items
- BuilderToolsPlugin -- registers this system during setup

Also in this package: Action, ActionEntry, BlockColorEntry, BlockColorIndex, BlocksSampleData, BuilderState, BuilderToolsConfig, BuilderToolsPacketHandler, BuilderToolsPlugin, BuilderToolsSystems, BuilderToolsUserData, CachedAccessor, CopyCutSettings, EditOperation, EnsureBuilderTools, EntityChange, FluidChange, PrefabCopyException, PrefabPasteEventSystem, PrototypePlayerBuilderToolSettings (and 2 more)

Complete API:
  public Query<EntityStore> getQuery()
  public void onEntityAdd(Holder<EntityStore> holder, AddReason reason, Store<EntityStore> store)
  public void onEntityRemoved(Holder<EntityStore> holder, RemoveReason reason, Store<EntityStore> store)

Fields:
private static final Query<EntityStore> QUERY
