# ActionSpawn

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.lifecycle | Extends: ActionBase

public class ActionSpawn extends ActionBase

NPC action that spawns new NPC entities nearby.

Also in this package: ActionDelayDespawn, ActionDespawn, ActionDie, ActionRemove, ActionRole, SensorAge

Complete API:
  public boolean canExecute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  public boolean execute(Ref<EntityStore> ref, Role role, InfoProvider sensorInfo, double dt, Store<EntityStore> store)
  protected boolean trySpawn(Ref<EntityStore> ref, SpawningContext spawningContext, Store<EntityStore> store)
  protected void postSpawn(NPCEntity npcComponent, Ref<EntityStore> ref, Store<EntityStore> store)
  protected void joinFlock(Ref<EntityStore> targetRef, Store<EntityStore> store)
  protected void launchAtTarget(Ref<EntityStore> ref, Store<EntityStore> store)
  protected boolean deferredSpawning(Ref<EntityStore> ref, Role role, double dt, Store<EntityStore> store)

Fields:
protected final float spawnDirection
protected final float spawnAngle
protected final boolean fanOut
protected final double minDistance
protected final double maxDistance
protected final String kind
protected final String flock
protected final int roleIndex
protected final int maxCount
protected final int minCount
protected final double minDelay
protected final double maxDelay
protected final Vector3d position
protected final Vector3f rotation
protected final boolean launchAtTarget
protected final boolean pitchHigh
protected final Vector3d targetPosition
protected final Vector3d launchDirection
protected final float[] pitch
protected final double spread
protected final boolean joinFlock
protected final String spawnState
protected final String spawnSubState
protected int spawnsLeft
protected int maxTries
protected float yaw0
protected float yawIncrement
protected double spawnDelay
protected Ref<EntityStore> parent
