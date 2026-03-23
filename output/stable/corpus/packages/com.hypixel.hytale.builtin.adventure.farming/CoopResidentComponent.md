# CoopResidentComponent

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.component | Implements: Component<EntityStore>

public class CoopResidentComponent implements Component<EntityStore>

An `EntityStore` component attached to NPC entities that are residents of a CoopBlock. Tracks the block position of the coop the entity belongs to and whether the entity is marked for despawn.

## Fields

- @Nonnull private Vector3i coopLocation
- private boolean markedForDespawn

## Methods

- public static ComponentType<EntityStore, CoopResidentComponent> getComponentType()
- public void setCoopLocation(@Nonnull Vector3i coopLocation)
- @Nonnull public Vector3i getCoopLocation()
- public void setMarkedForDespawn(boolean markedForDespawn)
- public boolean getMarkedForDespawn()
- @Nullable public Component<EntityStore> clone()

## Codec

Serialized fields: `CoopLocation` (Vector3i), `MarkedForDespawn` (boolean).

Complete API:
  public static ComponentType<EntityStore,CoopResidentComponent> getComponentType()
  public void setCoopLocation(Vector3i coopLocation)
  public Vector3i getCoopLocation()
  public void setMarkedForDespawn(boolean markedForDespawn)
  public boolean getMarkedForDespawn()
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<CoopResidentComponent> CODEC
private Vector3i coopLocation
private boolean markedForDespawn
