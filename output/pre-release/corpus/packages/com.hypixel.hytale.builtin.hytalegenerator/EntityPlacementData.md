# EntityPlacementData

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator | Implements: MemInstrument

public class EntityPlacementData implements MemInstrument

Data container for entity placement during world generation. Stores the voxel offset, prefab rotation, entity holder, and an object ID for tracking. Implements `MemInstrument` for memory profiling.

Also in this package: ArrayUtil, BiOperation3i, BlockMask, FutureUtils, GridUtils, LoggerUtil, MaterialSet, NakedOperation3i, Operation3i, PropRuntime, Registry, Retriever, ReusableList, VectorUtil, Viewport, WeightedMap

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
