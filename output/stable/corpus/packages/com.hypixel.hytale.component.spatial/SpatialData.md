# SpatialData

Type: class | Package: com.hypixel.hytale.component.spatial | Extends: java.lang.Object

public class SpatialData<T>

Growable parallel-array storage for spatial entity data. Maintains aligned arrays of positions (`Vector3d`), data references, sort indices, and Morton codes. Supports both standard axis-based sorting and Morton code-based sorting for cache-friendly spatial queries. Used as the input for `SpatialStructure.rebuild()`.

Also in this package: ClosestState, KDTree, MortonCode, Node, OrderedEntry, SpatialResource, SpatialStructure, SpatialSystem

Complete API:
  public int size()
  public int getSortedIndex(int i)
  public Vector3d getVector(int i)
  public T getData(int i)
  public void add(Vector3d vector, T value)
  public void addCapacity(int additionalSize)
  public void append(Vector3d vector, T value)
  public void sort()
  public void sortMorton()
  public void clear()

Fields:
public static final Vector3d[] EMPTY_VECTOR_ARRAY
private int[] indexes
private long[] moroton
private Vector3d[] vectors
private T[] data
private int size
