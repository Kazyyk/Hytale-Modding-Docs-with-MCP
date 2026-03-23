# BuilderRole

Type: class | Package: com.hypixel.hytale.server.npc.role.builders

public class BuilderRole

Primary builder for NPC roles. Reads JSON config for appearance, health, inventory, combat, flocking, motion controllers, instructions, state transitions, and more. Produces `Role` instances via `build()`.

Known subclasses: BuilderRoleAbstract

Also in this package: BuilderRoleAbstract, BuilderRoleVariant

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Role build(BuilderSupport builderSupport)
  public boolean validate(String configName, NPCLoadTimeValidationHelper validationHelper, ExecutionContext context, Scope globalScope, List<String> errors)
  public BuilderRole readConfig(JsonElement data)
  public String getIdentifier()
  public SpawnTestResult canSpawn(SpawningContext context)
  public Class<Role> category()
  public String getSpawnModelName(ExecutionContext context, Scope modifierScope)
  public Scope createModifierScope(ExecutionContext executionContext)
  public Scope createExecutionScope()
  public void markNeedsReload()
  public String getSpawnParticles()
  public Vector3d getSpawnParticleOffset()
  public double getSpawnViewDistance()
  public final boolean isEnabled(ExecutionContext context)
  public int getMaxHealth(BuilderSupport builderSupport)
  public String[] getDisplayNames()
  public String getNameTranslationKey(BuilderSupport support)
  public String getAppearance(BuilderSupport builderSupport)
  public boolean isBreathesInAir(BuilderSupport support)
  public boolean isBreathesInWater(BuilderSupport support)
  public int getOpaqueBlockSet()
  public double getInertia()
  public double getKnockbackScale(BuilderSupport support)
  public String[] getHotbarItems(BuilderSupport support)
  public String[] getOffHandItems(BuilderSupport support)
  public String getInventoryItemsDropList(BuilderSupport support)
  public String[] getArmor()
  public boolean isPickupDropOnDeath()
  public String getDropListId(BuilderSupport builderSupport)
  public String getStartState()
  public int getStartStateIndex()
  public int getStartSubStateIndex()
  public double getCollisionDistance()
  public double getCollisionForceFalloff()
  public boolean isAvoidingEntities()
  public Role.AvoidanceMode getAvoidanceMode()
  public double getCollisionRadius()
  public double getSeparationDistance(BuilderSupport support)
  public double getSeparationWeight(BuilderSupport support)
  public double getSeparationDistanceTarget(BuilderSupport support)
  public double getSeparationNearRadiusTarget(BuilderSupport support)
  public double getSeparationFarRadiusTarget(BuilderSupport support)
  public boolean isApplySeparation(BuilderSupport support)
  public boolean isStayingInEnvironment()
  public String getAllowedEnvironments()
  public double getEntityAvoidanceStrength()
  public boolean isOverridingHeadPitchAngle(BuilderSupport support)
  public float[] getHeadPitchAngleRange(BuilderSupport support)
  public String[] getFlockSpawnTypes(BuilderSupport support)
  public boolean isFlockSpawnTypeRandom(BuilderSupport support)
  public String[] getFlockAllowedRoles(BuilderSupport support)
  public boolean isCanLeadFlock(BuilderSupport support)
  public double getFlockWeightAlignment()
  public double getFlockWeightSeparation()
  public double getFlockWeightCohesion()
  public double getFlockInfluenceRange()
  public EnumSet<RoleDebugFlags> getDebugFlags()
  public float getCollisionViewAngle()
  public String getBalanceAsset(BuilderSupport support)
  public double getDeathAnimationTime()
  public String getDeathInteraction(BuilderSupport builderSupport)
  public float getDespawnAnimationTime()
  public boolean isDisableDamageFlock()
  public int[] getDisableDamageGroups(BuilderSupport support)
  public boolean isInvulnerable(BuilderSupport support)
  public int getInventorySlots()
  public int getHotbarSlots()
  public int getOffHandSlots()
  public byte getDefaultOffHandSlot(BuilderSupport support)
  public Int2ObjectMap<IntSet> getBusyStates()
  public Attitude getDefaultPlayerAttitude(BuilderSupport support)
  public Attitude getDefaultNPCAttitude(BuilderSupport support)
  public int getAttitudeGroup(BuilderSupport support)
  public int getItemAttitudeGroup(BuilderSupport support)
  public boolean isCorpseStaysInFlock()
  public Map<String,MotionController> getMotionControllerMap(BuilderSupport support)
  public String getInitialMotionController(BuilderSupport support)
  public List<Instruction> getInstructionList(BuilderSupport support)
  public Instruction getInteractionInstruction(BuilderSupport support)
  public Instruction getDeathInstruction(BuilderSupport support)
  public StateTransitionController getStateTransitionController(BuilderSupport support)
  public void registerStateEvaluator(BuilderSupport support)
  public Map<String,String> getInteractionVars(BuilderSupport support)
  public boolean isMemory(ExecutionContext context)
  public boolean isMemory(ExecutionContext context, Scope modifierScope)
  public String getMemoriesCategory(ExecutionContext context, Scope modifierScope)
  public String getMemoriesNameOverride(ExecutionContext context)
  public String getMemoriesNameOverride(ExecutionContext context, Scope modifierScope)
  public String getNameTranslationKey(ExecutionContext context, Scope modifierScope)
  public float getSpawnLockTime(BuilderSupport support)
  protected void runLoadTimeValidationHelper0(String configName, NPCLoadTimeValidationHelper loadTimeValidationHelper, ExecutionContext context, List<String> errors)

