# BuilderSensorBlock

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world.builders | Extends: BuilderSensorBase

public class BuilderSensorBlock extends BuilderSensorBase

Senses block information at a specific position relative to the NPC builder.

Also in this package: BuilderActionMakePath, BuilderActionPlaceBlock, BuilderActionResetBlockSensors, BuilderActionResetPath, BuilderActionResetSearchRays, BuilderActionSetBlockToPlace, BuilderActionSetLeashPosition, BuilderActionStorePosition, BuilderActionTriggerSpawners, BuilderBodyMotionPath, BuilderHeadMotionObserve, BuilderSensorBlockChange, BuilderSensorBlockType, BuilderSensorCanPlace, BuilderSensorEntityEvent, BuilderSensorEvent, BuilderSensorInWater, BuilderSensorLeash, BuilderSensorLight, BuilderSensorPath (and 4 more)

Complete API:
  public String getShortDescription()
  public String getLongDescription()
  public Sensor build(BuilderSupport builderSupport)
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public double getRange(BuilderSupport support)
  public double getYRange(BuilderSupport support)
  public int getBlockSet(BuilderSupport support)
  public boolean isPickRandom(BuilderSupport support)
  public boolean isReserveBlock(BuilderSupport support)

Fields:
protected final DoubleHolder range
protected final DoubleHolder yRange
protected final AssetHolder blockSet
protected final BooleanHolder pickRandom
protected final BooleanHolder reserveBlock
