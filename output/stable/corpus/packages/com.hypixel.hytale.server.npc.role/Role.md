# Role

Type: class | Package: com.hypixel.hytale.server.npc.role | Implements: com.hypixel.hytale.server.npc.util.IAnnotatedComponentCollection

public class Role implements IAnnotatedComponentCollection

The central runtime object for an NPC. Constructed from a `BuilderRole` and `BuilderSupport`, it owns all support subsystems (`CombatSupport`, `StateSupport`, `MarkedEntitySupport`, `WorldSupport`, `EntitySupport`, `PositionCache`, `DebugSupport`), the behavior instruction tree, motion controller map, steering accumulators, avoidance/separation configuration, flock parameters, inventory configuration, and lifecycle methods. The `tick` method drives the NPC's per-frame behavior: deferred actions, instruction tree evaluation, motion step selection, and steering computation.

## Constants

- public static final double INTERACTION_PLAYER_DISTANCE
- public static final boolean DEBUG_APPLIED_FORCES

## Support Subsystem Accessors

- @Nonnull public CombatSupport getCombatSupport()
- @Nonnull public StateSupport getStateSupport()
- @Nonnull public WorldSupport getWorldSupport()
- @Nonnull public MarkedEntitySupport getMarkedEntitySupport()
- @Nonnull public PositionCache getPositionCache()
- @Nonnull public EntitySupport getEntitySupport()
- @Nonnull public DebugSupport getDebugSupport()

## Lifecycle Methods

- public void postRoleBuilt(@Nonnull BuilderSupport builderSupport)
- public void loaded()
- public void spawned(@Nonnull Holder<EntityStore> holder, @Nonnull NPCEntity npcComponent)
- public void unloaded()
- public void removed()
- public void teleported(@Nonnull World from, @Nonnull World to)
- public void tick(@Nonnull Ref<EntityStore> ref, float tickTime, @Nonnull Store<EntityStore> store)

## Motion Controller Methods

- public MotionController getActiveMotionController()
- public boolean setActiveMotionController(@Nullable Ref<EntityStore> ref, @Nonnull NPCEntity npcComponent, @Nonnull String name, @Nullable ComponentAccessor<EntityStore> componentAccessor)
- public void setMotionControllers(@Nonnull NPCEntity npcComponent, @Nonnull Map<String, MotionController> motionControllers, @Nullable String initialMotionController)
- public void updateMotionControllers(@Nullable Ref<EntityStore> ref, @Nullable Model model, @Nullable Box boundingBox, @Nullable ComponentAccessor<EntityStore> componentAccessor)

## Steering & Avoidance

- @Nonnull public Steering getBodySteering()
- @Nonnull public Steering getHeadSteering()
- public void blendSeparation(@Nonnull Ref<EntityStore> selfRef, @Nonnull Vector3d position, @Nonnull Steering steering, ...)
- public void blendAvoidance(@Nonnull Ref<EntityStore> ref, @Nonnull Vector3d position, @Nonnull Steering steering, @Nonnull CommandBuffer<EntityStore> commandBuffer)
- @Nonnull public Vector3d getLastSeparationSteering()
- @Nonnull public Vector3d getLastAvoidanceSteering()
- public AvoidanceMode getAvoidanceMode()

## Key Accessors

- public String getRoleName()
- public int getRoleIndex()
- public int getInitialMaxHealth()
- public boolean isInvulnerable()
- public boolean isBreathesInAir()
- public boolean isBreathesInWater()
- public boolean canBreathe(@Nonnull BlockMaterial breathingMaterial, int fluidId)
- public boolean isOnGround()
- public boolean isFriendly(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)
- public Instruction getRootInstruction()
- @Nullable public Instruction getInteractionInstruction()
- @Nullable public Instruction getDeathInstruction()
- public String getDropListId()
- @Nullable public String getBalanceAsset()
- public boolean isMemory()

## Inner Types

### AvoidanceMode (enum)


public static enum AvoidanceMode implements Supplier<String> {
    Slowdown("Only slow down NPC"),
    Evade("Only evade"),
    Any("Any avoidance allowed");
}

### DeferredAction (functional interface)


@FunctionalInterface
public interface DeferredAction {
    boolean tick(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store);
}

Returns `true` when the action is complete and should be removed.

Also in this package: AvoidanceMode, DeferredAction, RoleDebugDisplay, RoleDebugFlags, RoleDebugPreset, RoleUtils, SpawnEffect

