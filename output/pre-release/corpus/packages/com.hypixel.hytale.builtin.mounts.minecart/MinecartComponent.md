# MinecartComponent

Type: class | Package: com.hypixel.hytale.builtin.mounts.minecart | Implements: Component

public class MinecartComponent implements Component<EntityStore>

ECS component stored in `EntityStore`. Serialized via `BuilderCodec`.

## Accessors

- getComponentType() | ComponentType<EntityStore, MinecartComponent> | Accessor method.
- getNumberOfHits() | int | Accessor method.
- setNumberOfHits(int numberOfHits) | void | Mutator method.
- getLastHit() | Instant | Accessor method.
- setLastHit(Instant lastHit) | void | Mutator method.
- getSourceItem() | String | Accessor method.
- setSourceItem(String sourceItem) | void | Mutator method.

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
