# WeightedMap

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator

public class WeightedMap

Generic weighted random selection map. Stores elements with associated weights and provides `pick(Random)` for weighted random selection. Supports immutability via `makeImmutable()` and iteration via `forEach(BiConsumer)`.

Also in this package: ArrayUtil, BiOperation3i, BlockMask, EntityPlacementData, FutureUtils, GridUtils, LoggerUtil, MaterialSet, NakedOperation3i, Operation3i, PropRuntime, Registry, Retriever, ReusableList, VectorUtil, Viewport

Complete API:
  public WeightedMap<T> add(T element, double weight)
  public double get(T element)
  public T pick(Random rand)
  public int size()
  public List<T> allElements()
  public void makeImmutable()
  public boolean isImmutable()
  public void forEach(BiConsumer<T,Double> consumer)
  public String toString()

Fields:
private final Set<T> elementSet
private final List<T> elements
private final List<Double> weights
private final Map<T,Integer> indices
private double totalWeight
private boolean immutable
