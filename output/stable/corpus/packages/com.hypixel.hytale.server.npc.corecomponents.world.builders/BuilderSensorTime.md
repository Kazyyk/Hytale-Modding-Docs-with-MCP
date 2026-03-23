# BuilderSensorTime

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.world.builders | Extends: BuilderSensorBase

public class BuilderSensorTime extends BuilderSensorBase

Provides time-of-day information for the NPC builder's behavior scheduling.

Also in this package: BuilderActionMakePath, BuilderActionPlaceBlock, BuilderActionResetBlockSensors, BuilderActionResetPath, BuilderActionResetSearchRays, BuilderActionSetBlockToPlace, BuilderActionSetLeashPosition, BuilderActionStorePosition, BuilderActionTriggerSpawners, BuilderBodyMotionPath, BuilderHeadMotionObserve, BuilderSensorBlock, BuilderSensorBlockChange, BuilderSensorBlockType, BuilderSensorCanPlace, BuilderSensorEntityEvent, BuilderSensorEvent, BuilderSensorInWater, BuilderSensorLeash, BuilderSensorLight (and 4 more)

Complete API:
  public Sensor build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public Builder<Sensor> readConfig(JsonElement data)
  public double[] getPeriod(BuilderSupport support)
  public boolean isCheckDay()
  public boolean isCheckYear()
  public boolean isScaleDayTimeRange()

Fields:
protected final NumberArrayHolder period
protected boolean checkDay
protected boolean checkYear
protected boolean scaleDayTimeRange
