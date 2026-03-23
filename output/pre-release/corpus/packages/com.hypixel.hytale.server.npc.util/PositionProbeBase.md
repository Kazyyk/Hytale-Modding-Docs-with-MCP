# PositionProbeBase

Type: class | Package: com.hypixel.hytale.server.npc.util

public class PositionProbeBase

Base class for NPC position probing that evaluates the collision state at a world position. Tracks ground contact, ceiling contact, water state, ground/water/surface levels, and height measurements.

## Key Methods

- public boolean isValidPosition()
- public boolean isTouchCeil()
- public boolean isOnGround()
- public boolean isInWater()
- public int getGroundLevel()
- public int getWaterLevel()
- public int getHeightOverGround()
- public int getHeightOverSurface()
- public int getDepthBelowSurface()
- public int getHeightOverWater()
- public String toString()

Known subclasses: PositionProbeAir, PositionProbeWater

Also in this package: AimingData, AimingHelper, Alarm, AttitudeMemoryEntry, BlockPlacementHelper, ComponentInfo, DamageData, Direction, IAnnotatedComponent, IAnnotatedComponentCollection, IComponentExecutionControl, IEntityByPriorityFilter, InventoryHelper, NPCPhysicsMath, PositionProbeAir, PositionProbeWater, RayBlockHitTest, RootSolver, SensorSupportBenchmark, Timer (and 4 more)

Complete API:
  protected boolean probePosition(Ref<EntityStore> ref, Box boundingBox, Vector3d position, CollisionResult collisionResult, T t, CollisionFilter<BoxBlockIntersectionEvaluator,T> blockTest, int materialSet, ComponentAccessor<EntityStore> componentAccessor)
  protected int updateWaterLevel(ComponentAccessor<ChunkStore> chunkStore, ChunkColumn chunkColumn, BlockChunk blockChunk, int x, int z)
  private boolean movedFarEnough(int x, int z)
  protected void reset()
  public boolean isValidPosition()
  public boolean isTouchCeil()
  public boolean isOnGround()
  public boolean isInWater()
  public int getGroundLevel()
  public int getWaterLevel()
  public int getHeightOverGround()
  public int getHeightOverSurface()
  public int getDepthBelowSurface()
  public int getHeightOverWater()
  public String toString()

Fields:
private static final int lastWaterCheckDistanceMinSquared
protected boolean touchCeil
protected boolean onGround
protected boolean inWater
protected boolean validPosition
protected int groundLevel
protected int waterLevel
protected int heightOverGround
protected int heightOverWater
protected int heightOverSurface
protected int depthBelowSurface
private int lastWaterCheckX
private int lastWaterCheckZ
private int lastWaterCheckLevel
