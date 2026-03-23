# BuilderBodyMotionAimCharge

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.combat.builders | Extends: BuilderBodyMotionBase

public class BuilderBodyMotionAimCharge extends BuilderBodyMotionBase

NPC behavior motion builder for BodyMotionAimCharge functionality.

## Fields

- protected final DoubleHolder relativeTurnSpeed

## Methods

- @Nonnull public BodyMotion build(@Nonnull BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull public BuilderBodyMotionAimCharge readConfig(@Nonnull JsonElement data)
- public double getRelativeTurnSpeed(@Nonnull BuilderSupport support)

Also in this package: BuilderActionApplyEntityEffect, BuilderActionAttack, BuilderHeadMotionAim, BuilderSensorDamage, BuilderSensorIsBackingAway

Complete API:
  public BodyMotion build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderBodyMotionAimCharge readConfig(JsonElement data)
  public double getRelativeTurnSpeed(BuilderSupport support)

Fields:
protected final DoubleHolder relativeTurnSpeed
