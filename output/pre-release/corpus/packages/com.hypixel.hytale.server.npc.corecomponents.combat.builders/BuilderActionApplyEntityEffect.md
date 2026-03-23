# BuilderActionApplyEntityEffect

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.combat.builders | Extends: BuilderActionBase

public class BuilderActionApplyEntityEffect extends BuilderActionBase

NPC behavior action builder for ActionApplyEntityEffect functionality.

## Fields

- protected final AssetHolder entityEffect
- protected final BooleanHolder useTarget

## Methods

- @Nonnull public ActionApplyEntityEffect build(@Nonnull BuilderSupport builderSupport)
- @Nonnull @Override public String getShortDescription()
- @Nonnull @Override public String getLongDescription()
- @Nonnull @Override public BuilderDescriptorState getBuilderDescriptorState()
- @Nonnull public BuilderActionApplyEntityEffect readConfig(@Nonnull JsonElement data)
- public int getEntityEffect(@Nonnull BuilderSupport support)
- public boolean isUseTarget(@Nonnull BuilderSupport support)

Also in this package: BuilderActionAttack, BuilderBodyMotionAimCharge, BuilderHeadMotionAim, BuilderSensorDamage, BuilderSensorIsBackingAway

Complete API:
  public ActionApplyEntityEffect build(BuilderSupport builderSupport)
  public String getShortDescription()
  public String getLongDescription()
  public BuilderDescriptorState getBuilderDescriptorState()
  public BuilderActionApplyEntityEffect readConfig(JsonElement data)
  public int getEntityEffect(BuilderSupport support)
  public boolean isUseTarget(BuilderSupport support)

Fields:
protected final AssetHolder entityEffect
protected final BooleanHolder useTarget
