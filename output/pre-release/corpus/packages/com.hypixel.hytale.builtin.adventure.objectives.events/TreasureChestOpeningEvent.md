# TreasureChestOpeningEvent

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.events | Implements: IEvent

public class TreasureChestOpeningEvent implements IEvent<String>

Server lifecycle event.

## Accessors

- getObjectiveUUID() | UUID | Accessor method.
- getChestUUID() | UUID | Accessor method.
- getPlayerRef() | Ref<EntityStore> | Accessor method.
- getStore() | Store<EntityStore> | Accessor method.

Complete API:
  public UUID getObjectiveUUID()
  public UUID getChestUUID()
  public Ref<EntityStore> getPlayerRef()
  public Store<EntityStore> getStore()
  public String toString()

Fields:
private final UUID objectiveUUID
private final UUID chestUUID
private final Ref<EntityStore> playerRef
private final Store<EntityStore> store
