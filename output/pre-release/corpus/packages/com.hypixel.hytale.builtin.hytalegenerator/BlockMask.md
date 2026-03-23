# BlockMask

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator

public class BlockMask

Configures material-based placement rules that control which blocks can be placed and which existing blocks can be replaced.

## Key Methods

- public boolean canPlace(@Nonnull Material material)
- public boolean canPlace(int materialHash)
- public boolean canReplace(@Nonnull Material source, @Nonnull Material destination)
- public boolean canReplace(int sourceHash, int destinationHash)
- public void setSkippedBlocks(@Nonnull MaterialSet materialSet)
- public void putBlockMaskEntry(@Nonnull MaterialSet source, @Nonnull MaterialSet destination)
- public void setDefaultMask(@Nonnull MaterialSet materialSet)

Known subclasses: MultiBlockMask

Also in this package: ArrayUtil, BiOperation3i, EntityPlacementData, FutureUtils, GridUtils, LoggerUtil, MaterialSet, NakedOperation3i, Operation3i, PropRuntime, Registry, Retriever, ReusableList, VectorUtil, Viewport, WeightedMap

Complete API:
  public boolean canPlace(Material material)
  public boolean canPlace(int materialHash)
  public boolean canReplace(Material source, Material destination)
  public boolean canReplace(int sourceHash, int destinationHash)
  public void setSkippedBlocks(MaterialSet materialSet)
  public void putBlockMaskEntry(MaterialSet source, MaterialSet destination)
  public void setDefaultMask(MaterialSet materialSet)

Fields:
private MaterialSet skippedBlocks
private MaterialSet defaultMask
private final List<MaterialSet> sourceBlocks
private final List<MaterialSet> destinationBlocks