Complete API:
  public int getInitialMaxHealth()
  public boolean isAvoidingEntities()
  public double getCollisionProbeDistance()
  public boolean isApplySeparation()
  public double getSeparationDistance()
  public Instruction getRootInstruction()
  public Instruction getInteractionInstruction()
  public Instruction getDeathInstruction()
  public Steering getBodySteering()
  public Steering getHeadSteering()
  public Set<Ref<EntityStore>> getIgnoredEntitiesForAvoidance()
  public String getDropListId()
  public String getBalanceAsset()
  public Map<String,String> getInteractionVars()
  public boolean isMemory()
  public String getMemoriesNameOverride()
  public String getNameTranslationKey()
  public boolean isMemoriesNameOverriden()
  public float getSpawnLockTime()
  public void postRoleBuilt(BuilderSupport builderSupport)
  public void loaded()
  public void spawned(Holder<EntityStore> holder, NPCEntity npcComponent)
  public void unloaded()
  public void removed()
  public void teleported(World from, World to)
  public String getAppearanceName()
  public MotionController getActiveMotionController()
  public CombatSupport getCombatSupport()
  public StateSupport getStateSupport()
  public WorldSupport getWorldSupport()
  public MarkedEntitySupport getMarkedEntitySupport()
  public PositionCache getPositionCache()
  public EntitySupport getEntitySupport()
  public DebugSupport getDebugSupport()
  public boolean isRoleChangeRequested()
  public void setRoleChangeRequested()
  public boolean setActiveMotionController(Ref<EntityStore> ref, NPCEntity npcComponent, String name, ComponentAccessor<EntityStore> componentAccessor)
  public void setActiveMotionController(Ref<EntityStore> ref, NPCEntity npcComponent, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  protected void motionControllerChanged(Ref<EntityStore> ref, NPCEntity npcComponent, MotionController motionController, ComponentAccessor<EntityStore> componentAccessor)
  public void setMotionControllers(NPCEntity npcComponent, Map<String,MotionController> motionControllers, String initialMotionController)
  public void updateMotionControllers(Ref<EntityStore> ref, Model model, Box boundingBox, ComponentAccessor<EntityStore> componentAccessor)
  public void updateMovementState(Ref<EntityStore> ref, MovementStates movementStates, Vector3d velocity, ComponentAccessor<EntityStore> componentAccessor)
  public void tick(Ref<EntityStore> ref, float tickTime, Store<EntityStore> store)
  public void addDeferredAction(Role.DeferredAction handler)
  protected void computeActionsAndSteering(Ref<EntityStore> ref, double tickTime, Steering bodySteering, Steering headSteering, Store<EntityStore> store)
  public void blendSeparation(Ref<EntityStore> selfRef, Vector3d position, Steering steering, ComponentType<EntityStore,TransformComponent> transformComponentType, CommandBuffer<EntityStore> commandBuffer)
  public Vector3d getLastSeparationSteering()
  public void blendAvoidance(Ref<EntityStore> ref, Vector3d position, Steering steering, CommandBuffer<EntityStore> commandBuffer)
  public Vector3d getLastAvoidanceSteering()
  public void resetInstruction(int instruction)
  public String getRoleName()
  public int getRoleIndex()
  public void setRoleIndex(int roleIndex, String roleName)
  public boolean isInvulnerable()
  public boolean isBreathesInAir()
  public boolean isBreathesInWater()
  public double getInertia()
  public double getKnockbackScale()
  public boolean canBreathe(BlockMaterial breathingMaterial, int fluidId)
  public boolean couldBreathe(BlockMaterial breathingMaterial, int fluidId)
  public boolean couldBreatheCached()
  public void addForce(Vector3d velocity, VelocityConfig velocityConfig)
  public void forceVelocity(Vector3d velocity, VelocityConfig velocityConfig, boolean ignoreDamping)
  public void processAddVelocityInstruction(Vector3d velocity, VelocityConfig velocityConfig)
  public void processSetVelocityInstruction(Vector3d velocity, VelocityConfig velocityConfig)
  public boolean isOnGround()
  public void setArmor(NPCEntity npcComponent, String[] armor)
  public boolean isPickupDropOnDeath()
  public boolean requiresLeashPosition()
  public void clearOnce()
  public void clearOnceIfNeeded()
  public void setMarkedTarget(String targetSlot, Ref<EntityStore> target)
  public boolean isFriendly(Ref<EntityStore> ref, ComponentAccessor<EntityStore> componentAccessor)
  public boolean isIgnoredForAvoidance(Ref<EntityStore> entityReference)
  public Role.AvoidanceMode getAvoidanceMode()
  public double getCollisionRadius()
  public int[] getFlockSpawnTypes()
  public String[] getFlockAllowedRoles()
  public boolean isFlockSpawnTypesRandom()
  public boolean isCanLeadFlock()
  public double getFlockInfluenceRange()
  public double getDeathAnimationTime()
  public String getDeathInteraction()
  public float getDespawnAnimationTime()
  public void setReachedTerminalAction(boolean hasReached)
  public boolean hasReachedTerminalAction()
  public void setFlag(int index, boolean value)
  public boolean isFlagSet(int index)
  public boolean isBackingAway()
  public void setBackingAway(boolean backingAway)
  public Instruction swapTreeModeSteps(Instruction newStep)
  public void notifySensorMatch()
  public void resetAllInstructions()
  public String getSteeringMotionName()
  public int componentCount()
  public IAnnotatedComponent getComponent(int index)
  public void getInfo(Role role, ComponentInfo holder)
  public int getIndex()
  public void setContext(IAnnotatedComponent parent, int index)
  public IAnnotatedComponent getParent()
  public String getLabel()
  private void initialiseInventories(NPCEntity npcComponent)
  public boolean isCorpseStaysInFlock()
  public void onLoadFromWorldGenOrPrefab(Ref<EntityStore> ref, NPCEntity npcComponent, ComponentAccessor<EntityStore> componentAccessor)
  public RoleStats getRoleStats()

Fields:
public static final double INTERACTION_PLAYER_DISTANCE
public static final boolean DEBUG_APPLIED_FORCES
protected final CombatSupport combatSupport
protected final StateSupport stateSupport
protected final MarkedEntitySupport markedEntitySupport
protected final WorldSupport worldSupport
protected final EntitySupport entitySupport
protected final PositionCache positionCache
protected final DebugSupport debugSupport
protected final int initialMaxHealth
protected final double collisionProbeDistance
protected final double collisionRadius
protected final double collisionForceFalloff
protected final float collisionViewAngle
protected final float collisionViewHalfAngleCosine
protected final Steering bodySteering
protected final Steering headSteering
protected final SteeringForceAvoidCollision steeringForceAvoidCollision
protected final GroupSteeringAccumulator groupSteeringAccumulator
protected final Vector3d separation
protected final Set<Ref<EntityStore>> ignoredEntitiesForAvoidance
protected final double entityAvoidanceStrength
protected final Role.AvoidanceMode avoidanceMode
protected final boolean isAvoidingEntities
protected final double separationDistance
protected final double separationWeight
protected final double separationDistanceTarget
protected final double separationNearRadiusTarget
protected final double separationFarRadiusTarget
protected final boolean applySeparation
protected final Vector3d lastSeparationSteering
protected final float[] headPitchAngleRange
protected final boolean stayInEnvironment
protected final String allowedEnvironments
protected final String[] flockSpawnTypes
protected final boolean flockSpawnTypesRandom
protected final String[] flockAllowedRoles
protected final boolean canLeadFlock
protected final double flockWeightAlignment
protected final double flockWeightSeparation
protected final double flockWeightCohesion
protected final double flockInfluenceRange
protected final boolean corpseStaysInFlock
protected final double inertia
protected final double knockbackScale
protected final boolean breathesInAir
protected final boolean breathesInWater
protected final boolean pickupDropOnDeath
protected final String[] hotbarItems
protected final String[] offHandItems
protected final double deathAnimationTime
protected final float despawnAnimationTime
protected final String dropListId
protected final String deathInteraction
protected final boolean invulnerable
protected final int inventorySlots
protected final String inventoryContentsDropList
protected final int hotbarSlots
protected final int offHandSlots
protected final byte defaultOffHandSlot
protected final List<Role.DeferredAction> deferredActions
protected final RoleStats roleStats
protected final String balanceAsset
protected final Map<String,String> interactionVars
protected int roleIndex
protected String roleName
protected String appearance
protected boolean isActivated
protected Map<String,MotionController> motionControllers
protected MotionController activeMotionController
protected int[] flockSpawnTypeIndices
protected boolean requiresLeashPosition
protected boolean hasReachedTerminalAction
protected String[] armor
protected boolean[] flags
protected Instruction rootInstruction
protected Instruction lastBodyMotionStep
protected Instruction lastHeadMotionStep
protected Instruction[] indexedInstructions
protected Instruction interactionInstruction
protected Instruction deathInstruction
protected Instruction currentTreeModeStep
protected boolean roleChangeRequested
protected final boolean isMemory
protected final String memoriesNameOverride
protected final boolean isMemoriesNameOverriden
protected final float spawnLockTime
protected final String nameTranslationKey
protected boolean backingAway
