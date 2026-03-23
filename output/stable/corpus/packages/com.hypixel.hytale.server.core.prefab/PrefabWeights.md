# PrefabWeights

Type: class | Package: com.hypixel.hytale.server.core.prefab

public class PrefabWeights

Weighted random selection system for prefabs. Stores a mapping of prefab names to weight values and a default weight for unmapped entries. Supports lazy initialization of cumulative weight arrays for O(n) selection. Provides parsing from a comma-separated `name=value` string format.

The `NONE` sentinel instance has zero sum and empty weights, effectively disabling selection.

## Fields

- public static final Codec<PrefabWeights> CODEC
- public static final PrefabWeights NONE
- public static final double DEFAULT_WEIGHT

## Methods

- public int size()
- @Nullable public <T> T get(@Nonnull T[] elements, @Nonnull Function<T, String> nameFunc, @Nonnull Random random)
- @Nullable public <T> T get(@Nonnull T[] elements, @Nonnull Function<T, String> nameFunc, double value)
- public double getWeight(String prefab)
- public void setWeight(String prefab, double weight)
- public void removeWeight(String prefab)
- public double getDefaultWeight()
- public void setDefaultWeight(double defaultWeight)
- @Nonnull public String getMappingString()
- @Nonnull public static PrefabWeights parse(@Nonnull String mappingString)
- public Set<Entry<String>> entrySet()

Also in this package: AssetPackPrefabPath, PrefabCopyableComponent, PrefabEntry, PrefabLoadException, PrefabRotation, PrefabSaveException, PrefabStore, RotationExecutor, RotationExecutor_0, RotationExecutor_180, RotationExecutor_270, RotationExecutor_90, Type, Type, WeightMapValidator

Complete API:
  public int size()
  public T get(T[] elements, Function<T,String> nameFunc, Random random)
  public T get(T[] elements, Function<T,String> nameFunc, double value)
  public double getWeight(String prefab)
  public void setWeight(String prefab, double weight)
  public void removeWeight(String prefab)
  public double getDefaultWeight()
  public void setDefaultWeight(double defaultWeight)
  public String getMappingString()
  public String toString()
  private void initialize(T[] elements, Function<T,String> nameFunc)
  public static PrefabWeights parse(String mappingString)
  public Set<Entry<String>> entrySet()
  private static void checkWeight(String prefab, double weight)

Fields:
public static final Supplier<Object2DoubleMap<String>> MAP_SUPPLIER
public static final Codec<Object2DoubleMap<String>> MAP_CODEC
public static final Codec<PrefabWeights> CODEC
public static final PrefabWeights NONE
public static final double DEFAULT_WEIGHT
public static final char DELIMITER_CHAR
public static final char ASSIGNMENT_CHAR
private double defaultWeight
private Object2DoubleMap<String> weightsLookup
protected double sum
protected double[] weights
protected volatile boolean initialized
