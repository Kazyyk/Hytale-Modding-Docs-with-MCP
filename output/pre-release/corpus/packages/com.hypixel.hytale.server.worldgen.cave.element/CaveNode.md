# CaveNode

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.element | Implements: CaveElement

public class CaveNode implements CaveElement

## Fields

- private final CaveNodeType caveNodeType
- private final CaveNodeShape shape
- private final WorldBounds bounds
- private final int seedOffset
- private final float pitch
- private final float yaw
- private List<CavePrefab> rawCavePrefabs
- private CavePrefab[] cavePrefabs

## Methods

- public int getSeedOffset()
- public CaveNodeType getCaveNodeType()
- @Nonnull public CaveNodeShape getShape()
- public CavePrefab[] getCavePrefabs()
- public float getYaw()
- public float getPitch()
- public Vector3d getEnd()
- public void addPrefab(CavePrefab prefab)
- @Nonnull @Override public IWorldBounds getBounds()
- public int getFloorPosition(int seed, double x, double z)
- public int getCeilingPosition(int seed, double x, double z)
- public void forEachChunk(LongConsumer consumer)
- public void compile()
- @Nonnull @Override public String toString()

Also in this package: CaveElement, CavePrefab

Complete API:
  public int getSeedOffset()
  public CaveNodeType getCaveNodeType()
  public CaveNodeShape getShape()
  public CavePrefab[] getCavePrefabs()
  public float getYaw()
  public float getPitch()
  public Vector3d getEnd()
  public void addPrefab(CavePrefab prefab)
  public IWorldBounds getBounds()
  public int getFloorPosition(int seed, double x, double z)
  public int getCeilingPosition(int seed, double x, double z)
  public void forEachChunk(LongConsumer consumer)
  public void compile()
  public String toString()

Fields:
private final CaveNodeType caveNodeType
private final CaveNodeShape shape
private final WorldBounds bounds
private final int seedOffset
private final float pitch
private final float yaw
private List<CavePrefab> rawCavePrefabs
private CavePrefab[] cavePrefabs