Fields:
protected static final double[] DEFAULT_HEAD_PITCH_RANGE
protected String[] displayNames
protected final AssetHolder appearance
protected final AssetHolder dropListId
protected final IntHolder maxHealth
protected String startState
protected String defaultSubState
protected int startStateIndex
protected int startSubStateIndex
protected final EnumSet<RoleDebugFlags> parsedDebugFlags
protected String debugFlags
protected double inertia
protected final DoubleHolder knockbackScale
protected String opaqueBlockSet
protected boolean applyAvoidance
protected double entityAvoidanceStrength
protected double collisionDistance
protected double collisionForceFalloff
protected double collisionRadius
protected float collisionViewAngle
protected final DoubleHolder separationDistance
protected final DoubleHolder separationWeight
protected final DoubleHolder separationDistanceTarget
protected final DoubleHolder separationNearRadiusTarget
protected final DoubleHolder separationFarRadiusTarget
protected final BooleanHolder applySeparation
protected boolean stayInEnvironment
protected String allowedEnvironments
protected final StringArrayHolder flockSpawnTypes
protected final BooleanHolder flockSpawnTypeRandom
protected final StringArrayHolder flockAllowedRoles
protected final BooleanHolder canLeadFlock
protected final FloatHolder spawnLockTime
protected double flockWeightAlignment
protected double flockWeightSeparation
protected double flockWeightCohesion
protected double flockInfluenceRange
protected boolean corpseStaysInFlock
protected final BooleanHolder invulnerable
protected final BooleanHolder breathesInAir
protected final BooleanHolder breathesInWater
protected final AssetArrayHolder hotbarItems
protected final AssetArrayHolder offHandItems
protected final AssetHolder inventoryItemsDropList
protected final IntHolder defaultOffHandSlot
protected boolean pickupDropOnDeath
protected String[] armor
protected double deathAnimationTime
protected float despawnAnimationTime
protected AssetHolder deathInteraction
protected Role.AvoidanceMode avoidanceMode
protected boolean disableDamageFlock
protected final AssetArrayHolder disableDamageGroups
protected String spawnParticles
protected double[] spawnParticleOffset
protected double spawnViewDistance
protected int inventorySlots
protected int hotbarSlots
protected int offHandSlots
protected final EnumHolder<Attitude> defaultPlayerAttitude
protected final EnumHolder<Attitude> defaultNPCAttitude
protected final AssetHolder attitudeGroup
protected final AssetHolder itemAttitudeGroup
protected Int2ObjectMap<IntSet> busyStates
protected final BuilderObjectReferenceHelper<Map<String,MotionController>> motionControllers
protected final BuilderObjectListHelper<Instruction> instructionList
protected final BuilderObjectReferenceHelper<Instruction> interactionInstruction
protected final BuilderObjectReferenceHelper<Instruction> deathInstruction
protected final BuilderObjectReferenceHelper<StateTransitionController> stateTransitionController
protected final StringHolder initialMotionController
protected final BuilderCodecObjectHelper<StateEvaluator> stateEvaluator
protected final BuilderCombatConfig combatConfig
protected final BuilderTemplateInteractionVars interactionVars
protected final BooleanHolder isMemory
protected final StringHolder memoriesCategory
protected final StringHolder memoriesNameOverride
protected final StringHolder nameTranslationKey
protected final NumberArrayHolder headPitchAngleRange
protected final BooleanHolder overrideHeadPitchAngle
