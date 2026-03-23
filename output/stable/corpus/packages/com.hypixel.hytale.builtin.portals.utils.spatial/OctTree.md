# OctTree

Type: class | Package: com.hypixel.hytale.builtin.portals.utils.spatial

public class OctTree<T>

Generic octree spatial data structure for 3D point queries. Supports add, range queries within a bounding box, and nearest-neighbor lookups. Used for spatial indexing of portal-related entities.

Also in this package: CellVisitor, Entry, Node, SpatialHashGrid

Complete API:
  public void add(Vector3d pos, T value)
  private boolean add(OctTree<T>.Node node, Vector3d pos, T value)
  private void subdivide(OctTree<T>.Node node)
  public Map<T,Vector3d> getAllPoints()
  public Map<T,Vector3d> queryRange(Vector3d position, double inradius)
  public Map<T,Vector3d> queryRange(Box range)
  private void queryRange(OctTree<T>.Node node, Box range, Map<T,Vector3d> out)

Fields:
private static final int SIZE
private static final int DEFAULT_NODE_CAPACITY
private final OctTree<T>.Node root
private final int nodeCapacity
