# KDTree

Type: class | Package: com.hypixel.hytale.component.spatial | Extends: java.lang.Object | Implements: SpatialStructure<T>

public class KDTree<T> implements SpatialStructure<T>

A k-d tree implementation for 3D spatial queries on ECS entity data. Supports nearest-neighbor, sphere, cylinder, box, and ordered distance queries. Uses object pooling for nodes and data lists to minimize GC pressure during per-tick rebuilds. The tree is rebuilt from scratch each tick using Morton code-based spatial sorting for cache-friendly construction.

Also in this package: ClosestState, MortonCode, Node, OrderedEntry, SpatialData, SpatialResource, SpatialStructure, SpatialSystem

Complete API:
  public int size()
  public void rebuild(SpatialData<T> spatialData)
  public T closest(Vector3d point)
  public void collect(Vector3d center, double radius, List<T> results)
  public void collectCylinder(Vector3d center, double radius, double height, List<T> results)
  public void collectBox(Vector3d min, Vector3d max, List<T> results)
  public void ordered(Vector3d center, double radius, List<T> results)
  public void ordered3DAxis(Vector3d center, double xSearchRadius, double YSearchRadius, double zSearchRadius, List<T> results)
  public String dump()
  private KDTree.Node<T> getPooledNode(Vector3d vector, List<T> data)
  private List<T> getPooledDataList()
  private void build0(SpatialData<T> spatialData, int start, int end)
  private void put0(KDTree.Node<T> node, Vector3d vector, List<T> list, int axis)
  private void closest0(KDTree.ClosestState<T> closestState, KDTree.Node<T> node, Vector3d vector, int depth)
  private void collect0(List<T> results, KDTree.Node<T> node, Vector3d vector, double distanceSq, int depth)
  private void collectCylinder0(List<T> results, KDTree.Node<T> node, Vector3d center, double radiusSq, double halfHeight, double radius, int depth)
  private void collectBox0(List<T> results, KDTree.Node<T> node, Vector3d min, Vector3d max, int depth)
  private void ordered0(List<KDTree.OrderedEntry<T>> results, KDTree.Node<T> node, Vector3d vector, double distanceSq, int depth)
  private void _internal_ordered3DAxis(List<KDTree.OrderedEntry<T>> results, KDTree.Node<T> node, Vector3d center, double xSearchRadius, double ySearchRadius, double zSearchRadius, int depth)
  private static int compare(Vector3d v1, Vector3d v2, int axis)
  private static double get(Vector3d v, int axis)

Fields:
private final List<KDTree.Node<T>> nodePool
private int nodePoolIndex
private final List<List<T>> dataListPool
private int dataListPoolIndex
private int size
private final Predicate<T> collectionFilter
private KDTree.Node<T> root
