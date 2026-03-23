# BuilderActionFlockSetTarget

Type: class | Package: com.hypixel.hytale.server.flock.corecomponents.builders | Extends: BuilderActionBase

public class BuilderActionFlockSetTarget extends BuilderActionBase

NPC behavior action builder for ActionFlockSetTarget functionality.

## Fields

- protected boolean clear
- protected final StringHolder targetSlot

## Methods

- @Nonnull public ActionFlockSetTarget build(@Nonnull BuilderSupport builderSupport)
- @Nonnull public BuilderActionFlockSetTarget readConfig(@Nonnull JsonElement data)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- public boolean isClear()
- public String getTargetSlot(@Nonnull BuilderSupport support)

Also in this package: BuilderActionFlockBeacon, BuilderActionFlockJoin, BuilderActionFlockLeave, BuilderActionFlockState, BuilderBodyMotionFlock, BuilderEntityFilterFlock, BuilderSensorFlockCombatDamage, BuilderSensorFlockLeader, BuilderSensorInflictedDamage

Complete API:
  public ActionFlockSetTarget build(BuilderSupport builderSupport)
  public BuilderActionFlockSetTarget readConfig(JsonElement data)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public boolean isClear()
  public String getTargetSlot(BuilderSupport support)

Fields:
protected boolean clear
protected final StringHolder targetSlot
