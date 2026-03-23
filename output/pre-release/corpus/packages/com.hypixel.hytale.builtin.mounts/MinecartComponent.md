# MinecartComponent

Type: class | Package: com.hypixel.hytale.builtin.mounts.minecart | Implements: Component<EntityStore>

public class MinecartComponent implements Component<EntityStore>

An `EntityStore` ECS component representing a minecart entity's state. Tracks the number of hits received (for destruction after 3 hits), the timestamp of the last hit (with a 10-second reset window), and the source item ID used to drop an item when destroyed in survival mode.

Serialized with codec key `"Minecart"` and a `BuilderCodec` that persists the `SourceItem` field.

## Component Type


public static ComponentType<EntityStore, MinecartComponent> getComponentType()

Delegates to `MountPlugin.getInstance().getMinecartComponentType()`.

## Codec


public static final BuilderCodec<MinecartComponent> CODEC

Serializes/deserializes the `SourceItem` field as a string. Defaults to `"Rail_Kart"`.

## Constructors


private MinecartComponent()

Default constructor for codec deserialization.


public MinecartComponent(String sourceItem)

Creates a minecart component with the specified source item ID.

## Accessors and Mutators

- getNumberOfHits() | int | Current hit count (resets after 10 seconds of no hits).
- setNumberOfHits(int numberOfHits) | void | Sets the hit count.
- getLastHit() | @Nullable Instant | Timestamp of the last hit, or `null` if never hit.
- setLastHit(@Nullable Instant lastHit) | void | Sets the last hit timestamp.
- getSourceItem() | String | The item ID to drop when destroyed (default: `"Rail_Kart"`).
- setSourceItem(String sourceItem) | void | Sets the source item ID.

## Clone


@Override
public Component<EntityStore> clone()

Returns a new `MinecartComponent` with the same source item. Hit count and last hit are not copied.

## Related Types

- MountSystems.OnMinecartHit -- handles damage and destruction
- MountSystems.EnsureMinecartComponents -- ensures supporting components on minecart entities
- SpawnMinecartInteraction -- creates minecart entities with this component

Complete API:
  public static ComponentType<EntityStore,MinecartComponent> getComponentType()
  public int getNumberOfHits()
  public void setNumberOfHits(int numberOfHits)
  public Instant getLastHit()
  public void setLastHit(Instant lastHit)
  public String getSourceItem()
  public void setSourceItem(String sourceItem)
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<MinecartComponent> CODEC
private int numberOfHits
private Instant lastHit
private String sourceItem
