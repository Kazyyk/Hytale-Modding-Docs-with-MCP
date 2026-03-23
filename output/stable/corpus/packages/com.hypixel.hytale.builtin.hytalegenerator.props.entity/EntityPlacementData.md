# EntityPlacementData

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props.entity | Implements: MemInstrument

public class EntityPlacementData implements MemInstrument

Utility type in the `entity` subsystem.

## Accessors

- getOffset() | Vector3i | Accessor method.
- getRotation() | PrefabRotation | Accessor method.
- getEntityHolder() | Holder<EntityStore> | Accessor method.
- getObjectId() | int | Accessor method.
- getMemoryUsage() | MemInstrument.Report | Accessor method.

Complete API:
  public Vector3i getOffset()
  public PrefabRotation getRotation()
  public Holder<EntityStore> getEntityHolder()
  public int getObjectId()
  public MemInstrument.Report getMemoryUsage()

Fields:
private final Vector3i offset
private final PrefabRotation rotation
private final Holder<EntityStore> entityHolder
private final int objectId
