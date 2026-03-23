# SpatialHashGrid

Type: class | Package: com.hypixel.hytale.builtin.portals.utils.spatial

public class SpatialHashGrid<T>

Spatial hash grid for efficient 2D proximity queries. Stores values by XZ position and supports radius-based neighbor lookups and conditional removal.

Also in this package: CellVisitor, Entry

Complete API:
  private Vector3i cellFor(Vector3d p)
  public Collection<? extends T> getAll()
  public int size()
  public boolean isEmpty()
  public void add(Vector3d pos, T value)
  public boolean remove(T value)
  public void removeIf(Predicate<T> predicate)
  public void move(T value, Vector3d newPos)
  public Map<T,Vector3d> queryRange(Vector3d center, double radius)
  public T findClosest(Vector3d center, double searchRadius)
  public boolean hasAnyWithin(Vector3d center, double radius)
  private void query(Vector3d center, double radius, SpatialHashGrid.CellVisitor<T> visitor)

Fields:
private final double cellSize
private final Map<Vector3i,List<SpatialHashGrid.Entry<T>>> grid
private final Map<T,SpatialHashGrid.Entry<T>> index
