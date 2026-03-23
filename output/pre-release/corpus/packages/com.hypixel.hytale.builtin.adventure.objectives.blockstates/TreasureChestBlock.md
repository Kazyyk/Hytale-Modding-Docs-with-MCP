# TreasureChestBlock

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.blockstates | Implements: Component<ChunkStore>

public class TreasureChestBlock implements Component<ChunkStore>

ECS component stored on chunk-store block entities that tracks treasure chest state for the objective system. Each instance records which objective and chest UUID the block belongs to, and whether the chest has been opened. Opening a chest dispatches a `TreasureChestOpeningEvent` through the global event bus.

## Fields

- @Nonnull public static final BuilderCodec<TreasureChestBlock> CODEC
- protected UUID objectiveUUID
- protected UUID chestUUID
- protected boolean opened

## Constructors

- public TreasureChestBlock()
- public TreasureChestBlock(UUID objectiveUUID, UUID chestUUID, boolean opened)

## Methods

- public static ComponentType<ChunkStore, TreasureChestBlock> getComponentType()
- public boolean canOpen(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public boolean canDestroy(@Nonnull Ref<EntityStore> playerRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public void onOpen(@Nonnull Ref<EntityStore> ref, @Nonnull World world, @Nonnull Store<EntityStore> store)
- public void setOpened(boolean opened)
- public boolean isOpened()
- public void setObjectiveData(UUID objectiveUUID, UUID chestUUID)
- @Nullable @Override public Component<ChunkStore> clone()

## Behavior

- `canOpen` returns `true` if the chest is already opened or if the player's UUID is in the objective's active player set. Otherwise the player cannot open it.
- `canDestroy` returns `true` only if the chest has already been opened.
- `onOpen` dispatches a `TreasureChestOpeningEvent` (scoped to the world name) when there are listeners registered and the chest is associated with an objective, then marks the chest as opened.

## Related Types

- `ObjectivePlugin` -- registers this component type under the key `"TreasureChest"`
- DestroyTreasureConditionInteraction -- checks `canDestroy`
- OpenTreasureContainerInteraction -- checks `canOpen` and calls `onOpen`

Complete API:
  public static ComponentType<ChunkStore,TreasureChestBlock> getComponentType()
  public boolean canOpen(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public boolean canDestroy(Ref<EntityStore> playerRef, ComponentAccessor<EntityStore> componentAccessor)
  public void onOpen(Ref<EntityStore> ref, World world, Store<EntityStore> store)
  public void setOpened(boolean opened)
  public boolean isOpened()
  public void setObjectiveData(UUID objectiveUUID, UUID chestUUID)
  public Component<ChunkStore> clone()

Fields:
public static final BuilderCodec<TreasureChestBlock> CODEC
protected UUID objectiveUUID
protected UUID chestUUID
protected boolean opened
