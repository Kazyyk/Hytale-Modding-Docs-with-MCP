# MaterialSet

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator | Implements: Predicate<Material>

public class MaterialSet implements Predicate<Material>

Predicate-based set of materials using hash codes, supporting inclusive and exclusive matching modes.

## Key Methods

- public boolean test(@Nullable Material value)
- public boolean test(int hashMaterialIds)

Also in this package: ArrayUtil, BiOperation3i, BlockMask, FutureUtils, Indexer, LoggerUtil, NakedOperation3i, Operation3i, PropField, Registry, Retriever, ReusableList, VectorUtil

Complete API:
  public boolean test(Material value)
  public boolean test(int hashMaterialIds)

Fields:
private final boolean isInclusive
private final IntSet mask
