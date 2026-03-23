# CoopResidentComponent

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.component | Implements: Component

public class CoopResidentComponent implements Component<EntityStore>

ECS component stored in `EntityStore`. Serialized via `BuilderCodec`.

## Accessors

- getComponentType() | ComponentType<EntityStore, CoopResidentComponent> | Accessor method.
- setCoopLocation(Vector3i coopLocation) | void | Mutator method.
- getCoopLocation() | Vector3i | Accessor method.
- setMarkedForDespawn(boolean markedForDespawn) | void | Mutator method.
- getMarkedForDespawn() | boolean | Accessor method.

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
