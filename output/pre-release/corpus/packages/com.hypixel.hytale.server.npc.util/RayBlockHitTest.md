# RayBlockHitTest

Type: class | Package: com.hypixel.hytale.server.npc.util | Implements: BlockIterator.BlockIteratorProcedure

public class RayBlockHitTest implements BlockIterator.BlockIteratorProcedure

Thread-local utility for casting rays against the block world to find block hits. Iterates through blocks along a ray direction and checks against block sets, tracking the hit position and block revision.

## Key Methods

- public static final ThreadLocal<RayBlockHitTest> THREAD_LOCAL = ThreadLocal.withInitial(RayBlockHitTest::new)
- public boolean accept(int x, int y, int z, double px, double py, double pz, double qx, double qy, double qz)
- public Vector3d getHitPosition()
- public short getLastBlockRevision()
- public boolean init(Ref<EntityStore> ref, int blockSet, float pitch, ComponentAccessor<EntityStore> componentAccessor)
- public boolean run(double range)
- public void clear()

Also in this package: AimingData, AimingHelper, Alarm, AttitudeMemoryEntry, BlockPlacementHelper, ComponentInfo, DamageData, Direction, IAnnotatedComponent, IAnnotatedComponentCollection, IComponentExecutionControl, IEntityByPriorityFilter, InventoryHelper, NPCPhysicsMath, PositionProbeAir, PositionProbeBase, PositionProbeWater, RootSolver, SensorSupportBenchmark, Timer (and 4 more)

Complete API:
  public boolean accept(int x, int y, int z, double px, double py, double pz, double qx, double qy, double qz)
  public Vector3d getHitPosition()
  public short getLastBlockRevision()
  public boolean init(Ref<EntityStore> ref, int blockSet, float pitch, ComponentAccessor<EntityStore> componentAccessor)
  public boolean run(double range)
  public void clear()

Fields:
public static final ThreadLocal<RayBlockHitTest> THREAD_LOCAL
private World world
private WorldChunk chunk
private final Vector3d origin
private final Vector3d direction
private int blockSet
private final Vector3d hitPosition
private short lastBlockRevision
